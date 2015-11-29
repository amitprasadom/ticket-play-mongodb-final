# ticket-play-mongodb-final

##Synopsis
 This module is created to record and maintain the customer complain.

##Motivation

Customers often have complaints which call the customer service representatives and talk to. 
The CSR then logs the information by choosing the available areas to which the issue is related to, into the system.
This record is called as a ticket. A ticket has the below details
1. Customer Information
2. Comments
3. Created By
4. Assigned To
5. Status (New,Open – once it is assigned to someone,Closed)

##tools
 playframework
 scala
 mongodb
 jquery
 bootstrap

##Features 

1. Log the ticket.
2. Add Comments to a ticket
3. Change the status
4. Assign to
5. Once closed this ticket should not be editable
6. View the tickets
7. REST Services in the backend.

##Live on heroku 
https://cryptic-tor-8929.herokuapp.com


##API 
 # ticket list

GET /ticket

 # Add ticket

GET /ticket/new

POST /ticket/save

 # Edit existing ticket

GET /ticket/:id

POST /ticket/:id





##License

(The MIT License)

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the 'Software'), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED 'AS IS', WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
