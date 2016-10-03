Feature: Checkout

#Scenario Outline: Checkout a banana
#Given the price of a "banana" is 40C
#When I checkout <count1> "banana"
#Then the total price should be <total1>

#Examples:
#|count1|total1|
#|1    |40   |
#|2    |80   |


#Scenario Outline: Two banana scanned separately
#Given the price of a "banana" is 40C
#When I checkout <count2> "banana"
#And I checkout <count2> "banana"
#Then the total price should be <total2>

#Examples:
#|count2|total2|
#|1    |80   |
#|2    |160  |

Scenario: A banana and an apple
Given the price of a "banana" is 40C
And the price of a "apple"  is 25C
When I checkout 1 "banana"
And I checkout 1 "apple"
Then the total price should be 65C