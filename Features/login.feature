Feature: Login Feature
@functional
Scenario: Sucessfully login with valid credential
Given User launch the chromebrwser
When User enter the URL "https://demo.actitime.com/login.do"
And User enter the username as "admin" and password as "manager"
And Click on login button
Then Home page title should be "actiTIME - Enter Time-Track"
And Click on logout button

@smoke
Scenario Outline: Sucessfully login with valid credential With DDT
Given User launch the chromebrwser
When User enter the URL "<url>"
And User enter the username as "<username>" and password as "<password>"
And Click on login button
Then Home page title should be "<title>"
And Click on logout button

Examples:
|url|username|password|title|
|https://demo.actitime.com/login.do|admin|manager|actiTIME - Enter Time-Track|