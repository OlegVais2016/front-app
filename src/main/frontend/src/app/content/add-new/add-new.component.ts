import { Component, OnInit } from '@angular/core';
import {UserHttpService} from "../../user-http.service";
import User from "../../model/User";

@Component({
  selector: 'app-add-new',
  templateUrl: './add-new.component.html',
  styleUrls: ['./add-new.component.css']
})
export class AddNewComponent implements OnInit {

  users: User[];
  constructor(private userHttpService: UserHttpService) { }

  ngOnInit() {
  }
  add(firstName: string, lastName: string, age: number): void {

    this.userHttpService.addUser({ firstName, lastName, age } as User)
      .subscribe(user => {
        this.users.push(user);
      });
  }

  Number(value: string) {
    let age = parseInt(value)
    return age;
  }
}
