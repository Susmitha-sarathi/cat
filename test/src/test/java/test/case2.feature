
Feature: Login

 
  Scenario Outline: User login
  Given launch the browser
And i enter the url
And click on signin button
And enter the username "<username>"
And enter the password "<password>"
Then click on login button
  
    

    Examples: 
      |username        | password  |
      |AlexUser        |Alex@123   |