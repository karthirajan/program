package com.centric.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.centric.resources.Commonactions;

public class FoodSetupPage extends Commonactions{

	public FoodSetupPage() {
		PageFactory.initElements(Commonactions.driver, this);
	}

	@FindBy(xpath="//a[text()='Food Setup']")
	private WebElement foodsetup;

	@FindBy(xpath="//span[text()='Food Allergens']")
	private WebElement foodallergens;

	@FindBy(xpath="//span[text()='Food Claims']")
	private WebElement foodclaims;

	@FindBy(xpath="//span[text()='Food Ingredients']")
	private WebElement foodingredient;

	@FindBy(xpath="//span[text()='Food Nutrients']")
	private WebElement foodnutri;

	@FindBy(xpath="//table[@data-csi-automation='plugin-Data-FoodAllergens-ToolbarNewActions']//div/div[2]")
	private WebElement foodalleraction;

	@FindBy(xpath="//div[@data-csi-automation='field-FoodAllergen-Form-Node Name']//div/div/input")
	private WebElement foodallerinput;	

	@FindBy(xpath="//table[@data-csi-automation='plugin-Data-FoodClaims-ToolbarNewActions']//div/div[2]")
	private WebElement foodclaimaction;	

	@FindBy(xpath="//div[@data-csi-automation='field-FoodClaim-Form-Node Name']//div/div/input")
	private WebElement foodclaiminput;	

	@FindBy(xpath="//table[@data-csi-automation='plugin-Data-FoodIngredients-ToolbarNewActions']//div/div[2]")
	private WebElement foodingreaction;		

	@FindBy(xpath="//div[@data-csi-automation='field-FoodIngredient-Form-Node Name']//div/div/input")
	private WebElement foodingredinput;

	@FindBy(xpath="//table[@data-csi-automation='plugin-Data-FoodNutrients-ToolbarNewActions']//div/div[2]")
	private WebElement foodnutriaction;

	@FindBy(xpath="(//td[text()='Eggs']//following::td[@data-csi-act='Languages::0{Languages}'])[1]")
	private WebElement eggusinp;

	@FindBy(xpath="(//td[text()='Fish']//following::td[@data-csi-act='Languages::0{Languages}'])[1]")
	private WebElement fishusinp;

	@FindBy(xpath="(//td[text()='Milk']//following::td[@data-csi-act='Languages::0{Languages}'])[1]")
	private WebElement milkusinp;

	@FindBy(xpath="(//td[text()='Soybean']//following::td[@data-csi-act='Languages::0{Languages}'])[1]")
	private WebElement Soybeanusinp;

	@FindBy(xpath="(//td[text()='Tree Nuts']//following::td[@data-csi-act='Languages::0{Languages}'])[1]")
	private WebElement TreeNutsusinp;

	@FindBy(xpath="(//td[text()='Peanuts']//following::td[@data-csi-act='Languages::0{Languages}'])[1]")
	private WebElement PeaNutsusinp;


	@FindBy(xpath="(//td[text()='ShellFish']//following::td[@data-csi-act='Languages::0{Languages}'])[1]")
	private WebElement ShellFishusinp;


	@FindBy(xpath="(//td[text()='structure/function claims']//following::td[@data-csi-act='Languages::0{Languages}'])[1]")
	private WebElement Structureinp;

	@FindBy(xpath="(//td[text()='nutrient content claims']//following::td[@data-csi-act='Languages::0{Languages}'])[1]")
	private WebElement NutrientContentinp;

	@FindBy(xpath="(//td[text()='health claims']//following::td[@data-csi-act='Languages::0{Languages}'])[1]")
	private WebElement Healthinp;

	@FindBy(xpath="(//td[text()='Pepper']//following::td[@data-csi-act='Languages::0{Languages}'])[1]")
	private WebElement pepperusinp;

	@FindBy(xpath="(//td[text()='Oils']//following::td[@data-csi-act='Languages::0{Languages}'])[1]")
	private WebElement oilusinp;

	@FindBy(xpath="(//td[text()='caramelized onions']//following::td[@data-csi-act='Languages::0{Languages}'])[1]")
	private WebElement Caramelizedonionsinp;

	@FindBy(xpath="(//td[text()='Vinegars']//following::td[@data-csi-act='Languages::0{Languages}'])[1]")
	private WebElement Vinegarsinp;

	@FindBy(xpath="(//td[text()='Chilli paste']//following::td[@data-csi-act='Languages::0{Languages}'])[1]")
	private WebElement Chilipasteinp;

	@FindBy(xpath="(//td[text()='Soy sauce']//following::td[@data-csi-act='Languages::0{Languages}'])[1]")
	private WebElement Soysaucesinp;

	@FindBy(xpath="(//td[text()='cheddar cheese']//following::td[@data-csi-act='Languages::0{Languages}'])[1]")
	private WebElement cheddarcheesesinp;

	@FindBy(xpath="(//td[text()='green pepper']//following::td[@data-csi-act='Languages::0{Languages}'])[1]")
	private WebElement greenpeppersinp;

	@FindBy(xpath="(//td[text()='grilled chicken']//following::td[@data-csi-act='Languages::0{Languages}'])[1]")
	private WebElement GrilledChickensinp;


	@FindBy(xpath="(//td[text()='Proteins']//following::td[@data-csi-act='Languages::0{Languages}'])[1]")
	private WebElement Proteinsinp;

	@FindBy(xpath="(//td[text()='Vitamins']//following::td[@data-csi-act='Languages::0{Languages}'])[1]")
	private WebElement Vitaminsinp;

	@FindBy(xpath="(//td[text()='Minerals']//following::td[@data-csi-act='Languages::0{Languages}'])[1]")
	private WebElement Mineralsinp;

	@FindBy(xpath="(//td[text()='Calories']//following::td[@data-csi-act='Languages::0{Languages}'])[1]")
	private WebElement Caloriesinp;

	@FindBy(xpath="(//td[text()='Sodium']//following::td[@data-csi-act='Languages::0{Languages}'])[1]")
	private WebElement Sodiuminp;

	@FindBy(xpath="(//td[text()='Sugars']//following::td[@data-csi-act='Languages::0{Languages}'])[1]")
	private WebElement Sugarsinp;

	@FindBy(xpath="(//td[text()='Carbohydrates']//following::td[@data-csi-act='Languages::0{Languages}'])[1]")
	private WebElement Carbohydratesinp;

	@FindBy(xpath="//span[text()='Cancel']")
	private WebElement cancelbutton;


	public WebElement getPepperusinp() {
		return pepperusinp;
	}

	public WebElement getOilusinp() {
		return oilusinp;
	}

	public WebElement getCaramelizedOnionsinp() {
		return Caramelizedonionsinp;
	}

	public WebElement getVinegarsinp() {
		return Vinegarsinp;
	}

	public WebElement getChilipasteinp() {
		return Chilipasteinp;
	}

	public WebElement getSoysaucesinp() {
		return Soysaucesinp;
	}

	public WebElement getcheddarcheesesinp() {
		return cheddarcheesesinp;
	}
	public WebElement getgreenpeppersinp() {
		return greenpeppersinp;
	}
	public WebElement getGrilledChickensinp() {
		return GrilledChickensinp;
	}


	public WebElement getHealthinp() {
		return Healthinp;
	}

	public WebElement getNutrientContentinp() {
		return NutrientContentinp;
	}


	public WebElement getStructureinp() {
		return Structureinp;
	}


	public WebElement getMilkusinp() {
		return milkusinp;
	}


	public WebElement getSoybeanusinp() {
		return Soybeanusinp;
	}

	public WebElement getTreeNutsusinp() {
		return TreeNutsusinp;
	}

	public WebElement getPeaNutsusinp() {
		return PeaNutsusinp;
	}

	public WebElement getShellFishusinp() {
		return ShellFishusinp;
	}


	public WebElement getFishusinp() {
		return fishusinp;
	}


	public WebElement getEggusinp() {
		return eggusinp;
	}


	public WebElement getFoodingredient() {
		return foodingredient;
	}


	public WebElement getFoodnutri() {
		return foodnutri;
	}


	public WebElement getFoodclaimaction() {
		return foodclaimaction;
	}


	public WebElement getFoodclaiminput() {
		return foodclaiminput;
	}


	public WebElement getFoodingreaction() {
		return foodingreaction;
	}


	public WebElement getFoodingredinput() {
		return foodingredinput;
	}


	public WebElement getFoodnutriaction() {
		return foodnutriaction;
	}


	public WebElement getFoodalleraction() {
		return foodalleraction;
	}


	public WebElement getFoodallerinput() {
		return foodallerinput;
	}


	public WebElement getFoodallergens() {
		return foodallergens;
	}


	public WebElement getFoodclaims() {
		return foodclaims;
	}


	public WebElement getFoodsetup() {
		return foodsetup;
	}


	public WebElement getProteinsinp() {
		return Proteinsinp;
	}


	public WebElement getVitaminsinp() {
		return Vitaminsinp;
	}


