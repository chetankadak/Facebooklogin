

Feature: Sign Up feature
  I want to create a new facebook acount

 @smoketesting
  Scenario: create facebook acount
    Given user is on facebook signup page
    When user enter firstname "Vikshita"
    And user enter lastname "Kharat"
    And user enter birthday date "10"
    And user enter birthday month "9"
    And user enter birthday year "1994"
    And user select gender "-1"
    And user select on custom "-1"
    And user select the text "1"
    And user enter mobile number "8521478960"
    And user enter password "14522qa"
     And user clicks on sign up
    Then close the browser

 @Systemintegrationtesting
  Scenario Outline: create facebook acount
    Given user is on facebook signup page
    When user enter firstname "<firstname>"
    And user enter lastname "<lastname>"
    And user enter birthday date "<birthday>"
    And user enter birthday month "<birthmonth>"
    And user enter birthday year "<birthyear>"
    And user select gender "<gendername>"
    And user enter mobile number "<emailidname>"
    And user enter password "<passwordname>"
    And user clicks on sign up
    Then close the browser
    
    Examples: 
      | firstname | lastname | birthday | birthmonth |birthyear |gendername | emailidname |passwordname|
      | chetan    |   kadak  |   10     |    12     | 2000 | 2 | chetank@gmail.com | klsjklj47 |
      | shubham   |   tibole |   13     |    5     | 1997 | 1 |shubham@gmail.com | sahha456 |
      | Pawan     |   tibole |   21     |    7     | 2000 | 2 | pawan@gmail.com | hkhskh47 |
