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
import { ForbiddenPageComponent } from './forbidden-page/forbidden-page.component';
import { LoginComponent } from './login/login.component';
import { PageNotFoundComponent } from './page-not-found/page-not-found.component';

@NgModule({
  declarations: [
    AppComponent,
    AllHardwareComponent,
    DetailedHardwareComponent,
    InfoMessageComponent,
    ReviewsComponent,
    FindReviewComponent,
    ForbiddenPageComponent,
    LoginComponent,
    PageNotFoundComponent
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
