import { Injectable } from '@angular/core';
import { Observable, of } from 'rxjs';
import { Hardware } from '../models/hardware';
import { ALL_HARDWARE } from '../models/mock-hardware';

@Injectable({
  providedIn: 'root'
})
export class HardwareServiceService {

  constructor() { }

  getAllHardware(): Observable<Hardware[]> {
    return of(ALL_HARDWARE);
  }
}
