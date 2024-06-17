
# Markersharks Assessment

Implement a user registration and user details fetch endpoints for a RESTful API using Spring Boot.


## Tech Stack



**Language:** Java 21.0.3

**Framework:** Spring Boot

**Dependencies:** Spring Data JPA , Spring Boot Web , Spring Boot DevTools , MySql connector , lombok & Spring Boot starter test

**Software required:** IntelliJ , MySQL Workbench & Postman 


## Run Locally

Click on code

Download the Zip file and extract it 

Open IntelliJ

Open Project
```bash
File->Open->(Locate the file location of the project)->Open->This window
```
Setup SDK (This project uses Oracle OpenJDK version 22.0.1)
```bash
File->Project Structure->Project Settings->Project->SDK
```
Enable Annotation Processing
```bash
File->Settings->Build,Execeution,Deployment->Compilers->Annotation Processors->Enable Annotation Processing->Apply->Ok
```
Open UserDataApplication class
```bash
Marksharks_Assessment-main->src->main->java->com.example.UserData->UserDataApplication
```
Run UserDataApplication class

Open Postman

**FOR POST METHOD**

Set the method as POST

Set the Url
```bash
http://localhost:8080/api/user/register
```

Click->Body->Raw (Select JSON)
```bash
{
    "username":"John",
    "email":"John@gmail.com",
    "password":"1234"
}
```
Write the above value in the Body

Click Send

**FOR GET METHOD**

Set the method as GET

Set the Url
```bash
http://localhost:8080/api/user/fetch/{username}
```
Enter a username in {username}

Click Send
