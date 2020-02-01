import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {FormsModule} from "@angular/forms";
import {HttpClientModule} from "@angular/common/http";

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NavbarComponent } from './navbar/navbar.component';
import { ContentComponent } from './content/content.component';
import { AllUsersComponent } from './content/all-users/all-users.component';
import { AddNewComponent } from './content/add-new/add-new.component';

import {RouterModule, Routes} from "@angular/router";


const routes: Routes = [
  {
    path: 'users/all',
    component: AllUsersComponent
  },

  {
    path: 'users/add',
    component: AddNewComponent
  },

  {
    path: '',
    component: AllUsersComponent
  }
];

@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    ContentComponent,
    AllUsersComponent,
    AddNewComponent

  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule,
    RouterModule.forRoot(routes)
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
