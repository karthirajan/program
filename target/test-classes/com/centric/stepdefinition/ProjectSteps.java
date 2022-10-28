package com.centric.stepdefinition;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.centric.objectrepository.DocumentPage;
import com.centric.objectrepository.HomePage;
import com.centric.objectrepository.InspectionPage;
import com.centric.objectrepository.Locators;
import com.centric.objectrepository.LoginPage;
import com.centric.objectrepository.MaterialSpecificationPage;
import com.centric.objectrepository.PopupPage;
import com.centric.objectrepository.ProjectPage;
import com.centric.objectrepository.QualityPage;
import com.centric.objectrepository.SourcingPage;
import com.centric.objectrepository.UserManagementPage;
import com.centric.resources.Commonactions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ProjectSteps extends Commonactions{

	ProjectPage prp = new ProjectPage();
	Commonactions ca = new Commonactions();
	PopupPage pp = new PopupPage();
	MaterialSpecificationPage mp = new MaterialSpecificationPage();
	QualityPage qp = new QualityPage();
	HomePage hp = new HomePage();
	UserManagementPage up = new UserManagementPage();
	InspectionPage in = new InspectionPage();
	LoginPage lp = new LoginPage();
	SourcingPage sp = new SourcingPage();
	BOMCreationSteps bc = new BOMCreationSteps();
	Locators lct = new Locators();
	
	@Then("User creates Projects with different Project Types {string},{string}")
	public void User_creates_Projects_with_different_Project_Types(String string1, String string2) throws Throwable {
		String[] ProjectSubType = string1.split(",");
		String[] ProjectName = string2.split(","); 

		Commonactions.isElementPresent(prp.getProjectsinp());
		ca.click(prp.getProjectsinp());
		Commonactions.isElementPresent(prp.getAllProjectsinp());
		ca.eleToBeClickable();
		ca.click(prp.getAllProjectsinp());
		ca.eleToBeClickable();
		//Verify Cancel Button
		Commonactions.isElementPresent(prp.getNewProjectBtninp());
		ca.click(prp.getNewProjectBtninp());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(prp.getCancelButton());
		ca.click(prp.getCancelButton());
		ca.eleToBeClickable();
		System.out.println("The cancel Button is working for Project Creation Window");

		//Creating the Projects
		for (int i = 0; i < ProjectSubType.length; i++) 
		{
			Commonactions.isElementPresent(prp.getNewProjectBtninp());
			ca.click(prp.getNewProjectBtninp());
			Commonactions.isElementPresent(prp.getSubTypeInputinp());
			ca.click(prp.getSubTypeInputinp());
			ca.insertText(prp.getSubTypeInputinp(), ProjectSubType[i]);
			ca.eleToBeClickable();
			Commonactions.isElementPresent(prp.getProjectNameInputinp());
			ca.click(prp.getProjectNameInputinp());
			ca.insertText(prp.getProjectNameInputinp(), ProjectName[i]);
			ca.eleToBeClickable();
			ca.save();
			ca.eleToBeClickable();
			System.out.println("The Project" + ProjectName[i] + "is created ");
		}	
	}

	@And("Verify Edit And Delete Options {string}")
	public void Verify_Edit_And_Delete_Options(String string1) throws Throwable {
		String[] ProjectName = string1.split(","); 

		Commonactions.isElementPresent(prp.getProjectsinp());
		ca.click(prp.getProjectsinp());
		Commonactions.isElementPresent(prp.getAllProjectsinp());
		ca.eleToBeClickable();
		ca.click(prp.getAllProjectsinp());
		ca.eleToBeClickable();
		//Verify the Edit and Delete links
		ca.click(driver.findElement(By.xpath("(//a[text()='"+ProjectName[5]+"']//following::td/div/span[@data-csi-act='Edit'])[1]")));
		ca.eleToBeClickable();
		Commonactions.isElementPresent(prp.getProjectNameInputinp());
		ca.insertText(prp.getProjectNameInputinp(),ProjectName[5]+" Copy All Revisions");
		ca.eleToBeClickable();
		ca.save();
		ca.eleToBeClickable();
		System.out.println("Project type"+ProjectName[5]+" is Edited");

		ca.click(driver.findElement(By.xpath("(//a[contains(text(),'"+ProjectName[5]+"')]//following::td/div/span[@data-csi-act='Delete'])[1]")));
		ca.eleToBeClickable();
		ca.click(lct.getDeleteBttn());
		ca.eleToBeClickable();
		System.out.println("Project type"+ProjectName[5]+" is Deleted");
	}

	@And("Verify the Tabs Under Each Project Type {string}")
	public void Verify_the_Tabs_Under_Each_Project_Type(String string1) throws Throwable {



		String[] ProjectName = string1.split(","); 
		Commonactions.isElementPresent(prp.getProjectsinp());
		ca.click(prp.getProjectsinp());
		Commonactions.isElementPresent(prp.getAllProjectsinp());
		ca.eleToBeClickable();
		ca.click(prp.getAllProjectsinp());
		ca.eleToBeClickable();
		//Verify the Tabs for each project Type created 
		Commonactions.isElementPresent(prp.getNewProjectBtninp());
		ca.eleToBeClickable();
		ca.click(driver.findElement(By.xpath("//a[@class='browse' and text()='"+ProjectName[4]+"']")));
		ca.eleToBeClickable();
		Commonactions.isElementPresent(prp.getDraftState());
		//				ca.isElementNotPresent(prp.getItemTab());
		//				System.out.println("For the - " + ProjectName[4] + " - The Items Tab is Not present ");				
		ca.isElementPresent(prp.getDocumentsTab());
		System.out.println("For the - " + ProjectName[4] + " - The Documents Tab is present ");
		ca.isElementPresent(prp.getPropertiesTab());
		System.out.println("For the - " + ProjectName[4] + " - The Properties Tab is present ");
		ca.isElementPresent(prp.getTeamTab());
		System.out.println("For the - " + ProjectName[4] + " - The Team Tab is present ");
		ca.isElementPresent(prp.getPresentationTab());
		System.out.println("For the - " + ProjectName[4] + " - The Presentation Tab is present ");
		ca.isElementPresent(prp.getScheduleTab());
		System.out.println("For the - " + ProjectName[4] + " - The Schedule Tab is present ");

		//verify the tabs for Food type Project
		ca.click(lct.getGlobalSpan());
		ca.eleToBeClickable();
		WebElement a1 = ca.activeElement();
		ca.eleToBeClickable(); 
		ca.insertText(a1, ProjectName[2]);
		ca.eleToBeClickable();
		a1.sendKeys(Keys.ENTER);
		ca.eleToBeClickable();
		ca.eleToBeClickable();
		Commonactions.isElementPresent(prp.getDraftState());
		ca.isElementNotPresent(prp.getStylesTab());
		ca.isElementPresent(prp.getItemTab());
		System.out.println("For the - " + ProjectName[2] + " - The Items Tab is present ");
		ca.isElementPresent(prp.getDocumentsTab());
		System.out.println("For the - " + ProjectName[2] + " - The Documents Tab is present ");
		ca.isElementPresent(prp.getPropertiesTab());
		System.out.println("For the - " + ProjectName[2] + " - The Properties Tab is present ");
		ca.isElementPresent(prp.getTeamTab());
		System.out.println("For the - " + ProjectName[2] + " - The Team Tab is present ");
		ca.isElementPresent(prp.getPresentationTab());
		System.out.println("For the - " + ProjectName[2] + " - The Presentation Tab is present ");
		ca.isElementPresent(prp.getScheduleTab());
		System.out.println("For the - " + ProjectName[2] + " - The Schedule Tab is present ");
		//Verifying the Food functionality
		ca.click(prp.getItemTab());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(prp.getAddItemBtn());
		ca.click(prp.getAddItemBtn());
		ca.eleToBeClickable();
		ca.insertText(prp.getProducttypedrp(),"Food");
		ca.eleToBeClickable();
		ca.click(qp.getNext());
		ca.eleToBeClickable();				
		ca.click(lct.getVegPizza());
		ca.click(qp.getFinish());
		ca.eleToBeClickable();
		System.out.println("The Project Item with the name - "+ProjectName[2]+"-Veg Pizza is created");

		//Verifying the New food Item Button
		ca.click(prp.getScheduleTab());
		ca.eleToBeClickable();
		ca.click(prp.getItemTab());
		ca.eleToBeClickable();

		Commonactions.isElementPresent(prp.getAddItemBtn());
		Commonactions.isElementPresent(prp.getAddItemDDL());
		ca.click(prp.getAddItemDDL());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(prp.getNewFoodsBtn());
		//				 Commonactions.isElementNotPresent(prp.getNewStyleBtn());
		//				 Commonactions.isElementNotPresent(prp.getAddMaterialBtn());

		ca.click(prp.getNewFoodsBtn());
		ca.eleToBeClickable();

		Commonactions.isElementPresent(prp.getFoodSubTypeInput());
		ca.click(prp.getFoodSubTypeInput());
		ca.insertText(prp.getFoodSubTypeInput(),"Cat Food");
		ca.eleToBeClickable();
		Commonactions.isElementPresent(prp.getFoodNameInput());
		ca.click(prp.getFoodNameInput());
		ca.insertText(prp.getFoodNameInput(),"Pedigree");
		ca.eleToBeClickable();
		ca.save();
		ca.eleToBeClickable();

		System.out.println("The Project Item with the name -  "+ProjectName[2]+"-Pedigree is created");	

		//verify the tabs for Style type Project
		ca.eleToBeClickable();
		ca.click(lct.getGlobalSpan());
		ca.eleToBeClickable();
		WebElement a2 = ca.activeElement();
		ca.eleToBeClickable(); 
		ca.insertText(a2, ProjectName[1]);
		ca.eleToBeClickable();
		a2.sendKeys(Keys.ENTER);
		ca.eleToBeClickable();
		ca.eleToBeClickable();
		Commonactions.isElementPresent(prp.getDraftState());
		ca.isElementPresent(prp.getItemTab());
		System.out.println("For the - " + ProjectName[1] + " - The Items Tab is present ");
		ca.isElementPresent(prp.getDocumentsTab());
		System.out.println("For the - " + ProjectName[1] + " - The Documents Tab is present ");
		ca.isElementPresent(prp.getPropertiesTab());
		System.out.println("For the - " + ProjectName[1] + " - The Properties Tab is present ");
		ca.isElementPresent(prp.getTeamTab());
		System.out.println("For the - " + ProjectName[1] + " - The Team Tab is present ");
		ca.isElementPresent(prp.getPresentationTab());
		System.out.println("For the - " + ProjectName[1] + " - The Presentation Tab is present ");
		ca.isElementPresent(prp.getScheduleTab());
		System.out.println("For the - " + ProjectName[1] + " - The Schedule Tab is present ");
		//Verifying the Style functionality
		ca.click(prp.getItemTab());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(prp.getAddItemBtn());
		ca.click(prp.getAddItemBtn());
		ca.eleToBeClickable();
		ca.insertText(prp.getProducttypedrp(),"Style");
		ca.eleToBeClickable();
		ca.click(qp.getNext());
		ca.eleToBeClickable();				
		ca.click(lct.getApparelOnlySize());
		ca.click(qp.getFinish());
		ca.eleToBeClickable();


		System.out.println("The Project Item with the name - "+ProjectName[1]+"-Apparel - Only Size is created");

		//Verifying the New Style Button

		Commonactions.isElementPresent(prp.getAddItemBtn());
		Commonactions.isElementPresent(prp.getAddItemDDL());
		ca.click(prp.getAddItemDDL());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(prp.getNewStyleBtn());
		//						 Commonactions.isElementNotPresent(prp.getNewFoodsBtn());
		//						 Commonactions.isElementNotPresent(prp.getAddMaterialBtn());
		ca.click(prp.getNewStyleBtn());
		ca.eleToBeClickable();

		Commonactions.isElementPresent(prp.getSeasonInput());
		ca.click(prp.getSeasonInput());
		ca.insertText(prp.getSeasonInput(),"winter season");
		ca.jsMouseOver();
		ca.eleToBeClickable();
		Commonactions.isElementPresent(prp.getBrandInput());
		ca.click(prp.getBrandInput());
		ca.insertText(prp.getBrandInput(),"Denim");
		ca.jsMouseOver();
		ca.eleToBeClickable();
		Commonactions.isElementPresent(prp.getDptInput());
		ca.click(prp.getDptInput());
		ca.insertText(prp.getDptInput(),"Mens");
		ca.jsMouseOver();
		ca.eleToBeClickable();
		Commonactions.isElementPresent(prp.getCollectionInput());
		ca.click(prp.getCollectionInput());
		ca.insertText(prp.getCollectionInput(),"Jeans");
		ca.jsMouseOver();
		ca.eleToBeClickable();

		ca.click(prp.getNextBtn());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(prp.getStyleTypeInput());
		ca.click(prp.getStyleTypeInput());
		ca.insertText(prp.getStyleTypeInput(),"Accessories - Only Color");
		ca.eleToBeClickable();
		Commonactions.isElementPresent(prp.getStyleNameInput());
		ca.click(prp.getStyleNameInput());
		ca.insertText(prp.getStyleNameInput(),"StyleInPrjType");
		ca.eleToBeClickable();//parallel
		try{
			ca.click(driver.findElement(By.xpath("(//th[contains(text(),'Automation')]//following-sibling::td)//input")));
			ca.eleToBeClickable();
		}catch (Exception e) {
			// TODO: handle exception
		}
		ca.click(prp.getFinishBtn());
		ca.eleToBeClickable();
		System.out.println("The Project Item with the name -  "+ProjectName[2]+"-StyleInPrjType is created");

		//verify the tabs for Material type Project
		ca.click(lct.getGlobalSpan());
		ca.eleToBeClickable();
		WebElement a3 = ca.activeElement();
		ca.eleToBeClickable(); 
		ca.insertText(a3, ProjectName[3]);
		ca.eleToBeClickable();
		a3.sendKeys(Keys.ENTER);
		ca.eleToBeClickable();
		ca.eleToBeClickable();
		Commonactions.isElementPresent(prp.getDraftState());
		ca.isElementNotPresent(prp.getItemTab());
		System.out.println("For the - " + ProjectName[3] + " - The Items Tab is not present ");
		ca.isElementPresent(prp.getDocumentsTab());
		System.out.println("For the - " + ProjectName[3] + " - The Documents Tab is present ");
		ca.isElementPresent(prp.getPropertiesTab());
		System.out.println("For the - " + ProjectName[3] + " - The Properties Tab is present ");
		ca.isElementPresent(prp.getTeamTab());
		System.out.println("For the - " + ProjectName[3] + " - The Team Tab is present ");
		ca.isElementPresent(prp.getPresentationTab());
		System.out.println("For the - " + ProjectName[3] + " - The Presentation Tab is present ");
		ca.isElementPresent(prp.getScheduleTab());
		System.out.println("For the - " + ProjectName[3] + " - The Schedule Tab is present ");
		//Verifying the Material functionality
		ca.click(prp.getItemTab());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(prp.getAddItemBtn());
		ca.click(prp.getAddItemBtn());
		ca.eleToBeClickable();
		ca.insertText(prp.getProducttypedrp(),"Material");
		ca.eleToBeClickable();
		ca.click(qp.getNext());
		ca.eleToBeClickable();				
		ca.click(lct.getCottonJersey());
		ca.click(qp.getFinish());
		ca.eleToBeClickable();
		System.out.println("The Project Item with the name - "+ProjectName[3]+"-100% Cotton/Rayon Jersey is created");

		//Verifying the New Material Button
		Commonactions.isElementPresent(prp.getAddItemBtn());
		Commonactions.isElementPresent(prp.getAddItemDDL());
		ca.click(prp.getAddItemDDL());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(prp.getNewMaterialDDL());
		//						 Commonactions.isElementNotPresent(prp.getNewStyleBtn());
		//						 Commonactions.isElementNotPresent(prp.getNewFoodsBtn());
		ca.click(prp.getNewMaterialDDL());
		ca.eleToBeClickable();

		Commonactions.isElementPresent(prp.getMaterialTypeInput());
		ca.click(prp.getMaterialTypeInput());
		ca.insertText(prp.getMaterialTypeInput(),"Fabric - Tool");
		ca.jsMouseOver();
		ca.eleToBeClickable();
		Commonactions.isElementPresent(prp.getMaterialNameInput());
		ca.click(prp.getMaterialNameInput());
		ca.eleToBeClickable();
		ca.insertText(prp.getMaterialNameInput(),"MaterialInPrjType");
		ca.eleToBeClickable();
		Commonactions.isElementPresent(prp.getMaterialCodeInput());
		ca.click(prp.getMaterialCodeInput());
		ca.insertText(prp.getMaterialCodeInput(),"M-001");
		ca.eleToBeClickable();
		ca.save();
		ca.eleToBeClickable();

		System.out.println("The Project Item with the name - "+ProjectName[3]+"-MaterialInPrjType is created");					

		//verify the tabs Where All Product Types are selected 
		ca.click(lct.getGlobalSpan());
		ca.eleToBeClickable();
		WebElement a4 = ca.activeElement();
		ca.eleToBeClickable(); 
		ca.insertText(a4, ProjectName[0]);
		ca.eleToBeClickable();
		a4.sendKeys(Keys.ENTER);
		ca.eleToBeClickable();
		ca.eleToBeClickable();
		Commonactions.isElementPresent(prp.getDraftState());
		ca.isElementPresent(prp.getStylesTab());
		System.out.println("For the - " + ProjectName[0] + " - The Styles Tab is present ");
		ca.isElementPresent(prp.getMaterialsTab());
		System.out.println("For the - " + ProjectName[0] + " - The Materials Tab is present ");
		ca.isElementPresent(prp.getItemTab());
		System.out.println("For the - " + ProjectName[0] + " - The Foods Tab is present ");
		ca.isElementPresent(prp.getDocumentsTab());
		System.out.println("For the - " + ProjectName[0] + " - The Documents Tab is present ");
		ca.isElementPresent(prp.getPropertiesTab());
		System.out.println("For the - " + ProjectName[0] + " - The Properties Tab is present ");
		ca.isElementPresent(prp.getTeamTab());
		System.out.println("For the - " + ProjectName[0] + " - The Team Tab is present ");
		ca.isElementPresent(prp.getPresentationTab());
		System.out.println("For the - " + ProjectName[0] + " - The Presentation Tab is present ");
		ca.isElementPresent(prp.getScheduleTab());
		System.out.println("For the - " + ProjectName[0] + " - The Schedule Tab is present ");
		//Verifying the Materials functionality
		ca.click(prp.getItemTab());
		Commonactions.isElementPresent(prp.getAddItemBtn());
		ca.click(prp.getAddItemBtn());
		ca.eleToBeClickable();
		ca.insertText(prp.getProducttypedrp(),"Material");
		ca.eleToBeClickable();
		ca.click(qp.getNext());
		ca.eleToBeClickable();				
		ca.click(lct.getCottonJersey());
		//				ca.eleToBeClickable();
		ca.click(qp.getFinish());				
		ca.eleToBeClickable();
		System.out.println("The Project Item with the name -  "+ProjectName[0]+"-100% Cotton/Rayon Jersey is created");
		//Verify the Already selected item is disabled now
		Commonactions.isElementPresent(prp.getAddItemBtn());
		ca.click(prp.getAddItemBtn());
		ca.eleToBeClickable();
		ca.insertText(prp.getProducttypedrp(),"Material");
		ca.eleToBeClickable();
		ca.click(qp.getNext());
		ca.eleToBeClickable();				
		ca.elementDisabled(lct.getCottonJersey());
		//				ca.eleToBeClickable();
		ca.click(prp.getCancelButton());
		ca.eleToBeClickable();
		System.out.println("The Already selected item 100% Cotton/Rayon Jersey is disabled"); 	
		//Verifying the New Material Button
		//				 ca.click(prp.getScheduleTab());
		//				 ca.eleToBeClickable();
		//			     ca.click(prp.getMaterialsTab());
		//				 ca.eleToBeClickable();

		Commonactions.isElementPresent(prp.getAddItemBtn());
		Commonactions.isElementPresent(prp.getAddItemDDL());
		ca.click(prp.getAddItemDDL());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(prp.getNewMaterialDDL());
		ca.click(prp.getNewMaterialDDL());
		ca.eleToBeClickable();

		Commonactions.isElementPresent(prp.getMaterialTypeInput());
		ca.click(prp.getMaterialTypeInput());
		ca.insertText(prp.getMaterialTypeInput(),"Fabric - Tool");
		ca.jsMouseOver();
		ca.eleToBeClickable();
		Commonactions.isElementPresent(prp.getMaterialNameInput());
		ca.click(prp.getMaterialNameInput());
		ca.eleToBeClickable();
		ca.insertText(prp.getMaterialNameInput(),"MaterialInPrjTypeAll");
		ca.eleToBeClickable();
		Commonactions.isElementPresent(prp.getMaterialCodeInput());
		ca.click(prp.getMaterialCodeInput());
		ca.insertText(prp.getMaterialCodeInput(),"M-001");
		ca.eleToBeClickable();
		ca.save();
		ca.eleToBeClickable();
		System.out.println("The Project Item with the name -  "+ProjectName[0]+"-MaterialInPrjTypeAll is created");	

		//Verifying the Food functionality
		ca.click(prp.getItemTab());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(prp.getAddItemBtn());
		ca.click(prp.getAddItemBtn());
		ca.eleToBeClickable();
		ca.insertText(prp.getProducttypedrp(),"Food");
		ca.eleToBeClickable();
		ca.click(qp.getNext());
		ca.eleToBeClickable();	
		ca.click(driver.findElement(By.xpath("(//td[contains(text(),'veg pizza')]//preceding-sibling::td)//input")));
		ca.eleToBeClickable();
		ca.click(qp.getFinish());
		ca.eleToBeClickable();
		System.out.println("The Project Item with the name - "+ProjectName[0]+"-Veg Pizza is created");
		//Verify the Already selected item is disabled now
		Commonactions.isElementPresent(prp.getAddItemBtn());
		ca.click(prp.getAddItemBtn());
		ca.eleToBeClickable();
		ca.insertText(prp.getProducttypedrp(),"Food");
		ca.eleToBeClickable();
		ca.click(qp.getNext());
		ca.eleToBeClickable();
		ca.elementDisabled(driver.findElement(By.xpath("(//td[contains(text(),'veg pizza')]//preceding-sibling::td)//input")));
		ca.eleToBeClickable();
		ca.click(prp.getCancelButton());
		ca.eleToBeClickable();
		System.out.println("The Already selected item Veg Pizza is disabled"); 	
		//Verifying the New food Item Button
		//					 ca.click(prp.getScheduleTab());
		//					 ca.eleToBeClickable();
		//				     ca.click(prp.getItemTab());
		//					 ca.eleToBeClickable();

		Commonactions.isElementPresent(prp.getAddItemBtn());
		Commonactions.isElementPresent(prp.getAddItemDDL());
		ca.click(prp.getAddItemDDL());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(prp.getNewFoodsBtn());
		ca.click(prp.getNewFoodsBtn());
		ca.eleToBeClickable();

		Commonactions.isElementPresent(prp.getFoodSubTypeInput());
		ca.click(prp.getFoodSubTypeInput());
		ca.insertText(prp.getFoodSubTypeInput(),"Cat Food");
		ca.eleToBeClickable();
		Commonactions.isElementPresent(prp.getFoodNameInput());
		ca.click(prp.getFoodNameInput());
		ca.insertText(prp.getFoodNameInput(),"Pedigree-All");
		ca.eleToBeClickable();
		ca.save();
		ca.eleToBeClickable();

		System.out.println("The Project Item with the name - "+ProjectName[0]+"-Pedigree-All is created");	


		//Verifying the Style functionality
		ca.click(prp.getItemTab());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(prp.getAddItemBtn());
		ca.click(prp.getAddItemBtn());
		ca.eleToBeClickable();
		ca.insertText(prp.getProducttypedrp(),"Style");
		ca.eleToBeClickable();
		ca.click(qp.getNext());
		ca.eleToBeClickable();				
		ca.click(lct.getApparelOnlySize());
		ca.click(qp.getFinish());
		ca.eleToBeClickable();
		System.out.println("The Project Item with the name - "+ProjectName[0]+"-Apparel - Only Size is created");
		//Verify the Already selected item is disabled now
		Commonactions.isElementPresent(prp.getAddItemBtn());
		ca.click(prp.getAddItemBtn());
		ca.eleToBeClickable();
		ca.insertText(prp.getProducttypedrp(),"Style");
		ca.eleToBeClickable();
		ca.click(qp.getNext());
		ca.eleToBeClickable();				
		ca.click(lct.getApparelOnlySize());
		ca.click(prp.getCancelButton());
		ca.eleToBeClickable();
		System.out.println("The Already selected item 'Apparel - Only Size' is disabled"); 									
		//Verifying the New Style Button
		//						     ca.click(prp.getStylesTab());
		//							 ca.eleToBeClickable();

		Commonactions.isElementPresent(prp.getAddItemBtn());
		Commonactions.isElementPresent(prp.getAddItemDDL());
		ca.click(prp.getAddItemDDL());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(prp.getNewStyleBtn());
		ca.click(prp.getNewStyleBtn());
		ca.eleToBeClickable();

		Commonactions.isElementPresent(prp.getSeasonInput());
		ca.click(prp.getSeasonInput());
		ca.insertText(prp.getSeasonInput(),"winter season");
		ca.jsMouseOver();
		ca.eleToBeClickable();
		Commonactions.isElementPresent(prp.getBrandInput());
		ca.click(prp.getBrandInput());
		ca.insertText(prp.getBrandInput(),"Denim");
		ca.jsMouseOver();
		ca.eleToBeClickable();
		Commonactions.isElementPresent(prp.getDptInput());
		ca.click(prp.getDptInput());
		ca.insertText(prp.getDptInput(),"Mens");
		ca.jsMouseOver();
		ca.eleToBeClickable();
		Commonactions.isElementPresent(prp.getCollectionInput());
		ca.click(prp.getCollectionInput());
		ca.insertText(prp.getCollectionInput(),"Jeans");
		ca.jsMouseOver();
		ca.eleToBeClickable();

		ca.click(prp.getNextBtn());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(prp.getStyleTypeInput());
		ca.click(prp.getStyleTypeInput());
		ca.insertText(prp.getStyleTypeInput(),"Accessories - Only Color");
		ca.eleToBeClickable();
		Commonactions.isElementPresent(prp.getStyleNameInput());
		ca.click(prp.getStyleNameInput());
		ca.insertText(prp.getStyleNameInput(),"StyleInPrjTypeAll");
		ca.eleToBeClickable();
		try{
			ca.click(driver.findElement(By.xpath("(//th[contains(text(),'Automation')]//following-sibling::td)//input")));
			ca.eleToBeClickable();
		}catch (Exception e) {
			// TODO: handle exception
		}
		ca.click(prp.getFinishBtn());
		ca.eleToBeClickable();
		System.out.println("The Project Item with the name - "+ProjectName[0]+"-StyleInPrjTypeAll is created");


	}

	@Then("User Create WBS projects {string},{string}")
	public void user_Create_WBS_projects(String string, String string2) throws Throwable {

		Commonactions.isElementPresent(prp.getWBS_Management());
		ca.click(prp.getWBS_Management());
		Commonactions.isElementPresent(prp.getWBS_Btn());
		ca.click(prp.getWBS_Btn());
		Commonactions.isElementPresent(prp.getWBS_Value());
		ca.insertText(prp.getWBS_Value(),string+" A");
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();

		Commonactions.isElementPresent(prp.getApplicapleTypes());
		ca.click(prp.getApplicapleTypes());
		try{//parallel
			Commonactions.isElementPresent(prp.getEngChn_ChkBX());
			ca.click(prp.getEngChn_ChkBX());
		}catch (Exception e) {
			ca.click(prp.getEngChn_ChkBX1());
		}
		Commonactions.isElementPresent(prp.getMaterial_ChkBx());
		ca.click(prp.getMaterial_ChkBx());
		Commonactions.isElementPresent(prp.getProject_ChkBx());
		ca.click(prp.getProject_ChkBx());
		Commonactions.isElementPresent(prp.getStyle_ChkBx());
		ca.click(prp.getStyle_ChkBx());

		Commonactions.isElementPresent(prp.getSettings());
		ca.click(prp.getSettings());

		System.out.println("Project A created successfully");

		Commonactions.isElementPresent(prp.getWBS_Btn());
		ca.click(prp.getWBS_Btn());
		Commonactions.isElementPresent(prp.getWBS_Value());
		ca.insertText(prp.getWBS_Value(),string+" B");
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();

		Commonactions.isElementPresent(prp.getApplicapleTypes());
		ca.click(prp.getApplicapleTypes());
		Commonactions.isElementPresent(prp.getMaterial_ChkBx());
		ca.click(prp.getMaterial_ChkBx());
		Commonactions.isElementPresent(prp.getStyle_ChkBx());
		ca.click(prp.getStyle_ChkBx());

		Commonactions.isElementPresent(prp.getSettings());
		ca.click(prp.getSettings());

		System.out.println("Project B created successfully");

		Commonactions.isElementPresent(prp.getMilestone_Temp());
		ca.click(prp.getMilestone_Temp());
		Commonactions.isElementPresent(prp.getPrjct_A_ChkBx());
		ca.click(prp.getPrjct_A_ChkBx());
		Commonactions.isElementPresent(prp.getPrjct_B_ChkBx());
		ca.click(prp.getPrjct_B_ChkBx());
		Commonactions.isElementPresent(prp.getSettings());
		ca.click(prp.getSettings());

		Commonactions.isElementPresent(prp.getWBS_Btn());
		ca.click(prp.getWBS_Btn());
		Commonactions.isElementPresent(prp.getWBS_Value());
		ca.insertText(prp.getWBS_Value(),string+" C");
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();

		System.out.println("Project C created successfully");

		Commonactions.isElementPresent(prp.getProjectName_A());
		ca.click(prp.getProjectName_A());

		Commonactions.isElementPresent(prp.getWbs_TaskBtn());
		ca.click(prp.getWbs_TaskBtn());
		Commonactions.isElementPresent(prp.getWBS_TaskValue());
		ca.insertText(prp.getWBS_TaskValue(),string2+" 1");
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();

		Commonactions.isElementPresent(prp.getDuration_1());
		ca.click(prp.getDuration_1());
		WebElement a = ca.activeElement();
		a.sendKeys(Keys.DELETE);
		ca.eleToBeClickable();
		a.sendKeys("4",Keys.TAB);
		ca.eleToBeClickable();

		String curentDate = ca.getCurentDate();
		String[] cd = curentDate.split("/");
		int i = Integer.parseInt(cd[1]);
		int j = i - 2;

		String cdd = string.valueOf(j);
		String date = cd[0]+"/"+cdd+"/"+cd[2];

		WebElement a1 = ca.activeElement();
		a1.sendKeys(curentDate);
		ca.eleToBeClickable();

		Commonactions.isElementPresent(prp.getWbs_TaskBtn());
		ca.click(prp.getWbs_TaskBtn());
		Commonactions.isElementPresent(prp.getWBS_TaskValue());
		ca.insertText(prp.getWBS_TaskValue(),string2+" 2");
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();

		Commonactions.isElementPresent(prp.getDuration_2());
		ca.click(prp.getDuration_2());
		WebElement a2 = ca.activeElement();
		a2.sendKeys(Keys.DELETE);
		ca.eleToBeClickable();
		a2.sendKeys("5",Keys.TAB);
		ca.eleToBeClickable();

		WebElement a3 = ca.activeElement();
		a3.sendKeys(curentDate);
		ca.eleToBeClickable();

		Commonactions.isElementPresent(prp.getStart_Date());
		ca.click(prp.getStart_Date());
		ca.eleToBeClickable();
		ca.click(lct.getCalendarCurrentDate());
		ca.eleToBeClickable();

		Commonactions.isElementPresent(prp.getSearch());
		ca.click(prp.getSearch());
		WebElement b = ca.activeElement();
		ca.eleToBeClickable();
		b.sendKeys("Project B",Keys.ENTER);
		ca.eleToBeClickable();

		Commonactions.isElementPresent(prp.getWbs_TaskBtn());
		ca.click(prp.getWbs_TaskBtn());
		Commonactions.isElementPresent(prp.getWBS_TaskValue());
		ca.insertText(prp.getWBS_TaskValue(),string2+" 1");
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();

		Commonactions.isElementPresent(prp.getWbs_TaskBtn());
		ca.click(prp.getWbs_TaskBtn());
		Commonactions.isElementPresent(prp.getWBS_TaskValue());
		ca.insertText(prp.getWBS_TaskValue(),string2+" 2");
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();

		Commonactions.isElementPresent(prp.getSearch());
		ca.click(prp.getSearch());
		WebElement c = ca.activeElement();
		ca.eleToBeClickable();
		c.sendKeys("Project C",Keys.ENTER);
		ca.eleToBeClickable();

		Commonactions.isElementPresent(prp.getWbs_TaskBtn());
		ca.click(prp.getWbs_TaskBtn());
		Commonactions.isElementPresent(prp.getWBS_TaskValue());
		ca.insertText(prp.getWBS_TaskValue(),string2+" 1");
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();

		Commonactions.isElementPresent(prp.getDuration_1());
		ca.click(prp.getDuration_1());
		WebElement c2 = ca.activeElement();
		c2.sendKeys(Keys.DELETE);
		ca.eleToBeClickable();
		c2.sendKeys("4",Keys.TAB);
		ca.eleToBeClickable();

		WebElement c3 = ca.activeElement();
		c3.sendKeys(curentDate);
		ca.eleToBeClickable();

		Commonactions.isElementPresent(prp.getWbs_TaskBtn());
		ca.click(prp.getWbs_TaskBtn());
		Commonactions.isElementPresent(prp.getWBS_TaskValue());
		ca.insertText(prp.getWBS_TaskValue(),string2+" 2");
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();

		Commonactions.isElementPresent(prp.getDuration_2());
		ca.click(prp.getDuration_2());
		WebElement d2 = ca.activeElement();
		d2.sendKeys(Keys.DELETE);
		ca.eleToBeClickable();
		d2.sendKeys("5",Keys.TAB);
		ca.eleToBeClickable();

		WebElement d3 = ca.activeElement();
		d3.sendKeys(curentDate);
		ca.eleToBeClickable();


		Commonactions.isElementPresent(prp.getStart_Date());
		ca.click(prp.getStart_Date());
		ca.eleToBeClickable();
		ca.click(lct.getCalendarCurrentDate());
		ca.eleToBeClickable();



	}

	@When("User select and start wbs projects in schedule")
	public void user_select_and_start_wbs_projects_in_schedule() throws Throwable {

		Commonactions.isElementPresent(prp.getProjectsinp());
		ca.click(prp.getProjectsinp());
		Commonactions.isElementPresent(prp.getAllProjectsinp());
		ca.click(prp.getAllProjectsinp());
		ca.eleToBeClickable();

		Commonactions.isElementPresent(prp.getAllProducts_name());
		ca.click(prp.getAllProducts_name());
		Commonactions.isElementPresent(prp.getScheduleTab());
		ca.click(prp.getScheduleTab());
		Commonactions.isElementPresent(prp.getSelect_WBS_Btn());
		ca.click(prp.getSelect_WBS_Btn());
		Commonactions.isElementPresent(prp.getA_ChkBx());
		ca.click(prp.getA_ChkBx());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();

		//Assert.assertTrue(driver.findElement(By.xpath("(//span[contains(text(),'1')])[1]")).isDisplayed());

		action();
		Commonactions.isElementPresent(prp.getStart_WBS());
		ca.click(prp.getStart_WBS());
		ca.eleToBeClickable();

		String state = prp.getState().getText();
		System.out.println(state);
	}

	@When("User verify gantt tab is apperaed")
	public void user_verify_gantt_tab_is_apperaed() {

		Commonactions.isElementPresent(prp.getGantt_Tab());
		ca.click(prp.getGantt_Tab());

		System.out.println("Gantt appeared successfully");

	}

	@Then("User validates milestone and deliever reports in project")
	public void user_validates_milestone_and_deliever_reports_in_project() throws Throwable {

		Commonactions.isElementPresent(prp.getProjectsinp());
		ca.click(prp.getProjectsinp());
		Commonactions.isElementPresent(prp.getMilestoneReport_Tab());
		ca.click(prp.getMilestoneReport_Tab());
		Commonactions.isElementPresent(prp.getNoneTab());
		ca.click(prp.getNoneTab());
		ca.eleToBeClickable();
		WebElement a = ca.activeElement();
		ca.eleToBeClickable();
		a.sendKeys(Keys.DELETE);
		ca.eleToBeClickable();
		a.sendKeys("Project A",Keys.ENTER);
		ca.eleToBeClickable();
		ca.eleToBeClickable();
		List<WebElement> dates = prp.getDates();
		for (WebElement x : dates) {

			System.out.println(x.getText());

		}

		//Assert.assertTrue(prp.getStar().isDisplayed());

		Commonactions.isElementPresent(prp.getMilestoneViews());
		ca.click(prp.getMilestoneViews());
		Commonactions.isElementPresent(prp.getMilestoneSave());
		ca.click(prp.getMilestoneSave());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();

		Commonactions.isElementPresent(prp.getDelieverReport_Tab());
		ca.click(prp.getDelieverReport_Tab());

		//Assert.assertTrue(driver.findElement(By.xpath("//a[text()='Task 1']")).isDisplayed());

		System.out.println("Validated milestone & delievery reports successfully");

	}



	@Then("user clicks Allproject under project and setup manageviews")
	public void user_clicks_Allproject_under_project_and_setup_manageviews() {

		navigateallproject();
		Commonactions.isElementPresent(prp.getItemview());
		ca.click(prp.getItemview());
		Commonactions.isElementPresent(prp.getItemamanage());
		ca.click(prp.getItemamanage());
		Commonactions.isElementPresent(up.getUsrMgmt_Copy());
		ca.click(up.getUsrMgmt_Copy());
		Commonactions.isElementPresent(up.getUsrMgmt_Copy_Value());
		ca.insertText(up.getUsrMgmt_Copy_Value(), "AllItem-copy");
		Commonactions.isElementPresent(prp.getProjectitem());
		ca.click(prp.getProjectitem());
		Commonactions.isElementPresent(prp.getProjecctcolor());
		ca.click(prp.getProjecctcolor());
		Commonactions.isElementPresent(mp.getAdd());
		ca.click(mp.getAdd());
		Commonactions.isElementPresent(prp.getProjectsku());
		ca.click(prp.getProjectsku());
		Commonactions.isElementPresent(prp.getBasesku());
		ca.click(prp.getBasesku());
		Commonactions.isElementPresent(mp.getAdd());
		ca.click(mp.getAdd());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		System.out.println("manage view modified in Items - Properties");

	}

	@Then("user select MaterialInprojectType modify manageview and select colorways and sku")
	public void user_select_MaterialInprojectType_modify_manageview_and_select_colorways_and_sku() throws Throwable {

		navigateallproject();
		Commonactions.isElementPresent(prp.getMaterialInPrjTypeAll());
		ca.click(prp.getMaterialInPrjTypeAll());
		Commonactions.isElementPresent(prp.getMaterialTab());
		ca.click(prp.getMaterialTab());
		Commonactions.isElementPresent(prp.getPropertiesTab());
		ca.click(prp.getPropertiesTab());
		Commonactions.isElementPresent(prp.getMAtPropertview());
		ca.click(prp.getMAtPropertview());
		Commonactions.isElementPresent(prp.getMATPropManageview());
		ca.click(prp.getMATPropManageview());
		Commonactions.isElementPresent(up.getUsrMgmt_Copy());
		ca.click(up.getUsrMgmt_Copy());
		Commonactions.isElementPresent(up.getUsrMgmt_Copy_Value());
		ca.insertText(up.getUsrMgmt_Copy_Value(), "Material-copy");
		Commonactions.isElementPresent(prp.getProjects());
		ca.click(prp.getProjects());
		Commonactions.isElementPresent(mp.getAdd());
		ca.click(mp.getAdd());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();

		Commonactions.isElementPresent(prp.getMatPdtColorExp());
		ca.click(prp.getMatPdtColorExp());
		Commonactions.isElementPresent(prp.getNewfromcolorspf());
		ca.click(prp.getNewfromcolorspf());
		ca.eleToBeClickable();
		String text = prp.getDisplayItems().getText();
		String ss = text.substring(11, 13);
		String tt = ss.trim();
		int p = Integer.parseInt(tt);
		Commonactions.isElementPresent(prp.getColorspecification());
		ca.click(prp.getColorspecification());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();

		for(int i=0;i<p;i++)
		{
			Commonactions.isElementPresent(mp.getSave_btn1());
			ca.click(mp.getSave_btn1());
			ca.eleToBeClickable();
		}
		Commonactions.isElementPresent(prp.getSKUTab());
		ca.click(prp.getSKUTab());
		Commonactions.isElementPresent(prp.getMATSKUBtn());
		ca.click(prp.getMATSKUBtn());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		System.out.println("manage view modified in MaterialInPrjTypeAll");

		Commonactions.isElementPresent(in.getHomeArrowIcon());
		ca.click(in.getHomeArrowIcon());
		Commonactions.isElementPresent(in.getSelectlastview());
		ca.click(in.getSelectlastview());
	}

	@Then("user select StyleInprojectType modify manageview and select colorways and sku")
	public void user_select_StyleInprojectType_modify_manageview_and_select_colorways_and_sku() throws Throwable {

		Commonactions.isElementPresent(prp.getItemTab());
		ca.click(prp.getItemTab());
		Commonactions.isElementPresent(prp.getStyleInPrjTypeAll());
		ca.click(prp.getStyleInPrjTypeAll());
		Commonactions.isElementPresent(prp.getPropertiesTab());
		ca.click(prp.getPropertiesTab());
		Commonactions.isElementPresent(prp.getStylePropView());
		ca.click(prp.getStylePropView());
		Commonactions.isElementPresent(prp.getStylemanageview());
		ca.click(prp.getStylemanageview());
		Commonactions.isElementPresent(up.getUsrMgmt_Copy());
		ca.click(up.getUsrMgmt_Copy());
		Commonactions.isElementPresent(up.getUsrMgmt_Copy_Value());
		ca.insertText(up.getUsrMgmt_Copy_Value(), "Style-copy");
		Commonactions.isElementPresent(prp.getProjects());
		ca.click(prp.getProjects());
		Commonactions.isElementPresent(mp.getAdd());
		ca.click(mp.getAdd());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());

		Commonactions.isElementPresent(prp.getColorwaystab());
		ca.click(prp.getColorwaystab());
		Commonactions.isElementPresent(prp.getStylecolorwaybtn());
		ca.click(prp.getStylecolorwaybtn());
		Commonactions.isElementPresent(prp.getNewfromcolorspf());
		ca.click(prp.getNewfromcolorspf());
		String text = prp.getDisplayItems().getText();
		String ss = text.substring(11, 13);
		String tt = ss.trim();
		int p = Integer.parseInt(tt);
		Commonactions.isElementPresent(prp.getStylecolorspecf());
		ca.click(prp.getStylecolorspecf());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();

		for(int i=0;i<p;i++)
		{
			Commonactions.isElementPresent(mp.getSave_btn1());
			ca.click(mp.getSave_btn1());
			ca.eleToBeClickable();
		}
		Commonactions.isElementPresent(prp.getSKUTab());
		ca.click(prp.getSKUTab());
		Commonactions.isElementPresent(prp.getStyleSKUBtn());
		ca.click(prp.getStyleSKUBtn());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		System.out.println("manage view modified in StyleInPrjTypeAll");
		Commonactions.isElementPresent(in.getHomeArrowIcon());
		ca.click(in.getHomeArrowIcon());
		Commonactions.isElementPresent(in.getSelectlastview());
		ca.click(in.getSelectlastview());
		ca.eleToBeClickable();
	}

	@Then("user select Project SKU and project color for MaterialInprojectType and StyleInprojectType")
	public void user_select_Project_SKU_and_project_color_for_MaterialInprojectType_and_StyleInprojectType() throws Throwable {

		Commonactions.isElementPresent(prp.getItemTab());
		ca.click(prp.getItemTab());
		Commonactions.isElementPresent(prp.getMaterialdoticon());
		ca.click(prp.getMaterialdoticon());
		ca.eleToBeClickable();
		selectprojectsku();
		Commonactions.isElementPresent(prp.getMaterialskuchkbox());
		ca.click(prp.getMaterialskuchkbox());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(prp.getMaterialdoticon());
		ca.click(prp.getMaterialdoticon());
		ca.eleToBeClickable();
		selectprojectcolor();
		Commonactions.isElementPresent(prp.getMaterialcolorchkbox());
		ca.click(prp.getMaterialcolorchkbox());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();

		Commonactions.isElementPresent(prp.getStyledoticon());
		ca.click(prp.getStyledoticon());
		ca.eleToBeClickable();
		selectprojectsku();
		Commonactions.isElementPresent(prp.getStyleskuchkbox());
		ca.click(prp.getStyleskuchkbox());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(prp.getStyledoticon());
		ca.click(prp.getStyledoticon());
		ca.eleToBeClickable();
		selectprojectcolor();
		Commonactions.isElementPresent(prp.getStylecolorchkbox());
		ca.click(prp.getStylecolorchkbox());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		System.out.println("Sku and color added for style and material");

	}

	@Then("user copies Material and style in AllProject")
	public void user_copies_Material_and_style_in_AllProject() throws Throwable {

		Commonactions.isElementPresent(prp.getMaterialcopy());
		ca.click(prp.getMaterialcopy());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();

		Commonactions.isElementPresent(prp.getStylecopy());
		ca.click(prp.getStylecopy());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		System.out.println("Material and style sopied under Allproduct project");

		Commonactions.isElementPresent(prp.getMaterialInPrjTypeAll());
		ca.click(prp.getMaterialInPrjTypeAll());
		Commonactions.isElementPresent(prp.getPropertiesTab());
		ca.click(prp.getPropertiesTab());
		System.out.println("Project has same count in material");
		Commonactions.isElementPresent(in.getHomeArrowIcon());
		ca.click(in.getHomeArrowIcon());
		Commonactions.isElementPresent(in.getSelectlastview());
		ca.click(in.getSelectlastview());
		ca.eleToBeClickable();

		Commonactions.isElementPresent(prp.getStyleInPrjTypeAll());
		ca.click(prp.getStyleInPrjTypeAll());
		Commonactions.isElementPresent(prp.getPropertiesTab());
		ca.click(prp.getPropertiesTab());
		System.out.println("Project has same count in style");
		Commonactions.isElementPresent(in.getHomeArrowIcon());
		ca.click(in.getHomeArrowIcon());
		Commonactions.isElementPresent(in.getSelectlastview());
		ca.click(in.getSelectlastview());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(prp.getItemTab());
		ca.click(prp.getItemTab());
	}

	@Then("user clicks Allproject under project and navigates to DocumentTab  {string}")
	public void user_clicks_Allproject_under_project_and_navigates_to_DocumentTab(String DocName) throws Throwable {

		navigateallproject();
		Commonactions.isElementPresent(prp.getDocumentsTab());
		ca.click(prp.getDocumentsTab());
		Commonactions.isElementPresent(prp.getNewdocexpbtn());
		ca.click(prp.getNewdocexpbtn());
		Commonactions.isElementPresent(prp.getNewdocument());
		ca.click(prp.getNewdocument());

		ca.eleToBeClickable();
		WebElement a1 = ca.activeElement();
		ca.eleToBeClickable(); 
		ca.insertText(a1, DocName);
		ca.eleToBeClickable();
		a1.sendKeys(Keys.TAB);
		ca.eleToBeClickable();	
		System.out.println("New Doc Created in All product project");

	}

	@Then("user share and validate the document {string}")
	public void user_share_and_validate_the_document(String ProjectName) throws Throwable {

		String[] PjctName = ProjectName.split(",");
		Commonactions.isElementPresent(prp.getDocdoticon());
		ca.click(prp.getDocdoticon());
		Commonactions.isElementPresent(prp.getSharedoc());
		ca.click(prp.getSharedoc());
		Commonactions.isElementPresent(prp.getSharematerialchkbox());
		ca.click(prp.getSharematerialchkbox());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();

		Commonactions.isElementPresent(prp.getClickicon());
		ca.click(prp.getClickicon());
		ca.eleToBeClickable();
		WebElement a2 = ca.activeElement();
		ca.eleToBeClickable(); 
		ca.insertText(a2, PjctName[0]);
		ca.eleToBeClickable();
		a2.sendKeys(Keys.ENTER);
		ca.eleToBeClickable();

		Commonactions.isElementPresent(prp.getAllprjdoc());
		String text = prp.getAllprjdoc().getText();
		System.out.println(text +"   shared document verified in Material");

		Commonactions.isElementPresent(prp.getClickicon());
		ca.click(prp.getClickicon());
		ca.eleToBeClickable();
		WebElement a3 = ca.activeElement();
		ca.eleToBeClickable(); 
		ca.insertText(a3, PjctName[1]);
		ca.eleToBeClickable();
		a3.sendKeys(Keys.ENTER);
		ca.eleToBeClickable();
	}

	@Then("user Navigates into user management under configuration {string}")
	public void user_Navigates_into_user_management_under_configuration(String shareteam) throws Throwable {
		String[] shareteamvalue = shareteam.split(",");
		Commonactions.isElementPresent(hp.getUser_settingsBtn());
		ca.click(hp.getUser_settingsBtn());
		Commonactions.isElementPresent(hp.getSystem_config());
		ca.click(hp.getSystem_config());
		Commonactions.isElementPresent(up.getUsrManagement());
		ca.click(up.getUsrManagement());
		Commonactions.isElementPresent(up.getSharedteamtab());
		ca.click(up.getSharedteamtab());
		Commonactions.isElementPresent(up.getNewsharedbtn());
		ca.click(up.getNewsharedbtn());
		Commonactions.isElementPresent(up.getSharedname());
		ca.insertText(up.getSharedname(), shareteamvalue[0]);
		Commonactions.isElementPresent(up.getSharedtype());
		ca.insertText(up.getSharedtype(), shareteamvalue[1]);
		ca.jsMouseOver();
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		System.out.println("created Project Shared Team in user management");

		Commonactions.isElementPresent(in.getHomeArrowIcon());
		ca.click(in.getHomeArrowIcon());
		Commonactions.isElementPresent(in.getSelectlastview());
		ca.click(in.getSelectlastview());
		ca.eleToBeClickable();
		System.out.println("navigates to All Project");

	}

	@Then("user moves into AllProject and Manage Team")
	public void user_moves_into_AllProject_and_Manage_Team() throws Throwable {

		Commonactions.isElementPresent(prp.getTeamTab());
		ca.click(prp.getTeamTab());
		Commonactions.isElementPresent(prp.getTeamtoolbar());
		ca.click(prp.getTeamtoolbar());
		Commonactions.isElementPresent(prp.getNewshareteambtn());
		ca.click(prp.getNewshareteambtn());
		Commonactions.isElementPresent(prp.getShareprojectchkbox());
		ca.click(prp.getShareprojectchkbox());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		System.out.println("shared project added under teams");

		Commonactions.isElementPresent(prp.getTeamtoolbar());
		ca.click(prp.getTeamtoolbar());
		Commonactions.isElementPresent(pp.getDelete_Btn());
		ca.click(pp.getDelete_Btn());
		ca.eleToBeClickable();
		System.out.println("shared project added under teams");

	}

	@Then("user verify the summary in Presentation Tab")
	public void user_verify_the_summary_in_Presentation_Tab() {

		Commonactions.isElementPresent(prp.getPresentationTab());
		ca.click(prp.getPresentationTab());
		Commonactions.isElementPresent(prp.getPresentationtoolbar());
		ca.click(prp.getPresentationtoolbar());
		System.out.println("summary present in presentation tab");
	}

	public void selectprojectsku()
	{
		List<WebElement> num = driver.findElements(By.xpath("//td[text()='Select SKUs']"));
		for(int i=1;i<=num.size();i++)
		{
			WebElement sku = driver.findElement(By.xpath("(//td[text()='Select SKUs'])["+i+"]"));
			boolean displayed = sku.isDisplayed();
			if(displayed==true)
			{
				ca.click(sku);
				break;
			}}	
	}

	public void selectprojectcolor()
	{
		List<WebElement> num = driver.findElements(By.xpath("//td[text()='Select Project Colors']"));
		for(int i=1;i<=num.size();i++)
		{
			WebElement clr = driver.findElement(By.xpath("(//td[text()='Select Project Colors'])["+i+"]"));
			boolean displayed = clr.isDisplayed();
			if(displayed==true)
			{
				ca.click(clr);
				break;
			}}	
	}

	public void navigateallproject()
	{
		Commonactions.isElementPresent(hp.getUser_homeBtn());
		ca.click(hp.getUser_homeBtn());
		Commonactions.isElementPresent(hp.getUser_homeBtn());
		ca.click(hp.getUser_homeBtn());
		Commonactions.isElementPresent(prp.getProjectsTab());
		ca.click(prp.getProjectsTab());
		Commonactions.isElementPresent(prp.getAllProjectsTab());
		ca.click(prp.getAllProjectsTab());
		Commonactions.isElementPresent(prp.getAllProducts_name());
		ca.click(prp.getAllProducts_name());
		Commonactions.isElementPresent(prp.getItemTab());
		ca.click(prp.getItemTab());
		System.out.println("Navigates into Project -> Allproduct project -> ItemTab");
	}


	@Then("user navigates into AllProject-Item tab and edits manageview")
	public void user_navigates_into_AllProject_Item_tab_and_edits_manageview() {

		navigateallproject();
		Commonactions.isElementPresent(prp.getItemview());
		ca.click(prp.getItemview());		
		List<WebElement> num = driver.findElements(By.xpath("//tr[contains(@data-csi-automation,'Project-Items-CustomViewManage')]//td[text()='Manage Views']"));
		for(int i=1;i<=num.size();i++)
		{
			WebElement mv = driver.findElement(By.xpath("(//tr[contains(@data-csi-automation,'Project-Items-CustomViewManage')]//td[text()='Manage Views'])["+i+"]"));
			boolean displayed = mv.isDisplayed();
			if(displayed==true)
			{
				ca.click(mv);
				break;
			}}	
		Commonactions.isElementPresent(up.getUsrMgmt_Copy());
		ca.click(up.getUsrMgmt_Copy());
		Commonactions.isElementPresent(up.getUsrMgmt_Copy_Value());
		ca.insertText(up.getUsrMgmt_Copy_Value(), "AllItem-copy2");
		Commonactions.isElementPresent(prp.getAssignedProdSupp());
		ca.click(prp.getAssignedProdSupp());
		Commonactions.isElementPresent(mp.getAdd());
		ca.click(mp.getAdd());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		System.out.println("manage view modified in Items for product supplier");

	}

	@Then("Navigates into Material-BaseProduct selects the supplier user in supplier quotes")
	public void navigates_into_Material_BaseProduct_selects_the_supplier_user_in_supplier_quotes() throws Throwable {
		Commonactions.isElementPresent(prp.getMaterialproduct());
		ca.click(prp.getMaterialproduct());
		Commonactions.isElementPresent(hp.getSourcingBtn());
		ca.click(hp.getSourcingBtn());
		Commonactions.isElementPresent(prp.getProdSupplier());
		ca.click(prp.getProdSupplier());
		Commonactions.isElementPresent(prp.getNewfromsupplier());
		ca.click(prp.getNewfromsupplier());
		Commonactions.isElementPresent(prp.getHuckleberrychkbox());
		ca.click(prp.getHuckleberrychkbox());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());

		Commonactions.isElementPresent(sp.getSupplierquotes());
		ca.click(sp.getSupplierquotes());
		Commonactions.isElementPresent(prp.getDesignatesProdSrc());
		ca.click(prp.getDesignatesProdSrc());
		ca.eleToBeClickable();
		WebElement a = ca.activeElement();
		ca.eleToBeClickable();
		a.sendKeys("Huc");
		ca.eleToBeClickable();
		ca.jsMouseOver();
		ca.eleToBeClickable();

	}

	@And("Add the supplier user in AllProject-Item-Material moves from DRAFT to INPROGRESS")
	public void add_the_supplier_user_in_AllProject_Item_Material_moves_from_DRAFT_to_INPROGRESS() throws Throwable {
		navigateallproject();

		for (int i = 0; i <70; i++) {
			driver.findElement(By.xpath("//div[contains(@class,'Items')]//span[text()='+']/parent::div")).click();
		}
		Commonactions.isElementPresent(prp.getMatProdSrc());
		ca.click(prp.getMatProdSrc());
		Commonactions.isElementPresent(prp.getMatProdSuppvalue());
		ca.click(prp.getMatProdSuppvalue());
		driver.findElement(By.xpath("//div[contains(@class,'Items')]//span[text()='+']/parent::div")).click();
		ca.eleToBeClickable();
		Commonactions.isElementPresent(prp.getDRAFTFWD());
		ca.click(prp.getDRAFTFWD());
		ca.eleToBeClickable();

	}

	@Then("Logout from Admin user and Login as supplier user")
	public void logout_from_Admin_user_and_Login_as_supplier_user() {

		Commonactions.isElementPresent(prp.getLogouticon());
		ca.click(prp.getLogouticon());
		Commonactions.isElementPresent(prp.getLogout());
		ca.click(prp.getLogout());	

		Commonactions.isElementPresent(lp.getUsername());
		ca.insertText(lp.getUsername(), "h1");
		ca.insertText(lp.getPassword(), "centric8");
		ca.clickjs(lp.getLogin());

		System.out.println("logged in as Supplier user");
		Commonactions.isElementPresent(hp.getUser_homeBtn());
		ca.click(hp.getUser_homeBtn());
		Commonactions.isElementPresent(hp.getUser_homeBtn());
		ca.click(hp.getUser_homeBtn());
	}

	@And("user verfiy the Project tab with material realted values")
	public void user_verfiy_the_Project_tab_with_material_realted_values() {

		Commonactions.isElementPresent(hp.getUser_homeBtn());
		ca.click(hp.getUser_homeBtn());
		Commonactions.isElementPresent(hp.getUser_homeBtn());
		ca.click(hp.getUser_homeBtn());
		Commonactions.isElementPresent(prp.getProjectsTab());
		ca.click(prp.getProjectsTab());


	}

	@Then("Logout from Supplier user and Login as Admin user")
	public void logout_from_Supplier_user_and_Login_as_Admin_user() {
		Commonactions.isElementPresent(prp.getLogouticon());
		ca.click(prp.getLogouticon());
		Commonactions.isElementPresent(prp.getLogout());
		ca.click(prp.getLogout());	

		Commonactions.isElementPresent(lp.getUsername());
		ca.insertText(lp.getUsername(), "Administrator");
		ca.insertText(lp.getPassword(), "centric8");
		ca.clickjs(lp.getLogin());

		System.out.println("logged in as Admin user");
		Commonactions.isElementPresent(hp.getUser_homeBtn());
		ca.click(hp.getUser_homeBtn());
		Commonactions.isElementPresent(hp.getUser_homeBtn());
		ca.click(hp.getUser_homeBtn());

	}

	@Then("Admin user changes the INPROGRESS to COMPLETE")
	public void admin_user_changes_the_INPROGRESS_to_COMPLETE() {
		navigateallproject();
		Commonactions.isElementPresent(prp.getMaterialedit());
		ca.click(prp.getMaterialedit());
		Commonactions.isElementPresent(prp.getItemeditvalue());
		prp.getItemeditvalue().sendKeys("1");
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());

	}

	@Then("Admin user changes the COMPLETE to DRAFT")
	public void admin_user_changes_the_COMPLETE_to_DRAFT() {
		navigateallproject();
		Commonactions.isElementPresent(prp.getCompletedFWD());
		ca.click(prp.getCompletedFWD());
		Commonactions.isElementPresent(prp.getCompletedBWD());
		ca.click(prp.getCompletedBWD());
		Commonactions.isElementPresent(prp.getCloseProject());
		ca.click(prp.getCloseProject());
		Commonactions.isElementPresent(prp.getBacktoDraft());
		ca.click(prp.getBacktoDraft());

	}

	@And("user verfiy the Project tab with material realted values should not present")
	public void user_verfiy_the_Project_tab_with_material_realted_values_should_not_present() {

		Commonactions.isElementPresent(hp.getUser_homeBtn());
		ca.click(hp.getUser_homeBtn());
		Commonactions.isElementPresent(hp.getUser_homeBtn());
		ca.click(hp.getUser_homeBtn());
		Commonactions.isElementPresent(prp.getProjectsTab());
		ca.click(prp.getProjectsTab());
	}

	public void action()
	{
		List<WebElement> num = driver.findElements(By.xpath("//span[contains(text(),'Actions')]"));
		for(int i=1;i<=num.size();i++)
		{
			WebElement action = driver.findElement(By.xpath("(//span[contains(text(),'Actions')])["+i+"]"));
			boolean displayed = action.isDisplayed();
			if(displayed==true)
			{
				ca.click(action);
				break;
			}}
	}
}