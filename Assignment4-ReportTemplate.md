**SENG 438 - Software Testing, Reliability, and Quality**

**Lab. Report \#4 – Mutation Testing and Web app testing**

| Group \#:           |   |
|---------------------|---|
| Student Names:      |   |
| Chad Holst          |   |
| Chace Nielson       |   |
| Tony Vo             |   |
| Olisehemeka Chukwuma|   |

# Introduction

In this assignment, we were tasked with engaging with two different kinds of testing: Mutation Testing and Graphical User interface (GUI) testing. Mutation testing, also known as Fault-based testing, involves the injection of artificial faults into the System Under Test (SUT). Syntactic (syntax-based) variations are applied in a systematic way to the SUT to create faulty versions of the program which exhibit different behaviors in comparison to the program's actual functionality. Mutant testing then seeks to help create a test suite that will be able to catch these faults.  In the first part of the lab. We injected mutation faults into a Java code-base using a mutation testing tool, the PIT Mutation test tool. Interpreted the mutation coverage data and developed new test cases to increase the mutation coverage of our test suites for the DataUtilities class and Range class. In the second part of the lab, we engaged in GUI test automation, recording and playing, which involved testing a product that implemented a graphical user interface using testing software tools, Selenium and SikuliX. We focused on semi-automated test generation using the capturing and replaying of user actions on the GUI using the testing tools.

# Analysis of 10 Mutants of the Range class 

