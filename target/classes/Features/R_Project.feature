#Author: karthick@kripya.com 
@Projects @Tag1 @Group3
Feature: Project

  @ProjectCreation
  Scenario Outline: Project creation
    Given User launches centric application
    Then Go to homepage
    And verify user screen
    Then User creates Projects with different Project Types "<ProjectType>","<ProjectNames>"
    And Verify Edit And Delete Options "<ProjectNames>"
    And Verify the Tabs Under Each Project Type "<ProjectNames>"

    Examples: 
      | ProjectType                                                                       | ProjectNames                                                                                                                                                                                              |
      | Project-ALL,Project-Style,Project-Food,Project-Material,Project-Blank,Project-All | Project-With All ProductTypes Selected,Project With Style As ProductType,Project With Food As Product Type,Project With Material As Product Type,Project With No Product Type Selected,ProjectForDeletion |

  @WBS_Validation @ProjectType
  Scenario: 
    #Given User launches centric application
    Then Go to homepage
    And verify user screen
    When User select and start wbs projects in schedule
    And User verify gantt tab is apperaed
    Then Go to homepage
    Then User validates milestone and deliever reports in project

  @ProjectAllSKUColorCreation
  Scenario: 
    #Given User launches centric application
    Then Go to homepage
    And verify user screen
    Then user select MaterialInprojectType modify manageview and select colorways and sku
    Then user select StyleInprojectType modify manageview and select colorways and sku
    Then user select Project SKU and project color for MaterialInprojectType and StyleInprojectType
    Then user clicks Allproject under project and setup manageviews
    Then user copies Material and style in AllProject

  @ProjectAllDocumentshare
  Scenario Outline: 
    #Given User launches centric application
    Then Go to homepage
    And verify user screen
    Then user clicks Allproject under project and navigates to DocumentTab  "<DocName>"
    Then user share and validate the document "<ProjectName>"
    Then user Navigates into user management under configuration "<SharedTeam>"
    Then user moves into AllProject and Manage Team
    Then user verify the summary in Presentation Tab

    Examples: 
      | DocName              | ProjectName          | SharedTeam                  |
      | All Project Document | Material,All Product | Project Shared Team,Project |

  @ProjectSupplieruservalidation
  Scenario: 
    #Given User launches centric application
    Then Go to homepage
    And verify user screen
    Then user navigates into AllProject-Item tab and edits manageview
    Then Navigates into Material-BaseProduct selects the supplier user in supplier quotes
    And Add the supplier user in AllProject-Item-Material moves from DRAFT to INPROGRESS
    Then Logout from Admin user and Login as supplier user
    And user verfiy the Project tab with material realted values
    Then Logout from Supplier user and Login as Admin user
    Then Admin user changes the INPROGRESS to COMPLETE
    Then Logout from Admin user and Login as supplier user
    And user verfiy the Project tab with material realted values
    Then Logout from Supplier user and Login as Admin user
    Then Admin user changes the COMPLETE to DRAFT
    Then Logout from Admin user and Login as supplier user
    And user verfiy the Project tab with material realted values should not present
    Then Logout from the Application


   
