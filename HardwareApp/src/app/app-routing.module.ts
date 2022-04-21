import { NgModule } from '@angular/core';
import {RouterModule, Routes} from "@angular/router";
import {AllHardwareComponent} from "./all-hardware/all-hardware.component";
import {DetailedHardwareComponent} from "./detailed-hardware/detailed-hardware.component";
import {AllReviewsComponent} from "./all-reviews/all-reviews.component";
import {DetailedReviewComponent} from "./detailed-review/detailed-review.component";

const routes: Routes = [
  {path: 'hardware', component: AllHardwareComponent},
  {path: 'detail/:code', component: DetailedHardwareComponent},
  {path: 'review', component: AllReviewsComponent},
  {path: 'review/:code', component: DetailedReviewComponent}
];

@NgModule({
  declarations: [],
  imports: [
    RouterModule.forRoot(routes)
  ],
  exports: [
    RouterModule
  ]
})
export class AppRoutingModule { }
