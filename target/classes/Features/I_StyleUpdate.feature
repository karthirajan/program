#Author: karthick@kripya.com
@Selenium @StyleSample @StyleUpdate @Tag1 @Group1 @Group4
Feature: Style Update validation

  @StyleColorSpec
  Scenario Outline: Style ColorSpec creation
    Given User launches centric application
    Then Go to homepage
    And verify user screen
    When User update property table with "<Code>","<Description>","<SizeRange>"
    And User creates colorway "<ColorSpec>","<ColorwayA>","<ColorwayB>","<Description>"

    Examples: 
      | Code | Description | SizeRange | ColorSpec   | ColorwayA        | ColorwayB         |
      |  123 | Automation  | MensJeans | GLASS GREEN | Blue Color faded | Green Color faded |

  #-----------------------------------------------------------------------------------------------------------------
  @StyleSample
  Scenario Outline: Style Sample Creation
   # Given User launches centric application
    Then Go to homepage
    And verify user screen
    And User creates style sample combination "<StyleSample>","<Style>","<DimensionA>","<DimensionB>"

    Examples: 
      | StyleSample          | DimensionA | DimensionB       | Style         |
      | Jeans Sample - Style | Colors     | Colors and Sizes | Style - Proto |

  #-----------------------------------------------------------------------------------------------------------------
  @StyleQuality
  Scenario Outline: Style Quality Creation
   # Given User launches centric application
    Then Go to homepage
    And verify user screen
    When User update quality types
    Then Go to homepage
    And User creates Style quality "<TestrunA>","<TestRunB>","<TestGrpA>","<TestGrpB>","<SampleA>","<SampleB>","<User>","<Supplier>"
    And User Creates test run templates
    And User approve test run "<Code>","<Description>","<Comment>"

    Examples: 
      | TestrunA          | TestRunB          | TestGrpA            | TestGrpB        | SampleA | SampleB | User          | Supplier | Code | Description | Comment  |
      | Acid Test - Style | Wash Test - Style | Chemical Test Group | Wash Test Group | small   | EGRET   | Administrator | Supplier |  123 | Automation  | Test Run |

  #-----------------------------------------------------------------------------------------------------------------
  @StyleSupplierQuote
  Scenario Outline: Supplier Quote Creation
  #  Given User launches centric application
    Then Go to homepage
    And verify user screen
    When User creates Style sourcing price list
    And User Creates Style Supplier Quotes "<Supplier>","<SQ-Template>","<Set>"
    And User creates Style product blended cost "<Product>"

    Examples: 
      | Supplier | SQ-Template               | Set           | Product            |
      | Supplier | Supplier Quote - Template | SS - Supplier | Product Blend Cost |

  #-----------------------------------------------------------------------------------------------------------------
  @StyleSupplierRequest
  Scenario Outline: Supplier Request Creation
   # Given User launches centric application
    Then Go to homepage
    And verify user screen
    When User creates Supplier Requests "<RequestTemplate>","<RequestName>"
    And User creates copy templates "<CopyTemp>"
    Then Go to homepage
    And User add new inspiration products "<InspA>","<InspB>"

    Examples: 
      | RequestTemplate | RequestName  | InspA            | InspB           | CopyTemp                    |
      | SRT - Style     | Apparel - SR | Auto Inspiration | New Inspiration | Copy Template - Inspiration |

  #---------------------------------------------------------------------------------------------------
  @StyleSupplierPO
  Scenario Outline: Supplier PO
   # Given User launches centric application
    Then Go to homepage
    And verify user screen
    When Create PO Group and Supplier PO "<PoGroup>","<supplierpovalue1>","<supplierpovalue2>","<quotevalueBlue>","<quotevaluegreen>","<EditValue>","<dispoint>","<disvalue>","<allowancepoint>","<allowancevalue>"
    Then user creates shipment qc and set "<unitvalueb1>","<unitvalueg1>","<bshipvalue>","<qshipvalue>","<qcissue>","<selectset>","<gshipqty>","<bshipqty>"

    Examples: 
      | PoGroup        | supplierpovalue1    | supplierpovalue2     | EditValue  | quotevalueBlue         | quotevaluegreen         | dispoint | disvalue | allowancepoint | allowancevalue | unitvalueb1 | unitvalueg1 | bshipvalue | qshipvalue | qcissue  | selectset   | gshipqty | bshipqty |
      | order po group | PO-AP1321-Not color | PO-AP1123-colorbased | Automation | blue color faded-large | green color faded-large |        1 |       10 |              2 |             20 |           3 |           5 |         50 |        100 | qc issue | SS-Shipment |       60 |       30 |

  #---------------------------------------------------------------------------------------------------
  @StyleCustomerPO
  Scenario Outline: Customer PO
   # Given User launches centric application
    Then Go to homepage
    And verify user screen
    Then User creates customerpo and issue "<povalue>","<B_baseprice>","<G_baseprice>","<B_orderqty>","<G_orderqty>","<dispnt>","<disvalue>","<allowanpct>","<allowvalue>","<commission>","<payment>"

    Examples: 
      | povalue             | B_baseprice | G_baseprice | B_orderqty | G_orderqty | dispnt | disvalue | allowanpct | allowvalue | commission | payment |
      | Target PO123#-color |         200 |         350 |         30 |         40 |      1 |      100 |          2 |         50 |          3 | cheque  |

  #---------------------------------------------------------------------------------------------------
  @StyleSampleUpdate
  Scenario Outline: Style Sample Update
    #Given User launches centric application
    Then Go to homepage
    And verify user screen
    When user update delete style samples "<Sample>","<Quantity>"
    And User modify the sample names

    Examples: 
      | Sample | Quantity |
      | Sample |        5 |

  #---------------------------------------------------------------------------------------------------
  @DeleteStyleSupplierQuotes&Samples
  Scenario Outline: Delete Supplier Quotes & Samples
    #Given User launches centric application
    Then Go to homepage
    And verify user screen
    When user creates delete supplier quotes "<Delete>"
    And user creates supplier request "<Template>","<Request>"
    And User Selects quotes and modifying states
    And User select Supplier request samples

    Examples: 
      | Delete    | Template    | Request                             |
      | Delete SQ | SRT - Style | SR - Delete Quotes & Samples - True |

  #---------------------------------------------------------------------------------------------------
 @ValidatingStyleQuotes&Samples 
  Scenario: Validating quotes & samples
   # Given User launches centric application
    Then Go to homepage
    And verify user screen
    When user removing supplier under supplier request setup
    And user validating supplier request and samples displayed datas are correct or not
    Then Go to homepage
    And user validating supplier quotes displayed datas are correct or not
    Then Go to homepage
    And User validating style sample displayed datas are correct or not

  #---------------------------------------------------------------------------------------------------
  @StyleCopyRequest   
  Scenario Outline: Copy Supplier Request
  #  Given User launches centric application
    Then Go to homepage
    And verify user screen
    When user creating new inspiration "<Inspiration>"
    And User copy supplier request "<SR>"

    Examples: 
      | Inspiration | SR                       |
      | Ins - 01    | Apparel SR - Inspiration |

  #---------------------------------------------------------------------------------------------------
  @IssuingStyleSupplierRequest    
  Scenario Outline: Issuing Supplier Request
   # Given User launches centric application
    Then Go to homepage
    And verify user screen
    When User issuing apparel SR
    Then Go to homepage
    And user creates issue supplier request "<Template>","<Request>"

    Examples: 
      | Template    | Request                |
      | SRT - Style | SR - with two products |

  #---------------------------------------------------------------------------------------------------
  @StyleSupplierQuote
  Scenario Outline: Supplier Quotes Update
   # Given User launches centric application
    Then Go to homepage
    And verify user screen
    When user enters designated supplier "Supplier" and samples details
    Then Go to homepage
    And User Creates supplier request template without style "<Template>","<value>"
    Then Go to homepage
    And validating copy and delete action "<value>"
    And User Creates supplier request template with style "<Template>","<Stylevalue>","<Style>"
    Then Go to homepage
    And user validating style template updated correctly or not
    Then Go to homepage
    And User issuing without style template
    Then Logout from the Application

    Examples: 
      | Template    | value    | Stylevalue         | Style                    |
      | SRT - Style | Style SR | Style Home - Jeans | Apparel - Color and Size |
 #---------------------------------------------------------------------------------------------------  
   @StyleSKU
  Scenario Outline: Style SKU Creation
    Given User launches centric application
    Then Go to homepage
    And verify user screen
    Then User creates style SKU combination "<SKUName>","<StyleSKU>","<Size>","<Colorway>"
    Then Create SKU with same Size and Colorway duplicate error message should be displayed "<SKUName>","<StyleSKU>","<Size>","<Colorway>"
		Then Logout from the Application
		
    Examples: 
      | StyleSKU  | Size         | Colorway       | SKUName  |
      | HC&S3     | W1/L1     | 1-Color1       | StyleSKU1 |
