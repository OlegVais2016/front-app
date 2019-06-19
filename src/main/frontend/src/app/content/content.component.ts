import { Component, OnInit } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import User from "../model/User";

@Component({
  selector: 'app-content',
  templateUrl: './content.component.html',
  styleUrls: ['./content.component.css']
})
export class ContentComponent implements OnInit {

  private httpClient: HttpClient;

  public users: User [] = [];

  constructor(httpClient: HttpClient) {
    this.httpClient = httpClient;
  }

  getUsers(){
    return this.httpClient
      .get<User []>("api/users")
      .subscribe(data => this.users = data);
  }

  ngOnInit() {
    this.getUsers();
  }

}
