import { Component, OnInit } from '@angular/core';
import { Hardware } from '../models/hardware';
import {ActivatedRoute} from "@angular/router";
import {HardwareServiceService} from "../services/hardware-service.service";

@Component({
  selector: 'app-detailed-hardware',
  templateUrl: './detailed-hardware.component.html',
  styleUrls: ['./detailed-hardware.component.css']
})
export class DetailedHardwareComponent implements OnInit {
  public hardware!: Hardware;
  public code!: string | null;


  constructor(private route: ActivatedRoute, private hardwareService: HardwareServiceService) {}

  ngOnInit(): void {
    this.code = this.route.snapshot.paramMap.get('code');
    this.getHardwareByCode();

  }

  getHardwareByCode(): void{
    this.hardwareService.getHardwareByCode(<string>this.code)
      .subscribe(value => this.hardware = value);
  }


}