#---------------------------------------------------------------------------------------------------      
  @StyleIssues
  Scenario Outline: Style Issues Creation
    Given User launches centric application
    Then Go to homepage
    And Navigate to Existing Style "<StyleIssue>"
    Then Create Custom View in Style Issues tab
    Then Verify the Cancel option 
    Then Create A Issue With Save Option "<IssueUName>","<Size>","<Colorway>"
    Then Create A Issue With SaveAndNew Option "<IssueUName>","<Size>","<Colorway>"
    Then Verify the Copy Option for Issues Node with Cancel Button "<IssueUName>","<Size>","<Colorway>"
    Then Verify the Copy Option for Issues Node with Save Button  "<IssueUName>","<Size>","<Colorway>"
    Then Verify the Copy Option for Issues Node with SaveAndCopy Button "<IssueUName>","<Size>","<Colorway>"
    Then Verify the Edit Option for Issues Node with Cancel Button "<IssueUName>","<Size>","<Colorway>"
    Then Verify the Edit Option for Issues Node with Save Button "<IssueUName>","<Size>","<Colorway>"
    Then Verify the Delete Option for Issues Node with Cancel Button "<IssueUName>","<Size>","<Colorway>"
    Then Verify the Delete Option for Issues Node with Delete Button "<IssueUName>","<Size>","<Colorway>" 
    Then Logout from the Application
    
    Examples: 
      | StyleIssue  | Size         | Colorway       | IssueUName  |
      | HC&S3     | W1/L1,W1/L2,W1/L3     | 1-Color1,11-0103 EGRET,11-0107 PAPYRUS  | Issue1,Issue2|
 #-----------------------------------------------------------------------------------------
   @StyleSKUCreationUsingMatrix
  Scenario Outline: Style SKU Creation
    Given User launches centric application
    Then Go to homepage
    And Navigate to Existing Style "<StyleSKU>"
    Then User creates style SKU and SKUs combination using Matrix "<SKUName>","<StyleSKU>","<Size>","<Colorway>"
    Then verify the row and Column Headings in the Matrix "<SKUName>","<StyleSKU>","<Size>","<Colorway>"
    Then Verify the Select All element is selected by default along with all other chekboxes "<SKUName>","<StyleSKU>","<Size>","<Colorway>"
    Then Click on the Select All Element in order to deselect it
    Then Verify All other elements are not selected in the Matrix "<SKUName>","<StyleSKU>","<Size>","<Colorway>"
    Then Verify the Colorway size checkbox already selected for a SKU is selected and disabled by default "<SKUName>","<StyleSKU>","<Size>","<Colorway>"
    Then Verify the row column Matrix Selection "<SKUName>","<StyleSKU>","<Size>","<Colorway>"
    Then Select a size2 and size3 chekbox for first colorway "<SKUName>","<StyleSKU>","<Size>","<Colorway>"
    Then Verify the SKU created "<SKUName>","<StyleSKU>","<Size>","<Colorway>"
    Then Create the SKU under Collections Mass Create Style SKU option "<SKUName>","<CollectionName>","<Size>","<Colorway>","<StyleSKU>"
    Then Verify the SKU created under Collections "<SKUName>","<CollectionName>","<Size>","<Colorway>"
    Then Logout from the Application
    

    Examples: 
      | StyleSKU  | Size         | Colorway       											| SKUName  | CollectionName |
      | HC&S2     | SMALL,XL,XXL | 11-0107 PAPYRUS,11-0205 GLASS GREEN | StyleSKU1,StyleSKU2,StyleSKU3 | 	Mens - collection |
      
      
