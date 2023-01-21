#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
Feature: To test swaglab login

  Scenario: As an user with valid credential i will be logged in swaglabs
    Given User lounch browser
    When User opens url
    When user enter <username> and <password>
    And click on login
    Then close browser
 

    Examples: 
      | username  | password | 
      | standard_user	|     secret_sauce | 
      | locked_out_user |     secret_sauce |
      | problem_user	|secret_sauce| 
      |	performance_glitch_user |secret_sauce|
      
