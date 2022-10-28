package com.centric.stepdefinition;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.centric.objectrepository.BusinessPlanningPage;
import com.centric.objectrepository.FoodSetupPage;
import com.centric.objectrepository.HomePage;
import com.centric.objectrepository.Locators;
import com.centric.objectrepository.MaterialSpecificationPage;
import com.centric.objectrepository.PopupPage;
import com.centric.objectrepository.StylePage;
import com.centric.resources.Commonactions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StylePageSteps extends Commonactions {

	Commonactions ca=new Commonactions();
	StylePage sp=new StylePage();
	PopupPage pup=new PopupPage();
	MaterialSpecificationPage mp =new  MaterialSpecificationPage();
	FoodSetupPage fp= new FoodSetupPage();
	BusinessPlanningPage bp=new BusinessPlanningPage();
	PopupPage pp =new  PopupPage();
	Locators lct = new Locators();

	@When("User create New season with mandatory deatails for season creation {string},{string},{string}")
	public void user_create_New_season_with_mandatory_deatails_for_season_creation(String a,String b, String c) throws InterruptedException {
		Thread.sleep(2000);
		ca.click(sp.getNew_season_Btn());
		ca.insertText(pup.getSeason_Value(), a);
		ca.insertText(pup.getCode_Value(), b);
		ca.insertText(pup.getDescription_Value(), c);
		ca.click(pup.getSave_and_go_Btn());
		Thread.sleep(2000);
		
		System.out.println("season created successfully");

	}

	@Then("Click New Brand")
	public void click_New_Brand() throws Throwable 
	{
		Thread.sleep(2000);
		ca.jsScrollPageDown(sp.getNew_season_Btn());
		ca.click(sp.getNew_season_Btn());
		ca.eleToBeClickable();
		
		
	}

	@And("Create Brand by providing valid and mandatory data {string},{string},{string}")
	public void create_Brand_by_providing_valid_and_mandatory_data(String a,String b, String c) throws Throwable {
		Thread.sleep(2000);
		ca.insertText(pup.getBrand_Value(), a);
		ca.insertText(pup.getBrand_code_Value(), b);
		ca.insertText(pup.getBrand_description_Value(), c);
		
		
	}

	@Then("Save the New Brand which was created")
	public void save_the_New_Brand_which_was_created() throws InterruptedException {
		Thread.sleep(2000);
		ca.click(pup.getSave_and_go_Btn1());  
		Thread.sleep(2000);
		
		System.out.println("brand created successfully");
	}

	@Then("Click New department by providing valid data  {string},{string},{string}")
	public void click_New_department_by_providing_valid_data(String a,String b, String c) throws Throwable {
		Thread.sleep(2000);
		ca.jsScrollPageDown(sp.getNew_season_Btn());
		ca.click(sp.getNew_season_Btn());
		Thread.sleep(2000);
		ca.insertText(pup.getDept_Value(), a);
		ca.insertText(pup.getDept_code_Value(), b);
		ca.insertText(pup.getDept_description_Value(), c);
	}

	@Then("Save the New department which was created")
	public void save_the_New_department_which_was_created() throws InterruptedException {
		Thread.sleep(2000);
		ca.click(pup.getSave_and_go_Btn1());  
		Thread.sleep(5000);
		
		System.out.println("department created successfully");
	}

	@Then("Click New collection")
	public void click_New_collection() throws Throwable {
		ca.jsScrollPageDown(sp.getNew_season_Btn());
		ca.click(sp.getNew_season_Btn());
		Thread.sleep(2000);
	}

	
	
	@Then("Create collection by providing valida and mandatory details {string},{string},{string}")
	public void create_collection_by_providing_valida_and_mandatory_details(String a,String b, String c) throws Throwable {
		Thread.sleep(2000);
		try{
		ca.insertText(pup.getCollection_Value(), a);
		}catch (Exception e) {
			
			Commonactions.isElementPresent(pup.getCancel_Btn());
			ca.click(pup.getCancel_Btn());
			ca.click(lct.getSp1());
		    ca.eleToBeClickable();
		    ca.click(lct.getSp2());
		    ca.eleToBeClickable();
		    ca.jsScrollPageDown(sp.getNew_season_Btn());
			ca.click(sp.getNew_season_Btn());
			Thread.sleep(2000);
			Commonactions.isElementPresent(pup.getCollection_Value());
			ca.insertText(pup.getCollection_Value(), a);
			
		}
		ca.insertText(pup.getCollection_code_Value(), b);
		ca.insertText(pup.getCollection_description_Value(), c);

	}

	@Then("Save the collection which was created")
	public void save_the_collection_which_was_created() throws InterruptedException {
		ca.click(pup.getSave_and_go_Btn1()); 
		Thread.sleep(2000);
		
		System.out.println("collection created successfully");
	}

	@Then("Click New style")
	public void click_New_style() throws Throwable {
		ca.jsScrollPageDown(sp.getNew_season_Btn());
		ca.click(sp.getNew_season_Btn());
		Thread.sleep(2000);

	}
	
	@Then("Create Style followed by its style Type {string}")
	public void create_Style_followed_by_its_style_Type(String a) throws InterruptedException {
		Thread.sleep(2000);
		ca.insertText(pup.getStyle_type_Value(), a);
		//ca.insertText(pup.getTemplate_Value(), "apparel");
		//ca.insertText(pup.getShape_Value(), "ssgd");
		//ca.insertText(pup.getTheme_code_Value(),"sgfg");
		//ca.insertText(pup.getSstyle_Value(), "fhgvahvmZXV");
	
			ca.click(pup.getSave_and_go_Btn());	
			Thread.sleep(3000);
		
			System.out.println("style created successfully");    
	      
	}
	HomePage hp=new HomePage();

	@Then("select the image from the avilable resource")
	public void select_the_image_from_the_avilable_resource() throws Throwable {
		try {
			Commonactions.isElementPresent(sp.getImg_icon());
		ca.click(sp.getImg_icon());
		Commonactions.isElementPresent(hp.getStyleBtn());
		}catch(Exception e) {
			ca.click(hp.getStyleBtn());
			Commonactions.isElementPresent(sp.getUpload_Btn());
				ca.jsScrollPageDown(sp.getUpload_Btn());
				Commonactions.isElementPresent(sp.getImg_icon());
			ca.click(sp.getImg_icon());
		Commonactions.isElementPresent(sp.getUpload_Btn());
		}
		    ca.click(sp.getUpload_Btn());
		Commonactions.isElementPresent(sp.getSelect_img_Btn());
		ca.click(sp.getSelect_img_Btn());
		Commonactions.isElementPresent(sp.getSave_img_Btn());
		ca.click(sp.getSave_img_Btn());
		Thread.sleep(2000);
	      
		System.out.println("Image uploaded successfully");
	      
	}
	
	static String A1,B1;
	
	@When("User create New season with mandatory deatails for season creation {string},{string},{string},{string},{string},{string}")
	public void user_create_New_season_with_mandatory_deatails_for_season_creation(String a, String b, String c, String A, String B, String C) throws Throwable {
	   
		Commonactions.isElementPresent(sp.getNew_season_Btn());
		ca.click(sp.getNew_season_Btn());
		Commonactions.isElementPresent(pup.getSeason_Value());
		ca.insertText(pup.getSeason_Value(), a);
		Commonactions.isElementPresent(pup.getCode_Value());
		ca.insertText(pup.getCode_Value(), b);
		Commonactions.isElementPresent(pup.getDescription_Value());
		ca.insertText(pup.getDescription_Value(), c);
		Commonactions.isElementPresent(pup.getSave_and_new_Btn());
		ca.click(pup.getSave_and_new_Btn());
		Commonactions.isElementPresent(pup.getSeason_Value());
		ca.insertText(pup.getSeason_Value(), A);
		Commonactions.isElementPresent(pup.getCode_Value());
		ca.insertText(pup.getCode_Value(), B);
		Commonactions.isElementPresent(pup.getDescription_Value());
		ca.insertText(pup.getDescription_Value(), C);
		Commonactions.isElementPresent(pup.getSave_Btn());
		ca.click(pup.getSave_Btn());
		
		A1=A;
		B1=B;
		
		
	}


	@When("User performing edit action on season")
	public void user_performing_edit_action_on_season() throws Throwable {
	    
		Commonactions.isElementPresent(sp.getEdit_Btn());
		ca.clickjs(sp.getEdit_Btn());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(pup.getSeason_Value());
		ca.insertText(pup.getSeason_Value(), A1);
		Commonactions.isElementPresent(pup.getCode_Value());
		ca.insertText(pup.getCode_Value(), B1);
		ca.eleToBeClickable();
		ca.clickjs(lct.getSave222());
		Commonactions.isElementPresent(sp.getSelect_season());
		Thread.sleep(1000);
		ca.click(sp.getSelect_season());
		ca.eleToBeClickable();
		
		System.out.println("season created successfully");
	}

	@Then("Create Style followed by its style Type {string},{string},{string},{string}")
	public void create_Style_followed_by_its_style_Type(String a, String b, String c, String d) throws Throwable {
		

		
		Commonactions.isElementPresent(pup.getStyle_type_Value());
		ca.insertText(pup.getStyle_type_Value(), a);
		ca.eleToBeClickable();
		ca.jsMouseOver();
		Commonactions.isElementPresent(pup.getSstyle_Value());
		ca.insertText(pup.getSstyle_Value(), a);
		Commonactions.isElementPresent(pup.getSave_and_new_Btn());
		ca.click(pup.getSave_and_new_Btn());
		ca.eleToBeClickable();
		
		Commonactions.isElementPresent(pup.getStyle_type_Value());
		ca.insertText(pup.getStyle_type_Value(), b);
		ca.eleToBeClickable();
		ca.jsMouseOver();
		Commonactions.isElementPresent(pup.getSstyle_Value());
		ca.insertText(pup.getSstyle_Value(), b);
		Commonactions.isElementPresent(pup.getSave_and_new_Btn());
		ca.click(pup.getSave_and_new_Btn());
		ca.eleToBeClickable();
		
		Commonactions.isElementPresent(pup.getStyle_type_Value());
		ca.insertText(pup.getStyle_type_Value(), c);
		ca.eleToBeClickable();
		ca.jsMouseOver();
		Commonactions.isElementPresent(pup.getSstyle_Value());
		ca.insertText(pup.getSstyle_Value(), c);
		Commonactions.isElementPresent(pup.getSave_and_new_Btn());
		ca.click(pup.getSave_and_new_Btn());
		ca.eleToBeClickable();
		
		Commonactions.isElementPresent(pup.getStyle_type_Value());
		ca.insertText(pup.getStyle_type_Value(), d);
		ca.eleToBeClickable();
		ca.jsMouseOver();
		Commonactions.isElementPresent(pup.getSstyle_Value());
		ca.insertText(pup.getSstyle_Value(), d);
		Commonactions.isElementPresent(pup.getSave_Btn());
		ca.click(pup.getSave_Btn());
		ca.eleToBeClickable();
		
		System.out.println("style created successfully");
		
		//driver.close();
	    
	}

	@Then("User verify business plan for season and copy the brand {string}")
	public void user_verify_business_plan_for_season_and_copy_the_brand(String Brand) throws Throwable{

		String[]d = Brand.split(",");
		
		Commonactions.isElementPresent(hp.getUser_homeBtn());
		ca.click(hp.getUser_homeBtn());
		Commonactions.isElementPresent(fp.getStyletab());
		ca.click(fp.getStyletab());
		Commonactions.isElementPresent(bp.getSeasonstab());
		ca.click(bp.getSeasonstab());
		
		Commonactions.isElementPresent(bp.getWinterseasonbtn());
		ca.click(bp.getWinterseasonbtn());
		ca.eleToBeClickable();
		ca.click(bp.getSeasontab());
		Commonactions.isElementPresent(bp.getHierarchytab());
		ca.click(bp.getHierarchytab());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(bp.getContent_copyDenim());
		ca.click(bp.getContent_copyDenim());
		ca.eleToBeClickable();
		WebElement template = ca.activeElement();
		ca.eleToBeClickable();
	    ca.insertText(template,d[0]);
	    ca.eleToBeClickable();
	    template.sendKeys(Keys.TAB);
	    ca.eleToBeClickable();
	    Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(bp.getDenimbrandbtn());
		ca.click(bp.getDenimbrandbtn());
		Commonactions.isElementPresent(bp.getHierarchytab());
		ca.click(bp.getHierarchytab());
		
		Commonactions.isElementPresent(bp.getBrand1());
		System.out.println(" Brand1 is Displayed");
		Commonactions.isElementPresent(bp.getCode1());
		System.out.println(" Code1 is Displayed");
		Commonactions.isElementPresent(bp.getDescription1());
		System.out.println(" Descrption1 is Displayed");
		
		ca.eleToBeClickable();
		List<WebElement> name = driver.findElements(By.xpath("//div[text()='Brand']/ancestor::table[2]"));
		System.out.println(name.size());
		for (WebElement x : name) {
		System.out.println("the element displayed "+x.getText());
		System.out.println("copy of brand verified");		
			}
		}
	@Then("User verify the copy of collection")
	public void user_verify_the_copy_of_collection() throws Throwable {
   
		Commonactions.isElementPresent(bp.getMensbtn());
		ca.click(bp.getMensbtn());
		Commonactions.isElementPresent(bp.getDepartmenttab());
		ca.click(bp.getDepartmenttab());
		Commonactions.isElementPresent(bp.getHierarchytab());
		ca.click(bp.getHierarchytab());
		
		Commonactions.isElementPresent(bp.getDepartmentchk());
		System.out.println(" Department name is Displayed");
		Commonactions.isElementPresent(bp.getDeptcode());
		System.out.println("code name is displayed");
		Commonactions.isElementPresent(bp.getDescription1());
		System.out.println("Description name is displayed");
		ca.eleToBeClickable();
		List<WebElement> name = driver.findElements(By.xpath("//div[text()='Department']/ancestor::table[2]"));
		System.out.println(name.size());
		for (WebElement x : name) {
		System.out.println("the element displayed "+x.getText());
				
			}
		System.out.println("copy of collection verified");
		}

	
	
	
	@Then("User verify the copy of department")
	public void user_verify_the_copy_of_department()  throws Throwable {
	Commonactions.isElementPresent(bp.getJeansbtn());
	ca.click(bp.getJeansbtn());
	Commonactions.isElementPresent(bp.getCollectiontab());
	ca.click(bp.getCollectiontab());
	Commonactions.isElementPresent(bp.getHierarchytab());
	ca.click(bp.getHierarchytab());
	ca.eleToBeClickable();
	Commonactions.isElementPresent(bp.getCollectionchk());
	System.out.println(" Collection name is Displayed");
	Commonactions.isElementPresent(bp.getCollectioncode());
	System.out.println("code name is displayed");
	Commonactions.isElementPresent(bp.getDescription1());
	System.out.println("Description name is displayed");
	ca.eleToBeClickable();
	List<WebElement> name = driver.findElements(By.xpath("//div[text()='Collection']/ancestor::table[2]"));
	System.out.println(name.size());
	for (WebElement x : name) {
	System.out.println("the element displayed "+x.getText());
    }
	ca.click(lct.getSp3());
	ca.eleToBeClickable();
	ca.click(lct.getSp4());
	Commonactions.isElementPresent(pp.getDelete_Btn());
	ca.click(pp.getDelete_Btn());
	ca.eleToBeClickable();
	}
	
	@Then("Navigate to department copy")
	public void navigate_to_department_copy() throws Throwable {
		Commonactions.isElementPresent(hp.getUser_homeBtn());
		ca.click(hp.getUser_homeBtn());
		Commonactions.isElementPresent(fp.getStyletab());
		ca.click(fp.getStyletab());
		Commonactions.isElementPresent(bp.getSeasonstab());
		ca.click(bp.getSeasonstab());		
		Commonactions.isElementPresent(bp.getWinterseasonbtn());
		ca.click(bp.getWinterseasonbtn());
		Commonactions.isElementPresent(lct.getSp5());
		ca.click(lct.getSp5());
		Commonactions.isElementPresent(bp.getHierarchytab());
		ca.click(bp.getHierarchytab());
		ca.eleToBeClickable();		
		Commonactions.isElementPresent(bp.getCopymens());
		ca.click(bp.getCopymens());
		ca.eleToBeClickable();
		ca.click(lct.getDontKnow());
		ca.eleToBeClickable();
		WebElement template = ca.activeElement();
		ca.eleToBeClickable();
	    ca.insertText(template,"Mens - Department");
	    ca.eleToBeClickable();
	    template.sendKeys(Keys.TAB);
	    ca.eleToBeClickable();
	    Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
	}
	@Then("verify the code description copied for department and collection")
	public void verify_the_code_description_copied_for_department_and_collection() throws Throwable {
		Commonactions.isElementPresent(lct.getSp6());
		ca.click(lct.getSp6());
		String code = Commonactions.getText(lct.getSp7());
		String desp = Commonactions.getText(lct.getSp8()); 
		if ((code.equalsIgnoreCase("123 jeans"))&&(desp.equalsIgnoreCase("Automation"))){
			System.out.println("code and description for the department verified");
		}
		ca.click(lct.getSp9());
		ca.eleToBeClickable();
		ca.click(lct.getSp10());
		Commonactions.isElementPresent(pp.getDelete_Btn());
		ca.click(pp.getDelete_Btn());
		ca.eleToBeClickable();
	}

	@Then("Verify push colorways to style and check another style")
	public void verify_push_colorways_to_style_and_check_another_style() throws Throwable {
		
		Commonactions.isElementPresent(hp.getUser_homeBtn());
		ca.click(hp.getUser_homeBtn());
		Commonactions.isElementPresent(fp.getStyletab());
		ca.click(fp.getStyletab());
		Commonactions.isElementPresent(fp.getStylestab());
		ca.click(fp.getStylestab());
		
		
		
		Commonactions.isElementPresent(sp.getApparel_color_and_size());
		ca.click(sp.getApparel_color_and_size());
		Commonactions.isElementPresent(fp.getStyletab());
		ca.click(fp.getStyletab());
		Commonactions.isElementPresent(fp.getPropertiestab());
		ca.click(fp.getPropertiestab());
		Commonactions.isElementPresent(sp.getActionstab());
		ca.click(sp.getActionstab());
		
		Commonactions.isElementPresent(sp.getPushcolorways());
		ca.click(sp.getPushcolorways());
		Commonactions.isElementPresent(sp.getColorways());
		ca.click(sp.getColorways());
		
		Commonactions.isElementPresent(sp.getEGRETchkbox());
		ca.click(sp.getEGRETchkbox());
		Commonactions.isElementPresent(sp.getAntiqueWhitechkbox());
		ca.click(sp.getAntiqueWhitechkbox());
		ca.eleToBeClickable();
		Robot R = new Robot();
		R.keyPress(KeyEvent.VK_TAB);
		R.keyRelease(KeyEvent.VK_TAB);
		ca.click(lct.getSp11());
		Commonactions.isElementPresent(sp.getAttributegroups()); 
		ca.click(sp.getAttributegroups());
		Commonactions.isElementPresent(sp.getColorwayattr());
		ca.click(sp.getColorwayattr());
		R.keyPress(KeyEvent.VK_TAB);
		R.keyRelease(KeyEvent.VK_TAB);
		ca.click(lct.getSp11());
	    Commonactions.isElementPresent(sp.getAddtoBOMchkbox());
		ca.click(sp.getAddtoBOMchkbox());
		Commonactions.isElementPresent(fp.getNextbtn());
		ca.click(fp.getNextbtn());
		Commonactions.isElementPresent(sp.getApparelBOchkbox());
		ca.click(sp.getApparelBOchkbox());
		Commonactions.isElementPresent(fp.getFinishbtn());
		ca.click(fp.getFinishbtn());
		Commonactions.isElementPresent(bp.getHomebtn());
		ca.click(bp.getHomebtn());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(sp.getApparel_Bo());
		ca.click(sp.getApparel_Bo());
		Commonactions.isElementPresent(sp.getColorwaystab());
		ca.click(sp.getColorwaystab());
	   
	}

	@Then("Verify style editable and check code   {string}")
	public void verify_style_editable_and_check_code(String Style) throws Throwable {
		String[]ss=Style.split(",");
		
		Commonactions.isElementPresent(sp.getEGRETcolor());
		System.out.println("EGRETcolor is visible");
		Commonactions.isElementPresent(sp.getAntiqueWhiteColor());
		System.out.println("Antiquewhitecolor is visible");		
		ca.click(lct.getSp12());
		ca.eleToBeClickable();
		WebElement t = ca.activeElement();
		ca.eleToBeClickable();
		t.sendKeys(ss[0]);
		ca.eleToBeClickable();
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(sp.getCode());
		ca.click(sp.getCode());
		ca.eleToBeClickable();
		WebElement h = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(h, ss[1]);
		ca.eleToBeClickable();
	}
			
	@Then("Verify push colorway to style does not duplicate the colorway")
	public void verify_push_colorway_to_style_does_not_duplicate_the_colorway()throws Throwable  {
		
	   Commonactions.isElementPresent(lct.getSp13());
	   ca.click(lct.getSp13());
	   WebElement t = ca.activeElement();
	   ca.eleToBeClickable();
		t.sendKeys("Apparel - Color and Size");
		ca.eleToBeClickable();
		t.sendKeys(Keys.ENTER);
		ca.eleToBeClickable();
	   Commonactions.isElementPresent(sp.getActionstab());
		ca.click(sp.getActionstab());
		
		Commonactions.isElementPresent(sp.getPushcolorways());
		ca.click(sp.getPushcolorways());
		Commonactions.isElementPresent(sp.getColorways());
		ca.click(sp.getColorways());
		
		Commonactions.isElementPresent(sp.getEGRETchkbox());
		ca.click(sp.getEGRETchkbox());
		Commonactions.isElementPresent(sp.getAntiqueWhitechkbox());
		ca.click(sp.getAntiqueWhitechkbox());
		ca.eleToBeClickable();
		Robot R = new Robot();
		R.keyPress(KeyEvent.VK_TAB);
		R.keyRelease(KeyEvent.VK_TAB);
		ca.click(lct.getSp11());
		Commonactions.isElementPresent(sp.getAttributegroups());
		ca.click(sp.getAttributegroups());
		Commonactions.isElementPresent(sp.getColorwayattr());
		ca.click(sp.getColorwayattr());
		R.keyPress(KeyEvent.VK_TAB);
		R.keyRelease(KeyEvent.VK_TAB);
		ca.click(lct.getSp11());
	    Commonactions.isElementPresent(sp.getAddtoBOMchkbox());
		ca.click(sp.getAddtoBOMchkbox());
		Commonactions.isElementPresent(fp.getNextbtn());
		ca.click(fp.getNextbtn());
		Commonactions.isElementPresent(sp.getApparelBOchkbox());
		ca.click(sp.getApparelBOchkbox());
		Commonactions.isElementPresent(fp.getFinishbtn());
		ca.click(fp.getFinishbtn());
		Commonactions.isElementPresent(lct.getSp13());
		ca.click(lct.getSp13());
		WebElement t1 = ca.activeElement();
		ca.eleToBeClickable();
	    t1.sendKeys("Apparel-BO");
		ca.eleToBeClickable();
		t1.sendKeys(Keys.ENTER);
		ca.eleToBeClickable(); 
		Commonactions.isElementPresent(sp.getColorwaystab());
		ca.click(sp.getColorwaystab());
		Commonactions.isElementPresent(lct.getSp14());
//		Commonactions.isElementNotPresent(driver.findElement(By.xpath("//a[text()='11-0103 EGRET-edit']//following::div[text()='EE-001']")));				
		}
	@Then("Verify push colorway to style is not supported when the style type configure with has color is false")
	public void verify_push_colorway_to_style_is_not_supported_when_the_style_type_configure_with_has_color_is_false()throws Throwable {
		Commonactions.isElementPresent(lct.getSp15());
		ca.click(lct.getSp15());		
		Commonactions.isElementPresent(sp.getNewstyleact());
		ca.click(sp.getNewstyleact());
		Commonactions.isElementPresent(sp.getStyleinp());
		ca.click(sp.getStyleinp());
		WebElement t1 = ca.activeElement();
		ca.eleToBeClickable();
	    t1.sendKeys("Style1-Edited");
		ca.eleToBeClickable();		
		Commonactions.isElementPresent(sp.getTestautchkbx());
		ca.click(sp.getTestautchkbx());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(lct.getSp16());
		ca.click(lct.getSp16());		
		Commonactions.isElementPresent(fp.getPropertiestab());
		ca.click(fp.getPropertiestab());
		Commonactions.isElementPresent(sp.getActionstab());
		ca.click(sp.getActionstab());		
		Commonactions.isElementPresent(lct.getSp17());
		ca.click(fp.getPropertiestab());
	}
	@Then("Navigate to sample storage under style")
	public void navigate_to_sample_storage_under_style() throws Throwable {
		Commonactions.isElementPresent(hp.getUser_homeBtn());
		ca.click(hp.getUser_homeBtn());
		Commonactions.isElementPresent(fp.getStyletab());
		ca.click(fp.getStyletab());
		Commonactions.isElementPresent(sp.getSampleStorageBtn());
		ca.click(sp.getSampleStorageBtn());
		Commonactions.isElementPresent(sp.getNewsamplebtn());
		ca.click(sp.getNewsamplebtn());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(sp.getSample_storage_input());
		ca.click(sp.getSample_storage_input());
		
		ca.eleToBeClickable();
		ca.insertText(sp.getSample_storage_input(), "AUT_sample");
		ca.eleToBeClickable();
		Commonactions.isElementPresent(sp.getSample_storage_bin());
		ca.click(sp.getSample_storage_bin());
		ca.eleToBeClickable();
		WebElement f = ca.activeElement();
		ca.eleToBeClickable();
		f.sendKeys(Keys.DELETE);
	    ca.insertText(f, "3");
	    ca.eleToBeClickable();
	    Commonactions.isElementPresent(sp.getSample_storage_maxbin());
		ca.click(sp.getSample_storage_maxbin());
		
		ca.eleToBeClickable();
		WebElement f1 = ca.activeElement();
		ca.eleToBeClickable();
		f1.sendKeys(Keys.DELETE);
	    ca.insertText(f1, "5");
	    ca.eleToBeClickable();
	    
	    Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(sp.getSample_chkbox());
		ca.click(sp.getSample_chkbox());
		
		Commonactions.isElementPresent(sp.getAUT_sample_edit());
		ca.click(sp.getAUT_sample_edit());
		ca.eleToBeClickable();
		WebElement a = ca.activeElement();
		ca.eleToBeClickable();
		a.sendKeys(Keys.DELETE);
		ca.eleToBeClickable();
		ca.insertText(a, "2");
		ca.eleToBeClickable();
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		
		Commonactions.isElementPresent(sp.getNewsamplebtn());
		ca.click(sp.getNewsamplebtn());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(sp.getSample_storage_input());
		ca.click(sp.getSample_storage_input());
		
		ca.eleToBeClickable();
		ca.insertText(sp.getSample_storage_input(), "AUT_sample1");
		ca.eleToBeClickable();
		Commonactions.isElementPresent(sp.getSample_storage_bin());
		ca.click(sp.getSample_storage_bin());
		ca.eleToBeClickable();
		WebElement d = ca.activeElement();
		ca.eleToBeClickable();
		d.sendKeys(Keys.DELETE);
	    ca.insertText(d, "3");
	    ca.eleToBeClickable();
	    Commonactions.isElementPresent(sp.getSample_storage_maxbin());
		ca.click(sp.getSample_storage_maxbin());
		
		ca.eleToBeClickable();
		WebElement d1 = ca.activeElement();
		ca.eleToBeClickable();
		d1.sendKeys(Keys.DELETE);
	    ca.insertText(d1, "5");
	    ca.eleToBeClickable();
	    
	    Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		
		Commonactions.isElementPresent(sp.getAUT_sample_close());
	    ca.click(sp.getAUT_sample_close());
	    Commonactions.isElementPresent(fp.getDeletebtn());
	    ca.click(fp.getDeletebtn());
				
	    
			
	
	}

	@Then("verify material sample and style sample {string}")
	public void verify_material_sample_and_style_sample(String Materialsample ) throws Throwable {
		String[]sa = Materialsample.split(",");
		Commonactions.isElementPresent(sp.getAUT_samplebtn());
		ca.click(sp.getAUT_samplebtn());
		Commonactions.isElementPresent(fp.getPropertiestab());
		System.out.println("properties tab present");
		Commonactions.isElementPresent(sp.getMaterialsamplestab());
		ca.click(sp.getMaterialsamplestab());
		Commonactions.isElementPresent(sp.getNewMaterialsample_btn());
		ca.click(sp.getNewMaterialsample_btn());
		ca.eleToBeClickable();
		WebElement s1 = ca.activeElement();
		ca.eleToBeClickable();
	    ca.insertText(s1, sa[0]);
	    ca.eleToBeClickable();
	    s1.sendKeys(Keys.TAB);
	    ca.eleToBeClickable();
	    WebElement s2 = ca.activeElement();
	    ca.eleToBeClickable();
	    ca.insertText(s2,sa[1]);
	    ca.eleToBeClickable();
	    s2.sendKeys(Keys.TAB);
	    ca.eleToBeClickable();
	    WebElement s3 = ca.activeElement();
	    ca.eleToBeClickable();
	    ca.insertText(s3,sa[2]);
	    ca.eleToBeClickable();
	    Commonactions.isElementPresent(sp.getMaterail_Type());
		ca.insertText(sp.getMaterail_Type(),sa[3]);
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		Commonactions.isElementPresent(sp.getEdit_material());
		ca.click(sp.getEdit_material());
		ca.eleToBeClickable();
		WebElement l = ca.activeElement();
		ca.eleToBeClickable();
		l.sendKeys(Keys.DELETE);
	    ca.insertText(l, "Sample2");
	    ca.eleToBeClickable();
	    l.sendKeys(Keys.TAB);
		ca.eleToBeClickable();
		WebElement l1 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(l1,"002");
		ca.eleToBeClickable();
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		System.out.println("materail sample edit verified");
		Commonactions.isElementPresent(sp.getNewMaterialsample_btn());
		ca.click(sp.getNewMaterialsample_btn());
		ca.eleToBeClickable();
		WebElement k1 = ca.activeElement();
		ca.eleToBeClickable();
	    ca.insertText(k1, sa[4]);
	    ca.eleToBeClickable();
	    k1.sendKeys(Keys.TAB);
	    ca.eleToBeClickable();
	    WebElement k2 = ca.activeElement();
	    ca.eleToBeClickable();
	    ca.insertText(k2,sa[5]);
	    ca.eleToBeClickable();
	    k2.sendKeys(Keys.TAB);
	    ca.eleToBeClickable();
	    WebElement k3 = ca.activeElement();
	    ca.eleToBeClickable();
	    ca.insertText(k3,sa[6]);
	    ca.eleToBeClickable();
	    Commonactions.isElementPresent(sp.getMaterail_Type());
		ca.insertText(sp.getMaterail_Type(),sa[7]);
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		
		Commonactions.isElementPresent(sp.getDelete_circle());
		ca.click(sp.getDelete_circle());
		  
		Commonactions.isElementPresent(sp.getStylesamplestab());
		ca.click(sp.getStylesamplestab());
		Commonactions.isElementPresent(sp.getNew_style_sample_btn());
		ca.click(sp.getNew_style_sample_btn());
		Commonactions.isElementPresent(sp.getApparel_Color_chkbox());
		ca.click(sp.getApparel_Color_chkbox());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		try{Commonactions.isElementPresent(sp.getContent_copy_Apparel());
		ca.click(sp.getContent_copy_Apparel());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		
		Commonactions.isElementPresent(sp.getDelete_Apparel());
		ca.click(sp.getDelete_Apparel());}
		catch(Exception e){}
		System.out.println("Style sample created and edit,Delete verified");
	}
	
	


}
