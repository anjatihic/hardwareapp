import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { AllHardwareComponent } from './all-hardware/all-hardware.component';
import { DetailedHardwareComponent } from './detailed-hardware/detailed-hardware.component';
import { InfoMessageComponent } from './info-message/info-message.component';
import { AppRoutingModule } from './app-routing.module';
import { HttpClientModule } from '@angular/common/http';
import { ReviewsComponent } from './reviews/reviews.component';
import { FindReviewComponent } from './find-review/find-review.component';
import {FormsModule} from "@angular/forms";

@NgModule({
  declarations: [
    AppComponent,
    AllHardwareComponent,
    DetailedHardwareComponent,
    InfoMessageComponent,
    ReviewsComponent,
    FindReviewComponent
  ],
  imports: [
    FormsModule,
    BrowserModule,
    AppRoutingModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
