# Spring Boot Oauth2 Client example

This is a Java Maven multimodule application containing: 

* An **authorization server** module that acts also as a **resource server**
* A  **client application** module that uses the authorization server for authentication, also for getting access to a resource on the resource server.

## How to run

From the **authorization server** module and **client application** module respectively execute:

`mvn spring-boot:run`

The above commands will start the authorization server on: http://localhost:8081/auth  and client application on

http://localhost:8082/client

## How to test

* Using a browser go to: http://localhost:8082/client/its-me - This will authenticate the current user against
the authorization server. The username/password is john/123. You should see: _The principal's name is: john_

* Using a browser go to: http://localhost:8082/client/its-also-me - This will access the http://localhost:8081/auth/user/also-me resource on the resource server.
You should get: _Message from auth server: The principal's name is: SampleClientId_




