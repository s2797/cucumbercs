
Feature: Title of your feature
 
  Scenario: cart
    Given Alex has registered in testmeapp
    And   alex searches a particular product like headphones 
    When  try to procced to payment without adding any item to cart
    Then  testmeapp doesnt display the cart
    

  