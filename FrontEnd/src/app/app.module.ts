import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
import { StuDashComponent } from './stu-dash/stu-dash.component';
import { InstructorComponent } from './instructor/instructor.component';

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    StuDashComponent,
    InstructorComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
