Feature: login feature
We need validate the login feature of test cases

@smoketesting @regressiontesting 
  Scenario: Validate the login functionality with valid username and password
    Given User should be login page
    When  user enters valid username "chetan@gmail.com"
    And user enters valid password "45ck442"
    And Clicks on submit
    #And close the browser
    
    @Systemitegrationtesting
    Scenario Outline: Validate the login functionality with valid username and password
    Given User should be login page
    When  user enters valid usernameC"<username>"
    And user enters valid passwordC"<password>"
    And Clicks on submit
    #And close the browser
    Examples: 
      | username  | password |
      | Testing@gmail.com | P23543|
      | Mahesh@gmail.com |  Pfh3738 |