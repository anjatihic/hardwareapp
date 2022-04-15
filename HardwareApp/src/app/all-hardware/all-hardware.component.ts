import { Component, OnInit } from '@angular/core';
import { Hardware } from '../models/hardware';
import { HardwareServiceService } from '../services/hardware-service.service';

@Component({
  selector: 'app-all-hardware',
  templateUrl: './all-hardware.component.html',
  styleUrls: ['./all-hardware.component.css']
})
export class AllHardwareComponent implements OnInit {

  allHardware!: Hardware[];
  selectedHardware!: Hardware;

  constructor(private HardwareService: HardwareServiceService) { }

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

}
