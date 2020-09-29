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
Feature: Google Search

  Background: To Launch the browser
    Given Launch the browser

  Scenario: Search for Cucumber in Google
    When Hit Google on your browser
    Then Enter "Cucumber" in the search text box.
    And Select the first result.
    
   Scenario: Search for Selenium in Google
    When Hit Google on your browser
    Then Enter "Selenium" in the search text box.
    And Select the first result.
    
   Scenario: Search for Jenkins in Google
    When Hit Google on your browser
    Then Enter "Jenkins" in the search text box.
    And Select the first result.
    
   Scenario: Search for TestNG in Google
    When Hit Google on your browser
    Then Enter "TestNG" in the search text box.
    And Select the first result.
