import { Component } from '@angular/core';
import { environment } from '../environments/environment';
import { Http, Response } from '@angular/http';
import { Observable } from 'rxjs/Observable';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'Super Brain';
  test;
  constructor (private http: Http) {
    this.http.get(environment.webserviceUrl + 'test').subscribe(response => {
      this.test = response.text();
      console.log('response', response);
    });
  }
}