	public WebElement getMineralsinp() {
		return Mineralsinp;
	}


	public WebElement getCaloriesinp() {
		return Caloriesinp;
	}

	public WebElement getSodiuminp() {
		return Sodiuminp;
	}

	public WebElement getSugarsinp() {
		return Sugarsinp;
	}

	public WebElement getCarbohydratesinp() {
		return Carbohydratesinp;
	}

	public WebElement getCancelButton() {
		return cancelbutton;
	}

	@FindBy(xpath="//span[text()='Food Label Data Sheet Templates']")
	private WebElement foodlabeldatasheet;

	@FindBy(xpath="//table[@data-csi-automation='plugin-Data-FoodLabelDataSheetTemplates-ToolbarNewActions']//div[text()='New Food Label Data Sheet Template']")
	private WebElement FoodDatasheettab;

	@FindBy(xpath="//div[@data-csi-automation='field-FoodLabelDataSheet-Form-Subtype']//div[3]/input[1]")
	private WebElement fooddatasheetsubtype;

	@FindBy(xpath="//div[@data-csi-automation='field-FoodLabelDataSheet-Form-Node Name']//div[2]/div/input")
	private WebElement fooddatasheetname;

	@FindBy(xpath="//a[text()='Food']")
	private WebElement foodname;

	@FindBy(xpath="(//div[text()='New Ingredient Item'])[2]//following::td[1]")
	private WebElement newingredientitem;

	@FindBy(xpath="//td[text()='New from Food Ingredient']")
	private WebElement newfromfoodingredient;

	@FindBy(xpath="//span[text()='Food Ingredient']//ancestor::tr/th/div/input")
	private WebElement foodingredientchkbox;

	@FindBy(xpath="(//div[text()='New Allergen Item'])[2]//following::td[1]")
	private WebElement newallergenitem;

	@FindBy(xpath="//td[text()='New from Food Allergen']")
	private WebElement newfromfoodallergen;

	@FindBy(xpath="//span[text()='Food Allergen']//ancestor::tr/th/div/input")
	private WebElement foodallergenchkbox;

	@FindBy(xpath="//div[@data-csi-automation='field-AllergenItem-Form-Node Name']/div[2]/div/input[1]")
	private WebElement allergenitemname;

	@FindBy(xpath="(//div[text()='New Nutrient Item'])[2]//following::td[1]")
	private WebElement newnutrientitem;

	@FindBy(xpath="//td[text()='New from Food Nutrient']")
	private WebElement newfromfoodnutrient;

	@FindBy(xpath="//span[text()='Food Nutrient']//ancestor::tr/th/div/input")
	private WebElement foodnutrientckhbox;

	@FindBy(xpath="//div[@data-csi-automation='field-NutrientItem-Form-Node Name']/div[2]/div/input[1]")
	private WebElement foodnutrientitemname;

	@FindBy(xpath="(//div[text()='New Claim Item'])[2]//following::td[1]")
	private WebElement newclaimitem;

	@FindBy(xpath="//td[text()='New from Food Claim']")
	private WebElement newfromfoodclaim;

	@FindBy(xpath="//span[text()='Food Claim']//ancestor::tr/th/div/input")
	private WebElement foodclaimchkbox;


	public WebElement getFoodlabeldatasheet() {
		return foodlabeldatasheet;
	}

	public WebElement getFoodDatasheettab() {
		return FoodDatasheettab;
	}

	public WebElement getFooddatasheetsubtype() {
		return fooddatasheetsubtype;
	}

	public WebElement getFooddatasheetname() {
		return fooddatasheetname;
	}

	public WebElement getFoodname() {
		return foodname;
	}

	public WebElement getNewingredientitem() {
		return newingredientitem;
	}

	public WebElement getNewfromfoodingredient() {
		return newfromfoodingredient;
	}

	public WebElement getFoodingredientchkbox() {
		return foodingredientchkbox;
	}

	public WebElement getNewallergenitem() {
		return newallergenitem;
	}

	public WebElement getNewfromfoodallergen() {
		return newfromfoodallergen;
	}

	public WebElement getFoodallergenchkbox() {
		return foodallergenchkbox;
	}

	public WebElement getAllergenitemname() {
		return allergenitemname;
	}

	public WebElement getNewnutrientitem() {
		return newnutrientitem;
	}

	public WebElement getNewfromfoodnutrient() {
		return newfromfoodnutrient;
	}

	public WebElement getFoodnutrientckhbox() {
		return foodnutrientckhbox;
	}

	public WebElement getFoodnutrientitemname() {
		return foodnutrientitemname;
	}

	public WebElement getNewclaimitem() {
		return newclaimitem;
	}

	public WebElement getNewfromfoodclaim() {
		return newfromfoodclaim;
	}

	public WebElement getFoodclaimchkbox() {
		return foodclaimchkbox;
	}

	/////////////////////////////////////////////////////////////////////

	@FindBy(xpath="//span[text()='Food' or @data-csi-tab-name='Food']")
	private WebElement foodTab;

	@FindBy(xpath="//span[text()='Foods' or @data-csi-tab-name='Foods']")
	private WebElement foodsTab;

	@FindBy(xpath="//span[text()='Foods' or @data-csi-tab-name='Foods']")
	private WebElement foodPrdctTab;

	@FindBy(xpath="(//table[contains(@data-csi-automation,'AllFoods')]//div/div)[2]")
	private WebElement newFoodBtn;

	@FindBy(xpath="(//div[contains(@data-csi-automation,'Food-Form-Subtype')]/div[3]//input)[1]")
	private WebElement foodTypeValue;

	@FindBy(xpath="(//div[contains(@data-csi-automation,'Food')]/div)/div/input")
	private WebElement foodValue;

	@FindBy(xpath="(//td[@data-csi-act='Node Name::0']/a[contains(text(),'veg pizza')])[1]")
	private WebElement vegpizza;

	@FindBy(xpath="//span[text()='Sales Regions' or @data-csi-tab-name='Sales Regions']")
	private WebElement salesRegionTab;

	@FindBy(xpath="(//table[contains(@data-csi-automation,'ProductSalesRegions')]//div/div)[2]")
	private WebElement newSalesRegionBtn;

	@FindBy(xpath="(//td[contains(text(),'CAD SR')]//preceding-sibling::td)//input")
	private WebElement cadSRChkBx;

	@FindBy(xpath="//td[text()='CAD SR']//following::span[text()='close']")
	private WebElement deletecadsr;

	@FindBy(xpath="(//td[contains(text(),'USA SR')]//preceding-sibling::td)//input")
	private WebElement usdSRChkBx;

	@FindBy(xpath="//span[text()='SKUs' or @data-csi-tab-name='SKUs']")
	private WebElement skubtn;

	@FindBy(xpath="(//table[contains(@data-csi-automation,'plugin-Food-ProductSKU')]//div/div)[2]")
	private WebElement newskusbtn;

	@FindBy(xpath="(//div[contains(@data-csi-automation,'FormulatedProductSKU')]/div)[2]/div/input")
	private WebElement foodsku;

	@FindBy(xpath="//div[contains(@data-csi-automation,'FPSProductSalesRegion')]/div[3]/input[1]")
	private WebElement foodsalesregion;

	@FindBy(xpath="//a[text()='FOOD SKU']//following::span[text()='content_copy']")
	private WebElement copyfoodsku;

	@FindBy(xpath="//a[text()='FOOD SKU']//following::span[text()='close']")
	private WebElement closefoodsku;

	@FindBy(xpath="//span[text()='Competitive Foods' or @data-csi-tab-name='Competitive Foods']")
	private WebElement competitivefoodtab;

	@FindBy(xpath="//table[contains(@data-csi-automation,'CompetitiveFoods')]//div[text()='New Competitive Food']")
	private WebElement newcompetitivefoodbtn;

	@FindBy(xpath="//table[contains(@data-csi-automation,'CompetitiveFoods')]//div[text()='New Competitive Food']//following::td[1]")
	private WebElement Newcompetitivefoodexpbtn;

	@FindBy(xpath="(//td[text()='Select Competitive Foods'])[1]")
	private WebElement selectcompetitivefood;

	@FindBy(xpath="(//th[@class='csi-table-selection-column noexport firstColumn'])[1]")
	private WebElement selectcompetitivechkbx;

	@FindBy(xpath="//span[text()='Specification' or @data-csi-tab-name='Specification']")
	private WebElement specificationtab;

	@FindBy(xpath="//span[text()='Summary' or @data-csi-tab-name='Summary']")
	private WebElement summarytab;

	@FindBy(xpath="(//table[contains(@data-csi-automation,'BaseProduct')]//div/div)[2]")
	private WebElement newdatapackage;

	@FindBy(xpath="//a[text()='Data Package']")
	private WebElement Datapackagename;

	@FindBy(xpath="//span[text()='Labels' or @data-csi-tab-name='Labels']")
	private WebElement label;

	@FindBy(xpath="//table[contains(@data-csi-automation,'FoodLabelDataSheets')]//div[text()='New Food Label Data Sheet']")
	private WebElement newlabeldatshtbtn;

