
Feature: register TestMeApp
  I want to use this template for my feature file

  
  Scenario: User Registration
    Given I want to launch the brower
    And enter the url
    And click on signup button
    Then enter the valid credentials
    
    |Username   |Firstname | Lastname| Password     | confirm password    | Gender                     | Email        | Mobile num|DOB        |Address        |Security q |Security ans|
    |pannikutty |susmitha  | sarathi | kani1234     | kani1234            | Female                   |kani@gmail.com|8098912695 |29/12/1997 |20,uthangarai  |Q1         |hosur       |
    
    And click on register 
     
 
  
      