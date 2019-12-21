Feature: Amazon Shoping

Scenario: Buy toys

Given open chrome browser
And Nevigate to url
When user search toys in search text box
And user click search button
And user click on first product
And user click on add to cart button
And user click on add to procedd to check out button
Then user should see sign in page