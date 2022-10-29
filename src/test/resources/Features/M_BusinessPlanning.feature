#Author: yuvaraj@kripya.com
@Selenium @BusinessPlanning @Tag1 @Group4
Feature: Creation of Business Planning

  Scenario Outline: User creates BusinessCategory for  Style and market
    Given User launches centric application
    Then Go to homepage
    And verify user screen
    Then User creates Business category for Style  "<stylecategory>","<style>","<currency>"
    Then User creates Business category for Material "<materialcategory>","<material>"
    And User Edit and copy Business category "<copymaterial>","<editmaterial>"
    Then create BusinessMarket for Style and Material "<Businessmarketvalue1>","<BusinessCode1>","<Businessmarketvalue2>","<BusinessCode2>"
    And user validating Business category custom view

    Examples: 
      | stylecategory     | style | currency | materialcategory     | material | copymaterial                | editmaterial                         | Businessmarketvalue1 | BusinessCode1 | Businessmarketvalue2 | BusinessCode2  |  |
      | BC-Style Category | style | dollar   | BC-Material category | Material | BC-Material Category Copied | BC-Material Category EditedUS Market | US Market            | US Automation | Indian Market        | IND Automation |  |

  #-------------------------------------------------------------------------------------------------------------
  @BusinessPlan
  Scenario Outline: User creates BusinessPlan for  Style and market
    # Given User launches centric application
    Then Go to homepage
    And verify user screen
    Then User creates Business Plan for Style "<BPValue1>","<BPCategory1>","<currency>","<supplier>","<season>","<Brand>","<Dpmt>","<Collection>"
    And verify the datas in marketplan
    Then User creates Business Plan for Material "<BPValue2>","<BPCategory2>","<currency>","<supplier>"
    And user verify custom view actions
    And user validating volume and margin datas are editable
    And User Verifying copy, edit and delete action
   # Then Logout from the Application

    Examples: 
      | BPValue1       | BPCategory1       | currency | supplier | season | Brand | Dpmt | Collection | BPValue2          | BPCategory2          |
      | Plan for style | BC-Style Category | CT       | supplier | winter | Denim | Mens | Jeans      | Plan for material | BC-Material Category |

  #-------------------------------------------------------------------------------------------------------------
  @BusinessHierarchy
  Scenario Outline: User verify datas in BusinessPlan for Style
  #  Given User launches centric application
    Then Go to homepage
    And verify user screen
    Then User verify business plan for season  "<copy>"
    And User verify business plan for brand
    Then User verify business plan for collection"<copy1>"
    And User verify business plan for department"<copy2>"

    Examples: 
      | copy            | copy1           | copy2           |
      | Copy of Default | Copy of Default | Copy of Default |
