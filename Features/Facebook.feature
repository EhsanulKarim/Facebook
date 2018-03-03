Feature: Login to Facebook 

In order to Login 
as a user with valid username and password 
I want to enter username and password then click to Login button to access my Facebook account


Scenario Outline: Positive Login to Facebook

Given User is in Facebook HomePage
When User enter "<Username>" and "<Password> "
And  click on Login button
Then facebook account open

Examples: 
|Username|password|
|Ehsan	 |Numaira |		|