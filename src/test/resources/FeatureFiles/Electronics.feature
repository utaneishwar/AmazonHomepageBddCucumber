Feature: Electonics On Amazon


Background:
Given user clicks on sign in tab
When user clicks on email or mobile phone number
And user enter username as mob number "8788584611"
And user cliks on continue button 
And user cliks on Password button 
And user send password as "Pass@123"
And clicks on sign in button 
Then user should navigate to home page of amazon

@Test(order=1)
Scenario: Electronics on homepage
When user clicks on Electronics module on Amazon homepage
And user clicks on laptop and accessories
And user clicks on pen drives
And user clicks on Hp 
And user clicks on add to cart 
Then user should go on new window
And user close the window 


