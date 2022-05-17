import { NgModule } from '@angular/core';
import {RouterModule, Routes} from "@angular/router";
import {AllHardwareComponent} from "./all-hardware/all-hardware.component";
import {DetailedHardwareComponent} from "./detailed-hardware/detailed-hardware.component";
import {LoginComponent} from "./login/login.component";
import {LoggedInGuard} from "./security/logged-in.guard";
import {AdminAuthorityGuard} from "./security/admin-authority.guard";
import {ForbiddenPageComponent} from "./forbidden-page/forbidden-page.component";
import {PageNotFoundComponent} from "./page-not-found/page-not-found.component";

const routes: Routes = [
  {
    path: '',
    redirectTo: 'home',
    pathMatch: 'full'
  },
  {
    path:'login',
    component: LoginComponent
  },
  {
    path: 'home',
    component: HomeComponent
  },
  {
    path: 'hardware',
    component: AllHardwareComponent,
    canActivate: [LoggedInGuard]
  },
  {
    path: 'detail/:code',
    component: DetailedHardwareComponent,
    canActivate: [LoggedInGuard]
  },
  {
    path: 'new-hardware',
    component: NewHardwareComponent,
    canActivate: [AdminAuthorityGuard]
  },
  {
    path: 'forbidden',
    component: ForbiddenPageComponent
  },
  {
    path: '**',
    component: PageNotFoundComponent
  }
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
