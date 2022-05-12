import { NgModule } from '@angular/core';
import {RouterModule, Routes} from "@angular/router";
import {AllHardwareComponent} from "./all-hardware/all-hardware.component";
import {DetailedHardwareComponent} from "./detailed-hardware/detailed-hardware.component";
import {FindReviewComponent} from "./find-review/find-review.component";

const routes: Routes = [
  {path: 'hardware', component: AllHardwareComponent},
  {path: 'detail/:code', component: DetailedHardwareComponent},
  {path: 'findreview', component: FindReviewComponent}
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
