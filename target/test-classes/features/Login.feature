Feature: SignIn page feature


Scenario: Login with correct credentails 
Given user is on login page
When user enters email "ashwanipandeycert@gmail.com"
And user enters password "Noon@2121"
And user clicks on Login button
Then user gets the title of the page
And page title should be "Online Shopping UAE | Fashion ,Electronics, Beauty, Baby | Noon"
