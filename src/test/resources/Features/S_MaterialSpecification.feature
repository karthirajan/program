@Selenium @MaterialSpecifBOM @Tag1 @Group4
Feature: MaterialBOMCreation
@MaterialBOM
    Scenario Outline: Create Material bom and placements
    Given User launches centric application
    Then Go to homepage
    And Go to datasetup and create new placement and BOMSection"<Placements>","<bomsection>","<sortorder>"
    And Navigate to material create bom section "<BOMMaterial>"
    And Navigate to bom create placements for material"<Placements>","<bomsection>"
    And Navigate to chiffon material 
    And Navigate to material create bom section "<BOMMaterial>"
    And create placement using new of material"<BOMMaterial>","<Placements>"
    And Navigate to linen material
    And Navigate to material create bom section "<BOMMaterial>"
    And create placement using new from bom"<BOMMaterial>","<Placements>"
    And Navigate to chiffon material
    Then create section in material bom and fill bom section value
    Then Logout from the Application
    Examples: 
      | Placements													|BOMMaterial			|bomsection																|sortorder		|
      |	APlac_01,APlac_02,APlac_03,APlac_04	|AUT_BOMHSHC			|A_MB_Sec1,A_MB_Sec2,A_MB_Sec3,A_MB_Sec4	|20,21,22,23	|
     
@MaterialPushSection
		Scenario Outline: Create Material and do push section
		Given User launches centric application
    Then Go to homepage
    And Navigate to linen material link
    And Navigate to material create bom section "<BOM>"
    And Adding placement to the section"<bomsection>","<Placements>"
    And Navigate to material create bom section "<BOM2>"
    And Open Source BOM and placement to first section "<bomsection>","<Placements>"
    And Navigate to material create bom section "<BOM3>"
    Then Adding placement to the section"<bomsection>","<Placements>"
    And Open autbom and placement to first section add append action"<bomsection>","<Placements>"
    And Navigate to destination2bom and do delete section"<bomsection>"
    And Create placements using new special"<Placements>"
    Then Logout from the Application   
    Examples:
    |Placements															|BOM							|bomsection																|BOM2				|BOM3							|
    |	APlac_01,APlac_02,APlac_03,APlac_04	  |DestinationBOM		|A_MB_Sec1,A_MB_Sec2,A_MB_Sec3,A_MB_Sec4	|SourceBOM	|DestinationBOM2	|
  
 @MaterialAction
  Scenario Outline: Material bom with action
    Given User launches centric application
    Then Go to homepage
    And Navigate to polyster material link
    And Navigate to material create bom section "<BOM>"
    And Click action and verify the revision state
    And Freeze & Reopen action verification
    And Freeze, Review and Revise action verification
    And Copy bom in review state and verify copied bom state "<BOM2>"
    Then Freeze,Review,Abandon and Reopen action
    And Approve and reopen action verify
    And Purge action verification
    And Purge and reset action verifiation
    Then Logout from the Application 
    
    Examples:
    |BOM							|BOM2							|
    |BOMStateVerify1	|BOMStateVerify2  |