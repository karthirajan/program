@FoodSetupHeirarchy @FoodTypes @Tag1 @Group2
Feature: Creating Food Setup

  @FoodSetup
  Scenario Outline: Creation for Food
   Given User launches centric application
    Then Go to homepage
    And verify user screen
    And Navigate to Food Setup
    Then Create food config "<Allergens>"
    Then Create claims "<Claims>"
    Then create food ingredients "<Ingredients>"
    Then Create food nutrients "<Nutrients>"
    Then user create Datasheet Template "<DSallergen>","<DSnutrient>"

    Examples: 
      | Allergens                                          | Claims                                                          | Ingredients                                                                                                | Nutrients                                                       | DSallergen                                          | DSnutrient                                                      |
      | Fish,Milk,Eggs,Soybean,Tree Nuts,Peanuts,ShellFish | structure/function claims,nutrient content claims,health claims | caramelized onions,Oils,Vinegars,Chilli paste,Soy sauce,cheddar cheese,green pepper,grilled chicken,Pepper | Proteins,Vitamins,Minerals,Calories,Sodium,Sugars,Carbohydrates | Eggs,Fish,Milk,Peanuts,ShellFish,Soybean,Tree Nuts | Calories,Carbohydrates,Minerals,Proteins,Sodium,Sugars,Vitamins |

  @CompetitiveFoodcreation
  Scenario Outline: Creation for Food
     #Given User launches centric application
    Then Go to homepage
    And verify user screen
    And user create foodtype and competitivefood "<competitive>","<Food>"
    Then User select Salesregion and perform delete action
    And select Competitive food
    And create Food SKU "<sku>"

    Examples: 
      | competitive            | Food            | sku          |
      | Cheese Pizza,1000,TEST | Pizza,veg pizza | FOOD SKU,CAD |

  @FoodDataCreation
  Scenario Outline: Creating datas under created Food
    #Given User launches centric application
    Then Go to homepage
    And verify user screen
    Then user create and validate datapackge
    And create Lables "<labels>"
    Then under labels select values for Allergen Ingredient Nutrient Claim "<fooddata>","<allergens>"
    Then user create Artwork values
    And create value for Review also verify delete function
    Then user verify copy edit and delte in spec creation "<spec>","<specedit>"

    Examples: 
      | labels                                             | fooddata                                                         | spec | specedit |allergens																				 |
      | Food,Food Additives  Colours and Flavors Datasheet | New Ingredient,New Allergen,Eggs,New Nutrient,Calories,New Claim | spec | specedit |Fish,Milk,Eggs,Soybean,Tree Nuts,Peanuts,ShellFish|

  @DataPackage
  Scenario Outline: Creating data Package Templates under Data Packages
    #Given User launches centric application
    Then Go to homepage
    And verify user screen
    And Navigate to Data packages
    And Create Data Package Templates "<DPTemplates>"
    Then Go to the Data Packages with cover sheet and create the Data Sheets And Verify Edit Delete Copy Functionality "<DPTemplates>","<Data SheetTypes>"
    Then Go to the Data Packages without cover sheet and create the Data Sheets "<DPTemplates>","<Data SheetTypes>"
    Then Create View Under the Cover Sheet View for Data Package Template With Cover Sheet "<DPTemplates>"
    Then Create View Under the Cover Sheet View for Data Package Template With Out Cover Sheet "<DPTemplates>"

    Examples: 
      | DPTemplates                                    | Data SheetTypes                                                            |
      | DPTemp-WithCoverSheet,DPTemp-WithOutCoverSheet | Artwork,Food Label Data Sheet,Food Review,Routing,Spec Data Sheet,Test Run |

  @Artwork
  Scenario Outline: Creating datas under created Food
    Given User launches centric application
    Then Go to homepage
    And verify user screen
    And user create food type "<Food>"
    Then user create Artwork template and verify edit,copy and delete function
    And user create canvas template for artwork
    And select template in foodtab and approves it

    Examples: 
      | Food                                                 |
      | Fast Food, J-Noodles,Fruits and vegetables,Apple     |

  @Routing
  Scenario Outline: create routing template under Food
     #Given User launches centric application
    Then Go to homepage
    And verify user screen
    Then user create routing template and verify edit,copy and delete function
    And user create newsubrouting "<Subrouting>"
    And user creates newcapability in subrouting
    Then user copy delete approve the capabilities and subrouting
    And user created Routing template tab "<routing template>"
    And goes to foodtab and select new from template "<routing template>"
    Then user copies approve revise and adandon

    Examples: 
      | Subrouting        | routing template |
      | Subrouting001,CMT | Div001           |

  @FoodLabelDataSheet
  Scenario Outline: Creating Food Label Data Sheet Templates
    #Given User launches centric application
    Then Go to homepage
    And verify user screen
    And Navigate to Food Label Data Sheet Templates
    And Create Food Label Data Sheet Templates "<FoodLabelDataSheetTemplates>","<FoodLabelDataSheetSubtype>"
    Then Go to the Food Label Data Sheet Template Node and Verify the Tab names "<FoodLabelDataSheetTemplates>"
    Then Go to the Ingredient Items tab and Create Ingredient Item and Verify the Main Ingredient Checkbox "<IngredientItemName>"
    Then Go to the Nutrient Items tab and Create Nutrient Items and Verify UOM DV and Amount Columns "<NutrientItemName>"

    Examples: 
      | FoodLabelDataSheetTemplates | FoodLabelDataSheetSubtype           | IngredientItemName | NutrientItemName |
      | FLDataSheet                 | Food Additives, Colours and Flavors | CornFlour          | WheyProtein      |

  @FoodDocument
  Scenario Outline: create Document under Food
     Given User launches centric application
    Then Go to homepage
    And verify user screen
    And user create food types "<Food>"
    Then user create Document and verify approve function"<Document>"

    Examples: 
      | Food                                                 | Document                   |
      | Pizza, veg pizza,Dog Food,pedigree,Fast Food,Noodles | New Document,New Document1 |

  @FoodSKUGTIN
  Scenario Outline: create GTIn under Food SKU
    #Given User launches centric application
    Then Go to homepage
    And verify user screen
    And user create foodtype and competitivefood "<CompFoodName>","<FoodNames>"
    Then User select Salesregion and create SKU "<SalesRegionName>","<FoodSKU>"
    And User Creates and Verify the GTIN Under Food SKU "<GTINForFoodSKU>","<FoodSKU>","<ManufacturerName>"

   Examples: 
      | ManufacturerName  | ManufacturerCode | SalesRegionName | GTINForFoodSKU | FoodNames |  CompFoodName | FoodSKU |          
      | JubilientFoods    | 12345            | India-South     | 12345 |  Pizza, FoodForGTINVerf   |  CompFoodName,200,CompetitiveFood | FoodSKU | 

 @FoodBOM
   Scenario Outline: create BOM under style  
    #Given User launches centric application
    Then Go to homepage
    And verify user screen
    And user create new food under food placement in style"<BOM>"
    Then user create BOM under food placement in style"<Food>"
    
    Examples: 
      | BOM                    |  Food               |
      | Apparel BOM,Food BOM   |   New Food,veg pizza|
      
   @Food_Data_Package_PDF
   Scenario: create BOM under style  
    #Given User launches centric application
    Then Go to homepage
    And verify user screen 
    And User select food data package templates
    And User generating food data package pdf 
    Then Logout from the Application 
    