	@FindBy(xpath="//div[@data-csi-automation='field-FoodLabelDataSheet-Form-Subtype']//div[3]/input[1]")
	private WebElement labelsubtype;

	@FindBy(xpath="//div[@data-csi-automation='field-FoodLabelDataSheet-Form-Node Name']//div[2]/div/input")
	private WebElement labelfooddatasheet;

	@FindBy(xpath="(//table[contains(@data-csi-automation,'FoodLabelDataSheets')]/tbody/tr/td[2])[3]")
	private WebElement choosenewfoodlabeldatasheet;

	@FindBy(xpath="(//th[@class='csi-table-selection-column noexport firstColumn'])[1]")
	private WebElement selectchkbox;

	@FindBy(xpath="(//div[contains(@data-csi-automation,'Subtype')]/div/input)[1]")
	private WebElement subtypebutton;

	@FindBy(xpath="(//td[@data-csi-act='Node Name::0']/a)[1]")
	private WebElement foodwecreateclick;

	@FindBy(xpath="//span[text()='Ingredient Items' or @data-csi-tab-name='Ingredient Items']")
	private WebElement ingredientitemtab;

	@FindBy(xpath="(//table[contains(@data-csi-automation,'plugin-FoodLabelDataSheetRevision-IngredientItems-ToolbarNewActions')]//div[text()='New Ingredient Item'])[1]")
	private WebElement newingredientbtn;

	@FindBy(xpath="//table[contains(@data-csi-automation,'plugin-FoodLabelDataSheetRevision-IngredientItems-ToolbarNewActions')]//td[2]")
	private WebElement newingredientbtnexp;

	@FindBy(xpath="//span[text()='Allergen Items' or @data-csi-tab-name='Allergen Items']")
	private WebElement allergenitemtab;

	@FindBy(xpath="//table[@data-csi-automation='plugin-FoodLabelDataSheetRevision-AllergenItems-ToolbarNewActions']//div[text()='New Allergen Item']")
	private WebElement newallergenbtn;

	@FindBy(xpath="//div[@data-csi-automation='field-AllergenItem-Form-Node Name']/div[2]/div/input[1]")
	private WebElement allergenfoodname;

	@FindBy(xpath="(//td[contains(text(),'New Ingredient')]//following::span[text()='more_horiz'])[1]")
	private WebElement promoteicon;

	@FindBy(xpath="//td[text()='Promote Food Ingredient']")
	private WebElement promotefood;

	@FindBy(xpath="//div[@data-csi-automation='field-AllergenItem-Form-LibraryItem']/div[3]/input[1]")
	private WebElement allergenitemlist;

	@FindBy(xpath="//span[text()='Nutrient Items' or @data-csi-tab-name='Nutrient Items']")
	private WebElement nutrienttab;

	@FindBy(xpath="//div[@data-csi-automation='field-NutrientItem-Form-Node Name']/div[2]/div/input[1]")
	private WebElement nutrientfoodname;

	@FindBy(xpath="//div[@data-csi-automation='field-NutrientItem-Form-LibraryItem']/div[3]/input[1]")
	private WebElement nutrientfoodselectitem;

	@FindBy(xpath="//span[text()='Claim Items' or @data-csi-tab-name='Claim Items']")
	private WebElement claimitermtab;

	@FindBy(xpath="(//td[contains(text(),'New Claim')]//following::span[text()='more_horiz'])[1]")
	private WebElement promoteiconclaim;

	@FindBy(xpath="//td[text()='Promote Claim Item']")
	private WebElement promoteclaim;

	@FindBy(xpath="(//table[contains(@data-csi-automation,'ClaimItems')]/tbody/tr/td[2])[1]")
	private WebElement newclaimbtn;

	@FindBy(xpath="//a[text()='veg pizza']")
	private WebElement clickvegpizzabtn;

	@FindBy(xpath="//span[text()='Artworks' or @data-csi-tab-name='Artworks']")
	private WebElement artworktab;

	@FindBy(xpath="(//table[contains(@data-csi-automation,'Artworks')]/tbody/tr/td[2])[1]")
	private WebElement artworkbtnexp;

	//@FindBy(xpath="(//td[contains(text(),'Artwork')]//parent::tr//div/input)[1]")


	@FindBy(xpath="(//th[contains(@class,'csi-table-selection-column noexport firstColumn')]/div/input)[1]")
    private WebElement artworkchkbox;

	@FindBy(xpath="(//table[@data-csi-automation='plugin-Food-Artworks-ToolbarNewActions']//td)[2]")
	private WebElement artworkbtn;

	@FindBy(xpath="//td[text()='New from Artwork']")
	private WebElement newfromartworkbtn;

	@FindBy(xpath="//a[text()='vegpizza']")
	private WebElement topvegpizzabtn;

	@FindBy(xpath="//span[text()='Reviews' or @data-csi-tab-name='Reviews']")
	private WebElement reviewtab;

	@FindBy(xpath="//table[contains(@data-csi-automation,'plugin-Food-FoodReviews-ToolbarNewActions')]//div[text()='New Food Review']")
	private WebElement newfoodreviewbtn;

	@FindBy(xpath="(//a[text()='Food Review']//following::span[text()='close'])[1]")
	private WebElement foodreviewdelete;

	@FindBy(xpath="//a[text()='Food Review']")
	private WebElement foodreviewname;

	@FindBy(xpath="//span[text()='Spec' or @data-csi-tab-name='Spec']")
	private WebElement spectab;

	@FindBy(xpath="//table[contains(@data-csi-automation,'plugin-Food-SpecificationDataSheets-ToolbarNewActions')]//div[text()='New Spec Data Sheet']")
	private WebElement specbtn;

	@FindBy(xpath="//div[@data-csi-automation='field-SpecificationDataSheet-Form-Subtype']//div[3]/input[1]")
	private WebElement spectype;

	@FindBy(xpath="//div[@data-csi-automation='field-SpecificationDataSheet-Form-Node Name']//div[2]/div/input")
	private WebElement specname;

	@FindBy(xpath="(//a[text()='spec']//following::span[text()='content_copy'])[1]")
	private WebElement speccopy;

	@FindBy(xpath="(//a[text()='spec']//following::span[text()='mode_edit'])[1]")
	private WebElement specedit;

	@FindBy(xpath="(//a[text()='specedit']//following::span[text()='close'])[1]")
	private WebElement specclose;

	@FindBy(xpath="//span[text()='Documents' or @data-csi-tab-name='Documents']")
	private WebElement documenttab;

	@FindBy(xpath="(//table[contains(@data-csi-automation,'DocumentContainer')]/tbody/tr/td[2])[1]")
	private WebElement docbtn;

	@FindBy(xpath="//td[text()='New Document']")
	private WebElement newformdocbtn;

	@FindBy(xpath="(//td[@class='attrString iconEditable firstColumn'])[2]")
	private WebElement newdocumentinbox;

	@FindBy(xpath="//td[@data-csi-act='Node Name::0']/a[contains(text(),'cheese pizza')]")
	private WebElement cheesepizzaclick;

	@FindBy(xpath="(//div[contains(@data-csi-automation,'CompetitiveFood-Form-Price')]/div)[2]/input")
	private WebElement compprice;

	@FindBy(xpath="(//div[contains(@data-csi-automation,'Form-Node Name')]/div)/div/input")
	private WebElement compname;

	@FindBy(xpath="//div[@data-csi-automation='field-CompetitiveFood-Form-Description']/div[2]/div/input")
	private WebElement compdesc;

	public WebElement getFoodsTab() {
		return foodsTab;
	}
	
	public WebElement getCaramelizedonionsinp() {
		return Caramelizedonionsinp;
	}

	public WebElement getCheddarcheesesinp() {
		return cheddarcheesesinp;
	}

	public WebElement getGreenpeppersinp() {
		return greenpeppersinp;
	}

	public WebElement getCancelbutton() {
		return cancelbutton;
	}

	public WebElement getFoodTab() {
		return foodTab;
	}

	public WebElement getFoodPrdctTab() {
		return foodPrdctTab;
	}

	public WebElement getNewFoodBtn() {
		return newFoodBtn;
	}

	public WebElement getFoodTypeValue() {
		return foodTypeValue;
	}

	public WebElement getFoodValue() {
		return foodValue;
	}

	public WebElement getVegpizza() {
		return vegpizza;
	}

	public WebElement getSalesRegionTab() {
		return salesRegionTab;
	}

	public WebElement getNewSalesRegionBtn() {
		return newSalesRegionBtn;
	}

	public WebElement getCadSRChkBx() {
		return cadSRChkBx;
	}

	public WebElement getDeletecadsr() {
		return deletecadsr;
	}

	public WebElement getUsdSRChkBx() {
		return usdSRChkBx;
	}

	public WebElement getSkubtn() {
		return skubtn;
	}

	public WebElement getNewskusbtn() {
		return newskusbtn;
	}

	public WebElement getFoodsku() {
		return foodsku;
	}