@StyleSamples
  Scenario Outline: Style Sample Creation
    Given User launches centric application
    Then Go to homepage
    And verify user screen
    Then User creates style sample combination for different Styles using Matrix "<Styles>","<SampleName>","<DimensionA>"
    Then User verify the style sample Edit Copy Delete  "<Styles>","<SampleName>","<DimensionA>"
    Then Create Style From Sample and verify the Style Creation message is displayed "<Styles>","<SampleName>","<DimensionA>"
    Then To verify if the Style created is present under Collections "<CollectionName>"
    Then To Verify the Product Supplier Selected in Sample is added as Supplier Under the Style-created in above step
    
    Examples: 
      | Styles          																																											| SampleName | DimensionA       | CollectionName |
      | Apparel - Color and Size,Apparel - Only Size,Accessories - Only Color,Accessories - No color and Size | ASample1,1-ASample2     | Colors and Sizes,Sizes,Colors | Jeans | 

 @StyleSamples
  Scenario Outline: Verify Styles Samples colorways SKU Issues
    #Given User launches centric application
    Then Go to homepage
    And verify user screen
    Then Verify the Styles Colorways Samples SKU Issues at Seasons Level "<SeasonName>","<Styles>","<Colorways>","<SKUName>","<IssueUName>","<SampleName>"
    Then Verify the Styles Colorways Samples SKU Issues at Brand Level  "<BrandName>","<Styles>","<Colorways>","<SKUName>","<IssueUName>","<SampleName>"
    Then Verify the Styles Colorways Samples SKU Issues at Department Level "<DptName>","<Styles>","<Colorways>","<SKUName>","<IssueUName>","<SampleName>"
    Then Verify the Styles Colorways Samples SKU Issues at Collections Level "<CollectionName>","<Styles>","<Colorways>","<SKUName>","<IssueUName>","<SampleName>"
    
    Examples: 
      | Styles     							 			|SampleName 				| CollectionName | SeasonName 										| Colorways |SKUName  					|IssueUName  	| BrandName 				|DptName                |  
      | HC&S3,Apparel - Color and Size| ASample1,1-ASample2 | Mens - collection,Jeans 				| 01 - Spring 2020,winter season |1-Color1 |StyleSKU1,StyleSKU2 |Issue1,Issue2| Denim - Brand,Denim |Mens - Department,Mens|

