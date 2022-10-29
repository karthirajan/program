@HybridAgent @Tag2 @Group3
Feature: Creation of Hybrid Agent

  @RolesCreation
  Scenario Outline: Create Roles, Assign supplier user, update home supplier
    Given User launches centric application
    Then Go to homepage
    And verify user screen
    Then Update the suppliers
    And User click on setup icon and roles under user management
    Then Update user assignment for Global users "<Supplier>"
    And Update Local User Security Roles

    Examples: 
      | Supplier |
      | h1,i1    |

  @PortalUseCases
  Scenario Outline: Create Data for portal use case
    #Given User launches centric application
    Then Go to homepage
    And Create HTS Code "<HTSvalue>"
    And Create supplier quotes templates and data package template "<SupQuoTemp>","<DPtemp>","<Datasheettype>"
    And create supplier request template "<Samptype>","<DPtemp>"
    And Test Data to Create Material Security Group and Assign Context Security Role For Material Security Group "<MSGMatr>","<MSGUsers>"
    And Test Data to Create Materials Under MSG-Fig  and MSG-Grape "<MaterialsForMSGFig>","<MaterialsForMSGGrape>","<MSGMatr>"

    Examples: 
      | HTSvalue          | SupQuoTemp            | DPtemp         | Datasheettype   | Samptype                       | MSGMatr                                 | MSGUsers | MaterialsForMSGFig  | MaterialsForMSGGrape    |
      | HTSCode1,HTSCode2 | SupQteTmp1,SupQteTmp2 | Style,Material | Artwork,Routing | Style - Proto,Material - Proto | MSG1-Fig_Materials,MSG2-Grape_Materials | f1,g1    | Mat 3 Fig,Mat 4 Fig | Mat 5 Grape,Mat 6 Grape |

  @VerifyTablevel
  Scenario Outline: Verify Tab Level fot h1 and i1 user
    Given User launches centric application for local user "<user>"
    Then Go to homepage
    Then user verify the tabs for the user "<userdata>"
    

    Examples: 
      | user | userdata                                                |
      | h1   | My Home,Styles,Materials,Projects,Supplier POs,Supplier |
      | i1   | My Home,Styles,Materials,Projects,Supplier POs,Supplier |

  @VerifysubTablevel
  Scenario Outline: Verify Tab Level fot h1 and i1 user
    Given User launches centric application for local user "<user>"
    Then Go to homepage
    Then user verify the specific tab and sub tab for the user "<userdata>"
    

    Examples: 
      | user | userdata                                                                                                                                                                                                                      |
      | f1   | My Home,Style,Material,Shape and Theme,Food,Sourcing,Projects,Documents,Issues,Reports,Select Sets,Business Planning,Quality,Inspection,Schedule,Engineering Change,Product Presentations,Collection Management,Merchandising |
      | g1   | My Home,Style,Material,Shape and Theme,Food,Sourcing,Projects,Documents,Issues,Reports,Select Sets,Business Planning,Quality,Inspection,Schedule,Engineering Change,Product Presentations,Collection Management,Merchandising |

  @StyleSupplierReqHost
  Scenario Outline: Create Style supplier request as host user
    Given User launches centric application
    Then Go to homepage
    Then Create Style Supplier Request for h1 users"<SupplierRequest>"
    Then Create Style Supplier Quotes and Issued for h1 user"<SupplierQuotes>"
    And Create Style Supplier Request for i1 user"<SupplierRequest>"
    And Create Style Supplier Quotes and Issued for i1 user"<SupplierQuotes>"

    Examples: 
      | SupplierRequest       | SupplierQuotes                |
      | AUT_SR_001,AUT_SR_003 | AUT_SQ_SR1_001,AUT_SQ_SR3_001 |

  @MaterialSupplierReqhost
  Scenario Outline: Create Material supplier request as host user
    #Given User launches centric application
    Then Go to homepage
    Then Create Material Supplier Request for h1 user"<SupplierRequest>"
    Then Creat Material Supplier Quotes and Issue for h1 user"<SupplierQuotes>"
    And Create Material Supplier Request for i1 user"<SupplierRequest>"
    And Create Material Supplier Quotes and issued for i1 User"<SupplierQuotes>"

    Examples: 
      | SupplierRequest         | SupplierQuotes                  |
      | AUT_MSR_001,AUT_MSR_003 | AUT_MSQ_SR1_001,AUT_MSQ_SR3_001 |

  @VerifySRUser
  Scenario Outline: Verify SR and Style,Material products as supplier user
    Given User launches centric application for local user "<user>"
    Then Login as h1 User and Verify Supplier Request Name, Type and State for Style"<SupplierRequest>","<SupplierQuotes>"
    Then Login as i1 User and Verify Supplier Request Name, Type and State for Style"<SupplierRequest>","<SupplierQuotes>"
    Then Login as h1 User and Verify Supplier Request Name, Type and State for Material"<SupplierRequest>","<SupplierQuotes>"
    Then Login as i1 User and Verify Supplier Request Name, Type and State for Material"<SupplierRequest>","<SupplierQuotes>"

    Examples: 
      | SupplierRequest                               | SupplierQuotes                                                | user | user1 |
      | AUT_SR_001,AUT_SR_003,AUT_MSR_001,AUT_MSR_003 | AUT_SQ_SR1_001,AUT_SQ_SR3_001,AUT_MSQ_SR1_001,AUT_MSQ_SR3_001 | h1   | i1    |

	@Stylesamplecreate
  Scenario Outline: create supplier request for h1 and i1 user
    Given User launches centric application
    Then Go to homepage
    And verify user screen
    Then user navigates into supplier request under soucring for  "<user>"

    Examples: 
      | user                       |
      | AUT_HSSRS_001,AUT_ISRS_003 |
      
  @MaterialSamplecreate&VerifySamples
  Scenario Outline: Create Material Samples with Huckleberry and Iceplant user
    #Given User launches centric application
    Then Go to homepage
    Then Create sample to material for the Huckleberry user"<SupplierRequest>","<SupplierQuotes>"
    And Create sample to material for the Iceplant user"<SupplierRequest>"
    And Login as Huckleberry and verify the sample data is visible for style  and material
    Then Login as Iceplant and verify the sample data is visible for style  and material tab

    Examples: 
      | SupplierRequest         | user | user1 |
      | AUT_MSR_001,AUT_MSR_003 | h1   | i1    |

  

  @StyleMaterialvalidationH1I1
  Scenario Outline: Verify Supplier Request value in f1 and g1 user
    Given User launches centric application for local user "<user>"
    Then Go to homepage
    And verify user screen
    Then user navigates into styles and validate the values "<user>"
    Then user navigates into material and validate the supplier quotes "<user>"
   # Then Logout from the Application

    Examples: 
      | user |
      | f1   |
      | g1   |
