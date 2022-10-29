package com.centric.stepdefinition;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.centric.objectrepository.BusinessPlanningPage;
import com.centric.objectrepository.ConfigurationPage;
import com.centric.objectrepository.FoodSetupPage;
import com.centric.objectrepository.HomePage;
import com.centric.objectrepository.MaterialSpecificationPage;
import com.centric.objectrepository.MerchandisePage;
import com.centric.objectrepository.PopupPage;
import com.centric.objectrepository.SetupPageTK;
import com.centric.objectrepository.SourcingPage;
import com.centric.objectrepository.StylePage;
import com.centric.objectrepository.UserManagementPage;
import com.centric.objectrepository.WizardPage;
import com.centric.resources.Commonactions;
import com.centric.objectrepository.QualityPage;
import com.centric.objectrepository.InspectionPage;
import com.centric.objectrepository.Locators;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FoodSetupSteps extends Commonactions {
	Commonactions ca = new Commonactions();
	HomePage hp = new HomePage();
	ConfigurationPage cp = new ConfigurationPage();
	FoodSetupPage fp= new FoodSetupPage();
	MaterialSpecificationPage mp = new MaterialSpecificationPage();
	SourcingPage sp = new SourcingPage();
	PopupPage pp=new PopupPage();
	UserManagementPage up = new UserManagementPage();
	BOMCreationSteps bc =new BOMCreationSteps();
	Locators lct = new Locators();



	@And("Navigate to Food Setup")
	public void Navigate_to_Food_Setup()throws Throwable {	
		Commonactions.isElementPresent(hp.getDatasetup());
		ca.click(hp.getDatasetup());

		Commonactions.isElementPresent(hp.getData_Spec());
		ca.click(hp.getData_Spec());
		Commonactions.isElementPresent(hp.getSetupSearch());
		ca.insertText(hp.getSetupSearch(), "Food" +Keys.ENTER);
		ca.eleToBeClickable();
	}

	@Then("Create food config {string}")
	public void Create_food_config(String string)throws Throwable {
		String[] allergenname;
		allergenname=string.split(",");
		ca.eleToBeClickable();

		Commonactions.isElementPresent(fp.getFoodallergens());
		ca.click(fp.getFoodallergens());
		ca.eleToBeClickable();
		try {
		Commonactions.isElementPresent(fp.getFoodalleraction());
		ca.click(fp.getFoodalleraction());
		//verifying the Cancel Button
		Commonactions.isElementPresent(fp.getFoodallerinput());
		ca.click(lct.getFood_cancel());
		ca.eleToBeClickable();
		System.out.println("Cancel Button is working for create Food Allergans");
        
		}catch(Exception e) {
	    driver.navigate().refresh();
	    Commonactions.jsWaitForPageLoad();
	    Commonactions.isElementPresent(fp.getFoodalleraction());
	    ca.click(fp.getFoodalleraction());
        //verifying the Cancel Button
		Commonactions.isElementPresent(fp.getFoodallerinput());
		ca.click(lct.getFood_cancel());
		ca.eleToBeClickable();
		System.out.println("Cancel Button is working for create Food Allergans");
		}
		//Enter the data values
		Commonactions.isElementPresent(fp.getFoodalleraction());
		ca.click(fp.getFoodalleraction());
		Commonactions.isElementPresent(fp.getFoodallerinput());
		ca.click(fp.getFoodallerinput());
		ca.insertText(fp.getFoodallerinput(),allergenname[0]);
		ca.click(lct.getSave_and_New());
		ca.eleToBeClickable();


		Commonactions.isElementPresent(fp.getFoodallerinput());
		ca.click(fp.getFoodallerinput());
		ca.insertText(fp.getFoodallerinput(),allergenname[1]);
		ca.click(lct.getSave_and_New());
		ca.eleToBeClickable();


		Commonactions.isElementPresent(fp.getFoodallerinput());
		ca.click(fp.getFoodallerinput());
		ca.insertText(fp.getFoodallerinput(),allergenname[2]);
		ca.click(lct.getSave_and_New());
		ca.eleToBeClickable();


		Commonactions.isElementPresent(fp.getFoodallerinput());
		ca.click(fp.getFoodallerinput());
		ca.insertText(fp.getFoodallerinput(),allergenname[3]);
		ca.click(lct.getSave_and_New());
		ca.eleToBeClickable();

		Commonactions.isElementPresent(fp.getFoodallerinput());
		ca.click(fp.getFoodallerinput());
		ca.insertText(fp.getFoodallerinput(),allergenname[4]);
		ca.click(lct.getSave_and_New());
		ca.eleToBeClickable();

		Commonactions.isElementPresent(fp.getFoodallerinput());
		ca.click(fp.getFoodallerinput());
		ca.insertText(fp.getFoodallerinput(),allergenname[5]);
		ca.click(lct.getSave_and_New());
		ca.eleToBeClickable();

		Commonactions.isElementPresent(fp.getFoodallerinput());
		ca.click(fp.getFoodallerinput());
		ca.insertText(fp.getFoodallerinput(),allergenname[6]);
		ca.click(lct.getFood_save());
		ca.eleToBeClickable();

		//To verify Edit/Copy/Delete
		ca.eleToBeClickable();
		ca.click(lct.getEggs_copy());
		Commonactions.isElementPresent(fp.getFoodallerinput());
		ca.click(fp.getFoodallerinput());
		ca.insertText(fp.getFoodallerinput(),"Eggs-Copy");
		ca.click(lct.getFood_save());
		ca.eleToBeClickable();
		WebElement a11 = driver.findElement(By.xpath("(//td[text()='Eggs-Copy'])"));
		ca.assertText(a11,"Eggs-Copy");
		System.out.println("Copy Button is working for Food Allergans Node");

		ca.eleToBeClickable();
		ca.click(lct.getEggs_Edit());
		Commonactions.isElementPresent(fp.getFoodallerinput());
		ca.click(fp.getFoodallerinput());
		ca.insertText(fp.getFoodallerinput(),"Eggs-Edit");
		ca.click(lct.getFood_save());
		ca.eleToBeClickable();
		WebElement a12 =driver.findElement(By.xpath("(//td[text()='Eggs-Edit'])"));
		ca.assertText(a12,"Eggs-Edit");
		System.out.println("Edit Button is working for Food Allergans Node");


		ca.eleToBeClickable();
		ca.click(lct.getEggs_Delete());
		Commonactions.isElementPresent(lct.getFood_Delete());
		ca.click(lct.getFood_Delete());
		ca.eleToBeClickable();
		System.out.println("Delete Button is working for Food Allergans Node");		

		//To edit the english, Japenese, French values
		
		ca.click(fp.getEggusinp());
		ca.eleToBeClickable();
		WebElement a3 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(a3, "Eggs");
		ca.eleToBeClickable();
		a3.sendKeys(Keys.TAB);
		ca.eleToBeClickable();

		WebElement a4 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(a4, "Oeuf");
		a4.sendKeys(Keys.TAB);
		ca.eleToBeClickable();

		WebElement a5 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(a5, "卵");
		a5.sendKeys(Keys.TAB);
		ca.eleToBeClickable();		

		ca.click(fp.getFishusinp());
		ca.eleToBeClickable();
		WebElement b3 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(b3, "Fish");
		ca.eleToBeClickable();
		b3.sendKeys(Keys.TAB);
		ca.eleToBeClickable();

		WebElement b4 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(b4, "poisson");
		b4.sendKeys(Keys.TAB);
		ca.eleToBeClickable();

		WebElement b5 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(b5, "魚");
		b5.sendKeys(Keys.TAB);
		ca.eleToBeClickable();	

		ca.click(fp.getMilkusinp());
		ca.eleToBeClickable();
		WebElement c3 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(c3, "Milk");
		ca.eleToBeClickable();
		c3.sendKeys(Keys.TAB);
		ca.eleToBeClickable();

		WebElement c4 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(c4, "lait");
		c4.sendKeys(Keys.TAB);
		ca.eleToBeClickable();

		WebElement c5 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(c5, "ミルク");
		c5.sendKeys(Keys.TAB);
		ca.eleToBeClickable();	

		ca.click(fp.getSoybeanusinp());
		ca.eleToBeClickable();
		WebElement d3 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(d3, "Soybeans");
		ca.eleToBeClickable();
		d3.sendKeys(Keys.TAB);
		ca.eleToBeClickable();

		WebElement d4 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(d4, "Le soja");
		d4.sendKeys(Keys.TAB);
		ca.eleToBeClickable();

		WebElement d5 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(d5, "大豆 だいず");
		d5.sendKeys(Keys.TAB);
		ca.eleToBeClickable();

		ca.click(fp.getTreeNutsusinp());
		ca.eleToBeClickable();
		WebElement e3 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(e3, "Tree Nuts");
		ca.eleToBeClickable();
		e3.sendKeys(Keys.TAB);
		ca.eleToBeClickable();

		WebElement e4 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(e4, "noix");
		e4.sendKeys(Keys.TAB);
		ca.eleToBeClickable();

		WebElement e5 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(e5, "木の実");
		e5.sendKeys(Keys.TAB);
		ca.eleToBeClickable();

		ca.click(fp.getPeaNutsusinp());
		ca.eleToBeClickable();
		WebElement f3 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(f3, "Pea Nuts");
		ca.eleToBeClickable();
		f3.sendKeys(Keys.TAB);
		ca.eleToBeClickable();

		WebElement f4 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(f4, "cacahuètes");
		f4.sendKeys(Keys.TAB);
		ca.eleToBeClickable();

		WebElement f5 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(f5, "ピーナッツ");
		f5.sendKeys(Keys.TAB);
		ca.eleToBeClickable();

		ca.click(fp.getShellFishusinp());
		ca.eleToBeClickable();
		WebElement g3 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(g3, "Shell Fish");
		ca.eleToBeClickable();
		g3.sendKeys(Keys.TAB);
		ca.eleToBeClickable();

		WebElement g4 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(g4, "Fruits de mer");
		g4.sendKeys(Keys.TAB);
		ca.eleToBeClickable();

		WebElement g5 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(g5, "貝");
		g5.sendKeys(Keys.TAB);
		ca.eleToBeClickable();

	}

	@Then("Create claims {string}")
	public void Create_claims(String string)throws Throwable {
		String[] claimnames;
		claimnames=string.split(",");


		Commonactions.isElementPresent(fp.getFoodclaims());
		ca.click(fp.getFoodclaims());
		ca.eleToBeClickable();

		Commonactions.isElementPresent(fp.getFoodclaimaction());
		ca.click(fp.getFoodclaimaction());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(fp.getFoodclaiminput());
		//verifying the Cancel Button
		//Commonactions.isElementPresent(fp.getFoodallerinput());
		ca.click(lct.getFood_cancel());
		ca.eleToBeClickable();
		System.out.println("Cancel Button is working for Food Claims");

		//entering the data
		Commonactions.isElementPresent(fp.getFoodclaimaction());
		ca.click(fp.getFoodclaimaction());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(fp.getFoodclaiminput());
		ca.click(fp.getFoodclaiminput());
		ca.insertText(fp.getFoodclaiminput(),claimnames[0]);
		ca.click(lct.getSave_and_New());
		ca.eleToBeClickable();

		Commonactions.isElementPresent(fp.getFoodclaiminput());
		ca.click(fp.getFoodclaiminput());
		ca.insertText(fp.getFoodclaiminput(),claimnames[1]);
		ca.click(lct.getSave_and_New());
		ca.eleToBeClickable();

		Commonactions.isElementPresent(fp.getFoodclaiminput());
		ca.click(fp.getFoodclaiminput());
		ca.insertText(fp.getFoodclaiminput(),claimnames[2]);
		ca.click(lct.getFood_save());
		ca.eleToBeClickable();

		//To verify Edit/Copy/Delete
		ca.eleToBeClickable();
		ca.click(lct.getHealth_copy());
		Commonactions.isElementPresent(fp.getFoodclaiminput());
		ca.click(fp.getFoodclaiminput());
		ca.insertText(fp.getFoodclaiminput(),"health claims-Copy");
		ca.click(lct.getFood_save());
		ca.eleToBeClickable();
		WebElement a11 = driver.findElement(By.xpath("(//td[text()='health claims-Copy'])"));
		ca.assertText(a11,"health claims-Copy");
		System.out.println("Copy Button is working for Food Claims Node");

		ca.eleToBeClickable();
		ca.click(lct.getHealth_edit());
		Commonactions.isElementPresent(fp.getFoodclaiminput());
		ca.click(fp.getFoodclaiminput());
		ca.insertText(fp.getFoodclaiminput(),"health claims-Edit");
		ca.click(lct.getFood_save());
		ca.eleToBeClickable();
		WebElement a12 =driver.findElement(By.xpath("(//td[text()='health claims-Edit'])"));
		ca.assertText(a12,"health claims-Edit");
		System.out.println("Edit Button is working for Food Claims Node");


		ca.eleToBeClickable();
		ca.click(lct.getHealth_delete());
		Commonactions.isElementPresent(lct.getFood_Delete());
		ca.click(lct.getFood_Delete());
		ca.eleToBeClickable();
		System.out.println("Delete Button is working for Food Claims Node");

		//editing the english french and japenese values

		ca.click(fp.getStructureinp());
		ca.eleToBeClickable();
		WebElement a3 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(a3, "Structure/Function");
		ca.eleToBeClickable();
		a3.sendKeys(Keys.TAB);
		ca.eleToBeClickable();

		WebElement a4 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(a4, "éléments nutritifs de la structure");
		a4.sendKeys(Keys.TAB);
		ca.eleToBeClickable();

		WebElement a5 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(a5, "構造");
		a5.sendKeys(Keys.TAB);
		ca.eleToBeClickable();		

		ca.click(fp.getNutrientContentinp());
		ca.eleToBeClickable();
		WebElement b3 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(b3, "NutrientContent");
		ca.eleToBeClickable();
		b3.sendKeys(Keys.TAB);
		ca.eleToBeClickable();

		WebElement b4 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(b4, "teneur en éléments nutritifs");
		b4.sendKeys(Keys.TAB);
		ca.eleToBeClickable();

		WebElement b5 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(b5, "栄養素含有量");
		b5.sendKeys(Keys.TAB);
		ca.eleToBeClickable();	

		ca.click(fp.getHealthinp());
		ca.eleToBeClickable();
		WebElement c3 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(c3, "Health Claim");
		ca.eleToBeClickable();
		c3.sendKeys(Keys.TAB);
		ca.eleToBeClickable();

		WebElement c4 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(c4, "teneur en éléments nutritifs");
		c4.sendKeys(Keys.TAB);
		ca.eleToBeClickable();

		WebElement c5 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(c5, "健康強調表示");
		c5.sendKeys(Keys.TAB);
		ca.eleToBeClickable();

	}
	@Then("create food ingredients {string}")
	public void create_food_ingredients(String string)throws Throwable {

		String[] ingrenames;
		ingrenames=string.split(",");

		Commonactions.isElementPresent(fp.getFoodingredient());
		ca.click(fp.getFoodingredient());
		ca.eleToBeClickable();

		Commonactions.isElementPresent(fp.getFoodingreaction());
		ca.click(fp.getFoodingreaction());
		//verifying the Cancel Button
		Commonactions.isElementPresent(fp.getFoodingredinput());
		ca.click(lct.getFood_cancel());
		ca.eleToBeClickable();
		System.out.println("Cancel Button is working for Food Ingredients");

		//Entering the Data
		Commonactions.isElementPresent(fp.getFoodingreaction());
		ca.click(fp.getFoodingreaction());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(fp.getFoodingredinput());
		ca.click(fp.getFoodingredinput());
		ca.insertText(fp.getFoodingredinput(),ingrenames[0]);
		ca.click(lct.getSave_and_New());
		ca.eleToBeClickable();

		Commonactions.isElementPresent(fp.getFoodingredinput());
		ca.click(fp.getFoodingredinput());
		ca.insertText(fp.getFoodingredinput(),ingrenames[1]);
		ca.click(lct.getSave_and_New());
		ca.eleToBeClickable();

		Commonactions.isElementPresent(fp.getFoodingredinput());
		ca.click(fp.getFoodingredinput());
		ca.insertText(fp.getFoodingredinput(),ingrenames[2]);
		ca.click(lct.getSave_and_New());
		ca.eleToBeClickable();

		Commonactions.isElementPresent(fp.getFoodingredinput());
		ca.click(fp.getFoodingredinput());
		ca.insertText(fp.getFoodingredinput(),ingrenames[3]);
		ca.click(lct.getSave_and_New());
		ca.eleToBeClickable();

		Commonactions.isElementPresent(fp.getFoodingredinput());
		ca.click(fp.getFoodingredinput());
		ca.insertText(fp.getFoodingredinput(),ingrenames[4]);
		ca.click(lct.getSave_and_New());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(fp.getFoodingredinput());
		ca.click(fp.getFoodingredinput());
		ca.insertText(fp.getFoodingredinput(),ingrenames[5]);
		ca.click(lct.getSave_and_New());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(fp.getFoodingredinput());
		ca.click(fp.getFoodingredinput());
		ca.insertText(fp.getFoodingredinput(),ingrenames[6]);
		ca.click(lct.getSave_and_New());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(fp.getFoodingredinput());
		ca.click(fp.getFoodingredinput());
		ca.insertText(fp.getFoodingredinput(),ingrenames[7]);
		ca.click(lct.getSave_and_New());
		ca.eleToBeClickable();

		Commonactions.isElementPresent(fp.getFoodingredinput());
		ca.click(fp.getFoodingredinput());
		ca.insertText(fp.getFoodingredinput(),ingrenames[8]);
		ca.click(lct.getFood_save());
		ca.eleToBeClickable();

		//To verify Edit/Copy/Delete
		ca.eleToBeClickable();
		ca.click(lct.getOils_copy());
		Commonactions.isElementPresent(fp.getFoodingredinput());
		ca.click(fp.getFoodingredinput());
		ca.insertText(fp.getFoodingredinput(),"Oils-Copy");
		ca.click(lct.getFood_save());
		ca.eleToBeClickable();
		WebElement a11 = driver.findElement(By.xpath("(//td[text()='Oils-Copy'])"));
		ca.assertText(a11,"Oils-Copy");
		System.out.println("Copy Button is working for Food Ingredients Node");

		ca.eleToBeClickable();
		ca.click(lct.getOils_Edit());
		Commonactions.isElementPresent(fp.getFoodingredinput());
		ca.click(fp.getFoodingredinput());
		ca.insertText(fp.getFoodingredinput(),"Oils-Edit");
		ca.click(lct.getFood_save());
		ca.eleToBeClickable();
		WebElement a12 =driver.findElement(By.xpath("(//td[text()='Oils-Edit'])"));
		ca.assertText(a12,"Oils-Edit");
		System.out.println("Edit Button is working for Food Ingredients Node");


		ca.eleToBeClickable();
		ca.click(lct.getOils_Delete());
		Commonactions.isElementPresent(lct.getFood_Delete());
		ca.click(lct.getFood_Delete());
		ca.eleToBeClickable();
		System.out.println("Delete Button is working for Food Ingredients Node");
		//Editing the language values

		ca.click(fp.getPepperusinp());
		ca.eleToBeClickable();
		WebElement a3 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(a3,"Pepper" );
		ca.eleToBeClickable();
		a3.sendKeys(Keys.TAB);
		ca.eleToBeClickable();

		WebElement a4 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(a4, "poivre");
		a4.sendKeys(Keys.TAB);
		ca.eleToBeClickable();

		WebElement a5 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(a5, "コショウ");
		a5.sendKeys(Keys.TAB);
		ca.eleToBeClickable();		

		ca.click(fp.getOilusinp());
		ca.eleToBeClickable();
		WebElement b3 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(b3, "Oils");
		ca.eleToBeClickable();
		b3.sendKeys(Keys.TAB);
		ca.eleToBeClickable();

		WebElement b4 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(b4, "huile");
		b4.sendKeys(Keys.TAB);
		ca.eleToBeClickable();

		WebElement b5 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(b5, "油");
		b5.sendKeys(Keys.TAB);
		ca.eleToBeClickable();	

		ca.click(fp.getCaramelizedOnionsinp());
		ca.eleToBeClickable();
		WebElement c3 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(c3, "caramelized onions");
		ca.eleToBeClickable();
		c3.sendKeys(Keys.TAB);
		ca.eleToBeClickable();

		WebElement c4 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(c4, "Oignons caramélisés");
		c4.sendKeys(Keys.TAB);
		ca.eleToBeClickable();

		WebElement c5 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(c5, "キャラメリゼした玉ねぎ");
		c5.sendKeys(Keys.TAB);
		ca.eleToBeClickable();	

		ca.click(fp.getVinegarsinp());
		ca.eleToBeClickable();
		WebElement d3 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(d3, "Vinegars");
		ca.eleToBeClickable();
		d3.sendKeys(Keys.TAB);
		ca.eleToBeClickable();

		WebElement d4 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(d4, "le vinaigre");
		d4.sendKeys(Keys.TAB);
		ca.eleToBeClickable();

		WebElement d5 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(d5, "お酢");
		d5.sendKeys(Keys.TAB);
		ca.eleToBeClickable();

		ca.click(fp.getChilipasteinp());
		ca.eleToBeClickable();
		WebElement d13 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(d13, "Chilli paste");
		ca.eleToBeClickable();
		d13.sendKeys(Keys.TAB);
		ca.eleToBeClickable();

		WebElement d14 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(d14, "pâte de piment");
		d14.sendKeys(Keys.TAB);
		ca.eleToBeClickable();

		WebElement d15 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(d15, "チリペースト");
		d15.sendKeys(Keys.TAB);
		ca.eleToBeClickable();

		ca.click(fp.getSoysaucesinp());
		ca.eleToBeClickable();
		WebElement e3 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(e3, "Soy sauce");
		ca.eleToBeClickable();
		e3.sendKeys(Keys.TAB);
		ca.eleToBeClickable();

		WebElement e4 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(e4, "sauce soya");
		e4.sendKeys(Keys.TAB);
		ca.eleToBeClickable();

		WebElement e5 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(e5, "醤油");
		e5.sendKeys(Keys.TAB);
		ca.eleToBeClickable();

		ca.click(fp.getcheddarcheesesinp());
		ca.eleToBeClickable();
		WebElement f3 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(f3, "cheddar cheese");
		ca.eleToBeClickable();
		f3.sendKeys(Keys.TAB);
		ca.eleToBeClickable();

		WebElement f4 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(f4, "Fromage cheddar");
		f4.sendKeys(Keys.TAB);
		ca.eleToBeClickable();

		WebElement f5 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(f5, "チェダーチーズ");
		f5.sendKeys(Keys.TAB);
		ca.eleToBeClickable();

		ca.click(fp.getgreenpeppersinp());
		ca.eleToBeClickable();
		WebElement g3 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(g3, "green pepper");
		ca.eleToBeClickable();
		g3.sendKeys(Keys.TAB);
		ca.eleToBeClickable();

		WebElement g4 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(g4, "poivre vert");
		g4.sendKeys(Keys.TAB);
		ca.eleToBeClickable();

		WebElement g5 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(g5, "ピーマン");
		g5.sendKeys(Keys.TAB);
		ca.eleToBeClickable();

		ca.click(fp.getGrilledChickensinp());
		ca.eleToBeClickable();
		WebElement h3 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(h3, "grilled chicken");
		ca.eleToBeClickable();
		h3.sendKeys(Keys.TAB);
		ca.eleToBeClickable();

		WebElement h4 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(h4, "Poulet grillé");
		h4.sendKeys(Keys.TAB);
		ca.eleToBeClickable();

		WebElement h5 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(h5, "焼き鳥");
		h5.sendKeys(Keys.TAB);
		ca.eleToBeClickable();


	}



	@Then("Create food nutrients {string}")
	public void create_food_nutrients(String string)throws Throwable {
		String[] nutrinames;
		nutrinames=string.split(",");

		Commonactions.isElementPresent(fp.getFoodnutri());
		ca.click(fp.getFoodnutri());
		ca.eleToBeClickable();

		Commonactions.isElementPresent(fp.getFoodnutriaction());

		ca.click(fp.getFoodnutriaction());
		ca.eleToBeClickable();
		WebElement a1 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(a1, nutrinames[0]);
		ca.eleToBeClickable();
		//a1.sendKeys(Keys.TAB);
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();

		ca.click(fp.getFoodnutriaction());
		ca.eleToBeClickable();
		WebElement a2 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(a2, nutrinames[1]);
		//a1.sendKeys(Keys.TAB);
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();

		ca.click(fp.getFoodnutriaction());
		ca.eleToBeClickable();
		WebElement a3 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(a3, nutrinames[2]);
		//a1.sendKeys(Keys.TAB);
				ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();	

		ca.click(fp.getFoodnutriaction());
		ca.eleToBeClickable();
		WebElement a4 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(a4, nutrinames[3]);
		//a1.sendKeys(Keys.TAB);
				ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();

		ca.click(fp.getFoodnutriaction());
		ca.eleToBeClickable();
		WebElement a5 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(a5, nutrinames[4]);
		//a1.sendKeys(Keys.TAB);
				ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();

		ca.click(fp.getFoodnutriaction());
		ca.eleToBeClickable();
		WebElement a6 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(a6, nutrinames[5]);
		//a1.sendKeys(Keys.TAB);
				ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();

		ca.click(fp.getFoodnutriaction());
		ca.eleToBeClickable();
		WebElement a7 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(a7, nutrinames[6]);
		//a1.sendKeys(Keys.TAB);
				ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();

		//To verify Edit/Copy/Delete
		ca.eleToBeClickable();
		ca.click(lct.getProteins_copy());
		ca.eleToBeClickable();
		WebElement a11 = ca.activeElement();
		ca.eleToBeClickable();
		a11.sendKeys(Keys.DELETE);
		ca.eleToBeClickable();
		a11.sendKeys("Proteins-Copy");
		ca.eleToBeClickable();
		//a1.sendKeys(Keys.TAB);
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		System.out.println("Copy Button is working for Nutrients Node");
		ca.click(lct.getProteins_delete());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(lct.getFood_Delete());
		ca.click(lct.getFood_Delete());
		ca.eleToBeClickable();
		System.out.println("Delete Button is working for Nutrients Node");

		//Editing the language values

		ca.click(fp.getProteinsinp());
		ca.eleToBeClickable();
		WebElement a31 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(a31,"Proteins" );
		ca.eleToBeClickable();
		a31.sendKeys(Keys.TAB);
		ca.eleToBeClickable();

		WebElement a41 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(a41, "protéines");
		a41.sendKeys(Keys.TAB);
		ca.eleToBeClickable();

		WebElement a51 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(a51, "タンパク質");
		a51.sendKeys(Keys.TAB);
		ca.eleToBeClickable();		

		ca.click(fp.getVitaminsinp());
		ca.eleToBeClickable();
		WebElement b3 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(b3, "Vitamins");
		ca.eleToBeClickable();
		b3.sendKeys(Keys.TAB);
		ca.eleToBeClickable();

		WebElement b4 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(b4, "des vitamines");
		b4.sendKeys(Keys.TAB);
		ca.eleToBeClickable();

		WebElement b5 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(b5, "ビタミン");
		b5.sendKeys(Keys.TAB);
		ca.eleToBeClickable();	

		ca.click(fp.getMineralsinp());
		ca.eleToBeClickable();
		WebElement c3 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(c3, "Minerals");
		ca.eleToBeClickable();
		c3.sendKeys(Keys.TAB);
		ca.eleToBeClickable();

		WebElement c4 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(c4, "les minéraux");
		c4.sendKeys(Keys.TAB);
		ca.eleToBeClickable();

		WebElement c5 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(c5, "ミネラル");
		c5.sendKeys(Keys.TAB);
		ca.eleToBeClickable();	

		ca.click(fp.getCaloriesinp());
		ca.eleToBeClickable();
		WebElement d3 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(d3, "Calories");
		ca.eleToBeClickable();
		d3.sendKeys(Keys.TAB);
		ca.eleToBeClickable();

		WebElement d4 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(d4, "calorique");
		d4.sendKeys(Keys.TAB);
		ca.eleToBeClickable();

		WebElement d5 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(d5, "カロリー");
		d5.sendKeys(Keys.TAB);
		ca.eleToBeClickable();

		ca.click(fp.getSodiuminp());
		WebElement d13 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(d13, "Sodium");
		ca.eleToBeClickable();
		d13.sendKeys(Keys.TAB);
		ca.eleToBeClickable();

		WebElement d14 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(d14, "chlorure de sodium");
		d14.sendKeys(Keys.TAB);
		ca.eleToBeClickable();

		WebElement d15 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(d15, "ナトリウム");
		d15.sendKeys(Keys.TAB);
		ca.eleToBeClickable();

		ca.click(fp.getSugarsinp());
		ca.eleToBeClickable();
		WebElement e3 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(e3, "Sugars");
		ca.eleToBeClickable();
		e3.sendKeys(Keys.TAB);
		ca.eleToBeClickable();

		WebElement e4 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(e4, "du sucre");
		e4.sendKeys(Keys.TAB);
		ca.eleToBeClickable();

		WebElement e5 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(e5, "砂糖");
		e5.sendKeys(Keys.TAB);
		ca.eleToBeClickable();

		ca.click(fp.getCarbohydratesinp());
		ca.eleToBeClickable();
		WebElement f3 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(f3, "Carbohydrates");
		ca.eleToBeClickable();
		f3.sendKeys(Keys.TAB);
		ca.eleToBeClickable();

		WebElement f4 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(f4, "les glucides");
		f4.sendKeys(Keys.TAB);
		ca.eleToBeClickable();

		WebElement f5 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(f5, "炭水化物");
		f5.sendKeys(Keys.TAB);
		ca.eleToBeClickable();


	}
	@Then("user create Datasheet Template {string},{string}")
	public void user_create_Datasheet_Template(String string, String string2) throws Throwable {
		String[] allergen = string.split(",");
		String[] nutrient = string2.split(",");

		/*ca.eleToBeClickable();
		Commonactions.isElementPresent(hp.getDatasetup());
		ca.click(hp.getDatasetup());

		Commonactions.isElementPresent(hp.getProductQuality());
		ca.click(hp.getProductQuality());
		Commonactions.isElementPresent(hp.getSetupSearch());
		ca.insertText(hp.getSetupSearch(), "Food" +Keys.ENTER);
		ca.eleToBeClickable();*/

		Commonactions.isElementPresent(fp.getFoodlabeldatasheet());
		ca.click(fp.getFoodlabeldatasheet());
		Commonactions.isElementPresent(fp.getFoodDatasheettab());
		ca.click(fp.getFoodDatasheettab());
		Commonactions.isElementPresent(fp.getFooddatasheetsubtype());
		ca.insertText(fp.getFooddatasheetsubtype(), "Food");
		ca.jsMouseOver();
		Commonactions.isElementPresent(fp.getFooddatasheetname());
		ca.insertText(fp.getFooddatasheetname(), "Food");
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();

		Commonactions.isElementPresent(fp.getFoodname());
		ca.click(fp.getFoodname());
		Commonactions.isElementPresent(fp.getNewingredientitem());
		ca.mouseOver(fp.getNewingredientitem());
		Commonactions.isElementPresent(fp.getNewingredientitem());
		ca.click(fp.getNewingredientitem());
		Commonactions.isElementPresent(fp.getNewfromfoodingredient());
		ca.click(fp.getNewfromfoodingredient());
		Commonactions.isElementPresent(fp.getFoodingredientchkbox());
		ca.click(fp.getFoodingredientchkbox());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();

		Commonactions.isElementPresent(fp.getNewallergenitem());
		ca.mouseOver(fp.getNewallergenitem());
		Commonactions.isElementPresent(fp.getNewallergenitem());
		ca.click(fp.getNewallergenitem());
		Commonactions.isElementPresent(fp.getNewfromfoodallergen());
		ca.click(fp.getNewfromfoodallergen());
		Commonactions.isElementPresent(fp.getFoodallergenchkbox());
		ca.click(fp.getFoodallergenchkbox());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		for(int i=0;i<7;i++)
		{
			Commonactions.isElementPresent(driver.findElement(By.xpath("//td[text()='"+allergen[i]+"']//preceding-sibling::td[@data-csi-heading='Node Name::0']")));			
			ca.click(driver.findElement(By.xpath("//td[text()='"+allergen[i]+"']//preceding-sibling::td[@data-csi-heading='Node Name::0']")));
			ca.eleToBeClickable();
			WebElement a = ca.activeElement();
			ca.eleToBeClickable();
			ca.insertText(a, allergen[i]+" allergen");
			ca.eleToBeClickable();
			a.sendKeys(Keys.TAB);
			ca.eleToBeClickable();
		}

		Commonactions.isElementPresent(fp.getNewnutrientitem());
		ca.mouseOver(fp.getNewnutrientitem());
		Commonactions.isElementPresent(fp.getNewnutrientitem());
		ca.click(fp.getNewnutrientitem());
		Commonactions.isElementPresent(fp.getNewfromfoodnutrient());
		ca.click(fp.getNewfromfoodnutrient());
		Commonactions.isElementPresent(fp.getFoodnutrientckhbox());
		ca.click(fp.getFoodnutrientckhbox());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		
		try {
		for(int i=0;i<7;i++)
		{
			
			Commonactions.isElementPresent(driver.findElement(By.xpath("(//*[text()='"+nutrient[i]+"']//parent::td//parent::tr//td)[1]")));
			ca.click(driver.findElement(By.xpath("(//*[text()='"+nutrient[i]+"']//parent::td//parent::tr//td)[1]")));
			ca.eleToBeClickable();
			WebElement a = ca.activeElement();
			ca.eleToBeClickable();
			ca.insertText(a, nutrient[i]+" nutrients");
			ca.eleToBeClickable();
			a.sendKeys(Keys.TAB);
			ca.eleToBeClickable();
			
		}
		}catch(Exception e) {
			for(int i=0;i<7;i++)
			{
				Commonactions.isElementPresent(driver.findElement(By.xpath("(//div[text()='"+nutrient[i]+"']//parent::td//parent::tr//td)[1]")));
				ca.click(driver.findElement(By.xpath("(//div[text()='"+nutrient[i]+"']//parent::td//parent::tr//td)[1]")));
				ca.eleToBeClickable();
				WebElement a = ca.activeElement();
				ca.eleToBeClickable();
				ca.insertText(a, nutrient[i]+" nutrients");
				ca.eleToBeClickable();
				a.sendKeys(Keys.TAB);
				ca.eleToBeClickable();
				
			}
			
		}
		Commonactions.isElementPresent(fp.getNewclaimitem());
		ca.mouseOver(fp.getNewclaimitem());
		Commonactions.isElementPresent(fp.getNewclaimitem());
		ca.click(fp.getNewclaimitem());
		Commonactions.isElementPresent(fp.getNewfromfoodclaim());
		ca.click(fp.getNewfromfoodclaim());
		Commonactions.isElementPresent(fp.getFoodclaimchkbox());
		ca.click(fp.getFoodclaimchkbox());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
	}


	@And("user create foodtype and competitivefood {string},{string}")
	public void user_create_foodtype_and_competitivefood(String comps, String foods) throws Throwable {

		String[] comp = comps.split(",");
		String[] food = foods.split(",");
		Commonactions.isElementPresent(hp.getUser_homeBtn());
		ca.click(hp.getUser_homeBtn());
//		try{
//			ca.eleToBeClickable();
//			Commonactions.clickjs(driver.findElement(By.xpath("//button[@aria-label='Scroll Right']")));
//		}catch(Exception e){
//		}
		Commonactions.isElementPresent(fp.getFoodTab());
		ca.click(fp.getFoodTab());

		Commonactions.isElementPresent(fp.getCompetitivefoodtab());
		ca.click(fp.getCompetitivefoodtab());
		Commonactions.isElementPresent(fp.getNewcompetitivefoodbtn());
		ca.click(fp.getNewcompetitivefoodbtn());
		Commonactions.isElementPresent(fp.getCompname());
		ca.insertText(fp.getCompname(),comp[0]);
		Commonactions.isElementPresent(fp.getCompprice());
		ca.insertText(fp.getCompprice(),comp[1]);
		Commonactions.isElementPresent(fp.getCompdesc());
		ca.insertText(fp.getCompdesc(),comp[2]);
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();

		Commonactions.isElementPresent(fp.getFoodsTab());
		ca.click(fp.getFoodsTab());
		Commonactions.isElementPresent(fp.getNewFoodBtn());
		ca.click(fp.getNewFoodBtn());
		Commonactions.isElementPresent(fp.getFoodTypeValue());
		ca.insertText(fp.getFoodTypeValue(), food[0]);
		ca.jsMouseOver();
		Commonactions.isElementPresent(fp.getFoodValue());
		ca.insertText(fp.getFoodValue(), food[1]);
		Commonactions.isElementPresent(sp.getSaveandgo());
		ca.click(sp.getSaveandgo());
		ca.eleToBeClickable();
		System.out.println("save and go performed- food value "+food[1]+ "created");
	}

	@Then("User select Salesregion and perform delete action")
	public void user_select_Salesregion_and_perform_delete_action() throws Throwable {

		Commonactions.isElementPresent(fp.getSalesRegionTab());
		ca.click(fp.getSalesRegionTab());
		Commonactions.isElementPresent(fp.getNewSalesRegionBtn());
		ca.click(fp.getNewSalesRegionBtn());
		Commonactions.isElementPresent(fp.getCadSRChkBx());
		ca.click(fp.getCadSRChkBx());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(fp.getDeletecadsr());
		ca.click(fp.getDeletecadsr());
		Commonactions.isElementPresent(pp.getDelete_Btn());
		ca.click(pp.getDelete_Btn());
		Commonactions.isElementPresent(fp.getNewSalesRegionBtn());
		ca.click(fp.getNewSalesRegionBtn());
		Commonactions.isElementPresent(fp.getCadSRChkBx());
		ca.click(fp.getCadSRChkBx());
		Commonactions.isElementPresent(fp.getUsdSRChkBx());
		ca.click(fp.getUsdSRChkBx());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		System.out.println("sales region created - delete action perfomed");
	}

	@And("select Competitive food")
	public void select_Competitive_food() throws Throwable {

		Commonactions.isElementPresent(fp.getCompetitivefoodtab());
		ca.click(fp.getCompetitivefoodtab());
		Commonactions.isElementPresent(fp.getNewcompetitivefoodexpbtn());
		ca.click(fp.getNewcompetitivefoodexpbtn());
		Commonactions.isElementPresent(fp.getSelectcompetitivefood());
		ca.click(fp.getSelectcompetitivefood());
		Commonactions.isElementPresent(fp.getSelectcompetitivechkbx());
		ca.click(fp.getSelectcompetitivechkbx());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		System.out.println("Competitive food added");
	}

	@And("create Food SKU {string}")
	public void create_Food_SKU(String skus) throws Throwable {

		String[] sku = skus.split(",");
		Commonactions.isElementPresent(fp.getSkubtn());
		ca.click(fp.getSkubtn());
		Commonactions.isElementPresent(fp.getNewskusbtn());
		ca.click(fp.getNewskusbtn());
		Commonactions.isElementPresent(fp.getFoodsku());
		ca.insertText(fp.getFoodsku(), sku[0]);
		Commonactions.isElementPresent(fp.getFoodsalesregion());
		ca.insertText(fp.getFoodsalesregion(), sku[1]);
		ca.eleToBeClickable();
		ca.jsMouseOver();
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(fp.getCopyfoodsku());
		ca.click(fp.getCopyfoodsku());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(fp.getClosefoodsku());
		ca.click(fp.getClosefoodsku());
		Commonactions.isElementPresent(pp.getDelete_Btn());
		ca.click(pp.getDelete_Btn());

		System.out.println("Food region crceated");
	}

	@Then("user create and validate datapackge")
	public void user_create_and_validate_datapackge() throws Throwable {

		Commonactions.isElementPresent(hp.getUser_homeBtn());
		ca.click(hp.getUser_homeBtn());
//		try{
//			ca.eleToBeClickable();
//			Commonactions.clickjs(driver.findElement(By.xpath("//button[@aria-label='Scroll Right']")));
//		}catch(Exception e){
//		}
		Commonactions.isElementPresent(fp.getFoodTab());
		ca.click(fp.getFoodTab());
//		Commonactions.isElementPresent(fp.getFoodPrdctTab());
//		ca.click(fp.getFoodPrdctTab());
		Commonactions.isElementPresent(fp.getFoodsTab());
		ca.click(fp.getFoodsTab());
		
		Commonactions.isElementPresent(fp.getClickvegpizzabtn());
		ca.click(fp.getClickvegpizzabtn());
		Commonactions.isElementPresent(fp.getSpecificationtab());
		ca.click(fp.getSpecificationtab());
		Commonactions.isElementPresent(fp.getSummarytab());
		ca.click(fp.getSummarytab());
		try
		{
			Commonactions.isElementPresent(fp.getNewdatapackage());
			ca.click(fp.getNewdatapackage());
			ca.eleToBeClickable();
			WebElement a = ca.activeElement();
			ca.eleToBeClickable();
			ca.insertText(a, "Data Package");
			ca.eleToBeClickable();
			a.sendKeys(Keys.TAB);
			ca.eleToBeClickable();
			Commonactions.isElementPresent(fp.getDatapackagename());
			ca.click(fp.getDatapackagename());
		}
		catch(Exception e)
		{
			System.out.println("Administrator error in Data PAckage");
		}
	}

	@Then("create Lables {string}")
	public void create_Lables(String foods) throws Throwable {

		String[] food = foods.split(",");
		Commonactions.isElementPresent(fp.getLabel());
		ca.click(fp.getLabel());
		Commonactions.isElementPresent(fp.getNewlabeldatshtbtn());
		ca.click(fp.getNewlabeldatshtbtn());
		Commonactions.isElementPresent(fp.getLabelsubtype());
		ca.insertText(fp.getLabelsubtype(), food[0]);
		ca.jsMouseOver();
		Commonactions.isElementPresent(fp.getLabelfooddatasheet());
		ca.insertText(fp.getLabelfooddatasheet(), food[1]);
		Commonactions.isElementPresent(sp.getSaveandgo());
		ca.click(sp.getSaveandgo());
		ca.eleToBeClickable();
		System.out.println(food[1] +" created");
	}

	@Then("under labels select values for Allergen Ingredient Nutrient Claim {string},{string}")
	public void under_labels_select_values_for_Allergen_Ingredient_Nutrient_Claim(String string, String string2) throws Throwable {

		String[] fooddata = string.split(",");
		String[] allergens = string2.split(",");
		Commonactions.isElementPresent(fp.getIngredientitemtab());
		ca.click(fp.getIngredientitemtab());
		try{
			//driver.findElement(By.xpath("//span[contains(@data-csi-automation,'IngredientItemsTab-htmlToolbars')]/span/span/span")).click();
			
			ca.eleToBeClickable();
			lct.getIngredients_itembtn().click();}
		catch(Exception e)
		{driver.navigate().refresh();
		ca.jsWaitForPageLoad();
			ca.eleToBeClickable();//parallel
			Commonactions.isElementPresent(fp.getNewingredientbtn());
		ca.click(fp.getNewingredientbtn());}
		ca.eleToBeClickable();
		WebElement a1 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(a1, fooddata[0]);
		ca.eleToBeClickable();
		a1.sendKeys(Keys.TAB);
		ca.eleToBeClickable();//parallel
		try{lct.getIngredients_items().click();}
		catch(Exception e)
		{Commonactions.isElementPresent(fp.getNewingredientbtnexp());
		ca.click(fp.getNewingredientbtnexp());}
		Commonactions.isElementPresent(fp.getNewfromfoodingredient());
		ca.click(fp.getNewfromfoodingredient());
		Commonactions.isElementPresent(fp.getFoodingredientchkbox());
		ca.click(fp.getFoodingredientchkbox());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();

		Commonactions.isElementPresent(fp.getPromoteicon());
		ca.click(fp.getPromoteicon());
		Commonactions.isElementPresent(fp.getPromotefood());
		ca.click(fp.getPromotefood());
		System.out.println("New Ingredient value added - Prmoted food ingredient");
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(fp.getAllergenitemtab());
		ca.click(fp.getAllergenitemtab());
		try{lct.getAllergrn_itembtn().click();}
		catch(Exception e)
		{Commonactions.isElementPresent(fp.getNewallergenbtn());
		ca.click(fp.getNewallergenbtn());}
		Commonactions.isElementPresent(fp.getAllergenfoodname());
		ca.insertText(fp.getAllergenfoodname(), fooddata[1]);
		Commonactions.isElementPresent(fp.getAllergenitemlist());
		ca.insertText(fp.getAllergenitemlist(), fooddata[2]);
		ca.jsMouseOver();
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();

		try{
			lct.getAllergrn_items2().click();}
		catch(Exception e)
		{lct.getAllergrn_items1().click();}
		ca.eleToBeClickable();
		Commonactions.isElementPresent(fp.getNewfromfoodallergen());
		ca.click(fp.getNewfromfoodallergen());
		Commonactions.isElementPresent(fp.getFoodallergenchkbox());
		ca.click(fp.getFoodallergenchkbox());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		for(int i=0;i<7;i++)
		{
//			System.out.println("allergens" +allergens[i]);
			if(allergens[i].equalsIgnoreCase("Eggs")) {
				Commonactions.isElementPresent(lct.getEggs());			
				ca.click(lct.getEggs());
				ca.eleToBeClickable();
				WebElement a = ca.activeElement();
				ca.eleToBeClickable();
				ca.insertText(a, allergens[i]+" allergen");
				ca.eleToBeClickable();
				a.sendKeys(Keys.TAB);
				ca.eleToBeClickable();
			}
			else {
				Commonactions.isElementPresent(driver.findElement(By.xpath("//td[text()='"+allergens[i]+"']//preceding-sibling::td[@data-csi-act='Node Name::0']")));			
				ca.click(driver.findElement(By.xpath("//td[text()='"+allergens[i]+"']//preceding-sibling::td[@data-csi-act='Node Name::0']")));
				ca.eleToBeClickable();
				WebElement a = ca.activeElement();
				ca.eleToBeClickable();
				ca.insertText(a, allergens[i]+" allergen");
				ca.eleToBeClickable();
				a.sendKeys(Keys.TAB);
				ca.eleToBeClickable();
			}
//			Commonactions.isElementPresent(mp.getSave_btn1());
//			ca.click(mp.getSave_btn1());
//			ca.eleToBeClickable();
		}
		System.out.println("All allergen values saved under labels");
		Commonactions.isElementPresent(fp.getNutrienttab());
		ca.click(fp.getNutrienttab());
		try
		{
			WebElement nutrientnewbtn = driver.findElement(By.xpath("(//table[contains(@data-csi-automation,'plugin-FoodLabelDataSheetRevision-NutrientItems-ToolbarNewActions')]//div[text()='New Nutrient Item'])[2]"));
			nutrientnewbtn.click();
		}
		catch(Exception e)
		{
			WebElement nutrientnewbtn2 = driver.findElement(By.xpath("(//table[contains(@data-csi-automation,'plugin-FoodLabelDataSheetRevision-NutrientItems-ToolbarNewActions')]//div[text()='New Nutrient Item'])[1]"));
			nutrientnewbtn2.click();
		}
		Commonactions.isElementPresent(fp.getNutrientfoodname());
		ca.insertText(fp.getNutrientfoodname(), fooddata[3]);
		Commonactions.isElementPresent(fp.getNutrientfoodselectitem());
		ca.insertText(fp.getNutrientfoodselectitem(), fooddata[4]);
		ca.jsMouseOver();
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		System.out.println("Nutrient value created under labels");

		Commonactions.isElementPresent(fp.getClaimitermtab());
		ca.click(fp.getClaimitermtab());
		try
		{
			WebElement claimnewbtn = driver.findElement(By.xpath("(//table[contains(@data-csi-automation,'plugin-FoodLabelDataSheetRevision-ClaimItems-')]//div[text()='New Claim Item'])[2]"));
			claimnewbtn.click();
		}
		catch(Exception e)
		{
			WebElement claimnewbtn2 = driver.findElement(By.xpath("(//table[contains(@data-csi-automation,'plugin-FoodLabelDataSheetRevision-ClaimItems-')]//div[text()='New Claim Item'])"));
			claimnewbtn2.click();
		}
		ca.eleToBeClickable();
		WebElement a2 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(a2, fooddata[5]);
		ca.eleToBeClickable();
		a2.sendKeys(Keys.TAB);
		ca.eleToBeClickable();
		Commonactions.isElementPresent(fp.getPromoteiconclaim());
		ca.click(fp.getPromoteiconclaim());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(fp.getPromoteclaim());
		ca.click(fp.getPromoteclaim());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		try
		{
			WebElement claimnewbtnexp = driver.findElement(By.xpath("(//table[contains(@data-csi-automation,'plugin-FoodLabelDataSheetRevision-ClaimItems-ToolbarNewActions')]//tr/td[2])[2]"));
			claimnewbtnexp.click();
		}
		catch(Exception e)
		{
			WebElement claimnewbtnexp2 = driver.findElement(By.xpath("(//table[contains(@data-csi-automation,'plugin-FoodLabelDataSheetRevision-ClaimItems-ToolbarNewActions')]//tr/td[2])[1]"));
			claimnewbtnexp2.click();
		}
		Commonactions.isElementPresent(fp.getNewfromfoodclaim());
		ca.click(fp.getNewfromfoodclaim());
		Commonactions.isElementPresent(fp.getFoodclaimchkbox());
		ca.click(fp.getFoodclaimchkbox());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();

		System.out.println("Claim created and promoted food claim");

	}

	@Then("user create Artwork values")
	public void user_create_Artwork_values() throws Throwable {
		Commonactions.isElementPresent(fp.getClickvegpizzabtn());
		ca.click(fp.getClickvegpizzabtn());
		//Commonactions.isElementPresent(fp.getSpecificationtab());
		//ca.click(fp.getSpecificationtab());
		
		
		Commonactions.isElementPresent(fp.getArtworktab());
		ca.click(fp.getArtworktab());
		Commonactions.isElementPresent(fp.getNewartworkbtn());
		ca.click(fp.getNewartworkbtn());
		ca.eleToBeClickable();
		WebElement a3 = ca.activeElement();
		ca.eleToBeClickable();
		a3.sendKeys(Keys.TAB);
		ca.eleToBeClickable();

		Commonactions.isElementPresent(fp.getArtworkbtnexp());
		ca.click(fp.getArtworkbtnexp());
		Commonactions.isElementPresent(fp.getNewfromartworkbtn());
		ca.click(fp.getNewfromartworkbtn());
		Commonactions.isElementPresent(fp.getArtworkchkbox());
		ca.click(fp.getArtworkchkbox());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
       // ca.click(driver.findElement(By.xpath("//span[text()='Cancel']")));
        //System.out.println("type is not defined");
		System.out.println("Artwork created");
	}

	@Then("create value for Review also verify delete function")
	public void create_value_for_Review_also_verify_delete_function() throws Throwable {

		Commonactions.isElementPresent(fp.getReviewtab());
		ca.click(fp.getReviewtab());
		Commonactions.isElementPresent(fp.getNewfoodreviewbtn());
		ca.click(fp.getNewfoodreviewbtn());
		ca.eleToBeClickable();
		WebElement a4 = ca.activeElement();
		ca.eleToBeClickable();
		a4.sendKeys(Keys.TAB);
		ca.eleToBeClickable();
		Commonactions.isElementPresent(fp.getFoodreviewdelete());
		ca.click(fp.getFoodreviewdelete());
		Commonactions.isElementPresent(pp.getDelete_Btn());
		ca.click(pp.getDelete_Btn());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(fp.getNewfoodreviewbtn());
		ca.click(fp.getNewfoodreviewbtn());
		ca.eleToBeClickable();
		WebElement a5 = ca.activeElement();
		ca.eleToBeClickable();
		a5.sendKeys(Keys.TAB);
		ca.eleToBeClickable();
		Commonactions.isElementPresent(fp.getFoodreviewname());
		ca.click(fp.getFoodreviewname());
		System.out.println("food review created- deleted validated");
	}

	@Then("user verify copy edit and delte in spec creation {string},{string}")
	public void user_verify_copy_edit_and_delte_in_spec_creation(String spec, String specedit) throws Throwable {

		Commonactions.isElementPresent(fp.getClickvegpizzabtn());
		ca.click(fp.getClickvegpizzabtn());
		Commonactions.isElementPresent(fp.getSpectab());
		ca.click(fp.getSpectab());
		Commonactions.isElementPresent(fp.getSpecbtn());
		ca.click(fp.getSpecbtn());
		Commonactions.isElementPresent(fp.getSpectype());
		ca.insertText(fp.getSpectype(),spec);
		ca.jsMouseOver();
		Commonactions.isElementPresent(fp.getSpecname());
		ca.insertText(fp.getSpecname(), spec);
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();

		Commonactions.isElementPresent(fp.getSpeccopy());
		ca.click(fp.getSpeccopy());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();

		Commonactions.isElementPresent(fp.getSpecedit());
		ca.click(fp.getSpecedit());
		Commonactions.isElementPresent(fp.getSpecname());
		ca.insertText(fp.getSpecname(), specedit);
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(fp.getSpecclose());
		ca.click(fp.getSpecclose());
		Commonactions.isElementPresent(pp.getDelete_Btn());
		ca.click(pp.getDelete_Btn());
		System.out.println("spec created - edit copy delete performed");

	}
	@And("Navigate to Data packages")
	public void Navigate_to_Data_packages()throws Throwable {	
		Commonactions.isElementPresent(hp.getDatasetup());
		ca.click(hp.getDatasetup());

		Commonactions.isElementPresent(hp.getData_Spec());
		ca.click(hp.getData_Spec());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(hp.getSetupSearch());
		ca.insertText(hp.getSetupSearch(), "Data Package Templates" +Keys.ENTER);
		ca.eleToBeClickable();
		//ca.eleToBeClickable();parallel
		try{
		Commonactions.isElementPresent(fp.getDataPackageTemplate());
		ca.click(fp.getDataPackageTemplate());
		}catch (Exception e) {
			// TODO: handle exception
		}

	}
	@And("Create Data Package Templates {string}")
	public void Create_Data_Package_Templates(String string) throws Throwable {
		String[] DPName = string.split(",");


		for(int i=0;i<DPName.length;i++)
		{
			Commonactions.isElementPresent(fp.getNewDPTempBtn());
			ca.click(fp.getNewDPTempBtn());
			Commonactions.isElementPresent(fp.getNewDPTempName());
			ca.insertText(fp.getNewDPTempName(), DPName[i]);
			Commonactions.isElementPresent(fp.getDPTempType());
			ca.insertText(fp.getDPTempType(), "Food");
			ca.jsMouseOver();
			if (DPName[i].equals("DPTemp-WithOutCoverSheet"))
			{	
				ca.click(lct.getDatapackage_template());
				ca.eleToBeClickable();  
				System.out.println("The Cover Sheet Checkbox for- " + DPName[i] + " -is Unchecked ");
				ca.eleToBeClickable();

			}

			Commonactions.isElementPresent(mp.getSave_btn1());
			ca.click(mp.getSave_btn1());
			ca.eleToBeClickable();
			System.out.println("The Data Package -" + DPName[i] + " -is created ");
			ca.eleToBeClickable();
		}

	}

	@Then("Go to the Data Packages with cover sheet and create the Data Sheets And Verify Edit Delete Copy Functionality {string},{string}")
	public void Go_to_the_Data_Packages_with_cover_sheet_and_create_the_Data_Sheets_And_Verify_Edit_Delete_Copy_Functionality(String string1,String string2) throws Throwable {
		String[] DPName = string1.split(",");
		String[] DataSheetType = string2.split(",");
		final ArrayList<String> list=new ArrayList<String>();
		list.add("Artwork");
		list.add("Routing");
		ca.click(lct.getDatapackage_templates());
		ca.eleToBeClickable();
		ca.click(driver.findElement(By.xpath("//a[contains(text(),'"+DPName[0]+"')]")));
		ca.eleToBeClickable();
		//verify the Cover Sheet View and the Document Filter are editable
		Commonactions.isElementPresent(lct.getDatapackage_template1());
		System.out.println("For the  - " + DPName[0] + " - Document Filter Area is Editable ");
		Commonactions.isElementPresent(lct.getDatapackage_template2());
		System.out.println("For the - " + DPName[0] + " - Cover Sheet View Area is Editable ");


		for(int i=0;i<DataSheetType.length;i++)
		{
			String DataSheetValue = DataSheetType[i];
			ca.eleToBeClickable();
			Commonactions.isElementPresent(fp.getNewDataSheetempBtn());
			ca.click(fp.getNewDataSheetempBtn());
			Commonactions.isElementPresent(fp.getDataSheetType());
			ca.insertText(fp.getDataSheetType(), DataSheetType[i]);
			ca.jsMouseOver();
			ca.eleToBeClickable();
			ca.eleToBeClickable();
			if (DataSheetType[i].equals("Spec Data Sheet"))
			{	
				Commonactions.isElementPresent(fp.getSpecDataSheetSubtype());
				ca.insertText(fp.getSpecDataSheetSubtype(), "Spec Type-01");
				ca.jsMouseOver();
				ca.eleToBeClickable();

			}
			boolean flag = ca.verifyTextInList(list, DataSheetValue);
			if (flag==true) 
			{	
				Commonactions.isElementPresent(fp.getDataSheetPhase());
				ca.insertText(fp.getDataSheetPhase(), "Sample");
				ca.jsMouseOver();
				ca.eleToBeClickable();

			}

			Commonactions.isElementPresent(fp.getDataSheetState());
			ca.insertText(fp.getDataSheetState(), "PENDING");
			ca.jsMouseOver();
			ca.eleToBeClickable();

			ca.click(mp.getSave_btn1());
			ca.eleToBeClickable();
			System.out.println("The -" + DataSheetType[i] + " -is created ");
			ca.eleToBeClickable();
		}

		//Verify Edit/Copy/delete links

		ca.click(driver.findElement(By.xpath("(//td[text()='"+DataSheetType[0]+"']//following::td/div/span[@data-csi-act='Edit'])[1]")));
		ca.eleToBeClickable();
		Commonactions.isElementPresent(fp.getDataSheetPhase());
		ca.insertText(fp.getDataSheetPhase(), "Production");
		ca.jsMouseOver();
		ca.eleToBeClickable();
		ca.save();
		ca.eleToBeClickable();
		Commonactions.isElementPresent(driver.findElement(By.xpath("//td[text()='"+DataSheetType[0]+"']//following::td[text()='Production']")));
		System.out.println("Data Sheet - "+DataSheetType[0]+" is Edited");
        ca.eleToBeClickable();
		ca.click(driver.findElement(By.xpath("(//td[text()='"+DataSheetType[0]+"']//following::td/div/span[@data-csi-act='Copy'])[1]")));
		ca.eleToBeClickable();
		Commonactions.isElementPresent(fp.getDataSheetState());
		ca.click(fp.getDataSheetState());
		ca.eleToBeClickable();
		WebElement AP = ca.activeElement();
		ca.eleToBeClickable();
		AP.sendKeys(Keys.DELETE);
		ca.eleToBeClickable();
		ca.insertText(AP,"APPROVED");
		ca.eleToBeClickable();
		AP.sendKeys(Keys.TAB);
		ca.eleToBeClickable();
		ca.jsMouseOver();
		ca.eleToBeClickable();
		ca.save();
		ca.eleToBeClickable();
		
		
		try {
		Commonactions.isElementPresent(driver.findElement(By.xpath("//td[text()='"+DataSheetType[0]+"']//following::td[text()='APPROVED']")));
		System.out.println("Data Sheet - "+DataSheetType[0]+" is Copied");
		}
		catch(Exception e){
			Commonactions.isElementPresent(driver.findElement(By.xpath("//td[text()='"+DataSheetType[0]+"']//following::div[text()='APPROVED']")));
			System.out.println("Data Sheet - "+DataSheetType[0]+" is Copied1");
				
		}
        try {
        	ca.eleToBeClickable();
     		ca.click(driver.findElement(By.xpath("(//td[text()='"+DataSheetType[0]+"']//following::td[text()='APPROVED']//following::td/div/span[@data-csi-act='Delete'])[1]")));
     		ca.eleToBeClickable();
     		ca.click(lct.getFood_Delete());
     		ca.eleToBeClickable();
     		System.out.println("Data Sheet"+DataSheetType[0]+" - with state APPROVED is Deleted");
            ca.eleToBeClickable();
             
        }catch(Exception e) {
        	ca.eleToBeClickable();
     		ca.click(driver.findElement(By.xpath("(//td[text()='"+DataSheetType[0]+"']//following::div[text()='APPROVED']//following::td/div/span[@data-csi-act='Delete'])[1]")));
     		ca.eleToBeClickable();
     		ca.click(lct.getFood_Delete());
     		ca.eleToBeClickable();
     		System.out.println("Data Sheet"+DataSheetType[0]+" - with state APPROVED is Deleted1");
            ca.eleToBeClickable();
             
        }
		/*ca.click(driver.findElement(By.xpath("(//td[text()='"+DataSheetType[0]+"']//following::td/div/span[@data-csi-act='Edit'])[1]")));
		ca.eleToBeClickable();
		Commonactions.isElementPresent(fp.getDataSheetPhase());
		ca.insertText(fp.getDataSheetPhase(), "Production");
		ca.jsMouseOver();
		ca.eleToBeClickable();
		ca.save();
		ca.eleToBeClickable();
		Commonactions.isElementPresent(driver.findElement(By.xpath("//td[text()='"+DataSheetType[0]+"']//following::td[text()='Production']")));
		System.out.println("Data Sheet - "+DataSheetType[0]+" is Edited");

		ca.click(driver.findElement(By.xpath("(//td[text()='"+DataSheetType[0]+"']//following::td/div/span[@data-csi-act='Copy'])[1]")));
		ca.eleToBeClickable();
		Commonactions.isElementPresent(fp.getDataSheetState());
		ca.insertText(fp.getDataSheetState(), "APPROVED");
		ca.jsMouseOver();
		ca.eleToBeClickable();
		ca.save();
		ca.eleToBeClickable();

		System.out.println("Data Sheet - "+DataSheetType[0]+" is Copied");
		//Deleting the Data Sheet

		ca.click(driver.findElement(By.xpath("(//span[@data-csi-act='Delete'])[2]")));
		ca.eleToBeClickable();
		ca.click(lct.getFood_Delete());
		ca.eleToBeClickable();
		System.out.println("Data Sheet"+DataSheetType[0]+" - with state APPROVED is Deleted");*/
	}

	@Then("Go to the Data Packages without cover sheet and create the Data Sheets {string},{string}")
	public void Go_to_the_Data_Packages_without_cover_sheet_and_create_the_Data_Sheets(String string1,String string2) throws Throwable {
		String[] DPName = string1.split(",");
		String[] DataSheetType = string2.split(",");
		final ArrayList<String> list=new ArrayList<String>();
		list.add("Artwork");
		list.add("Routing");
		ca.click(lct.getDatapackage_templates());
		ca.eleToBeClickable();
		ca.click(driver.findElement(By.xpath("//a[contains(text(),'"+DPName[1]+"')]")));
		ca.eleToBeClickable();
		//verify the Cover Sheet View is not editable and the Document Filter are editable
		Commonactions.isElementPresent(lct.getDatapackage_template1());
		System.out.println("For the  - " + DPName[1] + " - Document Filter Area is Editable ");
		Commonactions.isElementPresent(driver.findElement(By.xpath("//td[@class='attrRef' and @data-csi-heading='CoverSheetView::0']")));
		System.out.println("For the - " + DPName[1] + " - Cover Sheet View Area is Not Editable ");


		for(int i=0;i<DataSheetType.length;i++)
		{
			String DataSheetValue = DataSheetType[i];
			Commonactions.isElementPresent(fp.getNewDataSheetempBtn());
			ca.click(fp.getNewDataSheetempBtn());
			Commonactions.isElementPresent(fp.getDataSheetType());
			ca.insertText(fp.getDataSheetType(), DataSheetType[i]);
			ca.jsMouseOver();
			ca.eleToBeClickable();
			ca.eleToBeClickable();
			if (DataSheetType[i].equals("Spec Data Sheet"))
			{	
				Commonactions.isElementPresent(fp.getSpecDataSheetSubtype());
				ca.insertText(fp.getSpecDataSheetSubtype(), "Spec Type-01");
				ca.jsMouseOver();
				ca.eleToBeClickable();

			}
			boolean flag = ca.verifyTextInList(list, DataSheetValue);
			if (flag==true) 
			{	
				Commonactions.isElementPresent(fp.getDataSheetPhase());
				ca.insertText(fp.getDataSheetPhase(), "Sample");
				ca.jsMouseOver();
				ca.eleToBeClickable();

			}

			Commonactions.isElementPresent(fp.getDataSheetState());
			ca.insertText(fp.getDataSheetState(), "PENDING");
			ca.jsMouseOver();
			ca.eleToBeClickable();

			ca.click(mp.getSave_btn1());
			ca.eleToBeClickable();
			System.out.println("The -" + DataSheetType[i] + " -is created ");
			ca.eleToBeClickable();
		}

	}	

	@Then("Create View Under the Cover Sheet View for Data Package Template With Cover Sheet {string}")
	public void Create_View_Under_the_Cover_Sheet_View_for_Data_Package_Template_Witht_Cover_Sheet (String string1) throws Throwable {
		String[] DPName = string1.split(",");
		ca.click(lct.getDatapackage_templates());
		ca.eleToBeClickable();
		ca.click(driver.findElement(By.xpath("//a[contains(text(),'"+DPName[0]+"')]")));
		ca.eleToBeClickable();
		ca.click(fp.getCoverSheetTab());
		ca.eleToBeClickable();
		ca.click(fp.getShowHideToolbar());
		ca.eleToBeClickable();
		System.out.println("Creating CV's under the Data Package template- " +DPName[0]);
		//Creating View under Cover Sheet
		ca.click(fp.getCoverSheetview());
		ca.eleToBeClickable();
		ca.click(fp.getCoverSheetviewManage());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(up.getUsrMgmt_Copy());
		ca.click(up.getUsrMgmt_Copy());
		ca.eleToBeClickable();
		WebElement cp = ca.activeElement();
		ca.eleToBeClickable();
		cp.sendKeys(Keys.DELETE);
		ca.eleToBeClickable();
		ca.insertText(cp,"CVNoSQ" );
		ca.eleToBeClickable();
		cp.sendKeys(Keys.TAB);
	    
		//Commonactions.isElementPresent(up.getUsrMgmt_Copy_Value());
		//ca.insertText(up.getUsrMgmt_Copy_Value(), "CVNoSQ");
		ca.eleToBeClickable();
		ca.click(lct.getSupplier_Quotes());
		ca.eleToBeClickable();
		ca.save();
		ca.mouseOver(mp.getSave_btn1());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		System.out.println("The Custom View is created under 'Cover Seet' where 'Supplier Quote checkbox' is not selected");
		ca.eleToBeClickable();
		//ca.isElementNotPresent(driver.findElement(By.xpath("//div[@class='csi-view-title csi-view-title-FoodSourcing-SupplierItems']")));
		//System.out.println("The Suppplier Quote Section is not displayed in the 'Cover Sheet' tab");
		//Creating View under Cover Sheet Properties
		ca.eleToBeClickable();		
		ca.click(fp.getCoverSheetPropView());
		ca.eleToBeClickable();
		ca.click(fp.getCoverSheetPropViewManage());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(up.getUsrMgmt_Copy());
		ca.click(up.getUsrMgmt_Copy());
		Commonactions.isElementPresent(up.getUsrMgmt_Copy_Value());
		ca.insertText(up.getUsrMgmt_Copy_Value(), "CVAddDataSheet");
		ca.eleToBeClickable();
		ca.click(lct.getDatasheets());
		ca.eleToBeClickable();
		ca.click(fp.getAdd_Btn());
		//ca.save();
		ca.mouseOver(mp.getSave_btn1());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		System.out.println("The Custom View is created for 'Cover Seet Properties' Section where Data Sheets are added in View");
		ca.eleToBeClickable();
		ca.isElementPresent(driver.findElement(By.xpath("//div[@class='csiHeadingCellLabel' and text()='Data Sheets']")));
		System.out.println("The Data Sheets - Label is displayed for the 'Cover Seet Properties' Section");
		//Creating View under Properties section
		ca.eleToBeClickable();
		ca.click(fp.getFoodPropView());
		ca.eleToBeClickable();
		ca.click(fp.getFoodPropViewManage());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(up.getUsrMgmt_Copy());
		ca.click(up.getUsrMgmt_Copy());
		Commonactions.isElementPresent(up.getUsrMgmt_Copy_Value());
		ca.insertText(up.getUsrMgmt_Copy_Value(), "CVAddCompFood");
		ca.eleToBeClickable();
		ca.click(lct.getCompetitive_food());
		ca.eleToBeClickable();
		ca.click(fp.getAdd_Btn());
		//ca.save();
		ca.mouseOver(mp.getSave_btn1());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		System.out.println("The Custom View is created under 'Properties' Section where Competitive Foods is added in View");
		ca.eleToBeClickable();
		ca.isElementPresent(lct.getCompetitive_foods1());
		System.out.println("The Competitive Foods - Label is displayed in the Properties Section");

		//Creating View under SKU section
		ca.click(fp.getFoodProductSKUView());
		ca.eleToBeClickable();
		ca.click(fp.getFoodProductSKUViewManage());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(up.getUsrMgmt_Copy());
		ca.click(up.getUsrMgmt_Copy());
		Commonactions.isElementPresent(up.getUsrMgmt_Copy_Value());
		ca.insertText(up.getUsrMgmt_Copy_Value(), "CVinSKU");
		ca.eleToBeClickable();
		ca.click(lct.getSkuvalue());
		ca.eleToBeClickable();
		ca.click(fp.getAdd_Btn());
		//ca.save();
		ca.mouseOver(mp.getSave_btn1());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		System.out.println("The Custom View is created for 'SKU' Section where 'Created' Column is added in View");
		ca.eleToBeClickable();
		ca.isElementPresent(lct.getSkuvalue_1());
		System.out.println("The 'Created' - Column is displayed under SKU Section");		
		//Creating View under SKU Gallery section
		ca.eleToBeClickable();
		ca.click(fp.getFoodProductSKUGalleryView());
		ca.eleToBeClickable();
		ca.click(fp.getFoodProductSKUGalleryViewManage());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(up.getUsrMgmt_Copy());
		ca.click(up.getUsrMgmt_Copy());
		Commonactions.isElementPresent(up.getUsrMgmt_Copy_Value());
		ca.insertText(up.getUsrMgmt_Copy_Value(), "CVinSKUGallery");
		ca.eleToBeClickable();
		ca.click(driver.findElement(By.xpath("//option[@value='Active::0']")));
		ca.eleToBeClickable();
		ca.click(fp.getAdd_Btn());
		//ca.save();
		Commonactions.mouseOver(mp.getSave_btn1());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		System.out.println("The Custom View is created under 'SKU Gallery ' Section where 'Active' Atribute is added in View");	
		//Creating View under Data Sheets section
		ca.eleToBeClickable();
		ca.click(fp.getDataPackageDataSheetsView());
		ca.eleToBeClickable();
		ca.click(fp.getDataPackageDataSheetsViewManage());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(up.getUsrMgmt_Copy());
		ca.click(up.getUsrMgmt_Copy());
		Commonactions.isElementPresent(up.getUsrMgmt_Copy_Value());
		ca.insertText(up.getUsrMgmt_Copy_Value(), "CVinDataSheets");
		ca.eleToBeClickable();
		ca.click(lct.getCv_Datasheets());
		ca.eleToBeClickable();
		ca.click(fp.getAdd_Btn());
		//ca.save();
		Commonactions.mouseOver(mp.getSave_btn1());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		System.out.println("The Custom View is created under 'Data Section' Section where 'Created By' Column is added in View");
		ca.eleToBeClickable();
		Commonactions.isElementPresent(lct.getDatasheets4());
		System.out.println("The 'Created By' - Column is displayed under 'Data Sheets' Section");

		//Creating View under Documents section
		ca.click(fp.getDataPackageDocumentsView());
		ca.eleToBeClickable();
		ca.click(fp.getDataPackageDocumentsViewManage());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(up.getUsrMgmt_Copy());
		ca.click(up.getUsrMgmt_Copy());
		Commonactions.isElementPresent(up.getUsrMgmt_Copy_Value());
		ca.insertText(up.getUsrMgmt_Copy_Value(), "CVinDocs");
		ca.eleToBeClickable();
		ca.click(lct.getCr_Datasheets());
		ca.eleToBeClickable();
		ca.click(fp.getAdd_Btn());
		//ca.save();
		Commonactions.mouseOver(mp.getSave_btn1());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		System.out.println("The Custom View is created under 'Documents' Section where 'Current Revision' Column is added in View");
		ca.eleToBeClickable();
		Commonactions.isElementPresent(lct.getCurrent_revision());
		System.out.println("The 'Current Revision' - Column is displayed under 'Documents' Section");

	}
	@Then("Create View Under the Cover Sheet View for Data Package Template With Out Cover Sheet {string}")
	public void Create_View_Under_the_Cover_Sheet_View_for_Data_Package_Template_With_Out_Cover_Sheet (String string1) throws Throwable {
		String[] DPName = string1.split(",");
		ca.click(lct.getDatapackage_templates());
		ca.eleToBeClickable();
		ca.click(driver.findElement(By.xpath("//a[contains(text(),'"+DPName[1]+"')]")));
		ca.eleToBeClickable();
		ca.click(fp.getCoverSheetTab());
		ca.eleToBeClickable();
		ca.click(fp.getShowHideToolbar());
		ca.eleToBeClickable();
		System.out.println("Creating CV's under the Data Package template- " +DPName[1]);

		//Creating View under Cover Sheet
		ca.click(fp.getCoverSheetview());
		ca.eleToBeClickable();
		ca.click(fp.getCoverSheetviewManage());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(up.getUsrMgmt_Copy());
		ca.click(up.getUsrMgmt_Copy());
		Commonactions.isElementPresent(up.getUsrMgmt_Copy_Value());
		ca.insertText(up.getUsrMgmt_Copy_Value(), "CVNoSKUGal");
		ca.eleToBeClickable();
		ca.click(lct.getSKUgallery());
		ca.eleToBeClickable();
		ca.save();
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		System.out.println("The Custom View is created under 'Cover Sheet' where 'SKU Gallery' is not selected");
		ca.eleToBeClickable();
		Commonactions.isElementNotPresent(lct.getProductSKUgallery());
		System.out.println("The SKU Gallery Section is not displayed for the Cover Sheet Tab");
		//Creating View under Cover Sheet Properties
		ca.click(fp.getCoverSheetPropView());
		ca.eleToBeClickable();
		ca.click(fp.getCoverSheetPropViewManage());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(up.getUsrMgmt_Copy());
		ca.click(up.getUsrMgmt_Copy());
		Commonactions.isElementPresent(up.getUsrMgmt_Copy_Value());
		ca.insertText(up.getUsrMgmt_Copy_Value(), "CVAddCoverSheet");
		ca.eleToBeClickable();
		ca.click(lct.getCs_Datasheets());
		ca.eleToBeClickable();
		ca.click(fp.getAdd_Btn());
		//ca.save();
		Commonactions.mouseOver(mp.getSave_btn1());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		System.out.println("The Custom View is created under 'Cover Sheet Properties' Section  where 'Cover Sheet View' is added in View");
		ca.eleToBeClickable();
		Commonactions.isElementPresent(lct.getCoversheet_view());
		System.out.println("The 'Cover Sheet View'  - Label is displayed in the 'Cover Sheet Properties' setion");
		//Creating View under Properties section
		ca.click(fp.getFoodPropView());
		ca.eleToBeClickable();
		ca.click(fp.getFoodPropViewManage());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(up.getUsrMgmt_Copy());
		ca.click(up.getUsrMgmt_Copy());
		Commonactions.isElementPresent(up.getUsrMgmt_Copy_Value());
		ca.insertText(up.getUsrMgmt_Copy_Value(), "CVAddCode");
		ca.eleToBeClickable();
		ca.click(driver.findElement(By.xpath("//option[@value='Code::0']")));
		ca.eleToBeClickable();
		ca.click(fp.getAdd_Btn());
		//ca.save();
		Commonactions.mouseOver(mp.getSave_btn1());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		System.out.println("The Custom View is created under 'Properties' Section where 'Code' is added in View");
		ca.eleToBeClickable();
		Commonactions.isElementPresent(driver.findElement(By.xpath("//div[@class='csiHeadingCellLabel' and text()='Code']")));
		System.out.println("The 'Code' - Label is displayed in the Properties Section");

		//Creating View under SKU section
		ca.click(fp.getFoodProductSKUView());
		ca.eleToBeClickable();
		ca.click(fp.getFoodProductSKUViewManage());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(up.getUsrMgmt_Copy());
		ca.click(up.getUsrMgmt_Copy());
		Commonactions.isElementPresent(up.getUsrMgmt_Copy_Value());
		ca.insertText(up.getUsrMgmt_Copy_Value(), "CVinSKU2");
		ca.eleToBeClickable();
		ca.click(lct.getDocuments_and_commments());
		ca.eleToBeClickable();
		ca.click(fp.getAdd_Btn());
		//ca.save();
		Commonactions.mouseOver(mp.getSave_btn1());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		System.out.println("The Custom View is created under 'SKU Section' where 'Documents' Column is added in View");
		ca.eleToBeClickable();
		Commonactions.isElementPresent(lct.getDocuments());
		System.out.println("The 'Documents' - Column is displayed under SKU Section");		
		//Creating View under SupplierQuote section//parallel
		ca.click(fp.getFoodSupplierItemsView());
		ca.eleToBeClickable();
		ca.click(fp.getFoodSupplierItemsViewManage());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(up.getUsrMgmt_Copy());
		ca.click(up.getUsrMgmt_Copy());
		Commonactions.isElementPresent(up.getUsrMgmt_Copy_Value());
		ca.insertText(up.getUsrMgmt_Copy_Value(), "CVinSQ");
		ca.eleToBeClickable();
		ca.click(lct.getOptionsrequestnumber());
		ca.eleToBeClickable();
		ca.click(fp.getAdd_Btn());
		//ca.save();
		ca.mouseOver(mp.getSave_btn1());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		System.out.println("The Custom View is created 'Supplier Quote' Section  where 'AdoptionStatus' Atribute is added in View");	
		ca.eleToBeClickable();
	//	ca.isElementPresent(driver.findElement(By.xpath("//span[@class='csi-table-header-content' and text()='Adoption Status']")));
	//	System.out.println("The 'Adoption Status' - Column is displayed under Supplier Quotes Section");
		//Creating View under Data Sheets section
		ca.click(fp.getDataPackageDataSheetsView());
		ca.eleToBeClickable();
		ca.click(fp.getDataPackageDataSheetsViewManage());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(up.getUsrMgmt_Copy());
		ca.click(up.getUsrMgmt_Copy());
		Commonactions.isElementPresent(up.getUsrMgmt_Copy_Value());
		ca.insertText(up.getUsrMgmt_Copy_Value(), "CVinDataSheets2");
		ca.eleToBeClickable();
		ca.click(lct.getOptionsvaluemodified());
		ca.eleToBeClickable();
		ca.click(fp.getAdd_Btn());
		//ca.save();
		Commonactions.mouseOver(mp.getSave_btn1());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		System.out.println("The Custom View is created under 'Data Sheets' Section where 'Modified' Column is added in View");
		ca.eleToBeClickable();
		Commonactions.isElementPresent(driver.findElement(By.xpath("//span[@class='csi-table-header-content' and text()='Modified']")));
		System.out.println("The 'Modified' - Column is displayed under 'Data Sheets' Section");

		//Creating View under Documents section
		ca.click(fp.getDataPackageDocumentsView());
		ca.eleToBeClickable();
		ca.click(fp.getDataPackageDocumentsViewManage());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(up.getUsrMgmt_Copy());
		ca.click(up.getUsrMgmt_Copy());
		Commonactions.isElementPresent(up.getUsrMgmt_Copy_Value());
		ca.insertText(up.getUsrMgmt_Copy_Value(), "CVinDocs2");
		ca.eleToBeClickable();
		ca.click(lct.getOption_Document_type());
		ca.eleToBeClickable();
		ca.click(fp.getAdd_Btn());
		//ca.save();
		Commonactions.mouseOver(mp.getSave_btn1());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		System.out.println("The Custom View is created under 'Documents' Section where 'Document Type' Column is added in View");
		ca.eleToBeClickable();
		Commonactions.isElementPresent(lct.getDocument_Type1());
		System.out.println("The 'Document Type' - Column is displayed under 'Documents' Section");

	}	


	@Given("user create food type {string}")
	public void user_create_food_type(String foods) throws Throwable {String[] food = foods.split(",");
	Commonactions.isElementPresent(hp.getUser_homeBtn());
	ca.click(hp.getUser_homeBtn());
	Commonactions.isElementPresent(fp.getFoodTab());
	ca.click(fp.getFoodTab());
	Commonactions.isElementPresent(fp.getFoodsTab());
	ca.click(fp.getFoodsTab());
	
//	Commonactions.isElementPresent(fp.getFoodPrdctTab());
//	ca.click(fp.getFoodPrdctTab());
	Commonactions.isElementPresent(fp.getNewFoodBtn());
	ca.click(fp.getNewFoodBtn());
	Commonactions.isElementPresent(fp.getFoodTypeValue());
	ca.insertText(fp.getFoodTypeValue(), food[0]);
	ca.jsMouseOver();
	Commonactions.isElementPresent(fp.getFoodValue());
	ca.insertText(fp.getFoodValue(), food[1]);
	Commonactions.isElementPresent(mp.getSaveAndNew_btn());
	ca.click(mp.getSaveAndNew_btn());
	ca.eleToBeClickable();
	Commonactions.isElementPresent(fp.getFoodTypeValue());
	ca.insertText(fp.getFoodTypeValue(), food[2]);
	ca.jsMouseOver();
	Commonactions.isElementPresent(fp.getFoodValue());
	ca.insertText(fp.getFoodValue(), food[3]);
	Commonactions.isElementPresent(mp.getSave_btn1());
	ca.click(mp.getSave_btn1());
	WebElement edit = driver.findElement(By.xpath("(//a[text()='J-Noodles']//following::span[text()='mode_edit'])[1]"));
	ca.eleToBeClickable();
	edit.click();
	Commonactions.isElementPresent(fp.getFoodValue());
	ca.insertText(fp.getFoodValue(), "J-Noodles-editable");
	Commonactions.isElementPresent(mp.getSave_btn1());
	ca.click(mp.getSave_btn1());
	System.out.println("save performed- food value "+food[1]+ food[3]+"created");
	System.out.println("editable food created"+edit.getText());
	}


	@Then("user create Artwork template and verify edit,copy and delete function")
	public void user_create_Artwork_template_and_verify_edit_copy_and_delete_function() throws Throwable {
		Commonactions.isElementPresent(fp.getJNoodlesEdited());
		ca.click(fp.getJNoodlesEdited());
		Commonactions.isElementPresent(fp.getSpecificationtab());
		ca.click(fp.getSpecificationtab());
		Commonactions.isElementPresent(fp.getArtworktab());
		ca.click(fp.getArtworktab());
		Commonactions.isElementPresent(fp.getNewartworkbtn());
		ca.click(fp.getNewartworkbtn());

		ca.eleToBeClickable();
		WebElement f= ca.activeElement();
		f.sendKeys(Keys.DELETE);
		ca.eleToBeClickable();
		ca.insertText(f, "J-Artwork");
		ca.eleToBeClickable();
		Commonactions.isElementPresent(fp.getTopbtn());
		ca.click(fp.getTopbtn());
		ca.eleToBeClickable();
		WebElement f1 = ca.activeElement();
		f1.sendKeys(Keys.DELETE);
		ca.eleToBeClickable();
		f1.sendKeys("Apple",Keys.ENTER);
		ca.eleToBeClickable();
		Commonactions.isElementPresent(fp.getSpecificationtab());
		ca.click(fp.getSpecificationtab());
		Commonactions.isElementPresent(fp.getArtworktab());
		ca.click(fp.getArtworktab());
		Commonactions.isElementPresent(fp.getNewartworkbtn());
		ca.click(fp.getNewartworkbtn());
		ca.eleToBeClickable();
		WebElement f2= ca.activeElement();
		f2.sendKeys(Keys.DELETE);
		ca.eleToBeClickable();
		ca.insertText(f2, "J-Fruit");
		ca.eleToBeClickable();
		
		Commonactions.isElementPresent(fp.getArtworkbtn());
		ca.click(fp.getArtworkbtn());
		Commonactions.isElementPresent(fp.getNewfromartworkbtn());
		ca.click(fp.getNewfromartworkbtn());
		Commonactions.isElementPresent(fp.getArtworkchkbox());
		ca.click(fp.getArtworkchkbox());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
	    //System.out.println("the type is not defined");
	    //ca.click(driver.findElement(By.xpath("//span[text()='Cancel']")));
		
		Commonactions.isElementPresent(fp.getCopycontent());
		ca.click(fp.getCopycontent());
		Commonactions.isElementPresent(fp.getClosebutton());
		ca.click(fp.getClosebutton());
		Commonactions.isElementPresent(fp.getDeletebtn());
		ca.click(fp.getDeletebtn());
		ca.eleToBeClickable();
	}

	@And("user create canvas template for artwork")
	public void user_create_canvas_template_for_artwork() throws Throwable {
		Commonactions.isElementPresent(hp.getDatasetup());
		ca.click(hp.getDatasetup());
		Commonactions.isElementPresent(hp.getData_Spec());
		ca.click(hp.getData_Spec());
		Commonactions.isElementPresent(hp.getSetupSearch());
		hp.getSetupSearch().sendKeys("Canvas Templates",Keys.ENTER);
		ca.eleToBeClickable();
		Commonactions.isElementPresent(fp.getCanvastemplatetab());
		ca.click(fp.getCanvastemplatetab());
		Commonactions.isElementPresent(fp.getNewcanvastemplate());
		ca.click(fp.getNewcanvastemplate());
		Commonactions.isElementPresent(fp.getCanvastemplate());
		ca.insertText(fp.getCanvastemplate(), "J-Artwork");
		Commonactions.isElementPresent(fp.getTemplatetype());
		ca.insertText(fp.getTemplatetype(), "Artwork");
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();

		/*try{
			for (int i = 0; i < 200; i++) {
				// Thread.sleep(300);
				ca.click(driver.findElement(By.xpath("//div[contains(@class,'CanvasTemplates')]//span[text()='+']/parent::div")));

				if (fp.getArtworkactivechkbox().isDisplayed()) {

					ca.click(driver.findElement(By.xpath("//div[contains(@class,'CanvasTemplates')]//span[text()='+']/parent::div")));
					ca.click(driver.findElement(By.xpath("//div[contains(@class,'CanvasTemplates')]//span[text()='+']/parent::div")));
					ca.click(driver.findElement(By.xpath("//div[contains(@class,'CanvasTemplates')]//span[text()='+']/parent::div")));
					ca.click(driver.findElement(By.xpath("//div[contains(@class,'CanvasTemplates')]//span[text()='+']/parent::div")));
					ca.click(driver.findElement(By.xpath("//div[contains(@class,'CanvasTemplates')]//span[text()='+']/parent::div")));
					ca.click(driver.findElement(By.xpath("//div[contains(@class,'CanvasTemplates')]//span[text()='+']/parent::div")));
					ca.click(driver.findElement(By.xpath("//div[contains(@class,'CanvasTemplates')]//span[text()='+']/parent::div")));
					ca.click(driver.findElement(By.xpath("//div[contains(@class,'CanvasTemplates')]//span[text()='+']/parent::div")));
					ca.click(driver.findElement(By.xpath("//div[contains(@class,'CanvasTemplates')]//span[text()='+']/parent::div")));
					ca.click(driver.findElement(By.xpath("//div[contains(@class,'CanvasTemplates')]//span[text()='+']/parent::div")));
					ca.click(driver.findElement(By.xpath("//div[contains(@class,'CanvasTemplates')]//span[text()='+']/parent::div")));
					ca.click(driver.findElement(By.xpath("//div[contains(@class,'CanvasTemplates')]//span[text()='+']/parent::div")));
					ca.click(driver.findElement(By.xpath("//div[contains(@class,'CanvasTemplates')]//span[text()='+']/parent::div")));



					break;

				}

			}}catch (Exception e) {
				// TODO: handle exception
			}*/
		ca.eleToBeClickable();
		ca.click(fp.getArtworkactivechkbox());
		Commonactions.isElementPresent(fp.getJArtwork1());
		ca.click(fp.getJArtwork1());
		Commonactions.isElementPresent(fp.getCrtnewcanvas());
		ca.click(fp.getCrtnewcanvas());
		Commonactions.isElementPresent(fp.getRecttemplate());
		ca.click(fp.getRecttemplate());
		Commonactions.isElementPresent(fp.getSavefinishbtn());
		ca.click(fp.getSavefinishbtn());
		ca.eleToBeClickable();
	}
	@And("select template in foodtab and approves it")
	public void select_template_in_foodtab_and_approves_it() throws Throwable {


		Commonactions.isElementPresent(hp.getUser_homeBtn());
		ca.click(hp.getUser_homeBtn());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(fp.getFoodTab());
		ca.click(fp.getFoodTab());
//		Commonactions.isElementPresent(fp.getFoodPrdctTab());
//		ca.click(fp.getFoodPrdctTab());
        Commonactions.isElementPresent(fp.getFoodsTab());
		ca.click(fp.getFoodsTab());
		Commonactions.isElementPresent(fp.getJNoodlesEdited());
		ca.click(fp.getJNoodlesEdited());
		Commonactions.isElementPresent(fp.getSpecificationtab());
		ca.click(fp.getSpecificationtab());
		Commonactions.isElementPresent(fp.getArtworktab());
		ca.click(fp.getArtworktab());
		try{
			Commonactions.isElementPresent(fp.getJArtwork());
			ca.click(fp.getJArtwork());
		}catch (Exception e) {
			ca.eleToBeClickable();
			ca.click(lct.getJ_Artwork());
		}
		Commonactions.isElementPresent(fp.getTdstab());
		ca.click(fp.getTdstab());
		Commonactions.isElementPresent(fp.getSelecttemplate());
		ca.click(fp.getSelecttemplate());
		Commonactions.isElementPresent(fp.getSelectimg());
		ca.click(fp.getSelectimg());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		Commonactions.isElementPresent(fp.getSavefinishbtn());
		ca.click(fp.getSavefinishbtn());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(fp.getJNoodlesEdited());
		ca.click(fp.getJNoodlesEdited());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(fp.getApprovebtn());
		ca.click(fp.getApprovebtn());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(fp.getApprovebtn());
		ca.click(fp.getApprovebtn());
		ca.eleToBeClickable();	
		System.out.println("artwork templates created sucessfully and perform copy ,delete functions");
	}
	@Then("user create routing template and verify edit,copy and delete function")
	public void user_create_routing_template_and_verify_edit_copy_and_delete_function() throws Throwable {

		Commonactions.isElementPresent(hp.getDatasetup());
		ca.click(hp.getDatasetup());
		Commonactions.isElementPresent(hp.getData_Spec());
		ca.click(hp.getData_Spec());
		Commonactions.isElementPresent(hp.getSetupSearch());
		ca.insertText(hp.getSetupSearch(), "Operation Groups");
		Commonactions.isElementPresent(sp.getOperationGroup());
		ca.click(sp.getOperationGroup());


		Commonactions.isElementPresent(sp.getNewOGroupBtn());
		ca.click(sp.getNewOGroupBtn());
		ca.eleToBeClickable();
		Thread.sleep(1000);
		WebElement activeElement3 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(activeElement3, "CMT");
		ca.eleToBeClickable();
		activeElement3.sendKeys(Keys.TAB);



		Commonactions.isElementPresent(sp.getCapability());
		ca.click(sp.getCapability());
		Commonactions.isElementPresent(sp.getNewCapabilityBtn());
		ca.click(sp.getNewCapabilityBtn());
		ca.eleToBeClickable();
		Thread.sleep(1000);
		WebElement activeElement = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(activeElement, "Cut");
		ca.eleToBeClickable();
		activeElement.sendKeys(Keys.TAB);
		ca.eleToBeClickable();
		WebElement d= ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(d, "supplier");
		ca.eleToBeClickable();
		ca.jsMouseOver();
		WebElement aab = ca.activeElement();
		ca.eleToBeClickable();
		aab.sendKeys(Keys.TAB);
		Thread.sleep(1000);
		WebElement aa2 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(aa2, "CMT");
		ca.eleToBeClickable();

		Commonactions.isElementPresent(sp.getNewCapabilityBtn());
		ca.click(sp.getNewCapabilityBtn());
		ca.eleToBeClickable();
		WebElement activeElement2 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(activeElement2, "Sew");
		ca.eleToBeClickable();
		activeElement2.sendKeys(Keys.TAB);
		ca.eleToBeClickable();
		WebElement e= ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(e, "supplier");
		ca.eleToBeClickable();
		ca.jsMouseOver();
		WebElement aa = ca.activeElement();
		Thread.sleep(1000);
		aa.sendKeys(Keys.TAB);
		Thread.sleep(1000);
		WebElement aa1 = ca.activeElement();
		Thread.sleep(1000);
		ca.insertText(aa1, "CMT");
		ca.eleToBeClickable();

		System.out.println("capability created sucessfully");
	}
	@And("user create newsubrouting {string}")
	public void user_create_newsubrouting(String subrouting) throws Throwable {
		String[]sub=subrouting.split(",");
		Commonactions.isElementPresent(sp.getSub_Routing());
		ca.click(sp.getSub_Routing());
		Commonactions.isElementPresent(sp.getNewsubRoutingBtn());
		ca.click(sp.getNewsubRoutingBtn());
		Commonactions.isElementPresent(sp.getSubRoutingvalue());
		ca.insertText(sp.getSubRoutingvalue(), sub[0]);
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();

		ca.click(lct.getSubrouting());
		ca.eleToBeClickable();
		for(int i=0;i<75;i++)
		{
			driver.findElement(By.xpath("//div[text()='New Sub Routing']//following::div[contains(@class,'dijitSliderIncrementIconH')]//span[text()='+']/parent::div")).click();
		}
		Commonactions.isElementPresent(fp.getLatedstoperationgroup1());
		ca.click(fp.getLatedstoperationgroup1());
		ca.eleToBeClickable();
		WebElement l = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(l,sub[1]);
		Thread.sleep(4000);
		//ca.jsMouseOver();
		Commonactions.isElementPresent(fp.getSubrouting001());
		ca.click(fp.getSubrouting001());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(sp.getAddCapability());
		ca.click(sp.getAddCapability());
		Commonactions.isElementPresent(fp.getCapchkbox());
		ca.click(fp.getCapchkbox());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(fp.getNewcapbtn());
		ca.click(fp.getNewcapbtn());
		Commonactions.isElementPresent(fp.getNewdivider());
		ca.click(fp.getNewdivider());
		ca.eleToBeClickable();
		WebElement l1 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(l1,"Div001");
		Thread.sleep(4000);
		System.out.println("user created newsubrouting");
	}
	@And("user creates newcapability in subrouting")
	public void user_creates_newcapability_in_subrouting() throws Throwable {
		Commonactions.isElementPresent(fp.getNewcapbtn());
		ca.click(fp.getNewcapbtn());
		Commonactions.isElementPresent(fp.getNewsubrouting());
		ca.click(fp.getNewsubrouting());
		Commonactions.isElementPresent(fp.getSubroutingvalue());
		ca.insertText(fp.getSubroutingvalue(), "newSubrouting001");
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(fp.getNewcapbtn());
		ca.click(fp.getNewcapbtn());
		Commonactions.isElementPresent(fp.getNewsplbtn());
		ca.click(fp.getNewsplbtn());
		ca.eleToBeClickable();
		WebElement l2 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(l2,"Special");
		Thread.sleep(4000);
		Commonactions.isElementPresent(fp.getComments());
		ca.click(fp.getComments());
		Commonactions.isElementPresent(fp.getEdit_value());
		ca.insertText(fp.getEdit_value(),"edit"); 
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		System.out.println("user created newcapability in subrouting");
	}
	@Then("user copy delete approve the capabilities and subrouting")
	public void user_copy_delete_approve_the_capabilities_and_subrouting() throws Throwable {
		Commonactions.isElementPresent(fp.getCopycontentNew());
		ca.click(fp.getCopycontentNew());
		Commonactions.isElementPresent(fp.getClosebuttonNew());
		ca.click(fp.getClosebuttonNew());
		Commonactions.isElementPresent(fp.getDeletebtn());
		ca.click(fp.getDeletebtn());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(fp.getActions());
		ca.click(fp.getActions());
		try{

			ca.eleToBeClickable();
			//ca.click(driver.findElement(By.xpath("(//tr[@data-csi-automation='plugin-SubRouting-Breadcrumb-Approve']//td[text()='Approve'])[1]")));
            bc.approveaction();
		}catch(Exception e){

			ca.eleToBeClickable();
			
			ca.click(fp.getApprove());		
		}
		Commonactions.isElementPresent(sp.getSub_Routing());
		ca.click(sp.getSub_Routing());
		Commonactions.isElementPresent(fp.getCopycontent1());
		ca.click(fp.getCopycontent1());
		Commonactions.isElementPresent(sp.getSubRoutingvalue());
		ca.insertText(sp.getSubRoutingvalue(), "subrouting001copy");
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		ca.eleToBeClickable();
		ca.click(lct.getNew_subrouting());
		ca.eleToBeClickable();

		Commonactions.isElementPresent(fp.getSubrouting001copy());
		ca.click(fp.getSubrouting001copy());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(fp.getActions());
		ca.click(fp.getActions());
		try{

			ca.eleToBeClickable();
			//ca.click(driver.findElement(By.xpath("(//tr[@data-csi-automation='plugin-SubRouting-Breadcrumb-Approve']//td[text()='Approve'])[2]")));
            bc.approveaction();
		}catch(Exception ee){
			ca.eleToBeClickable();
			//Commonactions.isElementPresent(fp.getApprove());
			ca.click(fp.getApprove());		
		}
		ca.eleToBeClickable();
		System.out.println("subroutingcopy created sucessfully");
	}

	@And("user created Routing template tab {string}")
	public void user_created_Routing_template_tab(String routingtemplate) throws Throwable {

		Commonactions.isElementPresent(fp.getRouting_templatetab());
		ca.click(fp.getRouting_templatetab());
		Commonactions.isElementPresent(sp.getNewRoutingBtn());
		ca.click(sp.getNewRoutingBtn());
		ca.eleToBeClickable();
		WebElement l3 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(l3,"Routing Template");
		Thread.sleep(4000);
		l3.sendKeys(Keys.TAB);

		Commonactions.isElementPresent(fp.getRoutingtemplate());
		ca.click(fp.getRoutingtemplate());
		Commonactions.isElementPresent(fp.getRoutingitems());
		ca.click(fp.getRoutingitems());
		Commonactions.isElementPresent(fp.getAddcapabilitybtn());
		ca.click(fp.getAddcapabilitybtn());
		Commonactions.isElementPresent(fp.getAddsubrouting());
		ca.click(fp.getAddsubrouting());
		Commonactions.isElementPresent(fp.getSubroutingchkbox());
		ca.click(fp.getSubroutingchkbox());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		ca.eleToBeClickable();
		ca.click(lct.getNew_subrouting1());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(fp.getAddcopiedsubrouting());
		ca.click(fp.getAddcopiedsubrouting());
		Commonactions.isElementPresent(fp.getSubroutingchkbox1());
		ca.click(fp.getSubroutingchkbox1());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		ca.click(lct.getNew_subrouting1());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(fp.getNewdivider());
		ca.click(fp.getNewdivider());
		ca.eleToBeClickable();
		WebElement f = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(f, routingtemplate);
		ca.eleToBeClickable();
		f.sendKeys(Keys.TAB);
		ca.eleToBeClickable();
		Commonactions.isElementPresent(fp.getPiecesperhour1());
		ca.click(fp.getPiecesperhour1());
		ca.eleToBeClickable();
		WebElement f1 = ca.activeElement();
		ca.eleToBeClickable();
		f1.sendKeys(Keys.DELETE);
		ca.insertText(f1, "25");
		ca.eleToBeClickable();
		f1.sendKeys(Keys.TAB);
		ca.eleToBeClickable();
		Commonactions.isElementPresent(fp.getPiecesperhour2());
		ca.click(fp.getPiecesperhour2());
		ca.eleToBeClickable();
		WebElement f2 = ca.activeElement();
		ca.eleToBeClickable();
		f2.sendKeys(Keys.DELETE);
		ca.insertText(f2, "27");
		ca.eleToBeClickable();
		f2.sendKeys(Keys.TAB);
		ca.eleToBeClickable();
		Commonactions.isElementPresent(fp.getPiecesperhour3());
		ca.click(fp.getPiecesperhour3());
		ca.eleToBeClickable();
		WebElement f3 = ca.activeElement();
		ca.eleToBeClickable();
		f3.sendKeys(Keys.DELETE);
		ca.insertText(f3, "35");
		ca.eleToBeClickable();
		f3.sendKeys(Keys.TAB);
		ca.eleToBeClickable();
		System.out.println("routing template created sucessfully");
	}
	@And("goes to foodtab and select new from template {string}")
	public void goes_to_foodtab_and_select_new_from_template(String routingtemplate) throws Throwable {

		Commonactions.isElementPresent(hp.getUser_homeBtn());
		ca.click(hp.getUser_homeBtn());
		Commonactions.isElementPresent(fp.getFoodTab());
		ca.click(fp.getFoodTab());
		Commonactions.isElementPresent(fp.getFoodsTab());
		ca.click(fp.getFoodsTab());
		//Commonactions.isElementPresent(fp.getFoodPrdctTab());
		//ca.click(fp.getFoodPrdctTab());
		Commonactions.isElementPresent(fp.getJNoodlesEdited());
		ca.click(fp.getJNoodlesEdited());
		Commonactions.isElementPresent(fp.getSpecificationtab());
		ca.click(fp.getSpecificationtab());
		Commonactions.isElementPresent(fp.getRoutingtab());
		ca.click(fp.getRoutingtab());
		Commonactions.isElementPresent(fp.getNewrouting());
		ca.click(fp.getNewrouting());


		ca.eleToBeClickable();
		WebElement ff = ca.activeElement();
		ca.eleToBeClickable();
		ff.sendKeys(Keys.DELETE);
		ca.insertText(ff, "J-Routing");
		ca.eleToBeClickable();
		ff.sendKeys(Keys.TAB);
		ca.eleToBeClickable();


		Commonactions.isElementPresent(fp.getNewroutingbtn());
		ca.click(fp.getNewroutingbtn());
		Commonactions.isElementPresent(fp.getNewfrmrouting());
		ca.click(fp.getNewfrmrouting());
		Commonactions.isElementPresent(fp.getRoutingchkbox());
		ca.click(fp.getRoutingchkbox());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(fp.getNewroutingbtn());
		ca.click(fp.getNewroutingbtn());
		Commonactions.isElementPresent(fp.getNewfrmtemplate());
		ca.click(fp.getNewfrmtemplate());
		Commonactions.isElementPresent(fp.getRoutingtemplatechkbox());
		ca.click(fp.getRoutingtemplatechkbox());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(fp.getJrouting());
		ca.click(fp.getJrouting());
		Commonactions.isElementPresent(fp.getRoutingitems());
		ca.click(fp.getRoutingitems());
		ca.eleToBeClickable();
		ca.click(lct.getAdd_Capability());
		Commonactions.isElementPresent(fp.getAddsubrouting());
		ca.click(fp.getAddsubrouting());
		Commonactions.isElementPresent(fp.getSubroutingchkbox());
		ca.click(fp.getSubroutingchkbox());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		ca.eleToBeClickable();
		ca.click(driver.findElement(By.xpath("(//table[contains(@data-csi-automation,'actionRow-RoutingRevision')]/tbody/tr/td[2])")));
		ca.eleToBeClickable();
		Commonactions.isElementPresent(fp.getAddcopiedsubrouting());
		ca.click(fp.getAddcopiedsubrouting());
		Commonactions.isElementPresent(fp.getSubroutingchkbox1());
		ca.click(fp.getSubroutingchkbox1());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		ca.click(driver.findElement(By.xpath("(//table[contains(@data-csi-automation,'actionRow-RoutingRevision')]/tbody/tr/td[2])")));
		ca.eleToBeClickable();
		Commonactions.isElementPresent(fp.getNewdivider());
		ca.click(fp.getNewdivider());
		ca.eleToBeClickable();
		WebElement f5 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(f5, routingtemplate);
		ca.eleToBeClickable();
		f5.sendKeys(Keys.TAB);
		ca.eleToBeClickable();

		ca.click(driver.findElement(By.xpath("(//table[contains(@data-csi-automation,'actionRow-RoutingRevision')]/tbody/tr/td[2])")));
		ca.eleToBeClickable();
		Commonactions.isElementPresent(fp.getNewsubrouting());
		ca.click(fp.getNewsubrouting());
		Commonactions.isElementPresent(fp.getSubroutingvalue());
		ca.insertText(fp.getSubroutingvalue(), "newSubrouting001");
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		ca.eleToBeClickable();

		ca.click(driver.findElement(By.xpath("(//table[contains(@data-csi-automation,'actionRow-RoutingRevision')]/tbody/tr/td[2])")));
		ca.eleToBeClickable();
		Commonactions.isElementPresent(fp.getNewsplbtn());
		ca.click(fp.getNewsplbtn());


		ca.eleToBeClickable();
		WebElement ff1 = ca.activeElement();
		ca.eleToBeClickable();
		//ff1.sendKeys(Keys.DELETE);
		ca.insertText(ff1, "special");
		ca.eleToBeClickable();
		ff1.sendKeys(Keys.TAB);
		ca.eleToBeClickable();
		Commonactions.isElementPresent(fp.getTdstab());
		ca.click(fp.getTdstab()); 
		Commonactions.isElementPresent(fp.getCanvastab());
		ca.click(fp.getCanvastab()); 
		Commonactions.isElementPresent(fp.getCrtnewcanvas());
		ca.click(fp.getCrtnewcanvas()); 
		Commonactions.isElementPresent(fp.getPropertiestab());
		ca.click(fp.getPropertiestab()); 
		Commonactions.isElementPresent(fp.getRoutingitems());
		ca.click(fp.getRoutingitems());
		System.out.println("canvas, property, routing tab exist");
	}
	@Then("user copies approve revise and adandon")
	public void user_copies_approve_revise_and_adandon() throws Throwable {
		ca.eleToBeClickable();
		try{
			driver.findElement(By.xpath("(//a[contains(text(),'Sub')]/parent::span/parent::td//following-sibling::td/div/span[text()='content_copy'])[2]")).click();
			ca.eleToBeClickable();
		}
		catch(Exception e)
		{
			System.out.println("copycontent");
			ca.eleToBeClickable();
			Commonactions.isElementPresent(fp.getCopycontentRouting());
			ca.click(fp.getCopycontentRouting());
			ca.eleToBeClickable();
		}
		try{
			lct.getContent_close().click();
			ca.eleToBeClickable();
		}
		catch(Exception e)
		{
			Commonactions.isElementPresent(fp.getClosebuttonRouting());
			ca.click(fp.getClosebuttonRouting());
		}
		Commonactions.isElementPresent(pp.getDelete_Btn());
		ca.click(pp.getDelete_Btn());
		Commonactions.isElementPresent(fp.getActions());
		ca.click(fp.getActions());
		ca.eleToBeClickable();
		bc.approveaction();
		ca.eleToBeClickable();
		Commonactions.isElementPresent(fp.getActions());
		ca.click(fp.getActions());
		revise();
		ca.eleToBeClickable();
		Commonactions.isElementPresent(fp.getActions());
		ca.click(fp.getActions());
		Abandon();
		ca.eleToBeClickable();

		System.out.println("routing create successfully and perform edit,copy and delete function");

	}
	@Then("user create Document and verify approve ,delete function{string},{string}")
	public void user_create_Document_and_verify_approve_delete_function(String Food1,String Document) throws Throwable {

		String[] food = Food1.split(",");
		Commonactions.isElementPresent(hp.getUser_homeBtn());
		ca.click(hp.getUser_homeBtn());
		ca.eleToBeClickable();		
		Commonactions.isElementPresent(fp.getFoodTab());
		ca.click(fp.getFoodTab());
		//Commonactions.isElementPresent(fp.getFoodPrdctTab());
		//ca.click(fp.getFoodPrdctTab());
		Commonactions.isElementPresent(fp.getFoodsTab());		
		ca.click(fp.getFoodsTab());
		
		Commonactions.isElementPresent(fp.getNewFoodBtn());
		ca.click(fp.getNewFoodBtn());
		Commonactions.isElementPresent(fp.getFoodTypeValue());
		ca.insertText(fp.getFoodTypeValue(), food[0]);
		ca.jsMouseOver();
		Commonactions.isElementPresent(fp.getFoodValue());
		ca.insertText(fp.getFoodValue(), food[1]);
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(fp.getVegpizza());
		ca.click(fp.getVegpizza());
		Commonactions.isElementPresent(fp.getDocumenttab());
		ca.click(fp.getDocumenttab());
		Commonactions.isElementPresent(fp.getDocbtn());
		ca.click(fp.getDocbtn());
		Commonactions.isElementPresent(fp.getNewformdocbtn());
		ca.click(fp.getNewformdocbtn());
		ca.eleToBeClickable();
		WebElement f6 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(f6, Document);
		ca.eleToBeClickable();
		f6.sendKeys(Keys.TAB);
		ca.eleToBeClickable();
		Commonactions.isElementPresent(fp.getSelection());
		ca.click(fp.getSelection());
		Commonactions.isElementPresent(fp.getApprove());
		ca.click(fp.getApprove());
		ca.eleToBeClickable();

	}


	public void revise()
	{
		List<WebElement> num = driver.findElements(By.xpath("//td[text()='Revise']"));
		for(int i=1;i<=num.size();i++)
		{
			WebElement reopen = driver.findElement(By.xpath("(//td[text()='Revise'])["+i+"]"));
			boolean displayed = reopen.isDisplayed();
			if(displayed==true)
			{
				ca.click(reopen);
				break;
			}}
	}
	public void Abandon()
	{
		List<WebElement> num = driver.findElements(By.xpath("//td[text()='Abandon']"));
		for(int i=1;i<=num.size();i++)
		{
			WebElement reopen = driver.findElement(By.xpath("(//td[text()='Abandon'])["+i+"]"));
			boolean displayed = reopen.isDisplayed();
			if(displayed==true)
			{
				ca.click(reopen);
				break;
			}}
	}

	@And("Navigate to Food Label Data Sheet Templates")
	public void Navigate_to_Food_Label_Data_Sheet_Templates()throws Throwable {	
		Commonactions.isElementPresent(hp.getDatasetup());
		ca.click(hp.getDatasetup());
		Commonactions.isElementPresent(hp.getData_Spec());
		ca.click(hp.getData_Spec());
		Commonactions.isElementPresent(hp.getSetupSearch());
		ca.insertText(hp.getSetupSearch(), "Food Label Data Sheet Templates" +Keys.ENTER);
		ca.eleToBeClickable();
		Commonactions.isElementPresent(fp.getFoodLabelDataSheetTemplate());
		ca.click(fp.getFoodLabelDataSheetTemplate());

	}
	@And("Create Food Label Data Sheet Templates {string},{string}")
	public void Create_Food_Label_Data_Sheet_Templates(String string1,String string2) throws Throwable {
		String[] FLDSTempName = string1.split(",");
		String[] FLDSTempSubTypeName = string2.split(",");

		Commonactions.isElementPresent(fp.getNewFLDataSheetTempBtn());
		ca.click(fp.getNewFLDataSheetTempBtn());
		Commonactions.isElementPresent(fp.getFLDataSheetTempName());
		ca.insertText(fp.getFLDataSheetTempName(), FLDSTempName[0]);
		Commonactions.isElementPresent(fp.getFLDataSheetTempSubType());
		ca.insertText(fp.getFLDataSheetTempSubType(), FLDSTempSubTypeName[0]);
		ca.jsMouseOver();
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		System.out.println("The Food Label Data Sheet Template -" + FLDSTempName[0] + " -is created ");
		ca.eleToBeClickable();


	}

	@Then("Go to the Food Label Data Sheet Template Node and Verify the Tab names {string}")
	public void Go_to_the_Food_Label_Data_Sheet_Template_Node_and_Verify_the_Tab_names(String string1) throws Throwable {
		String[] FLDSTempName = string1.split(",");

		Commonactions.isElementPresent(lct.getFoodlabeldatasheettemplate());
		ca.click(driver.findElement(By.xpath("//a[contains(text(),'"+FLDSTempName[0]+"')]")));
		Commonactions.isElementPresent(fp.getFLDataSheetTDSTab());
		System.out.println("The TDS Tab is displayed for Food Label Data Sheet Template");
		Commonactions.isElementPresent(fp.getFLDataSheetCanvasTab());
		System.out.println("The Canvas Tab is displayed for Food Label Data Sheet Template");
		Commonactions.isElementPresent(fp.getFLDataSheetIngredientItemsTab());
		System.out.println("The Ingredient Items Tab is displayed for Food Label Data Sheet Template");
		Commonactions.isElementPresent(fp.getFLDataSheetAllergenItemsTab());
		System.out.println("The Allergen Item Tab is displayed for Food Label Data Sheet Template");
		Commonactions.isElementPresent(fp.getFLDataSheetNutrientItemsTab());
		System.out.println("The TDS Tab is displayed for Food Label Data Sheet Template");
		Commonactions.isElementPresent(fp.getFLDataSheetClaimItemsTab());
		System.out.println("The Claim Items Tab is displayed for Food Label Data Sheet Template");


	}

	@Then("Go to the Ingredient Items tab and Create Ingredient Item and Verify the Main Ingredient Checkbox {string}")
	public void Go_to_the_Ingredient_Items_tab_and_Create_Ingredient_Item_and_Verify_the_Main_Ingredient_Checkbox(String string1) throws Throwable {
		String[] IngredientName = string1.split(",");
try {
		Commonactions.isElementPresent(fp.getFLDataSheetIngredientItemsTab());
		ca.click(fp.getFLDataSheetIngredientItemsTab());//parallel
		driver.navigate().refresh();
		ca.jsWaitForPageLoad();
		Commonactions.isElementPresent(fp.getNewIngredientItemBtn());
		ca.click(fp.getNewIngredientItemBtn());
		ca.eleToBeClickable();
		WebElement n1 = ca.activeElement();
		ca.insertText(n1, IngredientName[0]);
		n1.sendKeys(Keys.ENTER);
		ca.eleToBeClickable();
		Commonactions.isElementPresent(fp.getMainIngredientChkBox());
		Commonactions.isElementPresent(driver.findElement(By.xpath("(//td[contains(text(),'"+IngredientName[0]+"')]/following::td/div[@data-csi-act='MainIngredient::0']/input[@aria-checked='false'])[1]")));
		System.out.println("By Default the Main Ingredient Checkbox is not selected for the Ingredient -" +IngredientName[0]);
		ca.click(fp.getMainIngredientChkBox());
		Commonactions.isElementPresent(driver.findElement(By.xpath("(//td[contains(text(),'"+IngredientName[0]+"')]/following::td/div[@data-csi-act='MainIngredient::0']/input[@aria-checked='true'])[1]")));
		System.out.println("The Main Ingredient Checkbox is selected for the Ingredient  -" +IngredientName[0] );
}catch(Exception e) {
	Commonactions.isElementPresent(fp.getFLDataSheetIngredientItemsTab());
	ca.click(fp.getFLDataSheetIngredientItemsTab());//parallel
	driver.navigate().refresh();
	ca.jsWaitForPageLoad();
	Commonactions.isElementPresent(lct.getAdd_ingredient_items());
	ca.click(lct.getAdd_ingredient_items());
	ca.eleToBeClickable();
	WebElement n1 = ca.activeElement();
	ca.insertText(n1, IngredientName[0]);
	n1.sendKeys(Keys.ENTER);
	ca.eleToBeClickable();
	Commonactions.isElementPresent(fp.getMainIngredientChkBox());
	Commonactions.isElementPresent(driver.findElement(By.xpath("(//td[contains(text(),'"+IngredientName[0]+"')]/following::td/div[@data-csi-act='MainIngredient::0']/input[@aria-checked='false'])[1]")));
	System.out.println("By Default the Main Ingredient Checkbox is not selected for the Ingredient -" +IngredientName[0]);
	ca.click(fp.getMainIngredientChkBox());
	Commonactions.isElementPresent(driver.findElement(By.xpath("(//td[contains(text(),'"+IngredientName[0]+"')]/following::td/div[@data-csi-act='MainIngredient::0']/input[@aria-checked='true'])[1]")));
	System.out.println("The Main Ingredient Checkbox is selected for the Ingredient  -" +IngredientName[0] );
}
	}


	@Then("Go to the Nutrient Items tab and Create Nutrient Items and Verify UOM DV and Amount Columns {string}")
	public void Go_to_the_Nutrient_Items_tab_and_Create_Nutrient_Items_and_Verify_UOM_DV_and_Amount_Columns(String string1) throws Throwable {
		String[] NutrientName = string1.split(",");
		//final ArrayList<String> list=new ArrayList<String>();
		List<String> list = new ArrayList<String>();
		list.add("mcg");
		list.add("mg");
		list.add("kcal");
		list.add("kJ");
		list.add("gm");
		Commonactions.isElementPresent(fp.getFLDataSheetNutrientItemsTab());
		ca.click(fp.getFLDataSheetNutrientItemsTab());
		Commonactions.isElementPresent(fp.getNewNutrientItemBtn());
		ca.click(fp.getNewNutrientItemBtn());
		Commonactions.isElementPresent(fp.getNutrientItemName());
		ca.insertText(fp.getNutrientItemName(), NutrientName[0]);
		Commonactions.isElementPresent(fp.getFoodNutrientName());
		ca.insertText(fp.getFoodNutrientName(), "Proteins");
		ca.jsMouseOver();
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		System.out.println("The Nutrient Item -" + NutrientName[0] + " -is created ");
		ca.eleToBeClickable();
		//Verifying the UOM Values
		Commonactions.isElementPresent(driver.findElement(By.xpath("(//td[contains(text(),'"+NutrientName[0]+"')]/following::td[@data-csi-act='UOM::0'])[1]")));
		int size = list.size();
		for(int i=0;i<size;i++) 
		{	
			ca.click(fp.getUOMDDL());
			ca.eleToBeClickable();
			WebElement fn1 = ca.activeElement();
			ca.eleToBeClickable();
			fn1.sendKeys(Keys.DELETE);
			ca.eleToBeClickable();
			fn1.sendKeys(list.get(i));
			ca.eleToBeClickable();
			ca.jsMouseOver();
			System.out.println("the UOM value - " + list.get(i) + " - can be selected" );
		}	

		Commonactions.isElementPresent(fp.getFLDataSheetNutrientItemsTab());
		ca.click(fp.getFLDataSheetNutrientItemsTab());
		//Verifying the values for %DV field
		Commonactions.isElementPresent(driver.findElement(By.xpath("(//td[contains(text(),'"+NutrientName[0]+"')]/following::td[@data-csi-act='PercentDailyValue::0'])[1]")));
		ca.click(fp.getDV());
		WebElement fn2 = ca.activeElement();
		ca.eleToBeClickable();
		fn2.sendKeys(Keys.DELETE);
		fn2.sendKeys("5");
		ca.eleToBeClickable();
		ca.jsMouseOver();

		String Val = ca.getText(driver.findElement(By.xpath("(//td[contains(text(),'"+NutrientName[0]+"')]/following::td[@data-csi-act='PercentDailyValue::0'])[1]")));
		if ( Val.equals("5%")) {
			System.out.println("the %DV value Updated to - " + Val );
		}
		//Entering the long integer value 
		ca.click(fp.getDV());
		WebElement fn3 = ca.activeElement();
		ca.eleToBeClickable();
		fn3.sendKeys(Keys.DELETE);
		fn3.sendKeys("6.0");
		ca.eleToBeClickable();
		ca.jsMouseOver();
		String Val2 = ca.getText(driver.findElement(By.xpath("(//td[contains(text(),'"+NutrientName[0]+"')]/following::td[@data-csi-act='PercentDailyValue::0'])[1]")));

		if ( Val2.equals("6%")) {
			System.out.println("the %DV Long value is truncated - " + Val2 + " - As whole number Is Updated" );
		}
		//Entering the text value 	 	
		ca.click(fp.getDV());
		WebElement fn4 = ca.activeElement();
		ca.eleToBeClickable();
		fn4.sendKeys(Keys.DELETE);
		fn4.sendKeys("text");
		ca.eleToBeClickable();
		ca.jsMouseOver();
		String Val3 = ca.getText(driver.findElement(By.xpath("//div[@data-dojo-attach-point='messageNode']/span[1]")));
		if ( Val3.equals("The value must be numeric.")) {
			System.out.println("the Error message when text value is entered for %DV is displayed");
		}
		WebElement fn5 = ca.activeElement();
		ca.eleToBeClickable();
		fn5.sendKeys(Keys.DELETE);
		fn5.sendKeys("7");
		ca.jsMouseOver();
		ca.eleToBeClickable();
		String Val4 = ca.getText(driver.findElement(By.xpath("(//td[contains(text(),'"+NutrientName[0]+"')]/following::td[@data-csi-act='PercentDailyValue::0'])[1]")));
		if ( Val4.equals("7%")) {
			System.out.println("the %DV value Updated to - " + Val4 );
		} 

		//Verifying the values for Amount field
		Commonactions.isElementPresent(fp.getFLDataSheetNutrientItemsTab());
		ca.click(fp.getFLDataSheetNutrientItemsTab());
		Commonactions.isElementPresent(driver.findElement(By.xpath("(//td[contains(text(),'"+NutrientName[0]+"')]/following::td[@data-csi-act='Amount::0'])[1]")));
		ca.click(fp.getAV());
		WebElement n1= ca.activeElement();
		ca.eleToBeClickable();
		n1.sendKeys(Keys.DELETE);
		n1.sendKeys("8");
		ca.eleToBeClickable();
		ca.jsMouseOver();

		String Value = ca.getText(driver.findElement(By.xpath("(//td[contains(text(),'"+NutrientName[0]+"')]/following::td[@data-csi-act='Amount::0'])[1]")));
		if ( Value.equals("8.00")) {
			System.out.println("the Amount value Updated to - " + Value );
		}

		//Entering the text value 
		Commonactions.isElementPresent(fp.getFLDataSheetNutrientItemsTab());
		ca.click(fp.getFLDataSheetNutrientItemsTab());
		ca.click(fp.getAV());
		WebElement n2 = ca.activeElement();
		ca.eleToBeClickable();
		n2.sendKeys(Keys.DELETE);
		n2.sendKeys("text");
		ca.eleToBeClickable();
		ca.jsMouseOver();
		String Value1 = ca.getText(driver.findElement(By.xpath("//div[@data-dojo-attach-point='messageNode']/span[1]")));
		if ( Value1.equals("The value must be numeric.")) {
			System.out.println("the Error message when text value is entered for Amount Value Field is displayed");
		} 

		WebElement n3 = ca.activeElement();
		ca.eleToBeClickable();
		n3.sendKeys(Keys.DELETE);
		n3.sendKeys("9");
		//ca.jsMouseOver();
		Commonactions.isElementPresent(fp.getFLDataSheetNutrientItemsTab());
		ca.click(fp.getFLDataSheetNutrientItemsTab());
		//The below wait time is required plz do not remove
		ca.eleToBeClickable();
		String Value2 = ca.getText(driver.findElement(By.xpath("(//td[contains(text(),'"+NutrientName[0]+"')]/following::td[@data-csi-act='Amount::0'])[1]")));
		if ( Value2.equals("9.00")) {
			System.out.println("the Amount Value  Updated to - " + Value2 );
		}   
	}	

	@Then("user create food types {string}")
	public void user_create_food_types(String food1) throws Throwable {
		String[] food = food1.split(",");
		Commonactions.isElementPresent(hp.getUser_homeBtn());
		ca.click(hp.getUser_homeBtn());
//		try{
//			ca.eleToBeClickable();
//			Commonactions.clickjs(driver.findElement(By.xpath("//button[@aria-label='Scroll Right']")));
//		}catch(Exception e){
//		}
		Commonactions.isElementPresent(fp.getFoodTab());
		ca.click(fp.getFoodTab());

		Commonactions.isElementPresent(fp.getFoodPrdctTab());
		ca.click(fp.getFoodPrdctTab());
		//Commonactions.isElementPresent(fp.getFoodPrdctTab());
		//ca.click(fp.getFoodPrdctTab());
		Commonactions.isElementPresent(fp.getFoodsTab());
		ca.click(fp.getFoodsTab());
		

		Commonactions.isElementPresent(fp.getNewFoodBtn());
		ca.click(fp.getNewFoodBtn());
		Commonactions.isElementPresent(fp.getFoodTypeValue());
		ca.insertText(fp.getFoodTypeValue(), food[0]);
		ca.jsMouseOver();
		Commonactions.isElementPresent(fp.getFoodValue());
		ca.insertText(fp.getFoodValue(), food[1]);
		Commonactions.isElementPresent(mp.getSaveAndNew_btn());
		ca.click(mp.getSaveAndNew_btn());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(fp.getFoodTypeValue());
		ca.insertText(fp.getFoodTypeValue(), food[2]);
		ca.jsMouseOver();
		Commonactions.isElementPresent(fp.getFoodValue());
		ca.insertText(fp.getFoodValue(), food[3]);
		Commonactions.isElementPresent(mp.getSaveAndNew_btn());
		ca.click(mp.getSaveAndNew_btn());
		ca.click(mp.getSaveAndNew_btn());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(fp.getFoodTypeValue());
		ca.insertText(fp.getFoodTypeValue(), food[4]);
		ca.jsMouseOver();
		Commonactions.isElementPresent(fp.getFoodValue());
		ca.insertText(fp.getFoodValue(), food[5]);
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		System.out.println("new food created sucessfully"+food[1]+food[3]+food[5]);


	}

	@Then("user create Document and verify approve function{string}")
	public void user_create_Document_and_verify_approve_delete_function(String document ) throws Throwable {
		String[] Document = document.split(",");
		try {
			Commonactions.isElementPresent(fp.getClickvegpizzabtn());
			ca.click(fp.getClickvegpizzabtn());
		}catch(Exception e){
			System.out.println("veg pizza");
			ca.eleToBeClickable();
			ca.click(lct.getVeg_pizza());
		}
		ca.eleToBeClickable();
		ca.click(fp.getDocumenttab());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(fp.getDocbtn());
		ca.click(fp.getDocbtn());
		Commonactions.isElementPresent(fp.getNewformdocbtn());
		ca.click(fp.getNewformdocbtn());
		ca.eleToBeClickable();
		WebElement doc = ca.activeElement();
		ca.eleToBeClickable();

		ca.insertText(doc, Document[0]);
		ca.eleToBeClickable();
		doc.sendKeys(Keys.TAB);
		ca.eleToBeClickable();
		Commonactions.isElementPresent(fp.getDocbtn());
		ca.click(fp.getDocbtn());
		Commonactions.isElementPresent(fp.getNewformdocbtn());
		ca.click(fp.getNewformdocbtn());
		ca.eleToBeClickable();
		WebElement doc1 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(doc1, Document[1]);
		ca.eleToBeClickable();
		doc1.sendKeys(Keys.TAB);
		ca.eleToBeClickable();
		ca.eleToBeClickable();
		ca.click(fp.getSelection());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(fp.getApprovedoc());
		ca.click(fp.getApprovedoc());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(fp.getDocSelection());
		ca.click(fp.getDocSelection());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(fp.getSharedoc());
		ca.click(fp.getSharedoc());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(fp.getNoodleschkbox());
		ca.click(fp.getNoodleschkbox());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		System.out.println("document created sucessfully"+Document[0]+Document[1]);
		ca.eleToBeClickable();
		Commonactions.isElementPresent(fp.getTopbtn());
		ca.click(fp.getTopbtn());
		ca.eleToBeClickable();
		WebElement N1 = ca.activeElement();
		N1.sendKeys(Keys.DELETE);
		ca.eleToBeClickable();
		N1.sendKeys("Noodles",Keys.ENTER);
		ca.eleToBeClickable();
		Commonactions.isElementPresent(fp.getAddreferencedocbtn());
		ca.click(fp.getAddreferencedocbtn());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(fp.getVegpizzachkbox());
		ca.click(fp.getVegpizzachkbox());
		Commonactions.isElementPresent(fp.getNextbtn());
		ca.click(fp.getNextbtn());
		Commonactions.isElementPresent(fp.getFinishbtn());
		ca.click(fp.getFinishbtn());
		System.out.println("reference document added");
		ca.eleToBeClickable();
		//parallel
		try{
		ca.click(driver.findElement(By.xpath("//span[text()='home']")));
		ca.eleToBeClickable();
		ca.click(lct.getVeg_pizza2());
		}catch (Exception e) {
			ca.eleToBeClickable();
			ca.click(lct.getVeg_pizza1());
			// TODO: handle exception
		}//driver.navigate().refresh();
	//	ca.jsWaitForPageLoad();
		ca.eleToBeClickable();
		Commonactions.isElementPresent(fp.getDocSelection());
		ca.click(fp.getDocSelection());
		ca.eleToBeClickable();
		ca.eleToBeClickable();
		ca.click(fp.getSharedoc());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(fp.getPedigreechkbox());
		ca.click(fp.getPedigreechkbox());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		System.out.println("pedigree check box clicked sucessfully");
		Commonactions.isElementPresent(fp.getTopbtn());
		ca.click(fp.getTopbtn());
		ca.eleToBeClickable();
		WebElement N3 = ca.activeElement();
		N3.sendKeys(Keys.DELETE);
		ca.eleToBeClickable();
		N3.sendKeys("pedigree",Keys.ENTER);
		ca.eleToBeClickable();
		Commonactions.isElementPresent(fp.getAddreferencedocbtn());
		ca.click(fp.getAddreferencedocbtn());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(fp.getNoodleschkbox());
		ca.click(fp.getNoodleschkbox());
		Commonactions.isElementPresent(fp.getNextbtn());
		ca.click(fp.getNextbtn());
		Commonactions.isElementPresent(fp.getFinishbtn());
		ca.click(fp.getFinishbtn());

	}
	@Then("User select Salesregion and create SKU {string},{string}")	
	public void User_select_Salesregion_and_create_SKU(String SalesRegName,String SKUName) throws Throwable {	
		Commonactions.isElementPresent(fp.getSalesRegionTab());	
		ca.click(fp.getSalesRegionTab());	
		Commonactions.isElementPresent(fp.getNewSalesRegionBtn());	
		ca.click(fp.getNewSalesRegionBtn());	
		Commonactions.isElementPresent(driver.findElement(By.xpath("//td[contains(text(),'"+SalesRegName+"')]//preceding-sibling::td//input")));	
		ca.click(driver.findElement(By.xpath("//td[contains(text(),'"+SalesRegName+"')]//preceding-sibling::td//input")));	
		Commonactions.isElementPresent(mp.getSave_btn1());	
		ca.click(mp.getSave_btn1());	
		ca.eleToBeClickable();	
        //craete SKU 	
		Commonactions.isElementPresent(fp.getSkubtn());	
		ca.click(fp.getSkubtn());	
		Commonactions.isElementPresent(fp.getNewskusbtn());	
		ca.click(fp.getNewskusbtn());	
		Commonactions.isElementPresent(fp.getFoodsku());	
		ca.insertText(fp.getFoodsku(), SKUName);	
		Commonactions.isElementPresent(fp.getFoodsalesregion());	
		ca.insertText(fp.getFoodsalesregion(), SalesRegName);	
		ca.eleToBeClickable();	
		ca.jsMouseOver();	
		ca.eleToBeClickable();	
		Commonactions.isElementPresent(mp.getSave_btn1());	
		ca.click(mp.getSave_btn1());	
		ca.eleToBeClickable();	
	}	
		
	@And("User Creates and Verify the GTIN Under Food SKU {string},{string},{string}")	
	public void User_Creates_and_Verify_the_GTIN_Under_Food_SKU(String GTINNumber,String FoodSKU,String ManufCode) throws Throwable {	
		ca.click(driver.findElement(By.xpath("(//a[contains(text(),'"+FoodSKU+"')]//following::td[@data-csi-heading='GTIN::0'])[1]")));	
		ca.eleToBeClickable();	
		ca.click(lct.getGTin());	
		ca.eleToBeClickable();	
		Commonactions.isElementPresent(fp.getProductCode());	
		ca.insertText(fp.getProductCode(), GTINNumber);	
		Commonactions.isElementPresent(fp.getManufaturerCode());	
		ca.insertText(fp.getManufaturerCode(), ManufCode);	
		ca.eleToBeClickable();	
		ca.jsMouseOver();	
		Commonactions.isElementPresent(mp.getSave_btn1());	
		ca.click(mp.getSave_btn1());	
		ca.eleToBeClickable();	
		Commonactions.isElementPresent(driver.findElement(By.xpath("//a[contains(text(),'"+FoodSKU+"')]//following::td[@data-csi-heading='GTIN::0' and contains(text(),'"+GTINNumber+"')]")));	
		System.out.println("The GTIN value intially is shown as  - " + GTINNumber+"0123454"  );	
		ca.click(driver.findElement(By.xpath("(//a[contains(text(),'"+FoodSKU+"')]//following::td[@data-csi-heading='GTIN::0'])[1]")));	
		ca.eleToBeClickable();	
		ca.click(lct.getAuogenerate_GTin());	
		ca.eleToBeClickable();	
		ca.eleToBeClickable();	
		Commonactions.isElementPresent(driver.findElement(By.xpath("//a[contains(text(),'"+FoodSKU+"')]//following::td[@data-csi-heading='GTIN::0' and contains(text(),'"+GTINNumber+"')]")));	
		System.out.println("The GTIN value is now updted to   - " + GTINNumber+"0000069"  );	
	}
	@Then("user create new food under food placement in style{string}")
	public void user_create_food_under_food_placement_in_style(String BOM) throws Throwable {
		String[] bom = BOM.split(",");
		Commonactions.isElementPresent(hp.getUser_homeBtn());
		ca.click(hp.getUser_homeBtn());
		Commonactions.isElementPresent(fp.getStyletab());
		ca.click(fp.getStyletab());
		Commonactions.isElementPresent(fp.getStylestab());
		ca.click(fp.getStylestab());
		Commonactions.isElementPresent(fp.getApparel_colorandsize());
		ca.eleToBeClickable();
		ca.click(fp.getApparel_colorandsize());
		System.out.println("Apparel color and size is clicked sucessfully" );
		Commonactions.isElementPresent(fp.getSpecificationtab());
		ca.click(fp.getSpecificationtab());
		Commonactions.isElementPresent(fp.getBOMtab());
		ca.click(fp.getBOMtab());
		Commonactions.isElementPresent(fp.getNewstyleBOM());
		ca.click(fp.getNewstyleBOM());
		Commonactions.isElementPresent(fp.getBOMsubtype());
		ca.insertText(fp.getBOMsubtype(), bom[0]);
		ca.jsMouseOver();
		Commonactions.isElementPresent(fp.getStyleBOMbtn());
		ca.insertText(fp.getStyleBOMbtn(), bom[1]);
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		try {
			Commonactions.isElementPresent(fp.getFood_BOMbtn());
			ca.click(fp.getFood_BOMbtn());
			}catch(Exception e){
				System.out.println("Food BOM");
				ca.eleToBeClickable();
				ca.click(lct.getFood_BOm());
			}
			
		Commonactions.isElementPresent(fp.getFood_placementbtn());
		ca.click(fp.getFood_placementbtn());
		
		try {
			driver.navigate().refresh();
			ca.jsWaitForPageLoad();
			//ca.eleToBeClickable();
			Commonactions.isElementPresent(fp.getNewofFood_expbtn());
			ca.click(fp.getNewofFood_expbtn());
			}catch(Exception e){
				ca.eleToBeClickable();
				ca.click(lct.getNew_Of_food());
				System.out.println("new of Food");
			}
		
			
		Commonactions.isElementPresent(fp.getNew_frm_foodbtn());
		ca.click(fp.getNew_frm_foodbtn());
		Commonactions.isElementPresent(fp.getSelectchkbox());
		ca.click(fp.getSelectchkbox());
		ca.click(fp.getSelectchkbox());
		System.out.println("select and unselect chkbox performed" );
		Commonactions.isElementPresent(fp.getChkbox1());
		ca.click(fp.getChkbox1());
		Commonactions.isElementPresent(fp.getChkbox2());
		ca.click(fp.getChkbox2());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		Commonactions.isElementPresent(fp.getQty_1());
		ca.click(fp.getQty_1());
		ca.eleToBeClickable();
		WebElement b2 = ca.activeElement();
		ca.eleToBeClickable();
		b2.sendKeys(Keys.DELETE);
		ca.insertText(b2, "5");
		ca.eleToBeClickable();
		b2.sendKeys(Keys.TAB);
		ca.eleToBeClickable();
		Commonactions.isElementPresent(fp.getQty_2());
		ca.click(fp.getQty_2());
		ca.eleToBeClickable();
		WebElement b3 = ca.activeElement();
		ca.eleToBeClickable();
		b3.sendKeys(Keys.DELETE);
		ca.insertText(b3, "10");
		ca.eleToBeClickable();
		b3.sendKeys(Keys.TAB);
		ca.eleToBeClickable();
		
		Commonactions.isElementPresent(fp.getApple_copy());
		ca.click(fp.getApple_copy());
		ca.eleToBeClickable();	
		Commonactions.isElementPresent(fp.getApple_close());
		ca.click(fp.getApple_close());
		Commonactions.isElementPresent(fp.getDeletebtn());
		ca.click(fp.getDeletebtn());
		
		
		System.out.println("new food created and perform copy and delete action");
		
		
		
	}	
		
		@Then("user create BOM under food placement in style{string}")
		public void user_create_BOM_under_food_placement_in_style(String Food ) throws Throwable {
			
			String[] FD = Food.split(",");
			
			try {
				driver.navigate().refresh();
				ca.jsWaitForPageLoad();
				Commonactions.isElementPresent(fp.getNewoffood());
			    ca.click(fp.getNewoffood());
			}catch(Exception e) {
				ca.eleToBeClickable();
				ca.click(lct.getNew_Of_food1());
				System.out.println("+New of Food button clicked");
			}
			ca.eleToBeClickable();
			WebElement b4 = ca.activeElement();
			ca.eleToBeClickable();
			ca.insertText(b4, FD[0]);
			ca.eleToBeClickable();
			b4.sendKeys(Keys.TAB);
			ca.eleToBeClickable();
			WebElement b5 = ca.activeElement();
			ca.eleToBeClickable();
			ca.insertText(b5, FD[1]);
			ca.eleToBeClickable();
			b5.sendKeys(Keys.DOWN);
			ca.eleToBeClickable();
			b5.sendKeys(Keys.ENTER);
			System.out.println(FD[0] + FD[1]);
			Commonactions.isElementPresent(fp.getQty_3());
			ca.click(fp.getQty_3());
			ca.eleToBeClickable();
			WebElement b6 = ca.activeElement();
			ca.eleToBeClickable();
			b6.sendKeys(Keys.DELETE);
			ca.insertText(b6, "8");
			ca.eleToBeClickable();
			b6.sendKeys(Keys.TAB);
			ca.eleToBeClickable();
			Commonactions.isElementPresent(fp.getNewoffood());
			ca.click(fp.getNewoffood());
			ca.eleToBeClickable();
			WebElement b7 = ca.activeElement();
			ca.eleToBeClickable();
     		ca.insertText(b7,"FoodBOM");
			ca.eleToBeClickable();
			b7.sendKeys(Keys.TAB);
			ca.eleToBeClickable();
			WebElement b8 = ca.activeElement();
			ca.eleToBeClickable();
			ca.insertText(b8, "Go to");
			ca.eleToBeClickable();
			b8.sendKeys(Keys.DOWN);
			ca.eleToBeClickable();
			b8.sendKeys(Keys.ENTER);
			Commonactions.isElementPresent(fp.getBomvegpizzachkbox());
			ca.click(fp.getBomvegpizzachkbox());
			Commonactions.isElementPresent(mp.getSave_btn1());
			ca.click(mp.getSave_btn1());
			System.out.println("Dialog box checked sucessfully");
			Commonactions.isElementPresent(fp.getDefaultbtn());
			ca.click(fp.getDefaultbtn());
			ca.eleToBeClickable();
			WebElement b9 = ca.activeElement();
			ca.eleToBeClickable();
			b9.sendKeys(Keys.DELETE);
			ca.insertText(b9, "Default");
			ca.eleToBeClickable();
			b9.sendKeys(Keys.ENTER);
			ca.eleToBeClickable();
			Commonactions.isElementPresent(fp.getViewsbtn());
			ca.click(fp.getViewsbtn());
			Commonactions.isElementPresent(fp.getManageviews());
			ca.click(fp.getManageviews());
			Commonactions.isElementPresent(fp.getFoodcontentcopybtn());
			ca.click(fp.getFoodcontentcopybtn());
			Commonactions.isElementPresent(fp.getOnlyforproduct());
			ca.click(fp.getOnlyforproduct());
			Commonactions.isElementPresent(fp.getAddbtn1());
			ca.click(fp.getAddbtn1());
			Commonactions.isElementPresent(fp.getOnlyforproductimage());
			ca.click(fp.getOnlyforproductimage());
			Commonactions.isElementPresent(fp.getAddbtn1());
			ca.click(fp.getAddbtn1());
			Commonactions.isElementPresent(mp.getSave_btn1());
			ca.click(mp.getSave_btn1());
			ca.eleToBeClickable();
			Commonactions.isElementPresent(fp.getOnlyforproducttable());
			ca.click(fp.getOnlyforproducttable());
			Commonactions.isElementPresent(fp.getEGRETcheckbox());
			ca.click(fp.getEGRETcheckbox());
			Commonactions.isElementPresent(fp.getAntiquewhitecheckbox());
			ca.click(fp.getAntiquewhitecheckbox() );
			ca.eleToBeClickable();
			Commonactions.isElementPresent(fp.getNewFoodContentCopy());
			ca.click(fp.getNewFoodContentCopy());
			ca.eleToBeClickable();
			Commonactions.isElementPresent(fp.getNewFoodclose());
			ca.click(fp.getNewFoodclose());
			Commonactions.isElementPresent(fp.getDeletebtn());
			ca.click(fp.getDeletebtn());
			
			ca.eleToBeClickable();
			ca.click(fp.getNewofFood_expbtn());
			Commonactions.isElementPresent(fp.getNewfrmBOM());
			ca.click(fp.getNewfrmBOM());
			try {
			Commonactions.isElementPresent(fp.getFoodBOMchkbox());
			ca.click(fp.getFoodBOMchkbox());
			}catch(Exception e) {
				ca.eleToBeClickable();
				ca.click(lct.getNew_Of_food());
				System.out.println("Food BOM chk box");
			}
			Commonactions.isElementPresent(fp.getNextbtn());
			ca.click(fp.getNextbtn());
			
			Commonactions.isElementPresent(fp.getProductitemchkbox());
			ca.click(fp.getProductitemchkbox());
			Commonactions.isElementPresent(fp.getFinishbtn());
			ca.click(fp.getFinishbtn());
			
		
		
		
		}

		
		@Then("User select food data package templates")
		public void user_select_food_data_package_templates() throws Throwable {
		    
			Commonactions.isElementPresent(hp.getUser_homeBtn());
			ca.click(hp.getUser_homeBtn());
	        Commonactions.isElementPresent(fp.getFoodTab());
			ca.click(fp.getFoodTab());
	        Commonactions.isElementPresent(fp.getFoodsTab());
			ca.click(fp.getFoodsTab());
	        Commonactions.isElementPresent(fp.getClickvegpizzabtn());
			ca.click(fp.getClickvegpizzabtn());
			Commonactions.isElementPresent(fp.getSpecificationtab());
			ca.click(fp.getSpecificationtab());
			Commonactions.isElementPresent(fp.getSummarytab());
			ca.click(fp.getSummarytab());
			
			Commonactions.isElementPresent(fp.getDataPack_Exp());
			ca.click(fp.getDataPack_Exp());
			Commonactions.isElementPresent(fp.getDatapack_Temp());
			ca.click(fp.getDatapack_Temp());
			Commonactions.isElementPresent(fp.getDPT_ChkBX());
			ca.click(fp.getDPT_ChkBX());
			Commonactions.isElementPresent(fp.getFinishbtn());
			ca.click(fp.getFinishbtn());
			ca.eleToBeClickable();
			
		}


		@Then("User generating food data package pdf")
		public void user_generating_food_data_package_pdf() throws Throwable {
		    
			Commonactions.isElementPresent(fp.getDPT_Export());
			ca.click(fp.getDPT_Export());
			Commonactions.isElementPresent(fp.getDPT_PDF());
			ca.click(fp.getDPT_PDF());
			ca.eleToBeClickable();
			
		}


}