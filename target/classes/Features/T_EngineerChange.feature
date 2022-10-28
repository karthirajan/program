 #Author: vignesh@kripya.com

@Selenium 
Feature: Engineerinng change  
@EngChange  @Tag1 @Group3
  Scenario Outline: Roles and user Creation
    Given User launches centric application
    And User click on setup icon and user under user management"<User>"
    When user click on Roles under user management"<Roles>"
    And User click on roles and create ECEdit "<ECEdit>"
    When user click on roles and create ECUser
    And user click on roles and create ECView
    Then User click on new enumeration under configuration and create enumeration value"<ECIssue>"
    Then User click on update cnfiguration
    Examples: 
      | User                             |Roles                          |ECIssue                    |ECEdit                                                                                                                      |
      | EC Admin,EC Edit,EC User,EC View|EC-Admin,EC-Edit,EC-User,EC-View|ECIssueSeverity,ECIssueType|Engineering Change Editor,Hierarchy Editor,Material Editor,Product Specification Editor,Product Specification Library Viewer|
      
 
 @EngineeringChange  @Tag1
  Scenario Outline: New Engineering change Creation
    Given User launches centric application
    Then Go to homepage
    And verify user screen
    When user click on Engineering Change and create New Engineering Change"<NewEngineering>"
     And user click on style btn in Engineering Change and create properties
     Examples: 
      | NewEngineering                               |
      | New Style,Product change,Critical,Style1,Quality Issue,High|