	public WebElement getFoodsalesregion() {
		return foodsalesregion;
	}

	public WebElement getCopyfoodsku() {
		return copyfoodsku;
	}

	public WebElement getClosefoodsku() {
		return closefoodsku;
	}

	public WebElement getCompetitivefoodtab() {
		return competitivefoodtab;
	}

	public WebElement getNewcompetitivefoodbtn() {
		return newcompetitivefoodbtn;
	}

	public WebElement getNewcompetitivefoodexpbtn() {
		return Newcompetitivefoodexpbtn;
	}

	public WebElement getSelectcompetitivefood() {
		return selectcompetitivefood;
	}

	public WebElement getSelectcompetitivechkbx() {
		return selectcompetitivechkbx;
	}

	public WebElement getSpecificationtab() {
		return specificationtab;
	}

	public WebElement getSummarytab() {
		return summarytab;
	}

	public WebElement getNewdatapackage() {
		return newdatapackage;
	}

	public WebElement getDatapackagename() {
		return Datapackagename;
	}

	public WebElement getLabel() {
		return label;
	}

	public WebElement getNewlabeldatshtbtn() {
		return newlabeldatshtbtn;
	}

	public WebElement getLabelsubtype() {
		return labelsubtype;
	}

	public WebElement getLabelfooddatasheet() {
		return labelfooddatasheet;
	}

	public WebElement getChoosenewfoodlabeldatasheet() {
		return choosenewfoodlabeldatasheet;
	}

	public WebElement getSelectchkbox() {
		return selectchkbox;
	}

	public WebElement getSubtypebutton() {
		return subtypebutton;
	}

	public WebElement getFoodwecreateclick() {
		return foodwecreateclick;
	}

	public WebElement getIngredientitemtab() {
		return ingredientitemtab;
	}

	public WebElement getNewingredientbtn() {
		return newingredientbtn;
	}

	public WebElement getNewingredientbtnexp() {
		return newingredientbtnexp;
	}

	public WebElement getAllergenitemtab() {
		return allergenitemtab;
	}

	public WebElement getNewallergenbtn() {
		return newallergenbtn;
	}


	public WebElement getAllergenfoodname() {
		return allergenfoodname;
	}

	public WebElement getPromoteicon() {
		return promoteicon;
	}

	public WebElement getPromotefood() {
		return promotefood;
	}

	public WebElement getAllergenitemlist() {
		return allergenitemlist;
	}

	public WebElement getNutrienttab() {
		return nutrienttab;
	}

	public WebElement getNutrientfoodname() {
		return nutrientfoodname;
	}

	public WebElement getNutrientfoodselectitem() {
		return nutrientfoodselectitem;
	}

	public WebElement getClaimitermtab() {
		return claimitermtab;
	}

	public WebElement getPromoteiconclaim() {
		return promoteiconclaim;
	}

	public WebElement getPromoteclaim() {
		return promoteclaim;
	}

	public WebElement getNewclaimbtn() {
		return newclaimbtn;
	}


	public WebElement getClickvegpizzabtn() {
		return clickvegpizzabtn;
	}

	public WebElement getArtworktab() {
		return artworktab;
	}

	public WebElement getArtworkbtn() {
		return artworkbtn;
	}

	public WebElement getArtworkbtnexp() {
		return artworkbtnexp;
	}

	public WebElement getArtworkchkbox() {
		return artworkchkbox;
	}

	public WebElement getNewfromartworkbtn() {
		return newfromartworkbtn;
	}

	public WebElement getTopvegpizzabtn() {
		return topvegpizzabtn;
	}

	public WebElement getReviewtab() {
		return reviewtab;
	}

	public WebElement getNewfoodreviewbtn() {
		return newfoodreviewbtn;
	}

	public WebElement getFoodreviewdelete() {
		return foodreviewdelete;
	}

	public WebElement getFoodreviewname() {
		return foodreviewname;
	}

	public WebElement getSpectab() {
		return spectab;
	}

	public WebElement getSpecbtn() {
		return specbtn;
	}

	public WebElement getSpectype() {
		return spectype;
	}

	public WebElement getSpecname() {
		return specname;
	}

	public WebElement getSpeccopy() {
		return speccopy;
	}

	public WebElement getSpecedit() {
		return specedit;
	}

	public WebElement getSpecclose() {
		return specclose;
	}

	public WebElement getDocumenttab() {
		return documenttab;
	}

	public WebElement getDocbtn() {
		return docbtn;
	}

	public WebElement getNewformdocbtn() {
		return newformdocbtn;
	}

	public WebElement getNewdocumentinbox() {
		return newdocumentinbox;
	}

	public WebElement getCheesepizzaclick() {
		return cheesepizzaclick;
	}

	public WebElement getCompprice() {
		return compprice;
	}

	public WebElement getCompname() {
		return compname;
	}

	public WebElement getCompdesc() {
		return compdesc;
	}
	@FindBy(xpath="(//span[text()='Data Package Templates'])[1]")
	private WebElement DataPackageTemplate;

	@FindBy(xpath="//table[@data-csi-automation='plugin-SizeChartAdmin-DataPackageTemplates-ToolbarNewActions']//div/div[2]")
	private WebElement NewDPTempBtn;

	@FindBy(xpath="//div[@data-csi-automation='field-DataPackageTemplate-Form-Node Name']//div/div/input")
	private WebElement NewDPTempName;

	@FindBy(xpath="(//div[contains(@data-csi-automation,'field-DataPackageTemplate-Form-TemplateType')]/div[3]//input)[1]")
	private WebElement DPTempType;

	@FindBy(xpath="//table[@data-csi-automation='plugin-DataPackageTemplate-DataSheets-ToolbarNewActions']//div/div[2]")
	private WebElement NewDataSheetempBtn;

	@FindBy(xpath="(//div[contains(@data-csi-automation,'field-DataPackageTemplateSheet-Form-Type')]/div[3]//input)[1]")
	private WebElement DataSheetType;

	@FindBy(xpath="(//div[contains(@data-csi-automation,'field-DataPackageTemplateSheet-Form-Phase')]/div[3]//input)[1]")
	private WebElement DataSheetPhase;

	@FindBy(xpath="(//div[contains(@data-csi-automation,'field-DataPackageTemplateSheet-Form-State')]/div[3]//input)[1]")
	private WebElement DataSheetState;

	@FindBy(xpath="(//div[contains(@data-csi-automation,'field-DataPackageTemplateSheet-Form-Subtype')]/div[3]//input)[1]")
	private WebElement SpecDataSheetSubtype;

	@FindBy(xpath="(//span[@title='Show/Hide toolbars in view'])")
	private WebElement ShowHideToolbar;

	@FindBy(xpath="(//span[@data-csi-tab-name='Cover Sheet'])")
	private WebElement CoverSheetTab;

	@FindBy(xpath="//span[contains(@data-csi-automation,'plugin-DataPackageTemplate-CoverSheet-CustomViewActions')]//span[@title='Manage custom views']")
	private WebElement CoverSheetview;

	@FindBy(xpath="//tr[contains(@data-csi-automation,'plugin-DataPackageTemplate-CoverSheet-CustomViewManage')]//td[text()='Manage Views']")
	private WebElement CoverSheetviewManage;


	@FindBy(xpath="//span[contains(@data-csi-automation,'plugin-DataPackage-CoverSheetProperties-CustomViewActions')]//span[@title='Manage custom views']")
	private WebElement CoverSheetPropView;

	@FindBy(xpath="//tr[contains(@data-csi-automation,'plugin-DataPackage-CoverSheetProperties-CustomViewManage')]//td[text()='Manage Views']")
	private WebElement CoverSheetPropViewManage;

	@FindBy(xpath="//span[contains(@data-csi-automation,'plugin-Food-Properties-CustomViewActions')]//span[@title='Manage custom views']")
	private WebElement FoodPropView;

	@FindBy(xpath="//tr[contains(@data-csi-automation,'plugin-Food-Properties-CustomViewManage')]//td[text()='Manage Views']")
	private WebElement FoodPropViewManage;

	@FindBy(xpath="//span[contains(@data-csi-automation,'plugin-Food-ProductSKU-CustomViewActions')]//span[@title='Manage custom views']")
	private WebElement FoodProductSKUView;

	@FindBy(xpath="//tr[contains(@data-csi-automation,'plugin-Food-ProductSKU-CustomViewManage')]//td[text()='Manage Views']")
	private WebElement FoodProductSKUViewManage;

	@FindBy(xpath="//span[contains(@data-csi-automation,'plugin-Food-ProductSKUGallery-CustomViewActions')]//span[@title='Manage custom views']")
	private WebElement FoodProductSKUGalleryView;

	@FindBy(xpath="//tr[contains(@data-csi-automation,'plugin-Food-ProductSKUGallery-CustomViewManage')]//td[text()='Manage Views']")
	private WebElement FoodProductSKUGalleryViewManage;

