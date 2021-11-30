@Amazon
Feature: Adding products in cart in Amazon site
Background: launching amazon Url
Given enter into amazon site
Scenario Outline: adding a product in cart
When search a "<product>" in searchBox
And click a search button
Then click the product 
And add the product into cart
But verify whether the product is added

Examples:
|product|
|Samsung m32|
|boat rockrez 330|
|dell kb216 keyboard|

