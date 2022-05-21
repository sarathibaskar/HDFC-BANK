Feature: Verifying HDFC bank
Scenario Outline: Verifying HDFC login page
Given I am enter the HDFC URL
When I am enter the Invalid "<User Id>" And Click Continue Button
When I am enter Password "<Password>" And Click Login Button
Then I will verfying the Invalid username or password error messaging dispalyed 

Examples:
|User Id|Password|
|134567890345678|Sarathi@18|
  