	@FindBy(xpath="//span[contains(@data-csi-automation,'plugin-Food-ProductSamples-CustomViewActions')]//span[@title='Manage custom views']")
	private WebElement FoodSupplierItemsView;

	@FindBy(xpath="//tr[contains(@data-csi-automation,'plugin-Food-ProductSamples-CustomViewManage')]//td[text()='Manage Views']")
	private WebElement FoodSupplierItemsViewManage;

	@FindBy(xpath="//span[contains(@data-csi-automation,'plugin-DataPackage-DataSheets-CustomViewActions')]//span[@title='Manage custom views']")
	private WebElement DataPackageDataSheetsView;

	@FindBy(xpath="//tr[contains(@data-csi-automation,'plugin-DataPackage-DataSheets-CustomViewManage')]//td[text()='Manage Views']")
	private WebElement DataPackageDataSheetsViewManage;

	@FindBy(xpath="//span[contains(@data-csi-automation,'plugin-DataPackage-Documents-CustomViewActions')]//span[@title='Manage custom views']")
	private WebElement DataPackageDocumentsView;

	@FindBy(xpath="//tr[contains(@data-csi-automation,'plugin-DataPackage-Documents-CustomViewManage')]//td[text()='Manage Views']")
	private WebElement DataPackageDocumentsViewManage;

	@FindBy(xpath="//span[text()='Add >']")
	private WebElement Add_Btn;

	public WebElement getDataPackageTemplate() {
		return DataPackageTemplate;
	}

	public WebElement getNewDPTempBtn() {
		return NewDPTempBtn;
	}

	public WebElement getNewDPTempName() {
		return NewDPTempName;
	}

	public WebElement getDPTempType() {
		return DPTempType;
	}

	public WebElement getNewDataSheetempBtn() {
		return NewDataSheetempBtn;
	}

	public WebElement getDataSheetType() {
		return DataSheetType;
	}

	public WebElement getDataSheetPhase() {
		return DataSheetPhase;
	}

	public WebElement getDataSheetState() {
		return DataSheetState;
	}
	public WebElement getSpecDataSheetSubtype() {
		return SpecDataSheetSubtype;
	}

	public WebElement getCoverSheetTab() {
		return CoverSheetTab;
	}
	public WebElement getShowHideToolbar() {
		return ShowHideToolbar;
	}

	public WebElement getCoverSheetview() {
		return CoverSheetview;
	}

	public WebElement getCoverSheetPropView() {
		return CoverSheetPropView;
	}

	public WebElement getFoodPropView() {
		return FoodPropView;
	}
	public WebElement getFoodProductSKUView() {
		return FoodProductSKUView;
	}

	public WebElement getFoodProductSKUGalleryView() {
		return FoodProductSKUGalleryView;
	}
	public WebElement getFoodSupplierItemsView() {
		return FoodSupplierItemsView;
	}
	public WebElement getDataPackageDataSheetsView() {
		return DataPackageDataSheetsView;
	}
	public WebElement getDataPackageDocumentsView() {
		return DataPackageDocumentsView;
	}
	public WebElement getCoverSheetviewManage() {
		return CoverSheetviewManage;
	}

	public WebElement getCoverSheetPropViewManage() {
		return CoverSheetPropViewManage;
	}

	public WebElement getFoodPropViewManage() {
		return FoodPropViewManage;
	}
	public WebElement getFoodProductSKUViewManage() {
		return FoodProductSKUViewManage;
	}

	public WebElement getFoodProductSKUGalleryViewManage() {
		return FoodProductSKUGalleryViewManage;
	}
	public WebElement getFoodSupplierItemsViewManage() {
		return FoodSupplierItemsViewManage;
	}
	public WebElement getDataPackageDataSheetsViewManage() {
		return DataPackageDataSheetsViewManage;
	}
	public WebElement getDataPackageDocumentsViewManage() {
		return DataPackageDocumentsViewManage;
	}

	public WebElement getAdd_Btn() {
		return Add_Btn;
	}

	//////////////////////////////////////////////////////////////////////////////////////------------//////////////////////
	@FindBy(xpath="//a[text()='J-Noodles']")
	private WebElement JNoodles;

	@FindBy(xpath="//a[text()='J-Noodles-editable']")
	private WebElement JNoodlesEdited;

	@FindBy(xpath="//a[text()='J-Artwork']//following::span[text()='check_circle']")
	private WebElement Approvebtn;

	@FindBy(xpath="(//table[contains(@data-csi-automation,'Artworks')]/tbody/tr/td[1])[1]")
	private WebElement newartworkbtn;

	@FindBy(xpath="(//span[@class='dijitReset dijitInline dijitButtonNode']/span[1])[11]")
	private WebElement topbtn;

	@FindBy(xpath="(//a[contains(text(),'Artwork')]/parent::td//following-sibling::td/div/span[text()='content_copy'])[1]")
	private WebElement copycontent;

	@FindBy(xpath="(//span[text()='content_copy'])[3]")
	private WebElement copycontentNew;

	@FindBy(xpath="(//span[text()='close'])[3]")
	private WebElement closebuttonNew;



	public WebElement getCopycontentNew() {
		return copycontentNew;
	}

	public WebElement getClosebuttonNew() {
		return closebuttonNew;
	}

	@FindBy(xpath="(//a[contains(text(),'Sub')]/ancestor::td//following-sibling::td/div/span[text()='content_copy'])[2]")
	private WebElement copycontentRouting;

	@FindBy(xpath="(//a[contains(text(),'Sub')]/ancestor::td//following-sibling::td/div/span[text()='close'])[2]")
	private WebElement closebuttonRouting;

	@FindBy(xpath="(//a[contains(text(),'Artwork')]/parent::td//following-sibling::td/div/span[text()='close'])[1]")
	private WebElement closebutton;




	public WebElement getCopycontentRouting() {
		return copycontentRouting;
	}

	public WebElement getClosebuttonRouting() {
		return closebuttonRouting;
	}

	@FindBy(xpath="//span[text()='Delete']")
	private WebElement Deletebtn;

	@FindBy(xpath="(//span[text()='Canvas Templates'])[1]")
	private WebElement canvastemplatetab;

	@FindBy(xpath="(//span[text()='Canvas'])[1]")
	private WebElement Canvastab;


	@FindBy(xpath="//div[text()='New Canvas Template']")
	private WebElement Newcanvastemplate;

	@FindBy(xpath="(//div[contains(@data-csi-automation,'field-CanvasTemplate')]/div[2]/div/input)[1]")
	private WebElement canvastemplate;

	@FindBy(xpath="(//div[contains(@data-csi-automation,'field-CanvasTemplate')]/div[3]/input)[1]")
	private WebElement Templatetype;

	@FindBy(xpath="(//td[@data-csi-heading='Active::0'])[1]")
	private WebElement artworkactivechkbox;

	@FindBy(xpath="(//td[@data-csi-heading='Node Name::0']/a)[1]")
	private WebElement JArtwork1;

	@FindBy(xpath="//span[text()='Create a new Canvas']")
	private WebElement crtnewcanvas;

	@FindBy(xpath="(//table[@class='dijit dijitReset dijitInline dijitLeft csi-button-toggle dijitComboButton']/tbody/tr/td/div)[1]")
	private WebElement recttemplate;

	@FindBy(xpath="//span[text()='Save & Finish']")
	private WebElement savefinishbtn;

	@FindBy(xpath="(//a[contains(text(),'J-Artwork')])[1]")
	private WebElement JArtwork;

	@FindBy(xpath="//span[text()='TDS' or @data-csi-tab-name='TDS']")
	private WebElement Tdstab;

	@FindBy(xpath="//span[text()='Select a Template']")
	private WebElement selecttemplate;

	@FindBy(xpath="//div[@data-csi-heading='Snapshot:Child:Pages/Index:0:0']")
	private WebElement selectimg;

	@FindBy(xpath="(//tr[contains(@data-csi-automation,'DataSetupSourcing')]/td)[2]")
	private WebElement sourcingsetup;

	@FindBy(xpath="(//td[@data-csi-heading='RoutingGroup::0'])[1]")
	private WebElement operationgroup;

	@FindBy(xpath="(//td[@data-csi-heading='RoutingGroup::0'])[2]")
	private WebElement operationgroup1;

	@FindBy(xpath="(//td[@data-csi-heading='RoutingGroup:Child:LatestRevision:0'])[1]")
	private WebElement latedstoperationgroup1;

	@FindBy(xpath="//a[text()='Subrouting001']")
	private WebElement subrouting001;

	@FindBy(xpath="(//th[@class='csi-table-selection-column noexport firstColumn'])[1]")
	private WebElement capchkbox;

	@FindBy(xpath="(//table[contains(@data-csi-automation,'actionRow-SubRoutingRevision-Items-root')]/tbody/tr/td)[2]")
	private WebElement newcapbtn;

	@FindBy(xpath="//td[text()='New Divider']")
	private WebElement newdivider;

	@FindBy(xpath="(//td[@data-csi-heading=\"__TextSpan__:\"])[2]")
	private WebElement Div001;

