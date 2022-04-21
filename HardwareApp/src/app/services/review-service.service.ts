import { Injectable } from '@angular/core';
import {HttpClient, HttpHeaders} from "@angular/common/http";
import {catchError, Observable, of, tap} from "rxjs";
import {Hardware} from "../models/hardware";
import {Review} from "../models/review";

@Injectable({
  providedIn: 'root'
})
export class ReviewServiceService {
  private allReviewsUrl = 'http://localhost:8080/review';

  httpsOptions = {
    headers: new HttpHeaders({'Content-Type': 'application/json'})
  }

  constructor(private http: HttpClient) { }

  getReviewByCode(code: string): Observable<Review>{
    return this.http.get<Review>(this.allReviewsUrl + "/" + code).pipe(
      tap(_ => console.log('fetched review with code = ' + code))
    );
  }

  getAllReviews(): Observable<Review[]> {
    return this.http.get<Review[]>(this.allReviewsUrl).pipe(
      tap(_ => console.log('fetched reviews')),
      catchError(this.handleError<Review[]>('getAllReviews', []))
    );
  }


  private handleError<T>(operation = 'operation', result?: T){
    return (error: any): Observable<T> => {
      console.error(operation);
      console.error(error);
      return  of(result as T);
    }
  }
}
