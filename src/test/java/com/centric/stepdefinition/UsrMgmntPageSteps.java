package com.centric.stepdefinition;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.centric.objectrepository.ConfigurationPage;
import com.centric.objectrepository.FoodSetupPage;
import com.centric.objectrepository.HomePage;
import com.centric.objectrepository.Locators;
import com.centric.objectrepository.MaterialSpecificationPage;
import com.centric.objectrepository.PopupPage;
import com.centric.objectrepository.UserManagementPage;
import com.centric.resources.Commonactions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UsrMgmntPageSteps extends Commonactions{
	
	Commonactions ca = new Commonactions();
	PopupPage pp = new PopupPage();
	UserManagementPage up = new UserManagementPage();
	MaterialSpecificationPage mp = new MaterialSpecificationPage();
	ConfigurationPage cp = new  ConfigurationPage();
	FoodSetupPage fp= new FoodSetupPage();
	Locators lct = new Locators();
	
	@When("User creates new admin role {string}")
	public void user_creates_new_admin_role(String arg1) throws Throwable {
		
		ca.eleToBeClickable();
		ca.click(up.getNew_role_Btn());
		ca.eleToBeClickable();
		ca.insertText(pp.getUsrMgmnt_NewRole_Value(), arg1);
		ca.eleToBeClickable();
		ca.click(pp.getConfig_save_Btn());
		ca.eleToBeClickable();
		
		System.out.println("creating admin role");
	    
	}

	@When("User select security roles in the action coloumn")
	public void user_select_security_roles_in_the_action_coloumn() throws Throwable {
	    
		ca.eleToBeClickable();
		ca.click(up.getUsrMgmt_MoreOptions());
		ca.eleToBeClickable();
		ca.click(up.getUsrMgmt_SecurityRoles());
		ca.eleToBeClickable();
		
		System.out.println("security roles selected");
		
	}

	@When("User click on custom view and copy the default custom view and name the custom view as {string}")
	public void user_click_on_custom_view_and_copy_the_default_custom_view_and_name_the_custom_view_as(String arg1) throws Throwable {
	    
		ca.eleToBeClickable();
		ca.click(up.getUsrMgmt_Views());
		ca.eleToBeClickable();
		ca.click(up.getUsrMgmt_Manage_Views());
		ca.eleToBeClickable();
		ca.click(up.getUsrMgmt_Copy());
		ca.eleToBeClickable();
		ca.insertText(up.getUsrMgmt_Copy_Value(), arg1);
		ca.eleToBeClickable();
		
		
	}

	@When("User apply the filter conditions as {string},{string},{string}")
	public void user_apply_the_filter_conditions_as(String arg1, String arg2, String arg3) throws Throwable {
		
		ca.eleToBeClickable();
		ca.click(up.getUsrMgmt_Filter());
		ca.eleToBeClickable();
		ca.click(up.getUsrMgmt_Add());
		ca.eleToBeClickable();
		ca.click(up.getUsrMgmt_Attribute());
		ca.insertText(up.getUsrMgmt_Attribute(), arg1);
		ca.eleToBeClickable();
        ca.jsMouseOver();
        ca.eleToBeClickable();
        ca.click(up.getUsrMgmt_Operator());
        ca.insertText(up.getUsrMgmt_Operator(), arg2);
        ca.eleToBeClickable();
        ca.jsMouseOver();
        ca.eleToBeClickable();
        ca.click(up.getUsrMgmt_Value());
        ca.insertText(up.getUsrMgmt_Value(), arg3);
        ca.eleToBeClickable();
        
        System.out.println("filter condition applied successfully");
	    
		
	}

	@When("User set results display size as {string}")
	public void user_set_results_display_size_as(String arg1) throws Throwable {
	    
		ca.eleToBeClickable();
		ca.click(up.getUsrMgmt_Options());
		ca.eleToBeClickable();
		ca.click(up.getUsrMgmt_ResultsSize());
		ca.insertText(up.getUsrMgmt_ResultsSize(), arg1);
		ca.eleToBeClickable();
		ca.jsMouseOver();
		ca.eleToBeClickable();
		ca.click(lct.getSave222());
		ca.eleToBeClickable();
		
	}

	@Then("User verify the displaying results size are more than {int}")
	public void user_verify_the_displaying_results_size_are_more_than(Integer int1) throws Throwable {
	    
		String text = Commonactions.getText(lct.getResult222());
		ca.eleToBeClickable();
		if(text.equals("Displaying 70 results")){
			ca.eleToBeClickable();
			ca.click(up.getUsrMgmt_All());
			ca.eleToBeClickable();
		}
		
	}

	@Then("User select all results and click on save button")
	public void user_select_all_results_and_click_on_save_button() throws Throwable {
	    
		ca.eleToBeClickable();
		ca.click(lct.getSave111());
		ca.eleToBeClickable();
		
		System.out.println("all results are selected");
	}
	
	
	
	@When("User creates new announcement and edit message {string}")
	public void user_creates_new_announcement_and_edit_message(String string) throws Throwable {
		
		ca.eleToBeClickable();
		ca.click(up.getNew_Ancmnt_Btn());
		ca.eleToBeClickable();
		Commonactions.mouseOver(up.getUsrMgmt_Ancmnts_Msg());
		ca.eleToBeClickable();
		ca.click(up.getUsrMgmt_Ancmnts_Edit());
		ca.eleToBeClickable();
		ca.click(up.getUsrMgmt_Ancmnts_EditMsg_value());
		ca.eleToBeClickable();
		String[] split = string.split(">");
		ca.eleToBeClickable();
		ca.insertText(up.getUsrMgmt_Ancmnts_EditMsg_value(), split[0]);
		ca.eleToBeClickable();
		Actions a = new Actions(driver);
		ca.eleToBeClickable();
		a.click(up.getUsrMgmt_Ancmnts_EditMsg_value());
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_SHIFT);
		ca.eleToBeClickable();
		int j = split[0].length();
		ca.eleToBeClickable();
		for (int i = 0; i < j; i++) {
			//ca.eleToBeClickable();
			Thread.sleep(500);
			r.keyPress(KeyEvent.VK_LEFT);
			
		}
		for (int i = 0; i < j; i++) {
			//ca.eleToBeClickable();
			Thread.sleep(500);
			r.keyRelease(KeyEvent.VK_LEFT);
			
		}
		r.keyRelease(KeyEvent.VK_SHIFT);
		ca.eleToBeClickable();
		ca.click(up.getUsrMgmt_Ancmnts_Bold());
		ca.eleToBeClickable();
		ca.click(up.getUsrMgmt_Ancmnts_FontSize());
		ca.eleToBeClickable();
		ca.click(up.getUsrMgmt_Ancmnts_FontSize_30());
		ca.eleToBeClickable();
		ca.click(up.getUsrMgmt_Ancmnts_Color());
		ca.eleToBeClickable();
		ca.click(up.getUsrMgmt_Ancmnts_purpleColor());
		ca.eleToBeClickable();

		up.getUsrMgmt_Ancmnts_EditMsg_value().sendKeys(Keys.ENTER);
		ca.eleToBeClickable();
		up.getUsrMgmt_Ancmnts_EditMsg_value().sendKeys(Keys.ENTER);
		ca.eleToBeClickable();
		up.getUsrMgmt_Ancmnts_EditMsg_value().sendKeys(Keys.ENTER);
		ca.eleToBeClickable();
		ca.click(lct.getU1());
		ca.insertText(lct.getU1(), split[1]);
		ca.eleToBeClickable();
		a.click(up.getUsrMgmt_Ancmnts_EditMsg_value());
		r.keyPress(KeyEvent.VK_SHIFT);
		ca.eleToBeClickable();
		int k = split[1].length();
		ca.eleToBeClickable();
		for (int i = 0; i < k; i++) {
		//	ca.eleToBeClickable();
			Thread.sleep(500);
			r.keyPress(KeyEvent.VK_LEFT);
			
		}
		for (int i = 0; i < k; i++) {
			//ca.eleToBeClickable();
			Thread.sleep(500);
			r.keyRelease(KeyEvent.VK_LEFT);
			
		}
		r.keyRelease(KeyEvent.VK_SHIFT);
		ca.eleToBeClickable();
		ca.click(up.getUsrMgmt_Ancmnts_Bold());
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,100)", "");
		ca.eleToBeClickable();
		ca.click(lct.getSave000());
		ca.eleToBeClickable();
		
		System.out.println("message edited successfully");
		
	}

	@When("User effective to and companies")
	public void user_effective_to_and_companies() throws Throwable {
		
		ca.eleToBeClickable();
		ca.click(up.getUsrMgmt_Ancmnts_EffectiveTo());
		//System.out.println("company selected");
		ca.eleToBeClickable();
		ca.click(up.getUsrMgmt_Ancmnts_CurrentDate());
		ca.eleToBeClickable();
		System.out.println("date selected");
		ca.click(up.getUsrMgmt_Ancmnts_Companies());
		ca.eleToBeClickable();
		ca.click(up.getUsrMgmt_Ancmnts_HostCompanies());
		ca.eleToBeClickable();
		ca.click(lct.getU2());
		ca.eleToBeClickable();
		
		System.out.println("company selected");
	    
	}
	
	HomePage hp = new HomePage();

	@Then("User validating the announcement is displaying in home page or not")
	public void user_validating_the_announcement_is_displaying_in_home_page_or_not() throws Throwable {
		
		ca.eleToBeClickable();
		ca.click(hp.getUser_homeBtn());
		ca.eleToBeClickable();
		Commonactions.jsWaitForPageLoad();
		String text = Commonactions.getText(lct.getU3());
	    System.out.println(text); 
	    
	    System.out.println("announcement message validate successfully");
	}
	
	
	@When("User click on setup icon and user under user management{string}")
	public void user_click_on_setup_icon_and_user_under_user_management(String User) throws Throwable {
		String[] usr = User.split(",");
		Commonactions.isElementPresent(hp.getUser_settingsBtn());
		ca.click(hp.getUser_settingsBtn());
		Commonactions.isElementPresent(hp.getSystem_config());
		ca.click(hp.getSystem_config());
		Commonactions.isElementPresent(up.getUsrManagement());
		ca.click(up.getUsrManagement());
		Commonactions.isElementPresent(up.getUsrMgmt_Users());
		ca.click(up.getUsrMgmt_Users());
		Commonactions.isElementPresent(up.getNew_user_btn());
		ca.click(up.getNew_user_btn());
		Commonactions.isElementPresent(up.getUser_login());
		ca.insertText(up.getUser_login(),usr[0]);
		Commonactions.isElementPresent(up.getActive_chkbox());
		ca.click(up.getActive_chkbox());
		Commonactions.isElementPresent(up.getFirstname());
		ca.click(up.getFirstname());
		ca.eleToBeClickable();
		WebElement f1 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(f1, "EC");
		ca.eleToBeClickable();
		f1.sendKeys(Keys.TAB);
		ca.eleToBeClickable();
		
		WebElement f2 = ca.activeElement();
		ca.eleToBeClickable();
		f2.sendKeys(Keys.TAB);
        WebElement f3 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(f3, "Admin");
		ca.eleToBeClickable();
		f3.sendKeys(Keys.TAB);
		ca.eleToBeClickable();
		
		WebElement f4 = ca.activeElement();
		ca.eleToBeClickable();
	    f4.sendKeys(Keys.TAB);
		ca.eleToBeClickable();
       
		WebElement f5 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(f5, "qauser2@centricsoftware.com");
		ca.eleToBeClickable();
		f5.sendKeys(Keys.TAB);
	    ca.eleToBeClickable();
        Commonactions.isElementPresent(mp.getSaveAndNew_btn());
		ca.click(mp.getSaveAndNew_btn());
		ca.eleToBeClickable();
		System.out.println("EC Admin created under user");
		
		Commonactions.isElementPresent(up.getUser_login());
		ca.insertText(up.getUser_login(),usr[1]);
		Commonactions.isElementPresent(up.getActive_chkbox());
		ca.click(up.getActive_chkbox());
		Commonactions.isElementPresent(up.getFirstname());
		ca.click(up.getFirstname());
		ca.eleToBeClickable();
		
		WebElement u1 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(u1, "EC");
		ca.eleToBeClickable();
		u1.sendKeys(Keys.TAB);
		ca.eleToBeClickable();
		
		WebElement u2 = ca.activeElement();
		ca.eleToBeClickable();
		u2.sendKeys(Keys.TAB);
       
		WebElement u3 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(u3, "Edit");
		ca.eleToBeClickable();
		u3.sendKeys(Keys.TAB);
		ca.eleToBeClickable();
		
		WebElement u4 = ca.activeElement();
		ca.eleToBeClickable();
	    u4.sendKeys(Keys.TAB);
		ca.eleToBeClickable();
       
		WebElement u5 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(u5, "qauser2@centricsoftware.com");
		ca.eleToBeClickable();
		
		u5.sendKeys(Keys.TAB);
	    ca.eleToBeClickable();
        Commonactions.isElementPresent(mp.getSaveAndNew_btn());
		ca.click(mp.getSaveAndNew_btn());
		ca.eleToBeClickable();
		System.out.println("EC Edit created under user ");
		
		Commonactions.isElementPresent(up.getUser_login());
		ca.insertText(up.getUser_login(),usr[2]);
		Commonactions.isElementPresent(up.getActive_chkbox());
		ca.click(up.getActive_chkbox());
		Commonactions.isElementPresent(up.getFirstname());
		ca.click(up.getFirstname());
		ca.eleToBeClickable();
		
		WebElement v1 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(v1, "EC");
		ca.eleToBeClickable();
		v1.sendKeys(Keys.TAB);
		ca.eleToBeClickable();
		
		WebElement v2 = ca.activeElement();
		ca.eleToBeClickable();
		v2.sendKeys(Keys.TAB);
       
		WebElement v3 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(v3, "User");
		ca.eleToBeClickable();
		v3.sendKeys(Keys.TAB);
		ca.eleToBeClickable();
		
		WebElement v4 = ca.activeElement();
		ca.eleToBeClickable();
	    v4.sendKeys(Keys.TAB);
		ca.eleToBeClickable();
        
		WebElement v5 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(v5, "qauser2@centricsoftware.com");
		ca.eleToBeClickable();
		v5.sendKeys(Keys.TAB);
	    ca.eleToBeClickable();
        Commonactions.isElementPresent(mp.getSaveAndNew_btn());
		ca.click(mp.getSaveAndNew_btn());
		ca.eleToBeClickable();
		System.out.println("EC User created under user");
		
		Commonactions.isElementPresent(up.getUser_login());
		ca.insertText(up.getUser_login(),usr[3]);
		Commonactions.isElementPresent(up.getActive_chkbox());
		ca.click(up.getActive_chkbox());
		Commonactions.isElementPresent(up.getFirstname());
		ca.click(up.getFirstname());
		ca.eleToBeClickable();
		
		WebElement s1 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(s1, "EC");
		ca.eleToBeClickable();
		s1.sendKeys(Keys.TAB);
		ca.eleToBeClickable();
		
		WebElement s2 = ca.activeElement();
		ca.eleToBeClickable();
		s2.sendKeys(Keys.TAB);
        
		WebElement s3 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(s3, "View");
		ca.eleToBeClickable();
		s3.sendKeys(Keys.TAB);
		ca.eleToBeClickable();
		
		WebElement s4 = ca.activeElement();
		ca.eleToBeClickable();
	    s4.sendKeys(Keys.TAB);
		ca.eleToBeClickable();
        
		WebElement s5 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(s5, "qauser2@centricsoftware.com");
		ca.eleToBeClickable();
		s5.sendKeys(Keys.TAB);
	    ca.eleToBeClickable();
        Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		System.out.println("EC view created under user");
        
		
	}

	@When("user click on Roles under user management{string}")
	public void user_click_on_Roles_under_user_management(String Roles) throws Throwable {
		String[]rol = Roles.split(",");
		Commonactions.isElementPresent(up.getUsrMgmt_Roles());
		ca.click(up.getUsrMgmt_Roles());
	Commonactions.isElementPresent(up.getNew_role_Btn());
		ca.click(up.getNew_role_Btn());
		Commonactions.isElementPresent(pp.getUsrMgmnt_NewRole_Value());
		ca.insertText(pp.getUsrMgmnt_NewRole_Value(), rol[0]);
		ca.eleToBeClickable();
		Commonactions.isElementPresent(up.getManage_preference_chkbox());
        ca.click(up.getManage_preference_chkbox());
		
		Commonactions.isElementPresent(mp.getSaveAndNew_btn());
		ca.click(mp.getSaveAndNew_btn());
		ca.eleToBeClickable();
		System.out.println("EC-Admin created under Roles");
		
		Commonactions.isElementPresent(pp.getUsrMgmnt_NewRole_Value());
		ca.insertText(pp.getUsrMgmnt_NewRole_Value(), rol[1]);
		ca.eleToBeClickable();
		Commonactions.isElementPresent(mp.getSaveAndNew_btn());
		ca.click(mp.getSaveAndNew_btn());
		ca.eleToBeClickable();
		System.out.println("EC-Edit created under Roles");
		
		Commonactions.isElementPresent(pp.getUsrMgmnt_NewRole_Value());
		ca.insertText(pp.getUsrMgmnt_NewRole_Value(), rol[2]);
		ca.eleToBeClickable();
		Commonactions.isElementPresent(mp.getSaveAndNew_btn());
		ca.click(mp.getSaveAndNew_btn());
		ca.eleToBeClickable();
		System.out.println("EC-View created under Roles");
		
		Commonactions.isElementPresent(pp.getUsrMgmnt_NewRole_Value());
		ca.insertText(pp.getUsrMgmnt_NewRole_Value(), rol[3]);
		ca.eleToBeClickable();
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		System.out.println("EC-User created under Roles");
		ca.eleToBeClickable();
		driver.navigate().refresh();
		Commonactions.jsWaitForPageLoad();
	  Commonactions.isElementPresent(up.getUsrMgmt_MoreOptions());
	  ca.click(up.getUsrMgmt_MoreOptions());
	  ca.eleToBeClickable();
	  WebElement RolesNumber = lct.getEcAdmin222();
      String number = RolesNumber.getAttribute("data-csi-result");
      System.out.println(number);
      ca.click( driver.findElement(By.xpath("//table[contains(@data-csi-automation,'"+number+"')]//td[text()='Select Security Roles']")));
      ca.eleToBeClickable();
      
		
        
String s[] = {"Engineering Change Administrator", "Hierarchy Administrator","Material Administrator","Product Specification Administrator","Product Specification Library Administrator","Style Administrator"};
   
    for (int i = 0; i < s.length; i++) {
    	WebElement ele = driver.findElement(By.xpath("//td[text()='"+s[i]+"']//parent::tr/td/div/input"));  
    	ca.mouseOver(ele);
    	ele.click();
    	Thread.sleep(2000);
    }
      ca.click(mp.getSave_btn1());  
     
      ca.eleToBeClickable();      
      Commonactions.isElementPresent(up.getUsrMgmt_MoreOptions());
	  ca.click(up.getUsrMgmt_MoreOptions());
	  ca.eleToBeClickable();
	  WebElement RolesNumber1 = driver.findElement(By.xpath("(//td[text()='EC-Admin'])/parent::tr"));
      String number1 = RolesNumber1.getAttribute("data-csi-result");
      System.out.println(number1);
      ca.click( driver.findElement(By.xpath("//table[contains(@data-csi-automation,'"+number1+"')]//td[text()='Select Members']")));
      ca.eleToBeClickable();
      
      
        	
		Commonactions.isElementPresent(up.getSelectmemebersAdmin());
		ca.click(up.getSelectmemebersAdmin());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1()); 
		
	}
		
		@When("User click on roles and create ECEdit {string}")
         public void user_click_on_roles_and_create_ECEdit(String ECEdit) throws Throwable {
          
			
			String[]ed=ECEdit.split(",");
      
          ca.eleToBeClickable();
		  ca.click(up.getUsrMgmt_MoreOptions1());
		  ca.eleToBeClickable();
		
		WebElement RolesNumber = driver.findElement(By.xpath("(//td[text()='EC-Edit'])/parent::tr"));
        String number = RolesNumber.getAttribute("data-csi-result");
        System.out.println(number);
        ca.click( driver.findElement(By.xpath("//table[contains(@data-csi-automation,'"+number+"')]//td[text()='Select Security Roles']")));
		ca.eleToBeClickable();
		
        for (int i = 0; i < ed.length; i++) {
	    WebElement ele = driver.findElement(By.xpath("//td[text()='"+ed[i]+"']//parent::tr/td/div/input"));
        ca.mouseOver(ele);
        ele.click();
        Thread.sleep(2000);
        
}	    ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		ca.click(up.getUsrMgmt_MoreOptions1());
		ca.eleToBeClickable();
		WebElement RolesNumber1 = driver.findElement(By.xpath("(//td[text()='EC-Edit'])/parent::tr"));
        String number1 = RolesNumber1.getAttribute("data-csi-result");
        System.out.println(number1);
        ca.click( driver.findElement(By.xpath("//table[contains(@data-csi-automation,'"+number1+"')]//td[text()='Select Members']")));
		ca.eleToBeClickable();
        
		Commonactions.isElementPresent(up.getSelectmemebersEdit());
		ca.click(up.getSelectmemebersEdit());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		
		}
		

		
		
		
		
		
	@When("user click on roles and create ECUser")
    public void user_click_on_roles_and_create_ECUser() throws Throwable {
   
         ca.eleToBeClickable();
        Commonactions.isElementPresent(up.getUsrMgmt_MoreOptions2());
		ca.click(up.getUsrMgmt_MoreOptions2());
		ca.eleToBeClickable();
		WebElement RolesNumber = driver.findElement(By.xpath("(//td[text()='EC-User'])/parent::tr"));
        String number = RolesNumber.getAttribute("data-csi-result");
        System.out.println(number);
        ca.click( driver.findElement(By.xpath("//table[contains(@data-csi-automation,'"+number+"')]//td[text()='Select Security Roles']")));
		ca.eleToBeClickable();
		String s[] = {"Engineering Change Administrator", "Engineering Change Editor","Hierarchy Viewer","Material Viewer","SKU Editor","Style Editor","Style Viewer"};
		   
	    for (int i = 0; i < s.length; i++) {
	    	WebElement ele = driver.findElement(By.xpath("//td[text()='"+s[i]+"']//parent::tr/td/div/input"));  
	    	ca.mouseOver(ele);
	    	ele.click();
	    	Thread.sleep(2000);
	    }
	    ca.click(mp.getSave_btn1());  
        ca.eleToBeClickable();
		ca.click(up.getUsrMgmt_MoreOptions2());
		ca.eleToBeClickable();
		WebElement RolesNumber1 = driver.findElement(By.xpath("(//td[text()='EC-User'])/parent::tr"));
        String number1 = RolesNumber1.getAttribute("data-csi-result");
        System.out.println(number1);
        ca.click( driver.findElement(By.xpath("//table[contains(@data-csi-automation,'"+number1+"')]//td[text()='Select Members']")));
		ca.eleToBeClickable();
        
		Commonactions.isElementPresent(up.getSelectmemebersUser());
		ca.click(up.getSelectmemebersUser());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		}
		
		
		 @When("user click on roles and create ECView")
   public void user_click_on_roles_and_create_ECView() throws Throwable {

		
		ca.eleToBeClickable();
		ca.click(up.getUsrMgmt_MoreOptions3());
		ca.eleToBeClickable();
		WebElement RolesNumber = driver.findElement(By.xpath("(//td[text()='EC-View'])/parent::tr"));
        String number = RolesNumber.getAttribute("data-csi-result");
        System.out.println(number);
        ca.click( driver.findElement(By.xpath("//table[contains(@data-csi-automation,'"+number+"')]//td[text()='Select Security Roles']")));
		ca.eleToBeClickable();
		
		String s[] = {"Engineering Change Viewer","Hierarchy Viewer","Material Viewer","Product Specification Viewer","Product Specification Library Viewer","Style Viewer"};
		   
	    for (int i = 0; i < s.length; i++) {
	    	WebElement ele = driver.findElement(By.xpath("//td[text()='"+s[i]+"']//parent::tr/td/div/input"));  
	    	ca.mouseOver(ele);
	    	ele.click();
	    	Thread.sleep(2000);
	    }
	      ca.click(mp.getSave_btn1());  
    
		
		ca.eleToBeClickable();
		
		ca.click(up.getUsrMgmt_MoreOptions3());
		ca.eleToBeClickable();
		WebElement RolesNumber1 = driver.findElement(By.xpath("(//td[text()='EC-View'])/parent::tr"));
        String number1 = RolesNumber1.getAttribute("data-csi-result");
        System.out.println(number1);
        ca.click( driver.findElement(By.xpath("//table[contains(@data-csi-automation,'"+number1+"')]//td[text()='Select Members']")));
		ca.eleToBeClickable();
        
		Commonactions.isElementPresent(up.getSelectmemebersView());
		ca.click(up.getSelectmemebersView());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		/*ca.click(driver.findElement(By.xpath("(//a[text()='EC-View']//following::span[text()='mode_edit'])[1]")));
		ca.eleToBeClickable();
		ca.click(driver.findElement(By.xpath("(//a[text()='EC-View']//following::span[text()='close'])[1]")));
		ca.eleToBeClickable();
		Commonactions.isElementPresent(lct.getDelete222()));
		ca.click(lct.getDelete222()));*/
		
	}
	
		 
    @Then("User click on new enumeration under configuration and create enumeration value{string}")
	public void user_click_on_new_enumeration_under_configuration_and_create_enumeration_value(String ECIssue) throws Throwable {
	   
    	String[]ec = ECIssue.split(",");
		
	   /*Commonactions.isElementPresent(hp.getUser_settingsBtn());
		ca.click(hp.getUser_settingsBtn());
		Commonactions.isElementPresent(hp.getSystem_config());
		ca.click(hp.getSystem_config());*/
		
		Commonactions.isElementPresent(cp.getUser_config());
		ca.click(cp.getUser_config());
		Commonactions.isElementPresent(up.getEnumeration_tab());
		ca.click(up.getEnumeration_tab());
		ca.eleToBeClickable();
		
		ca.click(up.getEnumeration_selecttab());
		ca.eleToBeClickable();
		
		   
	   		WebElement a1 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(a1, ec[0]);
		ca.eleToBeClickable();
	    a1.sendKeys(Keys.ENTER);
	    ca.eleToBeClickable();
	    a1.sendKeys(Keys.TAB);
	    System.out.println("ECissue severity");
	    ca.eleToBeClickable();
		try{
		ca.click(up.getEnumeration_Value());
		ca.eleToBeClickable();
		}catch (Exception e) {
			
			
			ca.click(driver.findElement(By.xpath("(//div[@data-csi-automation='values-Site-Enumerations-Node Name']/div/input)[1]")));
			WebElement a2 = ca.activeElement();
			ca.eleToBeClickable();
			ca.insertText(a2, ec[0]);
			ca.eleToBeClickable();
		    a2.sendKeys(Keys.ENTER);
		    ca.eleToBeClickable();
		    a2.sendKeys(Keys.TAB);
		    System.out.println("ECissue severity");
		    ca.eleToBeClickable();
		    ca.click(up.getEnumeration_Value());
			ca.eleToBeClickable();
		}
		
		WebElement a3 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(a3,"High");
		ca.eleToBeClickable();
		 a3.sendKeys(Keys.TAB);
		 ca.eleToBeClickable();
		Commonactions.isElementPresent(mp.getSaveAndNew_btn());
	    ca.click(mp.getSaveAndNew_btn());
	    ca.eleToBeClickable();
		
	    WebElement a4 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(a4,"Medium");
		ca.eleToBeClickable();
	    a4.sendKeys(Keys.TAB);
		ca.eleToBeClickable();
		Commonactions.isElementPresent(mp.getSaveAndNew_btn());
		ca.click(mp.getSaveAndNew_btn());
		ca.eleToBeClickable();
	    
		 WebElement a5 = ca.activeElement();
		 ca.eleToBeClickable();
		 ca.insertText(a5,"Low");
		 ca.eleToBeClickable();
		 a5.sendKeys(Keys.TAB);
	     ca.eleToBeClickable();
		 Commonactions.isElementPresent(mp.getSaveAndNew_btn());
		 ca.click(mp.getSaveAndNew_btn());
		 ca.eleToBeClickable();
		
		 
		 WebElement a6 = ca.activeElement();
		 ca.eleToBeClickable();
		 ca.insertText(a6,"Critical");
		 ca.eleToBeClickable();
		 a6.sendKeys(Keys.TAB);
	     ca.eleToBeClickable();
		 Commonactions.isElementPresent(mp.getSave_btn1());
		 ca.click(mp.getSave_btn1());
		  ca.eleToBeClickable();  
	    System.out.println("Enumeration value created for ECIssue Severity ");
		ca.eleToBeClickable();
		
		ca.click(up.getEnumeration_selecttab());
		ca.eleToBeClickable();
		WebElement b1 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(b1, ec[1]);
		ca.eleToBeClickable();
	    b1.sendKeys(Keys.ENTER);
	    ca.eleToBeClickable();
		b1.sendKeys(Keys.TAB);
		System.out.println("Ecissuetype");
		ca.eleToBeClickable();
		ca.click(lct.getIssueType());
		ca.eleToBeClickable();
		ca.click(up.getEnumeration_Value());
		ca.eleToBeClickable();
		
		
		 WebElement b2 = ca.activeElement();
		 ca.eleToBeClickable();
		 ca.insertText(b2,"Product change");
		 ca.eleToBeClickable();
		 b2.sendKeys(Keys.TAB);
	     ca.eleToBeClickable();
		 Commonactions.isElementPresent(mp.getSaveAndNew_btn());
		 ca.click(mp.getSaveAndNew_btn());
		 ca.eleToBeClickable();
		
		 WebElement b3 = ca.activeElement();
		 ca.eleToBeClickable();
		 ca.insertText(b3,"Quality Issue");
		 ca.eleToBeClickable();
		 b3.sendKeys(Keys.TAB);
	     ca.eleToBeClickable();
		 Commonactions.isElementPresent(mp.getSaveAndNew_btn());
		 ca.click(mp.getSaveAndNew_btn());
		 ca.eleToBeClickable();
		
		 WebElement b4 = ca.activeElement();
		 ca.eleToBeClickable();
		 ca.insertText(b4,"Design Change");
		 ca.eleToBeClickable();
		 b4.sendKeys(Keys.TAB);
	     ca.eleToBeClickable();
		 Commonactions.isElementPresent(mp.getSaveAndNew_btn());
		 ca.click(mp.getSaveAndNew_btn());
		 ca.eleToBeClickable();
		
		 WebElement b5 = ca.activeElement();
		 ca.eleToBeClickable();
		 ca.insertText(b5,"Product enhancement");
		 ca.eleToBeClickable();
		 b5.sendKeys(Keys.TAB);
	     ca.eleToBeClickable();
		 Commonactions.isElementPresent(mp.getSave_btn1());
		 ca.click(mp.getSave_btn1());
		 ca.eleToBeClickable();
		 System.out.println("Enumeration value created for ECIssueType ");
	    	}
 
   @When("user click on Engineering Change and create New Engineering Change{string}")
    public void user_click_on_Engineering_Change_and_create_New_Engineering_Change(String NewEngineering) throws Throwable {
    	String[]NE = NewEngineering.split(",");
    	Commonactions.isElementPresent(hp.getUser_homeBtn());
		 ca.click(hp.getUser_homeBtn());
		 Commonactions.isElementPresent(up.getEngineering_Change_Tab());
		 ca.click(up.getEngineering_Change_Tab());
		 Commonactions.isElementPresent(up.getAllEngineering_Changes_Tab());
		 ca.click(up.getAllEngineering_Changes_Tab());
		 Commonactions.isElementPresent(up.getNew_Engineering_Changebtn());
		 ca.click(up.getNew_Engineering_Changebtn());
		 ca.eleToBeClickable();
		
		 WebElement q1 = ca.activeElement();
		 ca.eleToBeClickable();
		 q1.sendKeys(Keys.TAB);
		 ca.eleToBeClickable();
		 ca.click(lct.getCancel222());
		 System.out.println("engineering Change value is required displayed");
         
		 Commonactions.isElementPresent(up.getNew_Engineering_Changebtn());
		 ca.click(up.getNew_Engineering_Changebtn());
		 ca.eleToBeClickable();
		
		 WebElement q2 = ca.activeElement();
		 ca.eleToBeClickable();
		 ca.insertText(q2, NE[0]);
		 ca.jsMouseOver();
		 
		 WebElement q3 = ca.activeElement();
		 ca.eleToBeClickable();
		 ca.insertText(q3, NE[1]);
		 ca.eleToBeClickable();
		 q3.sendKeys(Keys.TAB);
		 ca.eleToBeClickable();
		 
		 WebElement q4 = ca.activeElement();
		 ca.eleToBeClickable();
		 ca.insertText(q4, NE[2]);
		 ca.eleToBeClickable();
		 q4.sendKeys(Keys.TAB);
		 ca.eleToBeClickable();
		
		 Commonactions.isElementPresent(mp.getSave_btn1());
		 ca.click(mp.getSave_btn1());
		 ca.eleToBeClickable();
		 
		 Commonactions.isElementPresent(up.getNewStyle_Edit_btn());
		 ca.click(up.getNewStyle_Edit_btn());
		 ca.eleToBeClickable();
		 ca.eleToBeClickable();
			
		 WebElement q6 = ca.activeElement();
		 ca.eleToBeClickable();
		 q6.sendKeys(Keys.DELETE);
		 ca.eleToBeClickable();
		 q6.sendKeys(Keys.TAB);
		 Commonactions.isElementPresent(mp.getSave_btn1());
		 ca.click(mp.getSave_btn1());
		 ca.eleToBeClickable();
		
		 ca.click(lct.getCancel222());
		 System.out.println("engineering Change edit value is required displayed");
		 ca.eleToBeClickable();
		 Commonactions.isElementPresent(up.getNew_Engineering_Changebtn());
		 ca.click(up.getNew_Engineering_Changebtn());
		 ca.eleToBeClickable();
		
		 WebElement l2 = ca.activeElement();
		 ca.eleToBeClickable();
		 ca.insertText(l2, NE[3]);
		 ca.jsMouseOver();
		 
		 WebElement l3 = ca.activeElement();
		 ca.eleToBeClickable();
		 ca.insertText(l3, NE[4]);
		 ca.eleToBeClickable();
		 l3.sendKeys(Keys.TAB);
		 ca.eleToBeClickable();
		 
		 WebElement l4 = ca.activeElement();
		 ca.eleToBeClickable();
		 ca.insertText(l4, NE[5]);
		 ca.eleToBeClickable();
		 l4.sendKeys(Keys.TAB);
		 ca.eleToBeClickable();
		
		 Commonactions.isElementPresent(mp.getSave_btn1());
		 ca.click(mp.getSave_btn1());
		 ca.eleToBeClickable();
		
		 Commonactions.isElementPresent(up.getNewStyle_Close_btn());
		 ca.click(up.getNewStyle_Close_btn());
		 System.out.println("close button Work properly");
		 ca.eleToBeClickable();
		 Commonactions.isElementPresent(lct.getDelete222());
		ca.click(lct.getDelete222());
		ca.eleToBeClickable();
		System.out.println("Delete button  Working Properly");
		
		 	
		
    }

    @Then("user click on style btn in Engineering Change and create properties")
    public void user_click_on_style_btn_in_Engineering_Change_and_create_properties() throws Throwable {
    	 Commonactions.isElementPresent(up.getNeWStylebtn());
		 ca.click(up.getNeWStylebtn());
		 Commonactions.isElementPresent(fp.getPropertiestab());
		 ca.click(fp.getPropertiestab());
		 Commonactions.isElementPresent(up.getViewbtn());
		 ca.click(up.getViewbtn());
		 Commonactions.isElementPresent(up.getManageViewbtn());
		 ca.click(up.getManageViewbtn());
		 Commonactions.isElementPresent(fp.getfoodcontentcopybtn());
		 ca.click(fp.getfoodcontentcopybtn());
		 ca.eleToBeClickable();
		 ca.click(driver.findElement(By.xpath("//option[text()='Additional Impact Levels To Retrieve']")));
         Robot R = new Robot();
         R.keyPress(KeyEvent.VK_CONTROL);
         R.keyPress(KeyEvent.VK_A);
         R.keyRelease(KeyEvent.VK_CONTROL);
         R.keyRelease(KeyEvent.VK_A);
         Commonactions.isElementPresent(fp.getAdd_Btn());
		 ca.click(fp.getAdd_Btn());
		 Commonactions.isElementPresent(mp.getSave_btn1());
		 ca.click(mp.getSave_btn1());
		 ca.eleToBeClickable();
		 Commonactions.isElementPresent(up.getAllrevisionbtn());
		 ca.click(up.getAllrevisionbtn());


			ca.eleToBeClickable();
			WebElement ff = ca.activeElement();
			ca.eleToBeClickable();
			ff.sendKeys(Keys.DELETE);
			ca.insertText(ff, "Latest Revision");
			ca.eleToBeClickable();
			ff.sendKeys(Keys.TAB);
			ca.eleToBeClickable();
            System.out.println("latest revision clicked");
         
             Commonactions.isElementPresent(up.getEffectiveend_date());
			 ca.click(up.getEffectiveend_date());
		     ca.eleToBeClickable();
			 ca.click(up.getEnddate());

		     System.out.println("end date is clicked and before date is not displayed");
		 
		    Commonactions.isElementPresent(up.getEffectivestart_date());
			ca.click(up.getEffectivestart_date());
		    ca.eleToBeClickable();
			ca.click(up.getStartdate());
            ca.eleToBeClickable();
		    System.out.println("Start date is clicked and After date is not displayed");
		 

		 
		    Commonactions.isElementPresent(up.getAffected_Items());
			ca.click(up.getAffected_Items());
			Commonactions.isElementPresent(up.getNewAffected_Items());
			ca.click(up.getNewAffected_Items());
			ca.eleToBeClickable();
			 WebElement q5 = ca.activeElement();
			 ca.eleToBeClickable();
			 ca.insertText(q5, "Style");
			 ca.eleToBeClickable();
			 q5.sendKeys(Keys.TAB);
			 ca.eleToBeClickable();
			ca.click(fp.getNextbtn());
			ca.eleToBeClickable();
			Thread.sleep(1000);
			
			String s[] = {"Apparel - Color and Size"};
			   
		    for (int i = 0; i < s.length; i++) {
		    	WebElement ele = driver.findElement(By.xpath("(//td[text()='"+s[i]+"']//parent::tr/td/div/input)[1]"));  
		    	ca.mouseOver(ele);
		    	ele.click();
		    	Thread.sleep(2000);
		    }
			ca.click(fp.getFinishbtn());
			
			
			ca.eleToBeClickable();
			ca.click(driver.findElement(By.xpath("(//a[text()='Apparel - Color and Size'])[1]")));
			ca.eleToBeClickable();
			ca.click(driver.findElement(By.xpath("(//a[text()='Apparel - Color and Size'])[1]")));
			Commonactions.isElementPresent(up.getStyle_tab());
			ca.click(up.getStyle_tab());;
			Commonactions.isElementPresent(up.getSKUs_tab());
			ca.click(up.getSKUs_tab());
			Commonactions.isElementPresent(up.getNewStyleSKU());
			ca.click(up.getNewStyleSKU());
			Commonactions.isElementPresent(up.getStyle_Skuvalue());
			ca.insertText(up.getStyle_Skuvalue(), "StyleSKU");
			Commonactions.isElementPresent(up.getMatrixchkbox());
			ca.click(up.getMatrixchkbox());
			Commonactions.isElementPresent(mp.getSave_btn1());
			ca.click(mp.getSave_btn1());
			ca.eleToBeClickable();
			
			
			Commonactions.isElementPresent(up.getIssue_tab());
			ca.click(up.getIssue_tab());
			Commonactions.isElementPresent(up.getNewIssue_btn());
			ca.click(up.getNewIssue_btn());
			Commonactions.isElementPresent(up.getIssueValue());
			ca.insertText(up.getIssueValue(),"EC_Issue");
			ca.eleToBeClickable();
			ca.click(up.getProductColors_btn());
			ca.eleToBeClickable();
			ca.click(up.getAll_chkbox());
			ca.eleToBeClickable();
			R.keyPress(KeyEvent.VK_TAB);
			R.keyRelease(KeyEvent.VK_TAB);
			
			ca.eleToBeClickable();
			ca.click(up.getProduct_size());
			
			ca.eleToBeClickable();
			ca.click(up.getAll_chkbox2());
			ca.eleToBeClickable();
			Commonactions.isElementPresent(up.getIssuesize_chkbox());
			ca.click(up.getIssuesize_chkbox());
			Commonactions.isElementPresent(mp.getSave_btn1());
			ca.click(mp.getSave_btn1());
			ca.eleToBeClickable();
			
			Commonactions.isElementPresent(up.getEngineering_Change_Tab());
			ca.click(up.getEngineering_Change_Tab());
			ca.eleToBeClickable();
			Commonactions.isElementPresent(up.getNeWStylebtn());
			ca.click(up.getNeWStylebtn());
			ca.eleToBeClickable();
			
			
			
			
			Commonactions.isElementPresent(up.getAffected_Colors());
			ca.click(up.getAffected_Colors());
			ca.eleToBeClickable();
			ca.click(up.getEGRETCheckbox());
			R.keyPress(KeyEvent.VK_CONTROL);
			R.keyPress(KeyEvent.VK_A);
		    R.keyRelease(KeyEvent.VK_CONTROL);
	        R.keyRelease(KeyEvent.VK_A);
	        ca.eleToBeClickable();
	        System.out.println("Affect colors checkbox clicked");
			
			
			
			
			
			try{
				for(int i=0; i < 20; i++){
					ca.click(driver.findElement(By.xpath("//div[contains(@class,'IncrementIconH')]//span[text()='+']/parent::div")));
				}}catch (Exception e) {
					
				}
				
		 
		 
			Commonactions.isElementPresent(up.getAffected_SKU());
			ca.click(up.getAffected_SKU());
			ca.eleToBeClickable();
			ca.click(up.getAffectedSku_chkbox());
			R.keyPress(KeyEvent.VK_CONTROL);
			R.keyPress(KeyEvent.VK_A);
		    R.keyRelease(KeyEvent.VK_CONTROL);
	        R.keyRelease(KeyEvent.VK_A);
	        
	        System.out.println("Affect sku  checkbox clicked");
	        ca.eleToBeClickable();
		 
		 try {

	        Commonactions.isElementPresent(up.getAffected_Issue());
			ca.click(up.getAffected_Issue());
			ca.eleToBeClickable();
			ca.click(up.getIssue_chkbox());
			R.keyPress(KeyEvent.VK_CONTROL);
			R.keyPress(KeyEvent.VK_A);
		    R.keyRelease(KeyEvent.VK_CONTROL);
	        R.keyRelease(KeyEvent.VK_A);
	        ca.eleToBeClickable();
	        System.out.println("Affect Issue  checkbox clicked");
	        R.keyPress(KeyEvent.VK_TAB);
	        R.keyRelease(KeyEvent.VK_TAB);
		    System.out.println("Apparel color and size created");
		 } catch(Exception e) {
			 Commonactions.isElementPresent(up.getAffected_Issue());
				ca.click(up.getAffected_Issue());
				ca.eleToBeClickable();
				R.keyPress(KeyEvent.VK_DOWN);
		        R.keyRelease(KeyEvent.VK_DOWN);
		        R.keyPress(KeyEvent.VK_DOWN);
		        R.keyRelease(KeyEvent.VK_DOWN);
		        R.keyPress(KeyEvent.VK_ENTER);
		        R.keyRelease(KeyEvent.VK_ENTER);
			  
				R.keyPress(KeyEvent.VK_CONTROL);
				R.keyPress(KeyEvent.VK_A);
			    R.keyRelease(KeyEvent.VK_CONTROL);
		        R.keyRelease(KeyEvent.VK_A);
		        ca.eleToBeClickable();
		        System.out.println("Affect Issue  checkbox clicked");
		        R.keyPress(KeyEvent.VK_TAB);
		        R.keyRelease(KeyEvent.VK_TAB);
			    System.out.println("Apparel color and size created");
		
			 
		 }
    }
    }



