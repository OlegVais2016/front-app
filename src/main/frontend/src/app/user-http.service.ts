import {Injectable} from '@angular/core';
import {HttpClient, HttpHeaders} from "@angular/common/http";
import {Observable, of} from "rxjs";
import User from "./model/User";


@Injectable({
  providedIn: 'root'
})
export class UserHttpService {

  //private httpClient: HttpClient;     compiler will do

  constructor(private httpClient: HttpClient){
    //this.httpClient = httpClient;      compiler will do
  }

  private usersUrl = 'api/users';  // URL to web api

  httpOptions = {
    headers: new HttpHeaders({ 'Content-Type': 'application/json' })
  };

  getUsersObservable(): Observable<User[]> {
    return this.httpClient.get<User[]>(this.usersUrl);
  }


  addUser (user: User): Observable<User> {
    return this.httpClient.post<User>(this.usersUrl, user, this.httpOptions);
  }


  deleteUser (user: User | string): Observable<User> {
    const id = typeof user === 'string' ? user : user.id;
    const url = `${this.usersUrl}/${id}`;

    return this.httpClient.post<User>(url, this.httpOptions);
  }


}
