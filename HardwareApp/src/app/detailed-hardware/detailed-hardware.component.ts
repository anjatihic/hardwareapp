import { Component, Input, OnInit } from '@angular/core';
import { Hardware } from '../models/hardware';
import {ActivatedRoute} from "@angular/router";
import {HardwareServiceService} from "../services/hardware-service.service";
import {filter, find, first, map, Observable} from "rxjs";

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
    const codeNew = <string> this.code;
    console.log(this.hardwareService.getAllHardware());
    const foundHardware= this.hardwareService.getHardwareByCode(codeNew);

    console.log("Typeof " + typeof (foundHardware));
    console.log(this.hardware);
    console.log(this.hardware.name);
  }


}