@StyleSample12
  Scenario Outline: Issues creation and verification at Season brand department and collection levels
    #Given User launches centric application
    Then Go to homepage
    And verify user screen
    Then Create and Verify the Issues at Season level "<SeasonName>","<IssueName>"
    Then Create and Verify the Issues at Brand level "<BrandName>","<IssueName>"
    Then Verify the Issue created at Brand level in the parent Season "<SeasonName>","<IssueName>"
    Then Create and Verify the Issues at Department level "<DptName>","<IssueName>"
    Then Verify the Issue created at Department level in the parent Season and Brand "<SeasonName>","<BrandName>","<IssueName>"
    Then Create and Verify the Issues at Collection level"<CollectionName>","<IssueName>"
    Then Verify the Issue created at Collection level in the parent Season and Brand and Department "<SeasonName>","<BrandName>","<DptName>","<IssueName>"
    
    
    Examples: 
      | CollectionName | SeasonName 	| IssueName  																						| BrandName 				|DptName |
      | Jeans 				| winter season | AIssue4Season,AIssue4Brand,AIssue4Dept,AIssue4Collec | Denim 							|Mens|
      
@StyleHierarchyBrandCopy
  Scenario Outline: User verify datas in BusinessPlan for Style and Verify copy of brand ,collection and department
    #Given User launches centric application
    Then Go to homepage
    And verify user screen
    Then User verify business plan for season and copy the brand "<Brand>"
    And User verify the copy of collection
    Then User verify the copy of department
   

    Examples: 
      |Brand|
      |Denim - Brand|  
      
 @StyleHierarchyDepartmentCopy
 Scenario Outline: Copy Department and verify department and collection attribute
    #Given User launches centric application
    Then Go to homepage
    And verify user screen  
    Then Navigate to department copy 
    And verify the code description copied for department and collection
    
    
    @SampleStorage
    
    Scenario Outline: create sample storage under style
    
    Given User launches centric application
    Then Go to homepage
    And verify user screen  
    Then Navigate to sample storage under style
    And verify material sample and style sample "<Materialsample>"
    
     Examples: 
     |Materialsample|
     |Iceplant,Sample1,001,Fabric - Stanadlone,Frontline,Sample2,003,No Data|
    
   