Feature: Dashboard Page Feature

Background:
Given user has already logged in to application
|email|password|
|ashwanipandeycert@gmail.com|Noon@2121|

Scenario: Order page functionlity test when there is no order
Given user is on Home page
When user click to MyAccount option
When user click to order option
Then order page should  be "You have no previous orders"