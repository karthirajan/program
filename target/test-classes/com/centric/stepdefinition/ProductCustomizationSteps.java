package com.centric.stepdefinition;

import com.centric.objectrepository.*;
import com.centric.resources.Commonactions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ProductCustomizationSteps extends Commonactions {

    Commonactions ca = new Commonactions();
    SetupPageTK sp = new SetupPageTK();
    PopupPage pp = new PopupPage();
    HomePage hp = new HomePage();
	StyleMaterialSamplepage sm = new StyleMaterialSamplepage();
	StylePage st = new StylePage();
	ProductCustomizationPage pc = new ProductCustomizationPage();
	MaterialSpecificationPage mp = new MaterialSpecificationPage();
	UserManagementPage up = new UserManagementPage();
	FoodSetupPage fp= new FoodSetupPage();
	PopupPage pup=new PopupPage();
	LoginPage lp=new LoginPage();
	SourcingPage sup = new SourcingPage();
	DocumentPage dp = new DocumentPage();
	Locators lct = new Locators();
	

    @And("Navigate to Existing Style {string}")
    public void Navigate_to_Existing_Style(String StyleName) throws Throwable {
		//try{
		//	Commonactions.isElementPresent(sm.getLeftArrow());
		//	ca.click(sm.getLeftArrow());
		//}catch (Exception e) {
			// TODO: handle exception
		//}
    	
    	//parallel
    	
    	Commonactions.isElementPresent(hp.getSourcingBtn());
		ca.click(hp.getSourcingBtn());
		Commonactions.isElementPresent(mp.getSupplier());
		ca.click(mp.getSupplier());
		Commonactions.isElementPresent(mp.getNew_suppliier_Btn());
		ca.click(mp.getNew_suppliier_Btn());
		Commonactions.isElementPresent(mp.getSupplierValue());
		ca.insertText(mp.getSupplierValue(), "Ship - Supplier");
		Commonactions.isElementPresent(mp.getIsAgent_ChkBox());
		ca.click(mp.getIsAgent_ChkBox());
		Commonactions.isElementPresent(mp.getIsSupplier_ChkBox());
		ca.click(mp.getIsSupplier_ChkBox());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		Commonactions.isElementPresent(mp.getIsWareHouse_ChkBox());
		ca.click(mp.getIsWareHouse_ChkBox());
		ca.eleToBeClickable();
    	
		Commonactions.isElementPresent(hp.getStyleBtn());
		ca.click(hp.getStyleBtn());
		Commonactions.isElementPresent(st.getStyles_Btn());
		ca.click(st.getStyles_Btn());
		Commonactions.isElementPresent(driver.findElement(By.xpath("//a[text()='"+StyleName+"']")));
		ca.click(driver.findElement(By.xpath("//a[text()='"+StyleName+"']")));
    }
    
    @Then("Select Existing Supplier {string},{string}")
    public void Select_Existing_Supplier(String Supplier,String StyleName) throws Throwable {
    	Commonactions.isElementPresent(pc.getStylesSourcing());
		ca.click(pc.getStylesSourcing());
		Commonactions.isElementPresent(pc.getStyleProductSuppliers());
		ca.click(pc.getStyleProductSuppliers());
		Commonactions.isElementPresent(pc.getNewProductSuppliers());
		ca.click(pc.getNewProductSuppliers());
		Commonactions.isElementPresent(driver.findElement(By.xpath("//td[text()='"+Supplier+"']")));
		ca.click(driver.findElement(By.xpath("//td[text()='"+Supplier+"']")));
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
        
    }
    @Then("Verify the Quantity field cannot take values more than Forty {string}")
    public void Verify_the_Quantity_field_cannot_take_values_more_than_Forty(String SupplierName) throws Throwable {
    	Commonactions.isElementPresent(pc.getStyleStyleTab());
		ca.click(pc.getStyleStyleTab());
		Commonactions.isElementPresent(pc.getStylePropertiesTab());
		ca.click(pc.getStylePropertiesTab());
		Commonactions.isElementPresent(pc.getStyleSampleTab());

		Commonactions.mouseOver(pc.getStyleSampleTab());
		ca.click(pc.getStyleSampleTab());
		Commonactions.isElementPresent(pc.getNewStyleSamples());
		ca.click(pc.getNewStyleSamples());
		Commonactions.isElementPresent(pc.getSupplierValue());
		ca.insertText(pc.getSupplierValue(), SupplierName);	
		ca.eleToBeClickable();	
		ca.click(driver.findElement(By.xpath("//div[@role='option' and @item='1']/div")));	
		ca.eleToBeClickable();	
		ca.click(driver.findElement(By.xpath("//th[text()='Sample']")));	
		ca.eleToBeClickable();	
		//ca.jsMouseOver();
		Commonactions.isElementPresent(pc.getQuantityValue());
		ca.insertText(pc.getQuantityValue(), "41");
		ca.eleToBeClickable();
		Commonactions.isElementPresent(lct.getErrorMsg());	
		System.out.println("This value is out of range is displayed when 41 is entered.");	

		
		
    }
    @Then("Verify Forty Samples are created {string}")
    public void Verify_Forty_Samples_are_created (String SampleName) throws Throwable {
		Commonactions.isElementPresent(pc.getSampleNameValue());
		ca.insertText(pc.getSampleNameValue(), SampleName);
		Commonactions.isElementPresent(pc.getSampleDim());
		ca.insertText(pc.getSampleDim(), "None");	
		ca.eleToBeClickable();	
		ca.jsMouseOver();
    	Commonactions.isElementPresent(pc.getQuantityValue());
    	ca.click(pc.getQuantityValue());
		WebElement N3 = ca.activeElement();
		N3.sendKeys(Keys.DELETE);
		ca.eleToBeClickable();
		ca.insertText(pc.getQuantityValue(), "40");
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(lct.getSuccessfully());	
		System.out.println("40 Samples are created ");
         }
    
    @Then("Create Custom View in Style Properties")
    public void Create_Custom_View_in_Style_Properties() throws Throwable {
		//Creating View under Properties section
    	Commonactions.isElementPresent(pc.getStyleStyleTab());
		ca.click(pc.getStyleStyleTab());
    	Commonactions.isElementPresent(pc.getStylePropertiesTab());
		ca.click(pc.getStylePropertiesTab());
		Commonactions.isElementPresent(pc.getStylePropView());
		ca.click(pc.getStylePropView());
		ca.eleToBeClickable();
		ca.click(pc.getStylePropViewManage());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(up.getUsrMgmt_Copy());
		ca.click(up.getUsrMgmt_Copy());
		Commonactions.isElementPresent(up.getUsrMgmt_Copy_Value());
		ca.insertText(up.getUsrMgmt_Copy_Value(), "APIViews-001");
		ca.eleToBeClickable();
		ca.click(lct.getAct());
		Commonactions.isElementPresent(pc.getRemove_Btn());
		ca.click(pc.getRemove_Btn());
		ca.click(lct.getCarryOver());
		Commonactions.isElementPresent(pc.getRemove_Btn());
		ca.click(pc.getRemove_Btn());
		ca.click(lct.getDefltSize());
		Commonactions.isElementPresent(pc.getRemove_Btn());
		ca.click(pc.getRemove_Btn());
		ca.click(lct.getPrdtstrct());
		Commonactions.isElementPresent(pc.getRemove_Btn());
		ca.click(pc.getRemove_Btn());
		ca.click(lct.getOptTool());
		Commonactions.isElementPresent(pc.getRemove_Btn());
		ca.click(pc.getRemove_Btn());
		ca.click(lct.getOptType());
		Commonactions.isElementPresent(pc.getRemove_Btn());
		ca.click(pc.getRemove_Btn());
		ca.click(lct.getOptRange());
		Commonactions.isElementPresent(pc.getRemove_Btn());
		ca.click(pc.getRemove_Btn());
		ca.click(lct.getOptSrc());
		Commonactions.isElementPresent(pc.getRemove_Btn());
		ca.click(pc.getRemove_Btn());
		ca.click(lct.getOptSrc1());
		Commonactions.isElementPresent(pc.getRemove_Btn());
		ca.click(pc.getRemove_Btn());
		ca.click(lct.getOptQuo());
		Commonactions.isElementPresent(pc.getRemove_Btn());
		ca.click(pc.getRemove_Btn());
		ca.click(lct.getOptPrd());
		Commonactions.isElementPresent(pc.getRemove_Btn());
		ca.click(pc.getRemove_Btn());
		ca.click(lct.getOptPrdSrc());
		Commonactions.isElementPresent(pc.getRemove_Btn());
		ca.click(pc.getRemove_Btn());
		ca.click(lct.getOptRevision());
		Commonactions.isElementPresent(pc.getRemove_Btn());
		ca.click(pc.getRemove_Btn());
		ca.click(lct.getOptRecent());
		Commonactions.isElementPresent(fp.getAdd_Btn());
		ca.click(fp.getAdd_Btn());
		ca.mouseOver(mp.getSave_btn1());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		System.out.println("The Custom View is created for 'Style Properties' ");
		ca.eleToBeClickable();
       } 
    @Then("Navigate to style and add Recent comment from custom view")
    public void Navigate_to_style_and_add_Recent_comment_from_custom_view() throws Throwable {
    	Commonactions.isElementPresent(pc.getRecentConvHeading());
    	Commonactions.isElementPresent(pc.getConversationsArea());
    	ca.mouseOver(pc.getConversationsArea());
    	Commonactions.isElementPresent(pc.getViewConversations());
    	ca.click(pc.getViewConversations());
    	Commonactions.isElementPresent(pc.getNewConversationsBtn());
    	ca.click(pc.getNewConversationsBtn());
    	Commonactions.isElementPresent(pc.getConvSubject());
    	ca.insertText(pc.getConvSubject(), "Comment for Style");
        Commonactions.isElementPresent(pc.getConvBody());
    	ca.click(pc.getConvBody());
    	ca.insertText(pc.getConvBody(), "Test Commenting");
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		Commonactions.isElementPresent(lct.getCfs1());
		Commonactions.isElementPresent(pc.getClose_btn());
		ca.click(pc.getClose_btn());
		Commonactions.isElementPresent(lct.getCfs2());
		System.out.println("Comment is created for Style' ");
 	
    }
    @Then("Navigate to SKU tab and Create two SKUs and custom view for SKU {string}")
    public void Navigate_to_SKU_tab_and_Create_SKU_and_custom_view_for_SKU(String string1) throws Throwable {
    	String[] SKUName = string1.split(",");
    	Commonactions.isElementPresent(pc.getStyleSKUTab());
		ca.click(pc.getStyleSKUTab());
		Commonactions.isElementPresent(pc.getNewStyleSKU());
		ca.click(pc.getNewStyleSKU());
		Commonactions.isElementPresent(pc.getSyleSKUValue());
		ca.insertText(pc.getSyleSKUValue(), SKUName[0]);	
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(pc.getNewStyleSKU());
		ca.click(pc.getNewStyleSKU());
		Commonactions.isElementPresent(pc.getSyleSKUValue());
		ca.insertText(pc.getSyleSKUValue(), SKUName[1]);	
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		//Creating the custom view
    	Commonactions.isElementPresent(driver.findElement(By.xpath("//a[text()='"+SKUName[0]+"']")));
		ca.click(driver.findElement(By.xpath("//a[text()='"+SKUName[0]+"']")));
    	Commonactions.isElementPresent(pc.getSKUNodeSKUTab());
		ca.click(pc.getSKUNodeSKUTab());
    	Commonactions.isElementPresent(pc.getSKUPropView());
		ca.click(pc.getSKUPropView());
		Commonactions.isElementPresent(pc.getSKUPropViewManage());
		ca.click(pc.getSKUPropViewManage());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(up.getUsrMgmt_Copy());
		ca.click(up.getUsrMgmt_Copy());
		Commonactions.isElementPresent(up.getUsrMgmt_Copy_Value());
		ca.insertText(up.getUsrMgmt_Copy_Value(), "SKUViews-001");
		ca.eleToBeClickable();
		ca.click(lct.getCarryOver());
		Commonactions.isElementPresent(pc.getRemove_Btn());
		ca.click(pc.getRemove_Btn());
		ca.click(lct.getGtin());
		Commonactions.isElementPresent(pc.getRemove_Btn());
		ca.click(pc.getRemove_Btn());
		ca.click(lct.getCarton());
		Commonactions.isElementPresent(pc.getRemove_Btn());
		ca.click(pc.getRemove_Btn());
		ca.click(lct.getPallet());
		Commonactions.isElementPresent(pc.getRemove_Btn());
		ca.click(pc.getRemove_Btn());
		ca.click(lct.getSkuQuote());
		Commonactions.isElementPresent(pc.getRemove_Btn());
		ca.click(pc.getRemove_Btn());
		ca.click(lct.getSupplierSKUquote());
		Commonactions.isElementPresent(pc.getRemove_Btn());
		ca.click(pc.getRemove_Btn());
		ca.click(lct.getQuoFact());
		Commonactions.isElementPresent(pc.getRemove_Btn());
		ca.click(pc.getRemove_Btn());
		ca.click(lct.getDutySku());
		Commonactions.isElementPresent(pc.getRemove_Btn());
		ca.click(pc.getRemove_Btn());
		ca.click(lct.getDutyAdditional());
		Commonactions.isElementPresent(pc.getRemove_Btn());
		ca.click(pc.getRemove_Btn());
		ca.click(lct.getDutyPerItem());
		Commonactions.isElementPresent(pc.getRemove_Btn());
		ca.click(pc.getRemove_Btn());
		ca.click(lct.getDutyStatus());
		Commonactions.isElementPresent(pc.getRemove_Btn());
		ca.click(pc.getRemove_Btn());
		ca.click(lct.getRecComments());
		Commonactions.isElementPresent(fp.getAdd_Btn());
		ca.click(fp.getAdd_Btn());
		ca.mouseOver(mp.getSave_btn1());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		System.out.println("The Custom View is created for 'SKU Tab' ");
		ca.eleToBeClickable();
    }
    @Then("Create Recent comment for two SKUs {string},{string}")
    public void Create_Recent_comment_for_SKU(String StyleName,String string1) throws Throwable {
    	String[] SKUName = string1.split(",");
    	Commonactions.isElementPresent(pc.getSKUNodeSKUTab());
		ca.click(pc.getSKUNodeSKUTab());
	  	Commonactions.isElementPresent(pc.getRecentConvHeading());
    	Commonactions.isElementPresent(pc.getSKUConversationsArea());
    	ca.mouseOver(pc.getSKUConversationsArea());
    	Commonactions.isElementPresent(pc.getViewConversations());
    	ca.click(pc.getViewConversations());
    	Commonactions.isElementPresent(pc.getNewConversationsBtn());
    	ca.click(pc.getNewConversationsBtn());
    	Commonactions.isElementPresent(pc.getConvSubject());
    	ca.insertText(pc.getConvSubject(), "Comment for SKU1");
        Commonactions.isElementPresent(pc.getConvBody());
    	ca.click(pc.getConvBody());
    	ca.insertText(pc.getConvBody(), "Test Commenting");
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		Commonactions.isElementPresent(lct.getTwoSku());
		Commonactions.isElementPresent(pc.getClose_btn());
		ca.click(pc.getClose_btn());
		Commonactions.isElementPresent(lct.getSkuComment());
		//go to the other SKU and create comments
		Commonactions.isElementPresent(driver.findElement(By.xpath("//a[text()='"+StyleName+"']")));
		ca.click(driver.findElement(By.xpath("//a[text()='"+StyleName+"']")));
		Commonactions.isElementPresent(pc.getStyleSKUTab());
		ca.click(pc.getStyleSKUTab());
	  	Commonactions.isElementPresent(driver.findElement(By.xpath("//a[text()='"+SKUName[1]+"']")));
		ca.click(driver.findElement(By.xpath("//a[text()='"+SKUName[1]+"']")));
	    Commonactions.isElementPresent(pc.getSKUNodeSKUTab());
		ca.click(pc.getSKUNodeSKUTab());
	   	Commonactions.isElementPresent(pc.getRecentConvHeading());
    	Commonactions.isElementPresent(pc.getSKUConversationsArea());
    	ca.mouseOver(pc.getSKUConversationsArea());
    	Commonactions.isElementPresent(pc.getViewConversations());
    	ca.click(pc.getViewConversations());
    	Commonactions.isElementPresent(pc.getNewConversationsBtn());
    	ca.click(pc.getNewConversationsBtn());
    	Commonactions.isElementPresent(pc.getConvSubject());
    	ca.insertText(pc.getConvSubject(), "Comment for SKU2");
        Commonactions.isElementPresent(pc.getConvBody());
    	ca.click(pc.getConvBody());
    	ca.insertText(pc.getConvBody(), "Test Commenting");
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		Commonactions.isElementPresent(lct.getSpancmt());
		Commonactions.isElementPresent(pc.getClose_btn());
		ca.click(pc.getClose_btn());
		Commonactions.isElementPresent(lct.getSpancmt2());
		System.out.println("Comment is created for two SKU's' ");
    }
    @Then("Navigate to Style properties and check recent comments reflected in properties {string}")
    public void Navigate_to_Style_properties_and_check_recent_comments_reflected_in_properties(String StyleName) throws Throwable {
    	
    	Commonactions.isElementPresent(driver.findElement(By.xpath("//a[text()='"+StyleName+"']")));
		ca.click(driver.findElement(By.xpath("//a[text()='"+StyleName+"']")));
       	Commonactions.isElementPresent(pc.getStyleStyleTab());
    	ca.click(pc.getStyleStyleTab());
        Commonactions.isElementPresent(pc.getStylePropertiesTab());
    	ca.click(pc.getStylePropertiesTab());
     	Commonactions.isElementPresent(pc.getConversationsArea());
    	ca.mouseOver(pc.getConversationsArea());
    	Commonactions.isElementPresent(pc.getViewConversations());
    	ca.click(pc.getViewConversations());
    	Commonactions.isElementPresent(lct.getCfs1());
    	Commonactions.isElementPresent(lct.getTwoSku());
    	Commonactions.isElementPresent(lct.getSpancmt());
		Commonactions.isElementPresent(pc.getClose_btn());
		ca.click(pc.getClose_btn());
		System.out.println("All Comment are reflected in Style' ");
    }
    @Then("Delete the one comment SKU in style")
    public void Delete_the_one_comment_SKU_in_style() throws Throwable {
    	Commonactions.isElementPresent(lct.getPopup());
		ca.click(lct.getPopup());
		ca.eleToBeClickable();
       	Commonactions.isElementPresent(lct.getDeleteact2());
    	ca.click(lct.getDeleteact2());

    	Commonactions.isElementPresent(pp.getDelete_Btn());
    	ca.click(pp.getDelete_Btn());//parallel
		Commonactions.isElementPresent(pc.getClose_btn());
		ca.click(pc.getClose_btn());
        	System.out.println("The SKU1 comment is deleted in Style' ");
    }
    
    @Then("Navigate to collection verify move from style action is visible as Admin {string}")
    public void  Navigate_to_collection_verify_move_from_style_action_is_visible_as_Admin(String CollectionName) throws Throwable {
      	Commonactions.isElementPresent(pc.getHeaderSearch());
    	ca.click(pc.getHeaderSearch());
    	Commonactions.isElementPresent(lct.getTextCollection());
    	ca.click(lct.getTextCollection());
		Commonactions.isElementPresent(pc.getHeaderSearchField());
		ca.insertText(pc.getHeaderSearchField(), CollectionName);
		ca.eleToBeClickable();
		ca.click(pc.getSearchIcon());
		Commonactions.isElementPresent(driver.findElement(By.xpath("//a[@class='csi-card-anchor' and @title='"+CollectionName+"']")));
		ca.click(driver.findElement(By.xpath("//a[@class='csi-card-anchor' and @title='"+CollectionName+"']")));
		Commonactions.isElementPresent(pc.getHierarchyTab());
    	ca.click(pc.getHierarchyTab());
		Commonactions.isElementPresent(pc.getCollectiontabNewStyleBtn());
    	ca.click(pc.getCollectiontabNewStyleBtn());
		Commonactions.isElementPresent(pc.getMoveStyleFromColbtn());
		System.out.println("Move from style action is visible under hierarchy as Admin ' ");
    }
    
    @Then("Navigate to Style and verify move from style action is visible as Admin {string}")
    public void  Navigate_to_style_and_verify_move_from_style_action_is_visible_as_Admin(String StyleName) throws Throwable {
      	Commonactions.isElementPresent(pc.getAllStylesTab());
    	ca.click(pc.getAllStylesTab());
 		Commonactions.isElementPresent(pc.getStylesTabStyleBtn());
    	ca.click(pc.getStylesTabStyleBtn());
		Commonactions.isElementPresent(pc.getMoveStyleFromStylesTabBtn());
		System.out.println("Move from style action is visible under Style as Admin' ");
    } 
    
    @Then("Navigate to Hierarchy and verify move styles from present in season brand and department {string},{string},{string}")
    public void  Navigate_to_Hierarchy_and_verify_move_styles_from_present_in_season_brand_and_department(String SeasonName,String BrandName,String DeptName) throws Throwable {
      	Commonactions.isElementPresent(pc.getHeaderSearch());
    	ca.click(pc.getHeaderSearch());
    	Commonactions.isElementPresent(lct.getTextSeason());
    	ca.click(lct.getTextSeason());
		Commonactions.isElementPresent(pc.getHeaderSearchField());
		ca.insertText(pc.getHeaderSearchField(), SeasonName);
		ca.eleToBeClickable();
		ca.click(pc.getSearchIcon());
		Commonactions.isElementPresent(driver.findElement(By.xpath("//a[@class='csi-card-anchor' and @title='"+SeasonName+"']")));
		ca.click(driver.findElement(By.xpath("//a[@class='csi-card-anchor' and @title='"+SeasonName+"']")));
		Commonactions.isElementPresent(pc.getHierarchyTab());
    	ca.click(pc.getHierarchyTab());
       	Commonactions.isElementPresent(pc.getAllStylesTab());
    	ca.click(pc.getAllStylesTab());
 		Commonactions.isElementPresent(pc.getStylesTabStyleBtn());
    	ca.click(pc.getStylesTabStyleBtn());
		Commonactions.isElementPresent(pc.getMoveStyleFromStylesTabBtn());
		System.out.println("Move from style action is visible under Season as Admin' ");
		//for Brand
      	Commonactions.isElementPresent(pc.getHeaderSearch());
    	ca.click(pc.getHeaderSearch());
    	Commonactions.isElementPresent(lct.getTextBrand());
    	ca.click(lct.getTextBrand());
		Commonactions.isElementPresent(pc.getHeaderSearchField());
		ca.insertText(pc.getHeaderSearchField(), BrandName);
		ca.eleToBeClickable();
		ca.click(pc.getSearchIcon());
		Commonactions.isElementPresent(driver.findElement(By.xpath("//a[@class='csi-card-anchor' and @title='"+BrandName+"']")));
		ca.click(driver.findElement(By.xpath("//a[@class='csi-card-anchor' and @title='"+BrandName+"']")));
		Commonactions.isElementPresent(pc.getHierarchyTab());
    	ca.click(pc.getHierarchyTab());
       	Commonactions.isElementPresent(pc.getAllStylesTab());
    	ca.click(pc.getAllStylesTab());
 		Commonactions.isElementPresent(pc.getStylesTabStyleBtn());
    	ca.click(pc.getStylesTabStyleBtn());
		Commonactions.isElementPresent(pc.getMoveStyleFromStylesTabBtn());
		System.out.println("Move from style action is visible under Brand as Admin ' ");
		//For Department
      	Commonactions.isElementPresent(pc.getHeaderSearch());
    	ca.click(pc.getHeaderSearch());
    	Commonactions.isElementPresent(lct.getTextDept());
    	ca.click(lct.getTextDept());
		Commonactions.isElementPresent(pc.getHeaderSearchField());
		ca.insertText(pc.getHeaderSearchField(), DeptName);
		ca.eleToBeClickable();
		ca.click(pc.getSearchIcon());
		Commonactions.isElementPresent(driver.findElement(By.xpath("//a[@class='csi-card-anchor' and @title='"+DeptName+"']")));
		ca.click(driver.findElement(By.xpath("//a[@class='csi-card-anchor' and @title='"+DeptName+"']")));
		Commonactions.isElementPresent(pc.getHierarchyTab());
    	ca.click(pc.getHierarchyTab());
       	Commonactions.isElementPresent(pc.getAllStylesTab());
    	ca.click(pc.getAllStylesTab());
 		Commonactions.isElementPresent(pc.getStylesTabStyleBtn());
    	ca.click(pc.getStylesTabStyleBtn());
		Commonactions.isElementPresent(pc.getMoveStyleFromStylesTabBtn());
		System.out.println("Move from style action is visible under Department as Admin ' ");
    }
    @Then("Navigate to Role and assign User {string},{string}")
    public void  Navigate_to_Role_and_assign_User(String UserName,String RoleName) throws Throwable {
    	//Create the Role
		Commonactions.isElementPresent(up.getUsrMgmt_Roles());
		ca.click(up.getUsrMgmt_Roles());
	    Commonactions.isElementPresent(up.getNew_role_Btn());
		ca.click(up.getNew_role_Btn());
		Commonactions.isElementPresent(pp.getUsrMgmnt_NewRole_Value());
		ca.insertText(pp.getUsrMgmnt_NewRole_Value(), RoleName);
		ca.eleToBeClickable();
		Commonactions.isElementPresent(up.getManage_preference_chkbox());
        ca.click(up.getManage_preference_chkbox());
		
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		System.out.println("Non -Admin created under Roles");
    	Commonactions.mouseOver(driver.findElement(By.xpath("//td[text()='"+RoleName+"']//following::span[@class='dijitReset dijitInline dijitIcon material-icons' and text()='more_horiz']")));
    	ca.eleToBeClickable();
    	Commonactions.isElementPresent(driver.findElement(By.xpath("//td[text()='"+RoleName+"']//following::span[@class='dijitReset dijitInline dijitIcon material-icons' and text()='more_horiz']")));
       	ca.click(driver.findElement(By.xpath("//td[text()='"+RoleName+"']//following::span[@class='dijitReset dijitInline dijitIcon material-icons' and text()='more_horiz']")));
 		Commonactions.isElementPresent(lct.getSelectMembers());
 		ca.click(lct.getSelectMembers());
 		Commonactions.isElementPresent(driver.findElement(By.xpath("//td[text()='"+UserName+"']//preceding::div[1]/input[1]")));
 		ca.click(driver.findElement(By.xpath("//td[text()='"+UserName+"']//preceding::div[1]/input[1]")));
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		System.out.println("NonAdmin role is assigned to Non-admin User");
		Commonactions.mouseOver(driver.findElement(By.xpath("//td[text()='"+RoleName+"']//following::span[@class='dijitReset dijitInline dijitIcon material-icons' and text()='more_horiz']")));
		ca.eleToBeClickable();
		Commonactions.isElementPresent(driver.findElement(By.xpath("//td[text()='"+RoleName+"']//following::span[@class='dijitReset dijitInline dijitIcon material-icons' and text()='more_horiz']")));
		ca.click(driver.findElement(By.xpath("//td[text()='"+RoleName+"']//following::span[@class='dijitReset dijitInline dijitIcon material-icons' and text()='more_horiz']")));
		Commonactions.isElementPresent(lct.getSelsecrole());
		ca.click(lct.getSelsecrole());
		ca.eleToBeClickable();
		ca.click(lct.getSecrolegroup());
		ca.eleToBeClickable();
		WebElement a1 = ca.activeElement();
		ca.eleToBeClickable();
		a1.sendKeys(Keys.DELETE);
		ca.eleToBeClickable();
		//a1.sendKeys("Administrator");
		ca.insertText(a1,  "Administrator");
		ca.eleToBeClickable();
		ca.click(lct.getOptitemdiv());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		ca.click(up.getUsrMgmt_All());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
    } 
    
	@Then("Logout Login as Non Admin {string}")
	public void Login_as_Non_Admin(String UserName) throws Throwable {
		Commonactions.isElementPresent(lct.getMaterialIcon());
		ca.click(lct.getMaterialIcon());
		Commonactions.isElementPresent(lct.getLoggedOut());
 		ca.click(lct.getLoggedOut());
 		Thread.sleep(1000);
    	Commonactions.isElementPresent(lp.getUsername());
		ca.insertText(lp.getUsername(), UserName);
		Commonactions.isElementPresent(lp.getPassword());
		ca.insertText(lp.getPassword(), "centric8");
		ca.click(lp.getLogin());
		System.out.println("login clicked successfully");
	}
	   @Then("Navigate to collection verify move from style action not visible as NonAdmin {string}")
	    public void  Navigate_to_collection_verify_move_from_style_action_not_visible_as_NonAdmin(String CollectionName) throws Throwable {
	      	Commonactions.isElementPresent(pc.getHeaderSearch());
	    	ca.click(pc.getHeaderSearch());
	    	Commonactions.isElementPresent(lct.getTextCollection());
	    	ca.click(lct.getTextCollection());
			Commonactions.isElementPresent(pc.getHeaderSearchField());
			ca.insertText(pc.getHeaderSearchField(), CollectionName);
			ca.eleToBeClickable();
			ca.click(pc.getSearchIcon());
			Commonactions.isElementPresent(driver.findElement(By.xpath("//a[@class='csi-card-anchor' and @title='"+CollectionName+"']")));
			ca.click(driver.findElement(By.xpath("//a[@class='csi-card-anchor' and @title='"+CollectionName+"']")));
			Commonactions.isElementPresent(pc.getHierarchyTab());
	    	ca.click(pc.getHierarchyTab());
			Commonactions.isElementPresent(pc.getCollectiontabNewStyleBtn());
	    	ca.click(pc.getCollectiontabNewStyleBtn());
			Commonactions.isElementNotPresent(pc.getMoveStyleFromColbtn());
			System.out.println("Move from style action is Not visible under hierarchy as NonAdmin ' ");
	    }
	    
	    @Then("Navigate to style and verify move from style action not visible as NonAdmin {string}")
	    public void  Navigate_to_style_and_verify_move_from_style_action_not_visible_as_NonAdmin(String StyleName) throws Throwable {
	      	Commonactions.isElementPresent(pc.getAllStylesTab());
	    	ca.click(pc.getAllStylesTab());
	 		Commonactions.isElementPresent(pc.getStylesTabStyleBtn());
	    	ca.click(pc.getStylesTabStyleBtn());
			Commonactions.isElementNotPresent(pc.getMoveStyleFromStylesTabBtn());
			System.out.println("Move from style action is not visible under Style as NonAdmin' ");
	    } 
	    
	    @Then("Navigate to Hierarchy and verify move styles from not present in season, brand and department as NonAdmin {string},{string},{string}")
	    public void  Navigate_to_Hierarchy_and_verify_move_styles_from_not_present_in_season_brand_and_department_as_NonAdmin(String SeasonName,String BrandName,String DeptName) throws Throwable {
	      	Commonactions.isElementPresent(pc.getHeaderSearch());
	    	ca.click(pc.getHeaderSearch());
	    	Commonactions.isElementPresent(lct.getTextSeason());
	    	ca.click(lct.getTextSeason());
			Commonactions.isElementPresent(pc.getHeaderSearchField());
			ca.insertText(pc.getHeaderSearchField(), SeasonName);
			ca.eleToBeClickable();
			ca.click(pc.getSearchIcon());
			Commonactions.isElementPresent(driver.findElement(By.xpath("//a[@class='csi-card-anchor' and @title='"+SeasonName+"']")));
			ca.click(driver.findElement(By.xpath("//a[@class='csi-card-anchor' and @title='"+SeasonName+"']")));
			Commonactions.isElementPresent(pc.getHierarchyTab());
	    	ca.click(pc.getHierarchyTab());
	       	Commonactions.isElementPresent(pc.getAllStylesTab());
	    	ca.click(pc.getAllStylesTab());
	 		Commonactions.isElementPresent(pc.getStylesTabStyleBtn());
	    	ca.click(pc.getStylesTabStyleBtn());
			Commonactions.isElementNotPresent(pc.getMoveStyleFromStylesTabBtn());
			System.out.println("Move from style action is not visible under Season as NonAdmin' ");
			//for Brand
	      	Commonactions.isElementPresent(pc.getHeaderSearch());
	    	ca.click(pc.getHeaderSearch());
	    	Commonactions.isElementPresent(lct.getTextBrand());
	    	ca.click(lct.getTextBrand());
			Commonactions.isElementPresent(pc.getHeaderSearchField());
			ca.insertText(pc.getHeaderSearchField(), BrandName);
			ca.eleToBeClickable();
			ca.click(pc.getSearchIcon());
			Commonactions.isElementPresent(driver.findElement(By.xpath("//a[@class='csi-card-anchor' and @title='"+BrandName+"']")));
			ca.click(driver.findElement(By.xpath("//a[@class='csi-card-anchor' and @title='"+BrandName+"']")));
			Commonactions.isElementPresent(pc.getHierarchyTab());
	    	ca.click(pc.getHierarchyTab());
	       	Commonactions.isElementPresent(pc.getAllStylesTab());
	    	ca.click(pc.getAllStylesTab());
	 		Commonactions.isElementPresent(pc.getStylesTabStyleBtn());
	    	ca.click(pc.getStylesTabStyleBtn());
			Commonactions.isElementNotPresent(pc.getMoveStyleFromStylesTabBtn());
			System.out.println("Move from style action is not visible under Brand as NonAdmin ' ");
			//For Department
	      	Commonactions.isElementPresent(pc.getHeaderSearch());
	    	ca.click(pc.getHeaderSearch());
	    	Commonactions.isElementPresent(lct.getTextDept());
	    	ca.click(lct.getTextDept());
			Commonactions.isElementPresent(pc.getHeaderSearchField());
			ca.insertText(pc.getHeaderSearchField(), DeptName);
			ca.eleToBeClickable();
			ca.click(pc.getSearchIcon());
			Commonactions.isElementPresent(driver.findElement(By.xpath("//a[@class='csi-card-anchor' and @title='"+DeptName+"']")));
			ca.click(driver.findElement(By.xpath("//a[@class='csi-card-anchor' and @title='"+DeptName+"']")));
			Commonactions.isElementPresent(pc.getHierarchyTab());
	    	ca.click(pc.getHierarchyTab());
	       	Commonactions.isElementPresent(pc.getAllStylesTab());
	    	ca.click(pc.getAllStylesTab());
	 		Commonactions.isElementPresent(pc.getStylesTabStyleBtn());
	    	ca.click(pc.getStylesTabStyleBtn());
			Commonactions.isElementNotPresent(pc.getMoveStyleFromStylesTabBtn());
			System.out.println("Move from style action is not visible under Department as NonAdmin ' ");
	    }	
	    @Then("For Style Create price list, verify Approve action is visible {string}")
	    public void  For_Style_Create_price_list_verify_Approve_action_is_visible(String StylePriceList) throws Throwable {
	    	Commonactions.isElementPresent(pc.getStyleStyleTab());
			ca.click(pc.getStyleStyleTab());
			Commonactions.isElementPresent(pc.getStylePropertiesTab());
			ca.click(pc.getStylePropertiesTab());
			Commonactions.isElementPresent(pc.getStylesSourcing());
			ca.click(pc.getStylesSourcing());
			Commonactions.isElementPresent(sup.getSupplierquotes());
			ca.click(sup.getSupplierquotes());
			Commonactions.isElementPresent(sup.getNewPriceList());
			ca.click(sup.getNewPriceList());
			ca.eleToBeClickable();
			WebElement a1 = ca.activeElement();
			ca.eleToBeClickable();
			a1.sendKeys(Keys.DELETE);
			ca.eleToBeClickable();
			a1.sendKeys(StylePriceList);
			ca.eleToBeClickable();
			ca.jsMouseOver();
			System.out.println("Style Sourcing Price List Created successfully");
			Commonactions.isElementPresent(driver.findElement(By.xpath("(//a[text()='"+StylePriceList+"']//following::td//span[contains(@data-csi-automation,'actions-Style-PriceList')])[1]")));
			ca.mouseOver(driver.findElement(By.xpath("(//a[text()='"+StylePriceList+"']//following::td//span[contains(@data-csi-automation,'actions-Style-PriceList')])[1]")));
			ca.eleToBeClickable();
			ca.click(driver.findElement(By.xpath("(//a[text()='"+StylePriceList+"']//following::td//span[contains(@data-csi-automation,'actions-Style-PriceList')])[1]")));
			ca.eleToBeClickable();
			Commonactions.isElementPresent(pc.getApproveLabel());
			System.out.println("Approve Link is visible for Admin User ' ");
	    }
	    @Then("For Style Create price list, verify Approve action is not visible {string}")
	    public void  For_Style_Create_price_list_verify_Approve_action_is_not_visible(String StylePriceList) throws Throwable {
	    	Commonactions.isElementPresent(pc.getStyleStyleTab());
			ca.click(pc.getStyleStyleTab());
			Commonactions.isElementPresent(pc.getStylePropertiesTab());
			ca.click(pc.getStylePropertiesTab());
			Commonactions.isElementPresent(pc.getStylesSourcing());
			ca.click(pc.getStylesSourcing());
			Commonactions.isElementPresent(sup.getSupplierquotes());
			ca.click(sup.getSupplierquotes());
			Commonactions.isElementPresent(sup.getNewPriceList());
			ca.click(sup.getNewPriceList());
			ca.eleToBeClickable();
			WebElement a1 = ca.activeElement();
			ca.eleToBeClickable();
			a1.sendKeys(Keys.DELETE);
			ca.eleToBeClickable();
			a1.sendKeys(StylePriceList);
			ca.eleToBeClickable();
			ca.jsMouseOver();
			
			//ca.insertText(a1, StylePriceList);
			//ca.eleToBeClickable();
			//a1.sendKeys(Keys.TAB);
			//ca.eleToBeClickable();
			System.out.println("Style Sourcing Price List Created successfully");
			Commonactions.isElementPresent(driver.findElement(By.xpath("(//a[text()='"+StylePriceList+"']//following::td//span[contains(@data-csi-automation,'actions-Style-PriceList')])[1]")));
			ca.mouseOver(driver.findElement(By.xpath("(//a[text()='"+StylePriceList+"']//following::td//span[contains(@data-csi-automation,'actions-Style-PriceList')])[1]")));
			ca.eleToBeClickable();
			ca.click(driver.findElement(By.xpath("(//a[text()='"+StylePriceList+"']//following::td//span[contains(@data-csi-automation,'actions-Style-PriceList')])[1]")));
			ca.eleToBeClickable();
			Commonactions.isElementNotPresent(pc.getApproveLabel());
			System.out.println("Approve Link is not visible for Non-Admin User ' ");
	    }
	    
	    
	    @Then("Create New SKU and verify the None option is available {string},{string},{string}")
	    public void  Create_New_SKU_and_verify_the_None_option_is_available(String SKUNames,String ColorwayName,String SizeName) throws Throwable {  
	    	String[] SKUName = SKUNames.split(",");
	    	Commonactions.isElementPresent(pc.getStyleStyleTab());
			ca.click(pc.getStyleStyleTab());
			Commonactions.isElementPresent(pc.getStylePropertiesTab());
			ca.click(pc.getStylePropertiesTab());
		   	Commonactions.isElementPresent(pc.getStyleSKUTab());
			ca.click(pc.getStyleSKUTab());
			Commonactions.isElementPresent(pc.getNewStyleSKU());
			ca.click(pc.getNewStyleSKU());
			Commonactions.isElementPresent(pc.getSyleSKUValue());
			ca.insertText(pc.getSyleSKUValue(), SKUName[0]);
			Commonactions.isElementPresent(pc.getSKUSizeDDL1());
			ca.click(pc.getSKUSizeDDL1());
			Commonactions.isElementPresent(pc.getNonelabel1());
			System.out.println("None option is present for Size Selection in SKU pop up Window ");
			Commonactions.isElementPresent(lct.getAvbSize());
			ca.click(lct.getAvbSize());
			Commonactions.isElementPresent(pc.getSKUColorwayDDL1());
			ca.click(pc.getSKUColorwayDDL1());
			Commonactions.isElementPresent(pc.getNonelabel2());
			System.out.println("None option is present for Colorway Selection in SKU pop up Window ");

			Commonactions.isElementPresent(lct.getAvbColorway());
			ca.click(lct.getAvbColorway());
			Commonactions.isElementPresent(mp.getSave_btn1());
			ca.click(mp.getSave_btn1());
			ca.eleToBeClickable();
			//Select Colorway and Size
			Commonactions.isElementPresent(driver.findElement(By.xpath("//a[text()='"+SKUName[0]+"']//following::td[@data-csi-act='RealizedColor::0']")));
			ca.click(driver.findElement(By.xpath("//a[text()='"+SKUName[0]+"']//following::td[@data-csi-act='RealizedColor::0']")));
			ca.eleToBeClickable();
			WebElement a1 = ca.activeElement();
			ca.eleToBeClickable();
			a1.sendKeys(Keys.DELETE);
			ca.eleToBeClickable();
			a1.sendKeys(ColorwayName);
			ca.eleToBeClickable();
			ca.jsMouseOver();
			ca.eleToBeClickable();
			WebElement a2 = ca.activeElement();
			ca.eleToBeClickable();
			ca.insertText(a2,SizeName);
			ca.eleToBeClickable();
			ca.jsMouseOver();
	    }
	    
	    @Then("Create another SKU and verify in status bar shows duplicate ignored {string},{string},{string}")
	    public void  Create_another_SKU_and_verify_in_status_bar_shows_duplicate_ignored(String SKUNames,String ColorwayName,String SizeName) throws Throwable {  
	    	String[] SKUName = SKUNames.split(",");
	    	Commonactions.isElementPresent(pc.getStyleStyleTab());
			ca.click(pc.getStyleStyleTab());
			Commonactions.isElementPresent(pc.getStylePropertiesTab());
			ca.click(pc.getStylePropertiesTab());
		   	Commonactions.isElementPresent(pc.getStyleSKUTab());
			ca.click(pc.getStyleSKUTab());
			Commonactions.isElementPresent(pc.getNewStyleSKU());
			ca.click(pc.getNewStyleSKU());
			Commonactions.isElementPresent(pc.getSyleSKUValue());
			ca.insertText(pc.getSyleSKUValue(),SKUName[1]);
			Commonactions.isElementPresent(pc.getSKUSizeDDL2());
			ca.insertText(pc.getSKUSizeDDL2(),SizeName);
			ca.eleToBeClickable();
			ca.click(lct.getRoleItems());
			ca.eleToBeClickable();

			Commonactions.isElementPresent(lct.getAvbSize());
			ca.click(lct.getAvbSize());
    		Commonactions.isElementPresent(pc.getSKUColorwayDDL2());
			ca.insertText(pc.getSKUColorwayDDL2(),ColorwayName);
			ca.eleToBeClickable();
			ca.click(lct.getRoleItems2());
			ca.eleToBeClickable();
			
			Commonactions.isElementPresent(lct.getAvbColorway());
			ca.click(lct.getAvbColorway());
			Commonactions.isElementPresent(mp.getSave_btn1());
			ca.click(mp.getSave_btn1());
			ca.eleToBeClickable();
			//Duplicate SKU is not created
			Commonactions.isElementPresent(lct.getSKUignored());
			System.out.println("Duplicate SKU is not created and the status bar shows duplicate ignored message ");
		    }
	    @And("Navigate to Existing Material {string}")
	    public void Navigate_to_Existing_Material(String MatName) throws Throwable {

	    	Commonactions.isElementPresent(hp.getMaterialBtn());
			ca.click(hp.getMaterialBtn());
			Commonactions.isElementPresent(driver.findElement(By.xpath("//a[text()='"+MatName+"']")));
			ca.click(driver.findElement(By.xpath("//a[text()='"+MatName+"']")));
			Commonactions.isElementPresent(sm.getMproperties());
			ca.click(sm.getMproperties());
		    }
	    @Then("Create New SKU for Material and Verify None option is visible in dropdown {string}")
	    public void  Create_New_SKU_for_Material_and_verify_the_None_option_is_visible_in_dropdown(String SKUNames) throws Throwable {  
	    	String[] SKUName = SKUNames.split(",");
	   
		   	Commonactions.isElementPresent(mp.getSKU());
			ca.click(mp.getSKU());
			Commonactions.isElementPresent(mp.getNew_mat_sku_Btn());
			ca.click(mp.getNew_mat_sku_Btn());
			Commonactions.isElementPresent(mp.getMat_sku_value());
			ca.insertText(mp.getMat_sku_value(), SKUName[2]);
			Commonactions.isElementPresent(pc.getSKUMatColorwayDDL1());
			ca.click(pc.getSKUMatColorwayDDL1());
			Commonactions.isElementPresent(pc.getNonelabel1());
			System.out.println("None option is present for Colorway Selection for Material in SKU pop up Window ");
			Commonactions.isElementPresent(lct.getDDSKU());
			ca.click(lct.getDDSKU());
			Commonactions.isElementPresent(mp.getSave_btn1());
			ca.click(mp.getSave_btn1());
			ca.eleToBeClickable();
		    }
	    @Then("Add document properties through custom view in Style")
	    public void Add_document_properties_through_custom_view_in_Style() throws Throwable {
			//Creating View under Properties section
	    	Commonactions.isElementPresent(pc.getStyleStyleTab());
			ca.click(pc.getStyleStyleTab());
	    	Commonactions.isElementPresent(pc.getStylePropertiesTab());
			ca.click(pc.getStylePropertiesTab());
			Commonactions.isElementPresent(pc.getStylePropView());
			ca.click(pc.getStylePropView());
			ca.eleToBeClickable();
			ca.click(pc.getStylePropViewManage());
			ca.eleToBeClickable();
			ca.click(lct.getAPIviews());
			ca.eleToBeClickable();
			ca.click(lct.getDocOpt());
			Commonactions.isElementPresent(fp.getAdd_Btn());
			ca.click(fp.getAdd_Btn());
			ca.mouseOver(mp.getSave_btn1());
			Commonactions.isElementPresent(mp.getSave_btn1());
			ca.click(mp.getSave_btn1());
			ca.eleToBeClickable();
			System.out.println("The Custom View is modified created for 'Style Properties' to show Documents and Comments ");
			ca.eleToBeClickable();
	       }
	    @Then("Verify the Add 3D Document not visible in menu list for Style")
	    public void Verify_the_Add_3D_Document_not_visible_in_menu_list_for_Style() throws Throwable {

	        Commonactions.isElementPresent(pc.getStylePropertiesTab());
	    	ca.click(pc.getStylePropertiesTab());
	     	Commonactions.isElementPresent(pc.getDocumentslabel());
	    	ca.mouseOver(pc.getDocumentslabel());
	    	Commonactions.isElementPresent(pc.getDocumentsArea());
	    	ca.click(pc.getDocumentsArea());
	    	Commonactions.isElementPresent(pc.getViewDocumentsLink());
	    	ca.click(pc.getViewDocumentsLink());
	    	Commonactions.isElementPresent(pc.getAddDocumentsDDLBtn());
	    	ca.click(pc.getAddDocumentsDDLBtn());
	    	ca.eleToBeClickable();
	    	Commonactions.isElementNotPresent(pc.getAdd3DDocumentsLink());
	    
			Commonactions.isElementPresent(pc.getClose_btn());
			ca.click(pc.getClose_btn());
			System.out.println("Add 3D Document not visible in menu list in Style' ");
	    }
	    @Then("Navigate to SKU of the style and Add document properties through custom view {string}")
	    public void Navigate_to_SKU_of_the_style_and_Add_document_properties_through_custom_view(String string1) throws Throwable {
	    	String[] SKUName = string1.split(",");
	    	Commonactions.isElementPresent(pc.getStyleSKUTab());
			ca.click(pc.getStyleSKUTab());
			Commonactions.isElementPresent(pc.getNewStyleSKU());
			//Creating the custom view
	    	Commonactions.isElementPresent(driver.findElement(By.xpath("//a[text()='"+SKUName[0]+"']")));
			ca.click(driver.findElement(By.xpath("//a[text()='"+SKUName[0]+"']")));
	    	Commonactions.isElementPresent(pc.getSKUNodeSKUTab());
			ca.click(pc.getSKUNodeSKUTab());
	    	Commonactions.isElementPresent(pc.getSKUPropView());
			ca.click(pc.getSKUPropView());
			Commonactions.isElementPresent(pc.getSKUPropViewManage());
			ca.click(pc.getSKUPropViewManage());
			ca.eleToBeClickable();
			ca.click(lct.getTxtSkuViews());
			ca.eleToBeClickable();
			ca.click(lct.getDocOpt());
			Commonactions.isElementPresent(fp.getAdd_Btn());
			ca.click(fp.getAdd_Btn());
			ca.mouseOver(mp.getSave_btn1());
			Commonactions.isElementPresent(mp.getSave_btn1());
			ca.click(mp.getSave_btn1());
			ca.eleToBeClickable();
			System.out.println("The Custom View is modified created for 'SKU Style Properties' to show Documents and Comments ");
			ca.eleToBeClickable();
	       }    
	    @Then("Verify the Add 3D Document is visible in menu list for Style SKU")
	    public void Verify_the_Add_3D_Document_is_visible_in_menu_list_for_Style_SKU() throws Throwable {

	        Commonactions.isElementPresent(pc.getSKUNodeSKUTab());
	    	ca.click(pc.getSKUNodeSKUTab());
	     	Commonactions.isElementPresent(pc.getDocumentslabel());
	    	ca.mouseOver(pc.getDocumentslabel());
	    	Commonactions.isElementPresent(pc.getDocumentsArea());
	    	ca.click(pc.getDocumentsArea());
	    	Commonactions.isElementPresent(pc.getViewDocumentsLink());
	    	ca.click(pc.getViewDocumentsLink());
	    	Commonactions.isElementPresent(pc.getAddDocumentsDDLBtn());
	    	ca.click(pc.getAddDocumentsDDLBtn());
	    	ca.eleToBeClickable();
	    	Commonactions.isElementPresent(pc.getAdd3DDocumentsLink());
	    
			Commonactions.isElementPresent(pc.getClose_btn());
			ca.click(pc.getClose_btn());
			System.out.println("Add 3D Document is visible in menu list in Style SKU' ");
	    }
	    
	   @Then("Navigate to Document tab and verify fields are visible")
       public void Navigate_to_Document_tab_and_verify_fields_are_visible() throws Throwable {
	    	Commonactions.isElementPresent(dp.getUserDocuments());
	    	ca.click(dp.getUserDocuments());
	    	Commonactions.isElementPresent(dp.getExpand());
	    	ca.click(dp.getExpand());
	    	Commonactions.isElementPresent(pc.getAdd3DDocumentsLink());
	    	ca.click(pc.getAdd3DDocumentsLink());
	    	Commonactions.isElementPresent(lct.getTrDoc());
	    	Commonactions.isElementPresent(lct.getZipFile());
			ca.click(pc.getCancelBtn());
			ca.eleToBeClickable();
			System.out.println("Document and 3D Zip File fields are available for the Add3DDocuments under SKU Documents");
			
	    }
	    @Then("In Style verify reference document should not be visible")
	    public void In_Style_verify_reference_document_should_not_be_visible() throws Throwable {

	        Commonactions.isElementPresent(pc.getStylePropertiesTab());
	    	ca.click(pc.getStylePropertiesTab());
	     	Commonactions.isElementPresent(dp.getUserDocuments());
	    	ca.click(dp.getUserDocuments());
	    	Commonactions.isElementNotPresent(pc.getRefDocumentsBtn());
			System.out.println("In Style reference document is not visible' ");
	    }
	    @Then("In Material verify reference document should not be visible")
	    public void In_Material_verify_reference_document_should_not_be_visible() throws Throwable {


			Commonactions.isElementPresent(sm.getMproperties());
			ca.click(sm.getMproperties());
	     	Commonactions.isElementPresent(dp.getUserDocuments());
	    	ca.click(dp.getUserDocuments());
	    	Commonactions.isElementNotPresent(pc.getRefDocumentsBtn());
			System.out.println("In Material reference document is not visible' ");
	    } 
	    
	    @Then("Navigate to Colored Material and verify reference document should not be visible {string}")
	    public void Navigate_to_Colored_Material_and_verify_reference_document_should_not_be_visible(String ColoredMatName) throws Throwable {
			Commonactions.isElementPresent(sm.getMproperties());
			ca.click(sm.getMproperties());
			Commonactions.isElementPresent(driver.findElement(By.xpath("//a[text()='"+ColoredMatName+"']")));
			ca.click(driver.findElement(By.xpath("//a[text()='"+ColoredMatName+"']")));
			ca.eleToBeClickable();
	     	Commonactions.isElementPresent(dp.getUserDocuments());
	    	ca.click(dp.getUserDocuments());
	    	Commonactions.isElementNotPresent(pc.getRefDocumentsBtn());
			System.out.println("In Colored Material reference document is not visible' ");
	    } 
	    
} 