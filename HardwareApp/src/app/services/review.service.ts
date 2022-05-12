import { Injectable } from '@angular/core';
import {HttpClient, HttpHeaders, HttpParams} from "@angular/common/http";
import {catchError, Observable, of, tap} from "rxjs";
import {Review} from "../models/review";
import {Hardware} from "../models/hardware";

@Injectable({
  providedIn: 'root'
})
export class ReviewService {

  private allReviewsUrl = "http://localhost:8080/review";

  httpsOptions = {
    headers: new HttpHeaders({'Content-Type': 'application/json'})
  }

  constructor(private http: HttpClient) { }

  getAllReviews(): Observable<Review[]>{
    return this.http.get<Review[]>(this.allReviewsUrl)
      .pipe(
        tap(_ => console.log('fetched reviews')),
          catchError(this.handleError<Review[]>('getAllReviews', []))
      );
  }

  getReviewsByHardwareCode(code: string): Observable<Review[]>{
    let params = new HttpParams().set('code', code);
    return this.http.get<Review[]>(this.allReviewsUrl, {params: params})
      .pipe(
        tap(_ => console.log('fetched reviews for hardware code = ' + code)),
          catchError(this.handleError<Review[]>('getReviewsByHardwareCode', []))
      );
  }

  filterReviewsByText(filter: string): Observable<Review[]>{
    let params = new HttpParams().set('filter', filter);

    return this.http.get<Review[]>(this.allReviewsUrl, {params: params})
      .pipe(
        tap(_ => console.log('fetched filtered reviews')),
          catchError(this.handleError<Review[]>('filterReviewsByText', []))
      );

  }

  private handleError<T>(operation = 'operation', result?: T){
    return (error: any): Observable<T> => {
      console.log(operation);
      console.log(error);
      return  of(result as T);
    }
  }
}
