@OrangeLogin
Feature: To Validate the loginCredentials in OrangeHRM

  Scenario Outline: validating loginPage with valid and invalid credentials
    Given open the official page of OrangeHRM
    When user enters "<userName>" & "<passWord>"
    Then user click submit button
    And validates the Credentials

    Examples: 
      | userName | passWord |
      |Admin|admin123|
      |Admin0|admin456|
      |Admin1|admin789|
