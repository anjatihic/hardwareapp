import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { AllHardwareComponent } from './all-hardware/all-hardware.component';
import { DetailedHardwareComponent } from './detailed-hardware/detailed-hardware.component';
import { InfoMessageComponent } from './info-message/info-message.component';
import { AppRoutingModule } from './app-routing.module';

@NgModule({
  declarations: [
    AppComponent,
    AllHardwareComponent,
    DetailedHardwareComponent,
    InfoMessageComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
