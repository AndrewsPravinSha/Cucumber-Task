@Amazon
Feature: Adding products in cart in Amazon site
Scenario Outline: adding a product in cart
Given enter into amazon site
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

