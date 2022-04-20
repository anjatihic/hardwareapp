import { Injectable } from '@angular/core';
import {catchError, Observable, of, tap} from 'rxjs';
import { Hardware } from '../models/hardware';
import { ALL_HARDWARE } from '../models/mock-hardware';
import {HttpClient, HttpHeaders} from "@angular/common/http";

@Injectable({
  providedIn: 'root'
})
export class HardwareServiceService {

  private allHardwareUrl = 'http://localhost:8080/hardware';

  httpsOptions = {
    headers: new HttpHeaders({'Content-Type': 'application/json'})
  }

  constructor(private http: HttpClient) { }

  getHardwareByCode(code: string): Observable<Hardware>{
    return this.http.get<Hardware>(this.allHardwareUrl + "/" + code).pipe(
      tap(_ => console.log('fetched hardware with code = ' + code))
    );
  }

  getAllHardware(): Observable<Hardware[]> {
    return this.http.get<Hardware[]>(this.allHardwareUrl)
      .pipe(
        tap(_ => console.log('fetched hardware')),
          catchError(this.handleError<Hardware[]>('getAllHardware', []))
      );
  }

  addHardware(hardware: Hardware): Observable<Hardware> {
    return this.http.post<Hardware>(this.allHardwareUrl, hardware, this.httpsOptions).pipe(
      tap((newHardware: Hardware) => console.log('added hardware w/ code = ${newHardware.code}')),
      catchError(this.handleError<Hardware>('addHardware'))
    );
  }

  deleteHardware(hardware: Hardware | string): Observable<Hardware>{
    const code = typeof hardware === 'string' ? hardware : hardware.code;
    const url = this.allHardwareUrl + "/" + code;

    console.log(hardware);

    return this.http.delete<Hardware>(url, this.httpsOptions).pipe(
      tap(_ => console.log('deleted hardware w/ code = ' + code)),
      catchError(this.handleError<Hardware>('deleteHardware'))
    )
  }


  private handleError<T>(operation = 'operation', result?: T){
    return (error: any): Observable<T> => {
      console.error(operation);
      console.error(error);
      return  of(result as T);
    }
  }
}
