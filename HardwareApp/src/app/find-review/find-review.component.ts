import { Component, OnInit } from '@angular/core';
import {Review} from "../models/review";
import {ReviewService} from "../services/review.service";

@Component({
  selector: 'app-find-review',
  templateUrl: './find-review.component.html',
  styleUrls: ['./find-review.component.css']
})
export class FindReviewComponent implements OnInit {

  allReviews!: Review[];
  searchedReviews!: Review[];

  constructor(private reviewService: ReviewService) { }

  ngOnInit(): void {
    this.getAllReviews();

  }

  getAllReviews(): void{
    this.reviewService.getAllReviews()
      .subscribe(allReviews => this.allReviews = allReviews);
  }

  findAllByFilter(filter: string): void{
    filter = filter.trim();

    this.reviewService.filterReviewsByText(filter)
      .subscribe(filtered => this.searchedReviews = filtered);
  }
}
