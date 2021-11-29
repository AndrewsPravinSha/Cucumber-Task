@Spare
Feature: ABCD
Background: url
Given launch Url
Scenario: click button
Given click button
When reclick button
Then close button

Scenario: click image
Given click image
When reclick image
Then close image
