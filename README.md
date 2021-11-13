# RegistrationProject

Project Starts with Registration Feature

Step 1
For Registration user have to send a Post request to http://localhost:8080/Registration/SendOtp/ with body in Json format
eg. 
{
    "mobile": 1234567890,
    "name": "Rishav",
    "username": "rparth",
    "password": "123456789",
    "dataofbirth": "01/01/2020",
    "address": "Ranchi"
}
response from this service will be 
{"Status":"Success","Details":"ydvd756e1778ye9r98"}
status will be Success only if otp was sent to number


Step 2

Now User have to verify Otp for that they have to request another service http://localhost:8080/Registration/verifyOtp/
with body in json format eg
   {
    "session": "ydvd756e1778ye9r98", // this is same which we received from previous service
    "mobile": 8114787103,
    "otp": 418607,  // enter what you received in your phone
    "name": "Rishav",
    "username": "rparth",
    "password": "aadhar",
    "dataofbirth": "01/01/2020",
    "address": "Ranchi"
}

reponse will be 
{"Status":"Success","Details":"OTP Matched"} in case otp and session matched else will throw error

if it get sucesss data will be saved to db and session will be created for that user.


Step 3

Login 

user have to request http://localhost:8080/Registration/login/ with body in json format eg
{
    "mobile" : 1234567890,
    "password" : "1234567890"
}

if password and mobile number matched with data in db user will be logged in and new session will be created 



Logout 

user have to request http://localhost:8080/Registration/Logout/ 

if session is present for logged in user session will be destroyed.


User Profile Details 

user have to request http://localhost:8080/Registration/getsavedata/ 

user data will be picked from session and will be shared in json format .




