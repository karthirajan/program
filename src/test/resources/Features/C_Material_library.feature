#Author: karthick@kripya.com
@Selenium @MaterialHeirarichy @Material @Tag1 @Tag2  @Group2 @Group3 @Group4
Feature: Creation of Material Hierarchy

  @NewmaterialCreation
  Scenario Outline: User creates New material for a product
    Given User launches centric application
    Then Go to homepage
    And verify user screen
    And Click Libraries tab under specification
    When User create New material with mandatory deatails for material creation "<Standalone-value>","<Standalone-material>","<Standalone-code>"
    And User create material for Structure Component "<StrComponent-value>","<StrComponent-material>","<StrComponent-code>","<Tool-value>","<Tool-material>","<Tool-code>"
    And User performing copy and delete action on material
    And User creates color and size
    # Then select the image from the avilable resource
    Then Go to homepage
    And User creating suppliers,samples and sku and validates "<SupplierA>","<SupplierB>","<SupplierC>","<material-Sample>","<colors/sizes>","<SKU>","<ChooseSupplier>"

    Examples: 
      | SupplierA | SupplierB | SupplierC | material-Sample    | colors/sizes       | SKU          | Standalone-value    | Standalone-material      | Standalone-code  | StrComponent-value           | StrComponent-material  | StrComponent-code | Tool-value    | Tool-material                    | Tool-code        | ChooseSupplier |
      | Changshu  | Frontline | Supplier  | 100% Cotton Jersey | colors and sizes=1 | Material SKU | Fabric - Stanadlone | 100% Cotton/Rayon Jersey | 123 - Automation | Fabric - Structure Component | 100% Polyester Chiffon | 123 - Automation  | Fabric - Tool | 100% Polyester Chiffon (Striped) | 123 - Automation | Supplier       |

  #-------------------------------------------------------------------------------------------------------------
  @MaterialGallery
  Scenario Outline: Material Gallery validation
   # Given User launches centric application
    Then Go to homepage
    And verify user screen
    And User validates material gallery "<Test>","<MG-Filter>"

    Examples: 
      | Test          | MG-Filter |
      | QA Automation | Active    |

  #-------------------------------------------------------------------------------------------------------------
  @MaterialSecurity
  Scenario Outline: Material Security Group validation
   # Given User launches centric application
    Then Go to homepage
    And verify user screen
    And User validates material security group "<Test>","<MSG-Standalone>","<MSG-All>","<MSG-A>","<MSG-B>"
    And User validates security group copy,delete actions
    Examples: 
      | Test          | MSG-Standalone | MSG-All | MSG-A              | MSG-B            |
      | QA Automation | MSG-Standalone | MSG-All | Changshu Materials | Vendor Materials |

  #-------------------------------------------------------------------------------------------------------------
  @MaterialColor
  Scenario: Material color validation
    #Given User launches centric application
    Then Go to homepage
    And verify user screen
    And User validates colored material
    And User validates colored material copy,delete actions

  #-------------------------------------------------------------------------------------------------------------
  @MaterialSample
  Scenario Outline: Material Sample validation
    #Given User launches centric application
    Then Go to homepage
    And verify user screen
    And User validates and edit material samples "<material-Sample>","<ChooseSupplier>"
    And user validates PDF action in material samples

    Examples: 
      | material-Sample    | ChooseSupplier |
      | 100% Cotton Jersey | Supplier       |

  #-------------------------------------------------------------------------------------------------------------
  @MaterialSKU
  Scenario: Material SKU validation
    #Given User launches centric application
    Then Go to homepage
    And verify user screen
    And User validates material SKU's
    And User validates custom view action in material SKU

  #-------------------------------------------------------------------------------------------------------------
  @MaterialSourcing
  Scenario: Material Sourcing validation
    # Given User launches centric application
    Then Go to homepage
    And verify user screen
    And User validates sourcing
   

  #-------------------------------------------------------------------------------------------------------------
  @MatrialCareLabel
  Scenario Outline: Material Care Label validation
   # Given User launches centric application
   Then Go to homepage
   And verify user screen
   And User validates care label "<CL-Wash>","<CL-Iron>","<CL-Special>"
 And User validates care label copy,delete action
 
    Examples: 
      | CL-Wash     | CL-Iron       | CL-Special            |
      | Do Not Wash | Iron Low Heat | Wash With Like Colors |

  #-------------------------------------------------------------------------------------------------------------
  @MaterialComposition
  Scenario Outline: Material Composition Placement validation
   # Given User launches centric application
    Then Go to homepage
    And verify user screen
    And User validates composition placements "<CompPlacement-A>","<CompPlacement-B>"
    And User validates composition placements custom view actions
    And User validates Composition Placements edit,copy,delete action
    
    Examples: 
      | CompPlacement-A          | CompPlacement-B          |
      | Inner Lining - Placement | Outer Lining - placement |

  #-------------------------------------------------------------------------------------------------------------
  @CompositeMaterial
  Scenario Outline: Composite Material validation
   # Given User launches centric application
    Then Go to homepage
    And verify user screen
    And User validates composition material "<compMaterial-A>","<compMaterial-B>","<compMaterial-C>"
   And User validates composition material custom view actions
   And User validates composition material edit,copy,delete action

    Examples: 
      | compMaterial-A | compMaterial-B | compMaterial-C |
      | BRASS          | COTTON         | LEATHER        |

  #-------------------------------------------------------------------------------------------------------------
  @MaterialPlacement
  Scenario Outline: Material Placement validation
   # Given User launches centric application
    Then Go to homepage
    And verify user screen
    And User validates placement "<Placement-A>","<Placement-B>"
    And User validates placements custom view actions
    And User validates placements edit,copy,delete action

    Examples: 
      | Placement-A          | Placement-B      |
      | Shoulder - placement | Neck - placement |

  #-------------------------------------------------------------------------------------------------------------
  @MaterialProductSymbol
  Scenario Outline: Material Product Symbols validation
   # Given User launches centric application
    Then Go to homepage
    And verify user screen
    And User validates product symbols "<PS-Brand>","<PS-Feature>","<PS-Function>"
    And User validates product symbols copy,delete actions

    Examples: 
      | PS-Brand | PS-Feature | PS-Function |
      | Heat     | Vibration  | Waterproof  |

  #-------------------------------------------------------------------------------------------------------------
  @MaterialLanguage
  Scenario Outline: Material Language validation
    # Given User launches centric application
    Then Go to homepage
    And verify user screen
    And User validates language "<Language-A>","<Language-B>","<Language-C>"

    Examples: 
      | Language-A   | Language-B | Language-C |
      | English - US | French     | Japanese   |

  #-------------------------------------------------------------------------------------------------------------
  @MaterialStructure
  Scenario Outline: Material Structure Component validation
   # Given User launches centric application
    Then Go to homepage
    And verify user screen
    And User validates product structure "<StrComponent-material>"
    And User validates Product structures custom view actions
    And User validates Product structures edit,copy,delete action
    Then Logout from the Application
    

    Examples: 
      | StrComponent-material |
      | shoe structure        |
#-------------------------------------------------------------------------------------------------------------      
