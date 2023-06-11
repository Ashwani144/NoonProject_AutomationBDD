Feature: Search page feature

@smoke
Scenario: search the product 
Given user is on search home page
When user type the "Electronic" in search box
And user click to 3rd option
Then electric scooter is display