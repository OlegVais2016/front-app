import {Component, Input, OnInit} from '@angular/core';
import User from "../../model/User";
import {UserHttpService} from "../../user-http.service";

@Component({
  selector: 'app-all-users',
  templateUrl: './all-users.component.html',
  styleUrls: ['./all-users.component.css']
})
export class AllUsersComponent implements OnInit {

  public users: User [] = [];
  constructor(private userHttpService: UserHttpService) {
  }
  getUsers() {
    return this.userHttpService
      .getUsersObservable()
      .subscribe(data => this.users = data);
  }

  delete(user: User): void {
    this.users = this.users.filter(h => h !== user);
    this.userHttpService.deleteUser(user).subscribe();
  }
  ngOnInit() {
    this.getUsers();
  }



}
