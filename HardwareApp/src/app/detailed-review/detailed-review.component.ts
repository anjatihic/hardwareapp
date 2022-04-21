import { Component, OnInit } from '@angular/core';
import {Hardware} from "../models/hardware";
import {ActivatedRoute} from "@angular/router";
import {HardwareServiceService} from "../services/hardware-service.service";
import {Review} from "../models/review";
import {ReviewServiceService} from "../services/review-service.service";

@Component({
  selector: 'app-detailed-review',
  templateUrl: './detailed-review.component.html',
  styleUrls: ['./detailed-review.component.css']
})
export class DetailedReviewComponent implements OnInit {
  public review!: Review;
  public code!: string | null;


  constructor(private route: ActivatedRoute, private reviewService: ReviewServiceService) {}

  ngOnInit(): void {
    this.code = this.route.snapshot.paramMap.get('code');
    this.getReviewByCode();

  }

  getReviewByCode(): void{
    this.reviewService.getReviewByCode(<string>this.code)
      .subscribe(value => this.review = value);
  }


}
