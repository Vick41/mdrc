Feature: Deal with Leaftaps Login Credentials

#Background:

#Given Launch the Browser 

#And Load the URL

#And set implicitwait

#And maximize the page

@Smoke
Scenario Outline: Login Positive

And enter username as <username>

And enter password as <password>

When click the login button 

#Then close the browser 

Examples:
|username|password|
|DemoSalesManager|crmsfa|
|DemoCSR|crmsfa|

Scenario: Login Negative

And enter username as Vicky

And enter password as crmsfa

When click the login button

But verify the error

#Then close the browser 


