



Feature: search for the product
  I want to use this template for my feature file

  @tag
  Scenario: search for Hearphone
  When Alex has registered into TestMeapp
  And Alex search a particular product like Hearphone
  And try to procced to payment without adding any item in the cart
  Then TestMe doesn't display add to cart

  