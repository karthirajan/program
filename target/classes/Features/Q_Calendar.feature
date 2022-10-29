#yuvaraj@kripya.com
@Calendar @Tag1 @Group1 
Feature: Data Setup for Calendar


  @CalendarSetup
  Scenario Outline: calendar setup for season
    Given User launches centric application
    Then Go to homepage
    And verify user screen
    Then User moves into Calendar Template setup
    And User create Calendar Type for season "<calendartype>","<templatecalendar>","<calendardescription>"
    Then user create season Template activity under Calendar Type "<Templateactivity>","<ActivityType>","<ActivityLevel>","<TrackingType>","<TrackingPhase>","<Trackingstate>"

    Examples: 
      | calendartype | templatecalendar | calendardescription      | Templateactivity                                            | ActivityType                  				           | ActivityLevel																					| TrackingPhase     | Trackingstate |
      | Season       | Calendar_Season  | Season calendar Template | Manual,Custom,Milestone,Track Activity,S_TrackStyle Material| Manual Activity,Custom,Milestone,Track Activity | Brand,Collection,Colorway,Department,Style,Style SKU | Production,sample | APPROVED,PENDING |
 
  @CalendarSetupMaterial
  Scenario Outline: calendar setup for material
    Given User launches centric application
    Then Go to homepage
    And verify user screen
    Then User moves into Calendar Template setup
    And User create Calendar Type for material "<calendartype>","<templatecalendar>","<calendardescription>"
    Then user create material Template activity under Calendar Type "<Templateactivity>","<ActivityType>","<ActivityLevel>","<TrackingType>","<Trackingstate>"

    Examples: 
      | calendartype            | templatecalendar | calendardescription   | Templateactivity                                      | ActivityType                             | ActivityLevel                                      | TrackingType                                                                               | Trackingstate    |
      | Material Security Group | Calendar_MSG     | MSG Calendar Template | Manual Activity,Custom,Milestone,Track Activity | Manual Activity,Custom,Milestone,Track Activity | Material,Colored Material,Material Security Group| Material BOM,Material Color Data Sheet,Material Data Sheet,Routing,Spec Data Sheet,Test Run | APPROVED,PENDING |
 
 @Calendarmaster
  Scenario Outline: calendar setup for PO and master calendar creation
    Given User launches centric application
    Then Go to homepage
    And verify user screen
    Then User moves into Calendar Template setup
    And User create Calendar Type for PO "<calendartype>","<templatecalendar>","<calendardescription>"
    Then user create PO Template activity under Calendar Type "<Templateactivity>","<ActivityType>","<ActivityLevel>","<TrackingType>","<Trackingstate>"
    

    Examples: 
      | calendartype | templatecalendar | calendardescription  | Templateactivity                                 | ActivityType                             | ActivityLevel                            | TrackingType                   | Trackingstate |
      | PO Group     | Calendar_PO      | PO Calendar Template | Manual Activity,Custom,Milestone,Track Activity | Manual Activity,Custom,Milestone,Track Activity | PO Group,PO Color,PO Product,Supplier PO | Colorway Review,Style Review,Size Chart Review | APPROVED,PENDING |
 
 @Calendardate
 Scenario Outline: calendar date selection and validation for Season Hierarchy
    Given User launches centric application
    Then Go to homepage
    And Go to homepage and create master calendar
    And verify user screen
    And Freeze the Calendar and Apply Calendar to Style "<StyleName>"
    And Go To the Style and Modify Completion Date in the Manual Activities "<StyleName>"
    And Go To the Collection and Modify Completion Date in the Manual Activities "<Collection>"
    And Go To the Department and Modify Completion Date in the Manual Activities "<Department>"
    And Go To the Brand and Modify Completion Date in the Manual Activities "<Brand>"
    And user navigates into Artwork tab and creates "<StyleName>","<Artworkname>"
    And user navigates into Image tab and creates "<IDSName>"
    Then user select calendar season under style denim and verify the screen

    Examples: 
      | Artworkname      | IDSName      | StyleName                |   Season        | Brand  | Department | Collection | 
      | Calendar Artwork | Calendar IDS | Apparel - Color and Size | winter season | Denim  | Mens       | Jeans 		 |

  @Calendarmaterial
  Scenario Outline: calendar setup for material
    Given User launches centric application
    Then Go to homepage
    And verify user screen
    And User Assigns Material to MSG "<Material>"
    And Create Master Calendar in the MSG "<templatecalendar>"
    And Freeze the Calendar and Apply Calendar to Material "<Material>"
    Then Go To the Material Security Group modify the date and Verify the Manual Activities "<MSG>"
    Then Go To the Material and Verify the Manual Activities "<Material>"
    Then Go To the Colored Material and Verify the Manual Activities "<colorvalue>"
    And user create material sku under material "<materailsku>"
    And user navigates Material creates BOM and approves it "<Bomvalue>"
    And user approves created MDS and MCDS "<mdsvalue>","<colorvalue>"
    
      Examples: 
      | materailsku | Bomvalue     | mdsvalue     | colorvalue    | MSG            | Material               | templatecalendar |
      | MT SKU      | Calendar BOM | Calendar MDS | Green CM - 01 | MSG-Standalone | 100% Cotton/Rayon Jersey | Calendar_MSG  |


  @Calendarsourcing
  Scenario Outline: calendar sourcing and po order validation
     Given User launches centric application
     Then Go to homepage
     And verify user screen
     And create calendar po template for order po group
     And user freeze PO Calendar and apply calendar for the data
     And Navigate Supplier PO and Verify the Manual Activities then Fill The completion dates "<SupplierPO>"
     Then Navigate PO Colors Tab and Verify the Manual Activities Fill The completion dates "<POG>","<POColors>"
     Then Navigate PO Products Tab and Verify the Manual Activities Fill The completion dates "<POG>","<POProducts>"
     Then Go back to POG Calendar Fill Completion date for POG "<POG>"
     And Navigate to style create review "<Review>"
     Then Logout from the Application

     
      Examples: 
        | Review                | SupplierPO 					 | POColors 		| POProducts 								| POG |
        | Calendar Style Review | PO-AP1123-colorbased | Blue Color faded | Apparel - Color and Size |order po group |
  
      
