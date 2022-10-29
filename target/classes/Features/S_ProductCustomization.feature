@Selenium @ProductCustomizations @Tag1 @Group4


Feature: Product Customization
   Scenario Outline: Verifying the Maximum Quantity field
    Given User launches centric application
    Then Go to homepage
    And verify user screen
    And Navigate to Existing Style "<StyleName>"
    #Then Select Existing Supplier "<Supplier>","<StyleName>"
    Then Verify the Quantity field cannot take values more than Forty "<Supplier>"
    Then Verify Forty Samples are created "<Sample>"
 
    Examples: 
      | StyleName                | Supplier  | Sample |   
      | Apparel - Color and Size | Supplier | AUTSamp | 
  
   Scenario Outline: Add Comments Path
    Given User launches centric application
    Then Go to homepage
    And verify user screen
    And Navigate to Existing Style "<StyleName>"
    Then Create Custom View in Style Properties
    Then Navigate to style and add Recent comment from custom view 
    Then Navigate to SKU tab and Create two SKUs and custom view for SKU "<SKUName>"
    Then Create Recent comment for two SKUs "<StyleName>","<SKUName>"
    Then Navigate to Style properties and check recent comments reflected in properties "<StyleName>"
    Then Delete the one comment SKU in style
 
    Examples: 
      | StyleName                | Supplier  | Sample |  SKUName | 
      | Apparel - Color and Size | Ship - Supplier | AUTSamp | StyleSKU1,StyleSKU2 | 
      
   Scenario Outline: Hide Action
    #Given User launches centric application
    Then Navigate to collection verify move from style action is visible as Admin "<Collection>"
    And Navigate to Style and verify move from style action is visible as Admin "<Style>"
    And Navigate to Hierarchy and verify move styles from present in season brand and department "<Season>","<Brand>","<Department>"
    And User click on setup icon and roles under user management
    Then Navigate to Role and assign User "<User>","<Role>"
    Then Logout Login as Non Admin "<User>"
    And verify user screen
    Then Navigate to collection verify move from style action not visible as NonAdmin "<Collection>"
    Then Navigate to style and verify move from style action not visible as NonAdmin "<Style>" 
    Then Navigate to Hierarchy and verify move styles from not present in season, brand and department as NonAdmin "<Season>","<Brand>","<Department>"
    Then Logout from the Application
    Examples: 
      | Season        | Brand  | Department | Collection | Style 										| Role | User |
      | winter season | Denim  | Mens       | Jeans 		 |  Apparel - Color and Size | Non Admin | NA |

 Scenario Outline: Hide Revision Action
    Given User launches centric application
    Then Go to homepage
    And Navigate to Existing Style "<Style>"
    Then For Style Create price list, verify Approve action is visible "<PriceList>"
    Then Logout Login as Non Admin "<User>"
    And verify user screen
    And Navigate to Existing Style "<Style>"
    Then For Style Create price list, verify Approve action is not visible "<PriceList>"
    Then Logout from the Application

    Examples: 
      | Style 			  | Role | User | PriceList |
      |  Apparel - Color and Size | Non Admin | NA | A_Style_Price List | 

Scenario Outline: AllowNoneOptionForSKU
    Given User launches centric application
    Then Go to homepage
    And Navigate to Existing Style "<Style>"
    Then Create New SKU and verify the None option is available "<SKUName>","<StyleColorway>","<StyleSize>"
    Then Create another SKU and verify in status bar shows duplicate ignored "<SKUName>","<StyleColorway>","<StyleSize>"
    Then Go to homepage
    And Navigate to Existing Material "<Material>"
    And Create New SKU for Material and Verify None option is visible in dropdown "<SKUName>"

    Examples: 
      | Style                    | SKUName                           | Material                 | StyleColorway    | StyleSize |
      | Apparel - Color and Size | Style_SKU1,Style_SKUDup,Mat_SKU1 | 100% Cotton/Rayon Jersey | Blue Color faded | small     |


  Scenario Outline: Block 3D Document On Style
    #Given User launches centric application
    Then Go to homepage
    And Navigate to Existing Style "<Style>"
    Then Add document properties through custom view in Style 
    Then Verify the Add 3D Document not visible in menu list for Style 

    Examples: 
      | Style                    | 
      | Apparel - Color and Size | 
      
 Scenario Outline: Block 3D Document On SKU
    #Given User launches centric application
    Then Go to homepage
    And Navigate to Existing Style "<Style>"
    Then Navigate to SKU of the style and Add document properties through custom view "<SKUName>"
    Then Verify the Add 3D Document is visible in menu list for Style SKU
    Then Navigate to Document tab and verify fields are visible

    Examples: 
      | Style                    |  SKUName |
      | Apparel - Color and Size | StyleSKU1,StyleSKU2 |

 Scenario Outline: Block Reference Document on Style
    #Given User launches centric application
    Then Go to homepage
    And Navigate to Existing Style "<Style>"
    Then In Style verify reference document should not be visible
    Then Go to homepage
    Then Navigate to Existing Material "<MaterialName>"
    Then In Material verify reference document should not be visible
    Then Navigate to Colored Material and verify reference document should not be visible "<ColoredMaterialName>"
	Then Logout from the Application

    Examples: 
      | Style                    | MaterialName 		|	ColoredMaterialName		|	
      | Apparel - Color and Size | 100% Cotton/Rayon Jersey | Green CM - 01 |  