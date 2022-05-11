import { Component, OnInit } from '@angular/core';
import {Review} from "../models/review";
import {ReviewService} from "../services/review.service";
import {ActivatedRoute} from "@angular/router";

@Component({
  selector: 'app-reviews',
  templateUrl: './reviews.component.html',
  styleUrls: ['./reviews.component.css']
})
export class ReviewsComponent implements OnInit {
  public reviewsByCode!: Review[];
  public code!: string | null;


  constructor(private ReviewService: ReviewService, private route: ActivatedRoute) { }

  ngOnInit(): void {
    this.code = this.route.snapshot.paramMap.get('code');
    this.getReviewsByHardwareCode();
  }

  getReviewsByHardwareCode(): void{
    this.ReviewService.getReviewsByHardwareCode(<string> this.code)
      .subscribe(reviews => this.reviewsByCode = reviews);
  }


}