	@FindBy(xpath="//td[text()='New Sub Routing']")
	private WebElement newsubrouting;

	@FindBy(xpath="//div[contains(@data-csi-automation,'field-SubRouting-Form-Node Name')]/div[2]/div/input")
	private WebElement subroutingvalue;

	@FindBy(xpath="//td[text()='New Special']")
	private WebElement newsplbtn;

	@FindBy(xpath="(//td[@data-csi-heading=\"__TextSpan__:\"])[2]")
	private WebElement special;

	@FindBy(xpath="(//td[@data-csi-heading='Node Name::0'])[2]")
	private WebElement capabilitybtn;

	@FindBy(xpath="(//span[text()='chat_bubble_outline'])[4]")
	private WebElement comments;

	@FindBy(xpath="//div[@class='fr-element fr-view']")
	private WebElement edit_value;

	@FindBy(xpath="(//span[text()='Actions'])[1]")
	private WebElement Actions;

	@FindBy(xpath="(//tr[@data-csi-automation='plugin-SubRouting-Breadcrumb-Approve']//td[text()='Approve'])")
	private WebElement Approve;



	@FindBy(xpath="(//a[contains(text(),'Subrouting001')]/parent::td//following-sibling::td//div//span[text()='content_copy'])[2]")
	private WebElement copycontent1;

	@FindBy(xpath="(//td[@data-csi-heading='Node Name:Child:CurrentRevision:0']//preceding-sibling::td)[8]")
	private WebElement Activechkbox;

	@FindBy(xpath="(//td[@data-csi-heading='RoutingGroup:Child:LatestRevision:0'])[4]")
	private WebElement latestopgroup;

	@FindBy(xpath="//a[text()='subrouting001copy']")
	private WebElement subrouting001copy ;

	@FindBy(xpath="(//span[contains(text(),'Routing Templates')])[1]")
	private WebElement routing_templatetab ;

	@FindBy(xpath="(//td[@data-csi-heading='Node Name::0'])[1]")
	private WebElement routingname ;

	@FindBy(xpath="//span[text()='Properties' or @data-csi-tab-name='Properties']")
	private WebElement propertiestab ;

	@FindBy(xpath="(//a[text()='Routing Template'])")
	private WebElement routingtemplate ;

	@FindBy(xpath="//span[text()='Routing Items' or @data-csi-tab-name='Routing Items']")
	private WebElement routingitems ;

	@FindBy(xpath="(//table[contains(@data-csi-automation,'placeholder-RoutingRevision')]/tbody/tr/td[2])[2]")
	private WebElement addcapabilitybtn ;

	@FindBy(xpath="//td[text()='Add Sub Routing']")
	private WebElement addsubrouting ;

	@FindBy(xpath="(//th[@class='csi-table-selection-column noexport firstColumn'])[1]")
	private WebElement subroutingchkbox ;

	@FindBy(xpath="//td[text()='Add Copied Sub Routing']")
	private WebElement addcopiedsubrouting ;

	@FindBy(xpath="(//td[contains(text(),'Sub')]//preceding-sibling::td)/div//input")
	private WebElement subroutingchkbox1 ;

	@FindBy(xpath="(//td[@data-csi-heading=\"__TextSpan__:\"])[5]")
	private WebElement Div001new ;

	@FindBy(xpath="(//td[@data-csi-act='PcsPerHr::0'])[1]")
	private WebElement piecesperhour1 ;

	@FindBy(xpath="(//td[@data-csi-act='PcsPerHr::0'])[2]")
	private WebElement piecesperhour2 ;

	@FindBy(xpath="(//td[@data-csi-act='PcsPerHr::0'])[3]")
	private WebElement piecesperhour3 ;

	@FindBy(xpath="(//td[@data-csi-act='PcsPerHr::0'])[4]")
	private WebElement piecesperhour4 ;

	@FindBy(xpath="//span[text()='Routing' or @data-csi-tab-name='Routing']")
	private WebElement routingtab;

	@FindBy(xpath="//div[text()='New Routing']")
	private WebElement newrouting;

	@FindBy(xpath="//td[@data-csi-heading='Node Name::0']")
	private WebElement J_routing;

	@FindBy(xpath="(//table[contains(@data-csi-automation,'plugin-Food-Routing')]/tbody/tr/td[2])[1]")
	private WebElement newroutingbtn;

	@FindBy(xpath="//td[text()='New from Routing']")
	private WebElement newfrmrouting;

	@FindBy(xpath="(//th[@class='csi-table-selection-column noexport firstColumn'])[1]")
	private WebElement routingchkbox;

	@FindBy(xpath="//td[contains(text(),'New from Template')]")
	private WebElement newfrmtemplate;

	@FindBy(xpath="(//td[contains(text(),'Routing')]//preceding-sibling::td)//input")
	private WebElement routingtemplatechkbox;

	@FindBy(xpath="(//a[contains(text(),'J-Routing')])[1]")
	private WebElement Jrouting;





	public WebElement getJrouting() {
		return Jrouting;
	}

	public WebElement getDiv001new() {
		return Div001new;
	}

	public WebElement getRoutingtab() {
		return routingtab;
	}

	public WebElement getNewrouting() {
		return newrouting;
	}

	public WebElement getNewroutingbtn() {
		return newroutingbtn;
	}

	public WebElement getNewfrmrouting() {
		return newfrmrouting;
	}

	public WebElement getRoutingchkbox() {
		return routingchkbox;
	}

	public WebElement getNewfrmtemplate() {
		return newfrmtemplate;
	}

	public WebElement getRoutingtemplatechkbox() {
		return routingtemplatechkbox;
	}

	public WebElement getRouting_templatetab() {
		return routing_templatetab;
	}

	public WebElement getRoutingtemplate() {
		return routingtemplate;
	}

	public WebElement getRoutingitems() {
		return routingitems;
	}

	public WebElement getAddcapabilitybtn() {
		return addcapabilitybtn;
	}

	public WebElement getAddsubrouting() {
		return addsubrouting;
	}

	public WebElement getSubroutingchkbox() {
		return subroutingchkbox;
	}

	public WebElement getAddcopiedsubrouting() {
		return addcopiedsubrouting;
	}

	public WebElement getSubroutingchkbox1() {
		return subroutingchkbox1;
	}

	public WebElement getPiecesperhour1() {
		return piecesperhour1;
	}

	public WebElement getPiecesperhour2() {
		return piecesperhour2;
	}

	public WebElement getPiecesperhour3() {
		return piecesperhour3;
	}

	public WebElement getPiecesperhour4() {
		return piecesperhour4;
	}

	public WebElement getSubrouting001copy() {
		return subrouting001copy;
	}

	public WebElement getLatestopgroup() {
		return latestopgroup;
	}

	public WebElement getActivechkbox() {
		return Activechkbox;
	}

	public WebElement getCopycontent1() {
		return copycontent1;
	}

	public WebElement getEdit_value() {
		return edit_value;
	}



	public WebElement getDiv001() {
		return Div001;

	}

	public WebElement getSubroutingvalue() {
		return subroutingvalue;
	}

	public WebElement getNewsplbtn() {
		return newsplbtn;
	}

	public WebElement getSpecial() {
		return special;
	}


	public WebElement getSubrouting001() {
		return subrouting001;
	}

	public WebElement getCapchkbox() {
		return capchkbox;
	}

	public WebElement getNewcapbtn() {
		return newcapbtn;
	}

	public WebElement getNewdivider() {
		return newdivider;
	}

	public WebElement getNewsubrouting() {
		return newsubrouting;
	}

	public WebElement getComments() {
		return comments;
	}


	public WebElement getActions() {
		return Actions;
	}

	public WebElement getApprove() {
		return Approve;
	}

	public WebElement getNewspl() {
		return newspl;
	}

	@FindBy(xpath="//td[text()='New Special']")
	private WebElement newspl;



	public WebElement getLatedstoperationgroup1() {
		return latedstoperationgroup1;
	}

	public WebElement getOperationgroup1() {
		return operationgroup1;
	}


	public WebElement getCapabilitybtn() {
		return capabilitybtn;
	}

	public WebElement getOperationgroup() {
		return operationgroup;
	}

	public WebElement getSourcingsetup() {
		return sourcingsetup;
	}

	public WebElement getTdstab() {
		return Tdstab;
	}

	public WebElement getSelecttemplate() {
		return selecttemplate;
	}

	public WebElement getSelectimg() {
		return selectimg;
	}

	public WebElement getJArtwork() {
		return JArtwork;
	}

	public WebElement getArtworkactivechkbox() {
		return artworkactivechkbox;
	}

	public WebElement getJArtwork1() {
		return JArtwork1;
	}

	public WebElement getCrtnewcanvas() {
		return crtnewcanvas;
	}

	public WebElement getRecttemplate() {
		return recttemplate;
	}

	public WebElement getSavefinishbtn() {
		return savefinishbtn;
	}

	public WebElement getTemplatetype() {
		return Templatetype;
	}

	public WebElement getCanvastemplatetab() {
		return canvastemplatetab;
	}

