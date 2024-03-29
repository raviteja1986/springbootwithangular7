import {Injectable} from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';

import { User } from '../models/user.model';


const httpOptions = {
  headers: new HttpHeaders({ 'Content-Type': 'application/json' })
};

@Injectable()
export class UserService {

  constructor(private http:HttpClient) {}

  //private userUrl = 'http://localhost:8080/user-portal/users';
 private userUrl = 'http://localhost:8080/api/users';
  //private userUrl = '/api';

  //private userUrl = 'http://localhost:8080/api/';

  public getUsers() {
   // return this.http.get<User[]>(this.userUrl);

    return this.http.get<User[]>('http://localhost:8080/api/users');
  }

  public deleteUser(user) {
    return this.http.delete(this.userUrl + "/"+ user.id);
  }

  public createUser(user) {

    return this.http.post<User>('http://localhost:8080/api/create', user);

    // return this.http.post<User>(this.userUrl, user);
  }

}
