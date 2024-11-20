# Spring Boot Application with Clean Architecture
## Stack
- Java 17
- Spring Boot 3.3.5
- MongoDB 5.0.30
- Junit-Jupiter (tests) 5.8.1
## Description
The project idea is a service where non-authorized user can send a feedback 
form. This feedback form saves in a database and returns an url address of 
a created form to user.\
Idea was realised by using R.Martin's Clean Architecture conception.\
The app has four-level structure:
- domain
- application
- adapters
- presentation 
## Endpoints
<b>/api/v1/feedback-form/create</b>

Endpoint provides creating a feedback form.

<b>/api/v1/feedback-form/{id}</b>

This endpoint visualizes a feedback form which has already created.
