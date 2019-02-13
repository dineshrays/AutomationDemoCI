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
@tag
Feature: Login for Orange HRM  Site
  I want to use this template for my Orange HRM site

  @tag1
  Scenario Outline: Login the Orange HRM user
    Given Navigate to Orange HRM Login page
    When User enters username <username>
    And User enters password <password>
    And User clicks on login
    Then User has to be loggedin

    Examples: 
      | username | password |
      | Admin    | admin123 |
