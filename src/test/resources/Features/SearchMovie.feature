Feature: to validate the search page of BookMyShowWebsite

Scenario Outline: to validate the SearchPage with valid credentials

Given the user is in the login page
When the user clicking the search page
And the user entering the "<movieName>" moviename
Then the user should able to see the moviename


Examples:
|movieName|
|DoLittle |