![Mutants_1](https://user-images.githubusercontent.com/81201946/158873389-4a2ac03a-0735-491e-b0b5-0391936a5384.jpg)
![Mutants_2](https://user-images.githubusercontent.com/81201946/158873754-ea5f1fea-a49a-4d0b-976e-e773549788d1.jpg)

# Report all the statistics and the mutation score for each test class

Original Values of Mutation coverage for DataUtilities class and the Range class before test suite modification:

![Coverage_Before](https://user-images.githubusercontent.com/81201946/158865790-d76111e5-5868-4ed9-9c90-6519eb7092e2.png)

New Values of Mutation coverage for DataUtilities class and the Range class after test suite modification:

![After_Coverage](https://user-images.githubusercontent.com/81201946/158866161-8d1c5a3e-c95c-4e93-897a-535471e493ea.png)

Range Mutation coverage increase from 62% (782/1259) to 73% (913/1259) of mutants killed. It had a total of 131 mutant killed by additional tests.
DataUtilities Mutation coverage increase from 86% (593/687) to 87% (598/687) of mutants killed. It had a total of 5 mutants killed by additional tests.

DataUtilities already had very high Mutation coverage before starting this lab. After spending hours creating tests and looking for mutants to kill we decided that the overwhelming majority of the surviving mutants were equivalent mutants and that continuing with creating tests would be inefficient. 
Range had a much lower mutation converge to start with and many more methods than DataUtilities. This made it easier to find mutants and to kill an additional 11% of them

# Analysis drawn on the effectiveness of each of the test classes

Analysis of new test cases on the mutation coverage scores:

![Tests_Added](https://user-images.githubusercontent.com/81201946/158870533-45fda11d-e5bc-46cc-99ab-3788f7c7338d.jpg)

Tests were added to 7 different test classes. These tests increased the overall mutation coverage depending on how many mutants were already covered in the already existing tests. 

# A discussion on the effect of equivalent mutants on mutation score accuracy

The mutation coverage score is affected by the equivalent mutants since they can’t be killed. Therefore there will always be mutants that can’t be killed and the score will never be able to reach 100% as long as equivalent mutants are part of the total mutants. 

Equivalent mutants affected our results to a great extent. The first issue we faced had to do with our understanding of what an equivalent mutant is. We mainly didn’t understand that they would appeared in the pitest results. This resulted in more time spent trying to kill mutants that were unkillable. We also determined, through hours of trial and error, that for the DataUtilities class the majority of mutants that were alive when we started the lab were equivalent mutants. Due to our mutation coverage already being high for the class finding new mutants that could actually be killed became next to impossible and the group was only able to find 5 mutant that our test cases could kill.

# A discussion of what could have been done to improve the mutation score of the test suites

In order to improve the mutation coverage we could have spent more time analyzing the code line by line with all the possible mutant combinations. It would be very beneficial to spend time examining all the possible combinations the mutants created.
It was easy to follow all possible variable and path combinations with simple methods. For instance methods involving a return or even just a single if statement. For more complex methods it would be more difficult but even more beneficial to slowly go through the code to understand how the mutant changes it, and therefore how different inputs could kill the mutant.

Having more experience with coding, and especially experience with mutant testing would have come in handy while trying to follow complex paths caused by mutants. Having more practice with the specific skill would enable us to understand what works and what wouldn’t work when trying to kill mutants.

# Why do we need mutation testing? Advantages and disadvantages of mutation testing

Mutation testing is important as it greatly improves the quality of the source code. It ensures coverage of the code and is a great way to verify boundary cases for individual lines of code. It is a great addition to help establish good source code and create better tests.

Advantages
Great for catching small errors in the source code
Finding weaknesses in the source code
Improves quality of the source code
Helps to figure out how good the test suite is for testing the code base
Gives a high coverage of the code
Creates a stable and reliable system

Disadvantages 
Requires tools to effectively use, otherwise it would be near impossible to use
Requires a lot of mutants to have a positive effect of quality
The testers need a good understanding of mutation testing to be effective
Requires the source code
It takes time to identify ways to kill mutants and to recognize equivalent mutants

# Explain your SELENUIM test case design process

SELENIUM Tests
Login
Signout
Add item to cart
Remove item to cart
Search for item and click on item
Go to best buy facebook page
Sign up for newsletter
Change to french site

Design process 
First a website was chosen to carry the Graphical User Interface Testing, the website of choice being: https://www.bestbuy.ca/en-ca
Next, different functionalities were picked to be tested on the website, the total number of functionalities being 8. Tests were picked while making sure that they did not share a lot of similar functionality so as to help provide a more diverse set of test cases. Different areas of the web page were visited to observe the number of different buttons, hyperlinks and text boxes that could be tested. Input data was also chosen to test functionality that involved user input.
Login (assert value for password)
an assert value method for a valid password input and the test passed.
an assert value method for invalid password input and the test failed.
Forget Password (assert email for sending password change)
an assert value method for a valid email input and the test passed.
an assert value for invalid email input and the test failed.
Add item to cart
Assert title for the cart page and the test passed
Remove item to cart
Assert text for the cart page to indicate that no items are in the cart and the test passed.
Search for item and click on item
Search for jack reach and click on movie, assert the title is the jack reacher dvd page and the test passes
Change search to predator and the page will not be found and assert causes the test to fail
Go to best buy facebook page
After scrolling to the end of the website, in the bottom right corner, click on the facebook logo under the newsletter textbox 
Assert title for the facebook page passes the test 
Sign up for newsletter
After scrolling to the end of the website, in the bottom right corner, there is a textbox available to insert your email into the textbox 


Change to french site
After clicking on french page assert that the page title should be the title french version of best buy and test passed
Change click on french page to clicking on cart and assert causes the test to fail as title of current page is now wrong
Then each group member picked 2 functionalities to test using the Selenium IDE 

# Explain the use of assertions and checkpoints

In regards to GUI testing with Selenium, assertions are commands that can be used to check if a certain condition has been met. With the assert command, a Selenium test will fail if the condition is not met. As such, assertions can be used to verify that a test has reached the desired location of a website before continuing on with the test, such as asserting that the page has loaded the login page before entering the test login information. 

Checkpoints (or breakpoints in Selenium) are commands used to pause or stop the test from running at specified points in the code. Checkpoints can be used to debug Selenium tests for the tester to check if Selenium IDE has reached the anticipated point in the web application before continuing on with the rest of the test.

# How did you test each functionality with different test data

Testing each functionality with different test data greatly depends on the nature of the functionality. For example, to test the item search, the string containing the item to be searched for can be changed to find another item or replaced with a random combination of characters to check the behavior of an invalid search. On a different functionality such as removing an item from the cart, one test can be run when an item is present in the cart, and another test can be run when there are no items present in the cart.
# Discuss advantages and disadvantages of Selenium vs. Sikulix

![Compare](https://user-images.githubusercontent.com/81201946/158878785-8fda415d-ccad-4d24-90fc-f5fa40fe8306.jpg)
# How the team work/effort was divided and managed

In order to divide the work for this assignment, two team members (Chace and Tony) focused on creating mutation tests for the Range class, and the other two team members (Chad and Oliseh) focused on creating mutation tests for the DataUtilities class. Throughout this process, all team members kept in contact in order to resolve any technical difficulties that arose and to ensure that everyone had the same mutation test scores on their computers.

In particular, team members identified and wrote tests on the lowest scoring methods for mutation coverage. The lowest scoring methods were the ones that had larger denominators (which indicates that the method had more mutations) and smaller numerators (indicating that less mutators were killed when Pitest was used). Then, the methods were split evenly amongst the team members to work on by creating more mutation tests to increase the coverage score.

For the GUI test, one team member, Chace, identified eight different functionalities on the BestBuy website. Then, each team member took two functionalities that were not already taken and wrote Selenium tests for them, then tested the same functionalities with Sikulix.

# Difficulties encountered, challenges overcome, and lessons learned

One of the earliest challenges in this assignment was due to the wording found in the assignment specification document provided on GitHub. We were confused if we had to run Pitest on the source code of JFreeChart or if we had to run Pitest on our test suite. After experimenting with the Pitest, we found that it made sense for us to run Pitest on our own test suite.

DataUtilities already had very high mutation coverage before starting this lab due to our effective testing strategy in Assignment 3. After spending hours creating tests and looking for mutants to kill we decided that the overwhelming majority of the surviving mutants were equivalent mutants and that continuing with creating tests would be inefficient. 

We found that the Selenium IDE often caused our pages to freeze, which would mean that we are unable to complete our Selenium tests and therefore had to start from the beginning. One group member, Tony, found that it was slightly more effective to use Firefox rather than using Chrome for Selenium. 

When a test is run multiple times on a website, the website may block the browser from using certain functionalities, such as adding an item to the cart. After spending some time dealing with this problem, we found that deleting the cookies for the BestBuy website each time after a test is run will solve this problem. However, this takes away time from the development and testing of the Selenium tests.

In the end, all group members were able to gain experience with mutation testing and GUI testing, although we were not able to create mutation tests since we already had a high mutation coverage test score from the tests that we had created in Assignment. Initially, we had thought that the GUI testing would be easy, but technical difficulties with Selenium meant that we had to spend a lot more time testing the BestBuy website than needed.

# Comments/feedback on the lab itself

Compared to the previous labs, this lab assignment was considerably more difficult, particularly in Part 1. This was not due to the concepts utilized in this assignment, but rather the set up and running of the tools used for this assignment. Therefore, it took us more time than the previous labs to figure out how to create the tests. This assignment would have benefited by providing clearer instructions on setting up the project environment so that students spend less time on set up and more time on creating mutation tests and practicing GUI tests.

Another issue with this lab was the unclear instructions. For instance, Section 2.5.4 mentions sample test cases, but our group was unable to locate these sample tests. After some time, we decided to come back to this issue and start by creating the mutation tests. This assignment would have also benefited by ensuring that all the necessary files are present in the provided artifacts before making this assignment live to students.  

Furthermore, the lab report had many questions. Given that this assignment had two parts and that we were given the same amount of time as the other assignments to complete this lab, it would have benefitted us if there were fewer questions present in the lab report. Asking us more questions does not necessarily help us to gain a better understanding of the material, as the lab report is completed after the completion of Parts 1 and 2.

However, once we were able to overcome the technical hurdles with this lab, all group members were able to gain experience with mutation tests and GUI tests. As such, we can say that this assignment was good for our learning by reinforcing the concepts that were taught in the lectures. 

                                              SENG 438 Assignment 3 Test Designs:
                                          
note: test 69 isn’t running for pitests so when running tests it will give one less test than are found in test suite

note: 20 tests were written for lab 4 (tests 103-122)

![1](https://user-images.githubusercontent.com/81201946/158879751-0069b969-f694-4791-8017-887fe1f58376.jpg)
![2](https://user-images.githubusercontent.com/81201946/158879836-436f5882-c6bc-464e-9df4-efc8dbfbc942.jpg)
![3](https://user-images.githubusercontent.com/81201946/158879765-a8b485df-60fd-4c82-87f7-6a8885215934.jpg)
![4](https://user-images.githubusercontent.com/81201946/158879891-a440b54f-3718-47e6-b521-1221c27a5c6f.jpg)
![5](https://user-images.githubusercontent.com/81201946/158879903-64e9263b-be8e-4125-bd78-3ee8016cbf25.jpg)
                                              Start of new tests for Lab 3:
                                              
![6](https://user-images.githubusercontent.com/81201946/158880349-a6e21bac-7eee-42dc-aae5-d37c44b6ca5b.jpg)
![7](https://user-images.githubusercontent.com/81201946/158880363-b84bc994-6c71-464a-a2cf-cdee3c6f577c.jpg)
![8](https://user-images.githubusercontent.com/81201946/158880370-e7f4382e-6e53-4102-a3c3-9d9d592cbb2a.jpg)
![9](https://user-images.githubusercontent.com/81201946/158880405-2f7686e2-2140-43ca-a877-4e3fa74d9d23.jpg)
![10](https://user-images.githubusercontent.com/81201946/158880666-26e2d1e6-2ccc-41ac-81c6-bae139fa6538.jpg)
                                              Start of new tests for Lab 4:
                                              
![11](https://user-images.githubusercontent.com/81201946/158881006-6bcdb303-2b56-406f-9078-2066535d99c9.jpg)
![12](https://user-images.githubusercontent.com/81201946/158881016-ed56b489-8eeb-48dd-9efa-e2efd6639c90.jpg)
![13](https://user-images.githubusercontent.com/81201946/158881027-ed99a48b-4814-4bef-ab47-fb6138f280c1.jpg)
                                              Tests that were modified from A2:
![14](https://user-images.githubusercontent.com/81201946/158881142-caf726d0-e423-4f93-a480-add8d2a1efb7.jpg)                          
