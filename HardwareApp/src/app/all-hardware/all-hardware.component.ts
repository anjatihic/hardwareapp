import { Component, OnInit } from '@angular/core';
import { Hardware } from '../models/hardware';
import { HardwareServiceService } from '../services/hardware-service.service';
import {AuthenticationService} from "../security/authentication.service";

@Component({
  selector: 'app-all-hardware',
  templateUrl: './all-hardware.component.html',
  styleUrls: ['./all-hardware.component.css']
})
export class AllHardwareComponent implements OnInit {

  allHardware!: Hardware[];
  selectedHardware!: Hardware;
  isUserAdmin: boolean;

  constructor(
    private HardwareService: HardwareServiceService,
    private authenticationService: AuthenticationService
  ) {
    this.isUserAdmin = this.authenticationService.isUserAdmin();
  }

  ngOnInit(): void {
    this.getAllHardware();
  }

  getAllHardware(): void{
    this.HardwareService.getAllHardware()
      .subscribe(allHardware => this.allHardware = allHardware);
  }

  onSelect(hardware: Hardware): void{
    this.selectedHardware = hardware;
  }

  add(name: string, code: string, type: string, numberAvailable: number, price: number): void{
    name = name.trim();
    code = code.trim();
    type = type.trim();

    if(!name || !code || !type || !numberAvailable || !price){ return; }

    this.HardwareService.addHardware({name, code, type, numberAvailable, price} as Hardware)
      .subscribe(hardware => {
        this.allHardware.push(hardware)
      })
  }

  delete(hardware: Hardware): void{
    this.HardwareService.deleteHardware(hardware)
      .subscribe({
        next: (res) => {
          console.log(res);
          location.reload();
        },
        error: (e) => console.error(e)
      });
  }

}
