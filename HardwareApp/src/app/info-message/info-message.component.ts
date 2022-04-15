import { Component, Input, OnInit } from '@angular/core';
import { Hardware } from '../models/hardware';

@Component({
  selector: 'app-info-message',
  templateUrl: './info-message.component.html',
  styleUrls: ['./info-message.component.css']
})
export class InfoMessageComponent implements OnInit {

  @Input() hardware!: Hardware;

  constructor() { }

  ngOnInit(): void {
  }

}
