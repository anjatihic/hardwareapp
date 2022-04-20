import { Component, Input, OnInit } from '@angular/core';
import { Hardware } from '../models/hardware';

@Component({
  selector: 'app-detailed-hardware',
  templateUrl: './detailed-hardware.component.html',
  styleUrls: ['./detailed-hardware.component.css']
})
export class DetailedHardwareComponent implements OnInit {

  @Input() hardware!: Hardware;

  constructor() {}



  ngOnInit(): void {

  }

}
