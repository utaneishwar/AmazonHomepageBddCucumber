Feature: amzon application


Scenario: Login page

Given user clicks on sign in tab
When user clicks on email or mobile phone number
And user enter username as mob number "8788584611"
And user cliks on continue button 
And user cliks on Password button 
And user send password as "Pass@123"
And clicks on sign in button 
Then user should navigate to home page of amazon
