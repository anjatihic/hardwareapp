import { Component, OnInit } from '@angular/core';
import {Hardware} from "../models/hardware";
import {HardwareServiceService} from "../services/hardware-service.service";
import {Review} from "../models/review";
import {ReviewServiceService} from "../services/review-service.service";

@Component({
  selector: 'app-all-reviews',
  templateUrl: './all-reviews.component.html',
  styleUrls: ['./all-reviews.component.css']
})
export class AllReviewsComponent implements OnInit {
  allReviews!: Review[];
  selectedReview!: Review;

  constructor(private reviewService: ReviewServiceService) { }

  ngOnInit(): void {
    this.getAllReviews();
  }

  getAllReviews(): void{
    this.reviewService.getAllReviews()
      .subscribe(reviews => this.allReviews = reviews);
  }

  onSelect(review: Review): void{
    this.selectedReview = review;
  }
}
