import { RegistrationService } from './../registration.service';
import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-registration',
  templateUrl: './registration.component.html',
  styleUrls: ['./registration.component.css']
})
export class RegistrationComponent implements OnInit {

  constructor(private _service:RegistrationService) { }

  ngOnInit(): void {
  }

  registerUser(){
    this._service.registerUserFromRemote;
  }

}
