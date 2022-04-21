import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { AllHardwareComponent } from './all-hardware/all-hardware.component';
import { DetailedHardwareComponent } from './detailed-hardware/detailed-hardware.component';
import { InfoMessageComponent } from './info-message/info-message.component';
import { AppRoutingModule } from './app-routing.module';
import { HttpClientModule } from '@angular/common/http';
import { AllReviewsComponent } from './all-reviews/all-reviews.component';
import { DetailedReviewComponent } from './detailed-review/detailed-review.component';

@NgModule({
  declarations: [
    AppComponent,
    AllHardwareComponent,
    DetailedHardwareComponent,
    InfoMessageComponent,
    AllReviewsComponent,
    DetailedReviewComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