	public WebElement getCanvastab() {
		return Canvastab;
	}

	public WebElement getNewcanvastemplate() {
		return Newcanvastemplate;
	}

	public WebElement getCanvastemplate() {
		return canvastemplate;
	}


	public WebElement getDeletebtn() {
		return Deletebtn;
	}

	public WebElement getCopycontent() {
		return copycontent;
	}

	public WebElement getClosebutton() {
		return closebutton;
	}

	public WebElement getTopbtn() {
		return topbtn;
	}

	public WebElement getJNoodles() {
		return JNoodles;
	}

	public WebElement getNewartworkbtn() {
		return newartworkbtn;
	}
	public WebElement getPropertiestab() {
		return propertiestab;
	}

	public WebElement getRoutingname() {
		return routingname;
	}
	public WebElement getJ_routing() {
		return J_routing;
	}

	public WebElement getJNoodlesEdited() {
		return JNoodlesEdited;
	}


	public WebElement getApprovebtn() {
		return Approvebtn;
	}

	@FindBy(xpath="//span[text()='more_horiz']")
	private WebElement selection;

	public WebElement getSelection() {
		return selection;
	}

	@FindBy(xpath="(//span[text()='Food Label Data Sheet Templates'])[1]")
	private WebElement FoodLabelDataSheetTemplate;

	@FindBy(xpath="//table[@data-csi-automation='plugin-Data-FoodLabelDataSheetTemplates-ToolbarNewActions']//div/div[2]")
	private WebElement NewFLDataSheetTempBtn;

	@FindBy(xpath="//div[@data-csi-automation='field-FoodLabelDataSheet-Form-Node Name']//div/div/input")
	private WebElement FLDataSheetTempName;

	@FindBy(xpath="(//div[contains(@data-csi-automation,'field-FoodLabelDataSheet-Form-Subtype')]/div[3]//input)[1]")
	private WebElement FLDataSheetTempSubType;

	@FindBy(xpath="//span[@data-csi-tab-name='TDS']")
	private WebElement FLDataSheetTDSTab;

	@FindBy(xpath="//span[@data-csi-tab-name='Canvas']")
	private WebElement FLDataSheetCanvasTab;

	@FindBy(xpath="(//span[@data-csi-tab-name='Ingredient Items'])[2]")
	private WebElement FLDataSheetIngredientItemsTab;

	@FindBy(xpath="//span[@data-csi-tab-name='Allergen Items']")
	private WebElement FLDataSheetAllergenItemsTab;

	@FindBy(xpath="//span[@data-csi-tab-name='Nutrient Items']")
	private WebElement FLDataSheetNutrientItemsTab;

	@FindBy(xpath="//span[@data-csi-tab-name='Claim Items']")
	private WebElement FLDataSheetClaimItemsTab;

	@FindBy(xpath="//div[text()='New Ingredient Item']")
	private WebElement NewIngredientItemBtn;

	@FindBy(xpath="//div[text()='New Nutrient Item']")
	private WebElement NewNutrientItemBtn;

	@FindBy(xpath="//div[@data-csi-automation='field-NutrientItem-Form-Node Name']//div/div/input")
	private WebElement NutrientItemName;

	@FindBy(xpath="(//div[contains(@data-csi-automation,'field-NutrientItem-Form-LibraryItem')]/div[3]//input)[1]")
	private WebElement FoodNutrientName;

	@FindBy(xpath="//div[@data-csi-act='MainIngredient::0']")
	private WebElement MainIngredientChkBox;

	@FindBy(xpath="(//td[@data-csi-act='UOM::0'])[1]")
	private WebElement UOM;

	@FindBy(xpath="(//td[@data-csi-act='PercentDailyValue::0'])[1]")
	private WebElement DV;

	@FindBy(xpath="(//td[@data-csi-act='Amount::0'])[1]")
	private WebElement AV;


	public WebElement getFoodLabelDataSheetTemplate() {
		return FoodLabelDataSheetTemplate;
	}

	public WebElement getNewFLDataSheetTempBtn() {
		return NewFLDataSheetTempBtn;
	}

	public WebElement getFLDataSheetTempName() {
		return FLDataSheetTempName;
	}

	public WebElement getFLDataSheetTempSubType() {
		return FLDataSheetTempSubType;
	}

	public WebElement getFLDataSheetTDSTab() {
		return FLDataSheetTDSTab;
	}

	public WebElement getFLDataSheetCanvasTab() {
		return FLDataSheetCanvasTab;
	}

	public WebElement getFLDataSheetIngredientItemsTab() {
		return FLDataSheetIngredientItemsTab;
	}

	public WebElement getFLDataSheetAllergenItemsTab() {
		return FLDataSheetAllergenItemsTab;
	}

	public WebElement getFLDataSheetNutrientItemsTab() {
		return FLDataSheetNutrientItemsTab;
	}
	public WebElement getFLDataSheetClaimItemsTab() {
		return FLDataSheetClaimItemsTab;
	}

	public WebElement getNewIngredientItemBtn() {
		return NewIngredientItemBtn;
	}

	public WebElement getNewNutrientItemBtn() {
		return NewNutrientItemBtn;
	}

	public WebElement getNutrientItemName() {
		return NutrientItemName;
	}

	public WebElement getFoodNutrientName() {
		return FoodNutrientName;
	}

	public WebElement getMainIngredientChkBox() {
		return MainIngredientChkBox;
	}

	public WebElement getUOMDDL() {
		return UOM;
	}

	public WebElement getDV() {
		return DV;
	}

	public WebElement getAV() {
		return AV;
	}

	@FindBy(xpath="//a[text()='New Document']//following::span[text()='more_horiz'][1]")
	private WebElement docselection;

	@FindBy(xpath="(//table[contains(@data-csi-automation,'actions-DocumentContainer-Documents')]//td[text()='Approve'])[1]")
	private WebElement Approvedoc;

	@FindBy(xpath="(//table[contains(@data-csi-automation,'actions-DocumentContainer-Documents')]//td[text()='Share Document'])[1]")
	private WebElement sharedoc;
	@FindBy(xpath="//td[text()='pedigree']//parent::tr//div/input")
	private WebElement pedigreechkbox;


	public WebElement getPedigreechkbox() {
		return pedigreechkbox;
	}

	@FindBy(xpath="//td[text()='Noodles']//parent::tr//div/input")
	private WebElement Noodleschkbox;

	@FindBy(xpath="(//td[text()='veg pizza']//parent::tr//div/input)[1]")
	private WebElement vegpizzachkbox;

	@FindBy(xpath="//div[text()='Add Referenced Documents']")
	private WebElement addreferencedocbtn;

	@FindBy(xpath="(//span[contains(@class,'Button') or text()='●']//following-sibling::span[text()='Next'])[1]")
	private WebElement nextbtn;

	@FindBy(xpath="(//span[contains(@class,'Button') or text()='●']//following-sibling::span[text()='Finish'])[1]")
	private WebElement Finishbtn;

	public WebElement getVegpizzachkbox() {
		return vegpizzachkbox;
	}

	public WebElement getNextbtn() {
		return nextbtn;
	}

	public WebElement getFinishbtn() {
		return Finishbtn;
	}

	public WebElement getDocSelection() {
		return docselection;
	}
	public WebElement getAddreferencedocbtn() {
		return addreferencedocbtn;
	}
	public WebElement getApprovedoc() {
		return Approvedoc;
	}
	public WebElement getSharedoc() {
		return sharedoc;
	}
	public WebElement getNoodleschkbox() {
		return Noodleschkbox;
	}
	
	@FindBy(xpath="//div[contains(@data-csi-automation,'field-CompanyInfo-GTINComponentsInput-ProductCode')]//div[2]/input[1]")	
	private WebElement ProductCode;	
	
	@FindBy(xpath="//div[contains(@data-csi-automation,'field-CompanyInfo-GTINComponentsInput-ManufacturerCode')]/div[3]//input[1]")	
	private WebElement ManufaturerCode;	
	
	public WebElement getProductCode() {	
	return ProductCode;	
	}	
	
	public WebElement getManufaturerCode() {	
	return ManufaturerCode;	
	}

	@FindBy(xpath="(//tr[@data-csi-automation='plugin-Routing-Breadcrumb-Revise']//td[text()='Revise'])[1]")	
	private WebElement Revise;	
	
	@FindBy(xpath="(//tr[@data-csi-automation='plugin-Routing-Breadcrumb-Abandon']//td[text()='Abandon'])[1]")	
	private WebElement Abandon;


	public WebElement getRevise() {
		return Revise;
	}

