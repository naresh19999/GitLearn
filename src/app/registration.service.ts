import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';
import { UserRegister } from './user-register';

@Injectable({
  providedIn: 'root'
})
export class RegistrationService {

  constructor(private _http:HttpClient) { }

  public registerUserFromRemote(userRegister:UserRegister):Observable<any>{
    return this._http.post<any>("http://localhost:8080/register",userRegister)

  }
}
