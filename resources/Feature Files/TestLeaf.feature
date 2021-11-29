@TestLeaf
Feature: Validating the functionality of LeafGround
Background: entering leafGround Url
Given enter the url of leafGround
@Editbox
Scenario: Interacting with Editbox
When click the EditBox image
And enter the email address
Then get the default text
And clear the default text
But check whether the field is disabled
@Images
Scenario: Interacting with Images
When click the Images image
And click the homepage image 
Then reclick the Images button
@Radio
Scenario: Interacting with Radio buttons
When click the RadioButton image
Then check which button was clicked default