	public WebElement getAbandon() {
		return Abandon;
	}	
	@FindBy(xpath="//span[text()='Style' or @data-csi-tab-name='Style']")
private WebElement styletab;

@FindBy(xpath="//span[text()='Styles' or @data-csi-tab-name='Styles']")
private WebElement stylestab;

@FindBy(xpath="(//td[contains(@data-csi-heading,'Node Name::0')]/a[text()='Apparel - Color and Size'])")
private WebElement Apparel_colorandsize;

@FindBy(xpath="//span[text()='BOM' or @data-csi-tab-name='BOM']")
private WebElement BOMtab ;

@FindBy(xpath="(//div[contains(text(),'New Style BOM')])[1]")
private WebElement newstyleBOM ;

@FindBy(xpath="(//div[contains(@data-csi-automation,'ApparelBOM')]/div[3]//input)[1]")
private WebElement BOMsubtype ;

@FindBy(xpath="(//div[contains(@data-csi-automation,'ApparelBOM-Form-Node Name')]/div[2]/div/input)")
private WebElement styleBOMbtn ;

@FindBy(xpath="(//a[text()='Food BOM'])[1]")
private WebElement Food_BOMbtn ;

@FindBy(xpath="//span[text()='Food Placements' or @data-csi-tab-name='Food Placements']")
private WebElement Food_placementbtn ;

@FindBy(xpath="(//table[contains(@data-csi-automation,'FoodFPItems')]/tbody/tr/td[2])[1]")
private WebElement NewofFood_expbtn ;

@FindBy(xpath="//td[text()='New from Food']")
private WebElement New_frm_foodbtn  ;

@FindBy(xpath="(//td[contains(@class,'csi-table-selection-column noexport firstColumn')]/div/input)[1]")
private WebElement chkbox1  ;

@FindBy(xpath="(//td[contains(@class,'csi-table-selection-column noexport firstColumn')]/div/input)[2]")
private WebElement chkbox2  ;

@FindBy(xpath="(//a[contains(text(),'Apple')]/ancestor::tbody//following-sibling::td/div/span[text()='content_copy'])[1]")
private WebElement Apple_copy  ;

@FindBy(xpath="(//a[text()='Apple']//following::span[text()='close'])[2]")
private WebElement Apple_close  ;

@FindBy(xpath="(//a[contains(text(),'Apple')]/ancestor::tbody//following-sibling::td[contains(@data-csi-act,'Quantity::0')])[1]")
private WebElement Qty_1;

@FindBy(xpath="(//a[contains(text(),'Apple')]/ancestor::tbody//following-sibling::td[contains(@data-csi-act,'Quantity::0')])[2]")
private WebElement Qty_2;

@FindBy(xpath="(//table[contains(@data-csi-automation,'Food')]//div/div)[2]")
private WebElement Newoffood  ;

@FindBy(xpath="(//a[contains(text(),'Apple')]/ancestor::table//following-sibling::td[contains(@data-csi-heading,'Quantity::0')])[3]")
private WebElement Qty_3;

@FindBy(xpath="//td[text()='veg pizza']/parent::tr/td[contains(@class,'csi-table-selection-column noexport firstColumn')]/div/input")
private WebElement Bomvegpizzachkbox;

public WebElement getUOM() {
	return UOM;
}

public WebElement getDocselection() {
	return docselection;
}

public WebElement getBomvegpizzachkbox() {
	return Bomvegpizzachkbox;
}

@FindBy(xpath ="(//span[contains(@data-csi-automation,'ApparelBOMRevision-FoodFPItems')]//span[text()='Views']/following-sibling::span)[1]")
private WebElement viewsbtn;

@FindBy(xpath ="(//div[contains(@data-csi-automation,'ApparelBOMRevision-FoodFPItems')]/div[3]/input)[1]")
private WebElement Defaultbtn;

@FindBy(xpath =" (//tr[contains(@data-csi-automation,'plugin-ApparelBOMRevision-FoodFPItems-CustomViewManage')]//td[text()='Manage Views'])")
private WebElement Manageviews;

@FindBy(xpath ="//span[text()='content_copy']/parent::span/span[1]")
private WebElement foodcontentcopybtn;


@FindBy(xpath ="//option[text()='Only for Product Colors']")
private WebElement onlyforproduct;

@FindBy(xpath ="//span[text()='Add >']")
private WebElement Addbtn1;

@FindBy(xpath ="//option[text()='Only for Product Colors Images']")
private WebElement onlyforproductimage;

@FindBy(xpath ="(//a[contains(text(),'Apple')]/ancestor::tbody//following-sibling::td[contains(@data-csi-act,'OnlyForColors::0')])[3]")
private WebElement onlyforproducttable;

@FindBy(xpath ="//label[contains(text(),'11-0103 EGRET')]//parent::div/div/input")
private WebElement EGRETcheckbox;

@FindBy(xpath ="//label[contains(text(),'11-0105 ANTIQUE WHITE')]//parent::div/div/input")
private WebElement Antiquewhitecheckbox;

@FindBy(xpath ="(//td[text()='New Food']//following-sibling::td)//span[text()='content_copy'][1]")
private WebElement NewFoodContentCopy;

@FindBy(xpath ="(//td[text()='New Food-COPY']//following-sibling::td)//span[text()='close'][1]")
private WebElement NewFoodclose;

@FindBy(xpath ="//td[text()='New from BOM']")
private WebElement NewfrmBOM;

@FindBy(xpath ="(//td[contains(@class,'csi-table-selection-column noexport firstColumn')]/div/input)")
private WebElement FoodBOMchkbox;

@FindBy(xpath ="//th[contains(@class,'csi-table-selection-column noexport firstColumn')]/div/input")
private WebElement productitemchkbox;



public WebElement getFoodcontentcopybtn() {
	return foodcontentcopybtn;
}


public WebElement getAddbtn1() {
	return Addbtn1;
}

public WebElement getOnlyforproductimage() {
	return onlyforproductimage;
}

public WebElement getViewsbtn() {
	return viewsbtn;
}

public WebElement getDefaultbtn() {
	return Defaultbtn;
}

public WebElement getManageviews() {
	return Manageviews;
}

public WebElement getQty_3() {
	return Qty_3;
}

public WebElement getNewoffood() {
	return Newoffood;
}

public WebElement getNew_frm_foodbtn() {
	return New_frm_foodbtn;
}

public WebElement getChkbox1() {
	return chkbox1;
}

public WebElement getChkbox2() {
	return chkbox2;
}

public WebElement getApple_copy() {
	return Apple_copy;
}

public WebElement getApple_close() {
	return Apple_close;
}

public WebElement getQty_1() {
	return Qty_1;
}

public WebElement getQty_2() {
	return Qty_2;
}

public WebElement getStyletab() {
	return styletab;
}

public WebElement getStylestab() {
	return stylestab;
}

public WebElement getApparel_colorandsize() {
	return Apparel_colorandsize;
}



public WebElement getBOMtab() {
	return BOMtab;
}

public WebElement getNewstyleBOM() {
	return newstyleBOM;
}

public WebElement getBOMsubtype() {
	return BOMsubtype;
}

public WebElement getStyleBOMbtn() {
	return styleBOMbtn;
}

public WebElement getFood_BOMbtn() {
	return Food_BOMbtn;
}

public WebElement getFood_placementbtn() {
	return Food_placementbtn;
}

public WebElement getNewofFood_expbtn() {
	return NewofFood_expbtn;
}
public WebElement getEGRETcheckbox() {
	return EGRETcheckbox;
}

public WebElement getAntiquewhitecheckbox() {
	return Antiquewhitecheckbox;
}
public WebElement getfoodcontentcopybtn() {
	return foodcontentcopybtn;
}

public WebElement getOnlyforproduct() {
	return onlyforproduct;
}
public WebElement getOnlyforproducttable() {
	return onlyforproducttable;
}
public WebElement getNewFoodContentCopy() {
	return NewFoodContentCopy;
}

public WebElement getNewFoodclose() {
	return NewFoodclose;
}

public WebElement getNewfrmBOM() {
	return NewfrmBOM;
}

public WebElement getFoodBOMchkbox() {
	return FoodBOMchkbox;
}

public WebElement getProductitemchkbox() {
	return productitemchkbox;
}

//DPT
@FindBy(xpath ="(//table[contains(@data-csi-automation,'BaseProduct')]//td)[2]")
private WebElement dataPack_Exp;

@FindBy(xpath ="//td[text()='New from Data Package Template']")
private WebElement Datapack_Temp;

@FindBy(xpath ="((//td[contains(text(),'WithCoverSheet')]//preceding-sibling::td)/div//input)[1]")
private WebElement DPT_ChkBX;

@FindBy(xpath ="//span[contains(@data-csi-automation,'DataPackages-Export')]//span[text()='Export']/preceding-sibling::span")
private WebElement DPT_Export;

@FindBy(xpath ="//tr[contains(@data-csi-automation,'plugin-BaseProduct-DataPackages-pdf')]/td[text()='PDF']")
private WebElement DPT_PDF;


public WebElement getDataPack_Exp() {
	return dataPack_Exp;
}

public WebElement getDatapack_Temp() {
	return Datapack_Temp;
}

public WebElement getDPT_ChkBX() {
	return DPT_ChkBX;
}

public WebElement getDPT_Export() {
	return DPT_Export;
}

public WebElement getDPT_PDF() {
	return DPT_PDF;
}


	
}