package com.centric.stepdefinition;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.centric.objectrepository.BOMCreationPage;
import com.centric.objectrepository.BusinessPlanningPage;
import com.centric.objectrepository.CalendarPage;
import com.centric.objectrepository.ConfigurationPage;
import com.centric.objectrepository.DocumentPage;
import com.centric.objectrepository.HomePage;
import com.centric.objectrepository.InspectionPage;
import com.centric.objectrepository.Locators;
import com.centric.objectrepository.MaterialSpecificationPage;
import com.centric.objectrepository.PopupPage;
import com.centric.objectrepository.ProductCustomizationPage;
import com.centric.objectrepository.QualityPage;
import com.centric.objectrepository.SetupPageTK;
import com.centric.objectrepository.SourcingPage;
import com.centric.objectrepository.StyleInspectionPage;
import com.centric.objectrepository.StyleMaterialSamplepage;
import com.centric.objectrepository.StylePage;
import com.centric.objectrepository.UserManagementPage;
import com.centric.resources.Commonactions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class CalendarSetupSteps extends Commonactions {

	HomePage hp = new HomePage();
	Commonactions ca = new Commonactions();
	MaterialSpecificationPage mp = new MaterialSpecificationPage();
	PopupPage pp = new PopupPage();
	ConfigurationPage co = new ConfigurationPage();
	BOMCreationPage bc = new BOMCreationPage();
	SourcingPage sp = new SourcingPage();
	StylePage st = new StylePage();
	StyleMaterialSamplepage sm = new StyleMaterialSamplepage();
	StyleInspectionPage si = new StyleInspectionPage();
	ProductCustomizationPage pc = new ProductCustomizationPage();
	Locators lct = new Locators();

	CalendarPage cp = new CalendarPage();
	public static String futuredate;
	public static String pastdate;
	public static String date;


	@Then("User moves into Calendar Template setup")
	public void user_moves_into_Calendar_Template_setup() throws Throwable {
		Commonactions.isElementPresent(hp.getDatasetup());
		ca.click(hp.getDatasetup());
		Commonactions.isElementPresent(bc.getProdSpecSetup());
		ca.click(bc.getProdSpecSetup());
		Commonactions.isElementPresent(hp.getSetupSearch());
		ca.insertText(hp.getSetupSearch(), "Calendar Templates" +Keys.ENTER);
		ca.eleToBeClickable();
	}

	@And("User create Calendar Type for season {string},{string},{string}")
	public void user_create_Calendar_Type_for_season(String CalType, String CalTemplate, String CalDesc) throws Throwable {
		Commonactions.isElementPresent(co.getNewTemplatecalendarbtn());
		ca.click(co.getNewTemplatecalendarbtn());
		Commonactions.isElementPresent(co.getCalendartype());
		ca.insertText(co.getCalendartype(), CalType);
		ca.jsMouseOver();
		Commonactions.isElementPresent(co.getTemplatecalendar());
		ca.insertText(co.getTemplatecalendar(), CalTemplate);
		Commonactions.isElementPresent(co.getCalendardescription());
		ca.insertText(co.getCalendardescription(), CalDesc);
		Commonactions.isElementPresent(sp.getSaveandgo());
		ca.click(sp.getSaveandgo());
		ca.eleToBeClickable();
	}
	@Then("user create season Template activity under Calendar Type {string},{string},{string},{string},{string},{string}")
	public void user_create_season_Template_activity_under_Calendar_Type(String TempActivity, String ActivityType, String ActivityLevel, String TrackingType, String TrackingPhase, String TrackingState) throws Throwable {
		String[] TempActivityvalue = TempActivity.split(",");
		String[] ActivityTypevalue = ActivityType.split(",");
		String[] ActivityLevelvalue = ActivityLevel.split(",");
		String[] TrackingTypevalue = TrackingType.split(",");
		String[] TrackingPhasevalue = TrackingPhase.split(",");
		String[] TrackingStatevalue = TrackingState.split(",");

       //Create Manual Activity type
		Commonactions.isElementPresent(co.getNewtemplateactivitybtn());
		ca.click(co.getNewtemplateactivitybtn());	
        int exitVal = ActivityLevelvalue.length - 1;
		for(int i=0;i<ActivityLevelvalue.length;i++)
		{
	
		Commonactions.isElementPresent(co.getTemplateactivity());
		ca.insertText(co.getTemplateactivity(), TempActivityvalue[0]);
		Commonactions.isElementPresent(co.getActivityType());
		ca.insertText(co.getActivityType(), ActivityTypevalue[0]);
		ca.jsMouseOver();
		Commonactions.isElementPresent(co.getActivityLevel());
		ca.insertText(co.getActivityLevel(), ActivityLevelvalue[i]);
		ca.jsMouseOver();
		if (i == exitVal )
		{ 
			ca.click(mp.getSave_btn1());
			break;
		}
		ca.eleToBeClickable();
		Commonactions.isElementPresent(mp.getSaveAndNew_btn());
		ca.click(mp.getSaveAndNew_btn());
		ca.eleToBeClickable();
		}
		
		//Creating  Custom Activity Types
		
		Commonactions.isElementPresent(co.getNewtemplateactivitybtn());
		Commonactions.mouseOver(co.getNewtemplateactivitybtn());
		ca.click(co.getNewtemplateactivitybtn());	
		for(int i=0;i<ActivityLevelvalue.length;i++)
		{
	
		Commonactions.isElementPresent(co.getTemplateactivity());
		ca.insertText(co.getTemplateactivity(), TempActivityvalue[1]);
		Commonactions.isElementPresent(co.getActivityType());
		ca.insertText(co.getActivityType(), ActivityTypevalue[1]);
		ca.jsMouseOver();
		Commonactions.isElementPresent(co.getActivityLevel());
		ca.insertText(co.getActivityLevel(), ActivityLevelvalue[i]);
		ca.jsMouseOver();
		Commonactions.isElementPresent(co.getAutoCompleteExpTextbox());
		ca.insertText(co.getAutoCompleteExpTextbox(), "1");
	
		if (i == exitVal )
		{ 
			ca.click(mp.getSave_btn1());
			break;
		}
		ca.eleToBeClickable();
		Commonactions.isElementPresent(mp.getSaveAndNew_btn());
		ca.click(mp.getSaveAndNew_btn());
		ca.eleToBeClickable();
		}
   //Selecting milestone activity type
		Commonactions.isElementPresent(co.getNewtemplateactivitybtn());
		Commonactions.mouseOver(co.getNewtemplateactivitybtn());
		ca.click(co.getNewtemplateactivitybtn());	
		
		Commonactions.isElementPresent(co.getActivityType());
		ca.insertText(co.getActivityType(), ActivityTypevalue[2]);
		ca.jsMouseOver();
	
		Commonactions.isElementPresent(co.getPredecessors());
		ca.insertText(co.getPredecessors(), "");
		ca.eleToBeClickable();
		WebElement e3 = ca.activeElement();
		ca.eleToBeClickable();
		e3.sendKeys(Keys.DOWN);	
		ca.eleToBeClickable();
		Commonactions.isElementPresent(co.getManualcheckbox());
		ca.click(co.getManualcheckbox());
		Commonactions.isElementPresent(co.getTemplateactivity());
		ca.insertText(co.getTemplateactivity(), TempActivityvalue[2]);
		
     	ca.eleToBeClickable();
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		
		 //Selecting Track activity type
		String[] TrackingType1 = {"PO Color"," Product","Product Shipment"};
		String[] TrackingType2 = {"Care & Composition","Collection","Review Colorway","Review Size Chart","Review SKU Review","Spec Data Sheet"};
		String[] TrackingType3 = {"Style Review","Test Run"};
		String[] TrackingType4 = {"Style","Material"};
		String[] TrackingType5 = {"Artwork","Collection Matrix","Image Data Sheet","Routing","Size Chart","Size Label Data Sheet","Style BOM","Style Color","Style Main Material"};

		
		//Creating data for PO Color PO Product Product Shipment
		Commonactions.isElementPresent(co.getNewtemplateactivitybtn());
		Commonactions.mouseOver(co.getNewtemplateactivitybtn());
		ca.click(co.getNewtemplateactivitybtn());	
        int exitVal1 = TrackingType1.length - 1;
		for(int i=0;i<TrackingType1.length;i++)
		{
	
		Commonactions.isElementPresent(co.getTemplateactivity());
		ca.insertText(co.getTemplateactivity(), TempActivityvalue[3]);
		Commonactions.isElementPresent(co.getActivityType());
		ca.insertText(co.getActivityType(), ActivityTypevalue[3]);
		ca.jsMouseOver();
		Commonactions.isElementPresent(co.getTrackingType());
		ca.insertText(co.getTrackingType(), TrackingType1[i]);
		ca.jsMouseOver();
		
		if (i == exitVal1 )
		{ 
			ca.click(mp.getSave_btn1());
			break;
		}
		ca.eleToBeClickable();
		Commonactions.isElementPresent(mp.getSaveAndNew_btn());
		ca.click(mp.getSaveAndNew_btn());
		ca.eleToBeClickable();
		}
		
		//Creating data for Care & Composition Collection Review Colorway Review Size Chart Review SKU Review Spec Data Sheet 
		Commonactions.isElementPresent(co.getNewtemplateactivitybtn());
		Commonactions.mouseOver(co.getNewtemplateactivitybtn());
		ca.click(co.getNewtemplateactivitybtn());	
        int exitVal2 = TrackingType2.length - 1;
		for(int i=0;i<TrackingType2.length;i++)
		{
	
		Commonactions.isElementPresent(co.getTemplateactivity());
		ca.insertText(co.getTemplateactivity(), TempActivityvalue[3]);
		Commonactions.isElementPresent(co.getActivityType());
		ca.insertText(co.getActivityType(), ActivityTypevalue[3]);
		ca.jsMouseOver();
		Commonactions.isElementPresent(co.getTrackingType());
		ca.insertText(co.getTrackingType(), TrackingType2[i]);
		ca.jsMouseOver();
		Commonactions.isElementPresent(co.getTrackingstate());
		ca.insertText(co.getTrackingstate(), TrackingStatevalue[0]);
		ca.jsMouseOver();
		
		if (i == exitVal2 )
		{ 
			ca.click(mp.getSave_btn1());
			break;
		}
		ca.eleToBeClickable();
		Commonactions.isElementPresent(mp.getSaveAndNew_btn());
		ca.click(mp.getSaveAndNew_btn());
		ca.eleToBeClickable();
		}
		
		//Creating data for Style Review Test Run
		Commonactions.isElementPresent(co.getNewtemplateactivitybtn());
		Commonactions.mouseOver(co.getNewtemplateactivitybtn());
		ca.click(co.getNewtemplateactivitybtn());	
        int exitVal3 = TrackingType3.length - 1;
		for(int i=0;i<TrackingType3.length;i++)
		{
	
		Commonactions.isElementPresent(co.getTemplateactivity());
		ca.insertText(co.getTemplateactivity(), TempActivityvalue[3]);
		Commonactions.isElementPresent(co.getActivityType());
		ca.insertText(co.getActivityType(), ActivityTypevalue[3]);
		ca.jsMouseOver();
		Commonactions.isElementPresent(co.getTrackingType());
		ca.insertText(co.getTrackingType(), TrackingType3[i]);
		ca.jsMouseOver();
		Commonactions.isElementPresent(co.getTrackingstate());
		ca.insertText(co.getTrackingstate(), TrackingStatevalue[1]);
		ca.jsMouseOver();
		
		if (i == exitVal3 )
		{ 
			ca.click(mp.getSave_btn1());
			break;
		}
		ca.eleToBeClickable();
		Commonactions.isElementPresent(mp.getSaveAndNew_btn());
		ca.click(mp.getSaveAndNew_btn());
		ca.eleToBeClickable();
		}
		
		//Creating data for Style and Material
		Commonactions.isElementPresent(co.getNewtemplateactivitybtn());
		Commonactions.mouseOver(co.getNewtemplateactivitybtn());

		ca.click(co.getNewtemplateactivitybtn());	
        int exitVal4 = TrackingType4.length - 1;
		for(int i=0;i<TrackingType4.length;i++)
		{
	
		Commonactions.isElementPresent(co.getTemplateactivity());
		ca.insertText(co.getTemplateactivity(), TempActivityvalue[4]);
		Commonactions.isElementPresent(co.getActivityType());
		ca.insertText(co.getActivityType(), ActivityTypevalue[3]);
		ca.jsMouseOver();
		Commonactions.isElementPresent(co.getTrackingType());
		ca.insertText(co.getTrackingType(), TrackingType4[i]);
		ca.jsMouseOver();
		Commonactions.isElementPresent(co.getTrackingPhase());
		ca.insertText(co.getTrackingPhase(), TrackingPhasevalue[1]);
		ca.jsMouseOver();
		Commonactions.isElementPresent(co.getTrackingstate());
		ca.insertText(co.getTrackingstate(), TrackingStatevalue[1]);
		ca.jsMouseOver();
		
		if (i == exitVal4 )
		{ 
			ca.click(mp.getSave_btn1());
			break;
		}
		ca.eleToBeClickable();
		Commonactions.isElementPresent(mp.getSaveAndNew_btn());
		ca.click(mp.getSaveAndNew_btn());
		ca.eleToBeClickable();
		}
		
		//Creating data for Artwork Collection Matrix Image Data Sheet Routing Size Chart Size Label Data Sheet Style BOM Style Color Style Main Material  
		Commonactions.isElementPresent(co.getNewtemplateactivitybtn());
		Commonactions.mouseOver(co.getNewtemplateactivitybtn());

		ca.click(co.getNewtemplateactivitybtn());	
        int exitVal5 = TrackingType5.length - 1;
		for(int i=0;i<TrackingType5.length;i++)
		{
	
		Commonactions.isElementPresent(co.getTemplateactivity());
		ca.insertText(co.getTemplateactivity(), TempActivityvalue[3]);
		Commonactions.isElementPresent(co.getActivityType());
		ca.insertText(co.getActivityType(), ActivityTypevalue[3]);
		ca.jsMouseOver();
		Commonactions.isElementPresent(co.getTrackingType());
		ca.insertText(co.getTrackingType(), TrackingType5[i]);
		ca.jsMouseOver();
		Commonactions.isElementPresent(co.getTrackingPhase());
		ca.insertText(co.getTrackingPhase(), TrackingPhasevalue[1]);
		ca.jsMouseOver();
		Commonactions.isElementPresent(co.getTrackingstate());
		ca.insertText(co.getTrackingstate(), TrackingStatevalue[1]);
		ca.jsMouseOver();
		
		if (i == exitVal5 )
		{ 
			ca.click(mp.getSave_btn1());
			break;
		}
		ca.eleToBeClickable();
		Commonactions.isElementPresent(mp.getSaveAndNew_btn());
		ca.click(mp.getSaveAndNew_btn());
		ca.eleToBeClickable();
		}
		System.out.println("Calendar_Season for Style with the activities created successfully");
	}
	

	@And("User create Calendar Type for material {string},{string},{string}")
	public void user_create_Calendar_Type_for_material(String CalType, String CalTemplate, String CalDesc) throws Throwable {
		Commonactions.isElementPresent(co.getNewTemplatecalendarbtn());
		ca.click(co.getNewTemplatecalendarbtn());
		Commonactions.isElementPresent(co.getCalendartype());
		ca.insertText(co.getCalendartype(), CalType);
		ca.jsMouseOver();
		Commonactions.isElementPresent(co.getTemplatecalendar());
		ca.insertText(co.getTemplatecalendar(), CalTemplate);
		Commonactions.isElementPresent(co.getCalendardescription());
		ca.insertText(co.getCalendardescription(), CalDesc);
		Commonactions.isElementPresent(sp.getSaveandgo());
		ca.click(sp.getSaveandgo());
		ca.eleToBeClickable();
	}

	@Then("user create material Template activity under Calendar Type {string},{string},{string},{string},{string}")
	public void user_create_material_Template_activity_under_Calendar_Type(String TempActivity, String ActivityType, String ActivityLevel, String TrackingType, String TrackingState) throws Throwable {
		Commonactions.isElementPresent(co.getExpandIcon());
		ca.click(co.getExpandIcon());
		ca.eleToBeClickable();
		WebElement e2 = ca.activeElement();
		ca.eleToBeClickable();
		e2.sendKeys(Keys.DELETE);
		ca.eleToBeClickable();
		ca.insertText(e2, "Calendar_MSG");
		ca.eleToBeClickable();
		e2.sendKeys(Keys.ENTER);
		ca.eleToBeClickable();

		String[] TempActivityvalue = TempActivity.split(",");
		String[] ActivityTypevalue = ActivityType.split(",");
		String[] ActivityLevelvalue = ActivityLevel.split(",");
		String[] TrackingTypevalue = TrackingType.split(",");
		String[] TrackingStatevalue = TrackingState.split(",");
		
	     //Create Manual Activity type
			Commonactions.isElementPresent(co.getNewtemplateactivitybtn());
			ca.click(co.getNewtemplateactivitybtn());	
	        int exitVal = ActivityLevelvalue.length - 1;
			for(int i=0;i<ActivityLevelvalue.length;i++)
			{
		
			Commonactions.isElementPresent(co.getTemplateactivity());
			ca.insertText(co.getTemplateactivity(), TempActivityvalue[0]);
			Commonactions.isElementPresent(co.getActivityType());
			ca.insertText(co.getActivityType(), ActivityTypevalue[0]);
			ca.jsMouseOver();
			Commonactions.isElementPresent(co.getActivityLevel());
			ca.insertText(co.getActivityLevel(), ActivityLevelvalue[i]);
			ca.jsMouseOver();
			if (i == exitVal )
			{ 
				ca.click(mp.getSave_btn1());
				break;
			}
			ca.eleToBeClickable();
			Commonactions.isElementPresent(mp.getSaveAndNew_btn());
			ca.click(mp.getSaveAndNew_btn());
			ca.eleToBeClickable();
			}
			
			//Creating  Custom Activity Types
			
			Commonactions.isElementPresent(co.getNewtemplateactivitybtn());
			Commonactions.mouseOver(co.getNewtemplateactivitybtn());
			ca.click(co.getNewtemplateactivitybtn());	
			for(int i=0;i<ActivityLevelvalue.length;i++)
			{
		
			Commonactions.isElementPresent(co.getTemplateactivity());
			ca.insertText(co.getTemplateactivity(), TempActivityvalue[1]);
			Commonactions.isElementPresent(co.getActivityType());
			ca.insertText(co.getActivityType(), ActivityTypevalue[1]);
			ca.jsMouseOver();
			Commonactions.isElementPresent(co.getActivityLevel());
			ca.insertText(co.getActivityLevel(), ActivityLevelvalue[i]);
			ca.jsMouseOver();
			Commonactions.isElementPresent(co.getAutoCompleteExpTextbox());
			ca.insertText(co.getAutoCompleteExpTextbox(), "1");
		
			if (i == exitVal )
			{ 
				ca.click(mp.getSave_btn1());
				break;
			}
			ca.eleToBeClickable();
			Commonactions.isElementPresent(mp.getSaveAndNew_btn());
			ca.click(mp.getSaveAndNew_btn());
			ca.eleToBeClickable();
			}
	   //Selecting milestone activity type
			Commonactions.isElementPresent(co.getNewtemplateactivitybtn());
			Commonactions.mouseOver(co.getNewtemplateactivitybtn());
			ca.eleToBeClickable();
			ca.click(co.getNewtemplateactivitybtn());	
			
			Commonactions.isElementPresent(co.getActivityType());
			ca.insertText(co.getActivityType(), ActivityTypevalue[2]);
			ca.jsMouseOver();
			Commonactions.isElementPresent(co.getPredecessors());
			ca.insertText(co.getPredecessors(), "");
			ca.eleToBeClickable();
			WebElement e3 = ca.activeElement();
			ca.eleToBeClickable();
			e3.sendKeys(Keys.DOWN);	
			ca.eleToBeClickable();
			Commonactions.isElementPresent(co.getManualActivitycheckbox());
			ca.click(co.getManualActivitycheckbox());
			Commonactions.isElementPresent(co.getTemplateactivity());
			ca.insertText(co.getTemplateactivity(), TempActivityvalue[2]);
			
	     	ca.eleToBeClickable();
			Commonactions.isElementPresent(mp.getSave_btn1());
			ca.click(mp.getSave_btn1());
			ca.eleToBeClickable();
			
			 //Selecting Track activity type
			Commonactions.isElementPresent(co.getNewtemplateactivitybtn());
			Commonactions.mouseOver(co.getNewtemplateactivitybtn());
			ca.click(co.getNewtemplateactivitybtn());	
	        int exitVal1 = TrackingTypevalue.length - 1;
			for(int i=0;i<TrackingTypevalue.length;i++)
			{
		
			Commonactions.isElementPresent(co.getTemplateactivity());
			ca.insertText(co.getTemplateactivity(), TempActivityvalue[3]);
			Commonactions.isElementPresent(co.getActivityType());
			ca.insertText(co.getActivityType(), ActivityTypevalue[3]);
			ca.jsMouseOver();
			Commonactions.isElementPresent(co.getTrackingType());
			ca.insertText(co.getTrackingType(), TrackingTypevalue[i]);
			ca.jsMouseOver();
			Commonactions.isElementPresent(co.getTrackingstate());
			ca.insertText(co.getTrackingstate(), TrackingStatevalue[1]);
			ca.jsMouseOver();
		
			if (i == exitVal1 )
			{ 
				ca.click(mp.getSave_btn1());
				break;
			}
			ca.eleToBeClickable();
			Commonactions.isElementPresent(mp.getSaveAndNew_btn());
			ca.click(mp.getSaveAndNew_btn());
			ca.eleToBeClickable();
			}
			
		System.out.println("Calendar_MSG for material with the activities created successfully");

	}

	@Then("User create Calendar Type for PO {string},{string},{string}")
	public void user_create_Calendar_Type_for_PO(String CalType, String CalTemplate, String CalDesc)throws Throwable {
		Commonactions.isElementPresent(co.getNewTemplatecalendarbtn());
		ca.click(co.getNewTemplatecalendarbtn());
		Commonactions.isElementPresent(co.getCalendartype());
		ca.insertText(co.getCalendartype(), CalType);
		ca.jsMouseOver();
		ca.eleToBeClickable();
		Commonactions.isElementPresent(co.getTemplatecalendar());
		ca.insertText(co.getTemplatecalendar(), CalTemplate);
		Commonactions.isElementPresent(co.getCalendardescription());
		ca.insertText(co.getCalendardescription(), CalDesc);
		Commonactions.isElementPresent(sp.getSaveandgo());
		ca.click(sp.getSaveandgo());
		ca.eleToBeClickable();
		System.out.println("calendar template created");
	}

	@Then("user create PO Template activity under Calendar Type {string},{string},{string},{string},{string}")
	public void user_create_PO_Template_activity_under_Calendar_Type(String TempActivity, String ActivityType, String ActivityLevel, String TrackingType, String TrackingState)throws Throwable {
		String[] TempActivityvalue = TempActivity.split(",");
		String[] ActivityTypevalue = ActivityType.split(",");
		String[] ActivityLevelvalue = ActivityLevel.split(",");
		String[] TrackingTypevalue = TrackingType.split(",");
		String[] TrackingStatevalue = TrackingState.split(",");

	     //Create Manual Activity type
			Commonactions.isElementPresent(co.getNewtemplateactivitybtn());
			Commonactions.mouseOver(co.getNewtemplateactivitybtn());
			ca.click(co.getNewtemplateactivitybtn());	
	        int exitVal = ActivityLevelvalue.length - 1;
			for(int i=0;i<ActivityLevelvalue.length;i++)
			{
		
			Commonactions.isElementPresent(co.getTemplateactivity());
			ca.insertText(co.getTemplateactivity(), TempActivityvalue[0]);
			Commonactions.isElementPresent(co.getActivityType());
			ca.insertText(co.getActivityType(), ActivityTypevalue[0]);
			ca.jsMouseOver();
			Commonactions.isElementPresent(co.getActivityLevel());
			ca.insertText(co.getActivityLevel(), ActivityLevelvalue[i]);
			ca.jsMouseOver();
			if (i == exitVal )
			{ 
				ca.click(mp.getSave_btn1());
				break;
			}
			ca.eleToBeClickable();
			Commonactions.isElementPresent(mp.getSaveAndNew_btn());
			ca.click(mp.getSaveAndNew_btn());
			ca.eleToBeClickable();
			}
			
			//Creating  Custom Activity Types
			
			Commonactions.isElementPresent(co.getNewtemplateactivitybtn());
			Commonactions.mouseOver(co.getNewtemplateactivitybtn());
			ca.click(co.getNewtemplateactivitybtn());	
			for(int i=0;i<ActivityLevelvalue.length;i++)
			{
		
			Commonactions.isElementPresent(co.getTemplateactivity());
			ca.insertText(co.getTemplateactivity(), TempActivityvalue[1]);
			Commonactions.isElementPresent(co.getActivityType());
			ca.insertText(co.getActivityType(), ActivityTypevalue[1]);
			ca.jsMouseOver();
			Commonactions.isElementPresent(co.getActivityLevel());
			ca.insertText(co.getActivityLevel(), ActivityLevelvalue[i]);
			ca.jsMouseOver();
			Commonactions.isElementPresent(co.getAutoCompleteExpTextbox());
			ca.insertText(co.getAutoCompleteExpTextbox(), "1");
		
			if (i == exitVal )
			{ 
				ca.click(mp.getSave_btn1());
				break;
			}
			ca.eleToBeClickable();
			Commonactions.isElementPresent(mp.getSaveAndNew_btn());
			ca.click(mp.getSaveAndNew_btn());
			ca.eleToBeClickable();
			}
	   //Selecting milestone activity type
			Commonactions.isElementPresent(co.getNewtemplateactivitybtn());
			Commonactions.mouseOver(co.getNewtemplateactivitybtn());
			ca.eleToBeClickable();
			ca.click(co.getNewtemplateactivitybtn());	
			
			Commonactions.isElementPresent(co.getActivityType());
			ca.insertText(co.getActivityType(), ActivityTypevalue[2]);
			ca.jsMouseOver();
			Commonactions.isElementPresent(co.getPredecessors());
			ca.insertText(co.getPredecessors(), "");
			ca.eleToBeClickable();
			WebElement e3 = ca.activeElement();
			ca.eleToBeClickable();
			e3.sendKeys(Keys.DOWN);	
			ca.eleToBeClickable();
			Commonactions.isElementPresent(co.getManualActivitycheckbox());
			ca.click(co.getManualActivitycheckbox());
			Commonactions.isElementPresent(co.getTemplateactivity());
			ca.insertText(co.getTemplateactivity(), TempActivityvalue[2]);
			
	     	ca.eleToBeClickable();
			Commonactions.isElementPresent(mp.getSave_btn1());
			ca.click(mp.getSave_btn1());
			ca.eleToBeClickable();
			
			 //Selecting Track activity type
			Commonactions.isElementPresent(co.getNewtemplateactivitybtn());
			Commonactions.mouseOver(co.getNewtemplateactivitybtn());
			ca.click(co.getNewtemplateactivitybtn());	
	        int exitVal1 = TrackingTypevalue.length - 1;
			for(int i=0;i<TrackingTypevalue.length;i++)
			{
		
			Commonactions.isElementPresent(co.getTemplateactivity());
			ca.insertText(co.getTemplateactivity(), TempActivityvalue[3]);
			Commonactions.isElementPresent(co.getActivityType());
			ca.insertText(co.getActivityType(), ActivityTypevalue[3]);
			ca.jsMouseOver();
			Commonactions.isElementPresent(co.getTrackingType());
			ca.insertText(co.getTrackingType(), TrackingTypevalue[i]);
			ca.jsMouseOver();
			Commonactions.isElementPresent(co.getTrackingstate());
			ca.insertText(co.getTrackingstate(), TrackingStatevalue[1]);
			ca.jsMouseOver();
		
			if (i == exitVal1 )
			{ 
				ca.click(mp.getSave_btn1());
				ca.eleToBeClickable();
				break;
			}
			ca.eleToBeClickable();
			Commonactions.isElementPresent(mp.getSaveAndNew_btn());
			ca.click(mp.getSaveAndNew_btn());
			ca.eleToBeClickable();
			}
			
		System.out.println("Calendar_PO  for PO Group with the activities created successfully");
	}

	@Then("Go to homepage and create master calendar")
	public void go_to_homepage_and_create_master_calendar()throws Throwable {
		ca.click(hp.getUser_homeBtn());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(hp.getStyleBtn());
		ca.click(hp.getStyleBtn());
		Commonactions.isElementPresent(st.getStyles_Btn());
		ca.click(st.getStyles_Btn());
		ca.eleToBeClickable();

		for(int i=0;i<100;i++)
		{
			ca.click(cp.getStyleslider());			
		}
		Commonactions.isElementPresent(cp.getWinterseason());
		ca.click(cp.getWinterseason());

		Commonactions.isElementPresent(cp.getMastercalander());
		ca.click(cp.getMastercalander());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(cp.getTemplatecalendaraction());
		ca.click(cp.getTemplatecalendaraction());
		Commonactions.isElementPresent(cp.getCalendarseasoncheckbox());
		ca.click(cp.getCalendarseasoncheckbox());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		System.out.println("master calendar created");
	}
	@Then("Freeze the Calendar and Apply Calendar to Style {string}")
	public void Freeze_the_Calendar_and_Apply_Calendar_to_Style(String StyleName) throws Throwable {
		
		Commonactions.isElementPresent(cp.getCalendarseasonlink());
		//ca.click(cp.getCalendarseasonlink());
		Commonactions.isElementPresent(cp.getPropagatenewcheckbox());
		ca.click(cp.getPropagatenewcheckbox());
		Commonactions.isElementPresent(cp.getthreedotseasoncalmsg());
		ca.click(cp.getthreedotseasoncalmsg());
		Commonactions.isElementPresent(cp.getFreeze());
		ca.click(cp.getFreeze());
		ca.eleToBeClickable();

		/*for(int i=0;i<50;i++)
		{
		ca.click(cp.getMastercalslider());
		}*/
		Commonactions.isElementPresent(cp.getRefreshmastercalpg());
		ca.click(cp.getRefreshmastercalpg());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(cp.getthreedotseasoncalmsg());
		ca.click(cp.getthreedotseasoncalmsg());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(cp.getApplycalendar());
		ca.click(cp.getApplycalendar());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(driver.findElement(By.xpath("//td[@data-csi-heading='Node Name::0' and contains(text(),'"+StyleName+"')]")));
		ca.click(driver.findElement(By.xpath("//td[@data-csi-heading='Node Name::0' and contains(text(),'"+StyleName+"')]")));
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();

		for(int i=0;i<10;i++)
		{
			Commonactions.isElementPresent(cp.getRefreshmastercalpg());
			ca.click(cp.getRefreshmastercalpg());
			ca.eleToBeClickable();
			ca.eleToBeClickable();
			WebElement create = driver.findElement(By.xpath("//td[contains(text(),'Create')]"));
			String status = create.getText();
			if(status.contains("Succeeded"))
			{
				System.out.println(status +" calendar status");
				break;
			}
		}
		System.out.println("verified Applied calendar is succeeded or not");
	}

	@And("Go To the Style and Modify Completion Date in the Manual Activities {string}") 
	public void Go_To_the_Style_and_Modify_Completion_Date_in_the_Manual_Activities(String StyleName) throws Throwable {
    	Commonactions.isElementPresent(pc.getHeaderSearch());
    	ca.click(pc.getHeaderSearch());
    	Commonactions.isElementPresent(driver.findElement(By.xpath("//td[@class='dijitReset dijitMenuItemLabel' and text()='Style']")));
    	ca.click(driver.findElement(By.xpath("//td[@class='dijitReset dijitMenuItemLabel' and text()='Style']")));
		Commonactions.isElementPresent(pc.getHeaderSearchField());
		ca.insertText(pc.getHeaderSearchField(), StyleName);
		ca.eleToBeClickable();
		ca.click(pc.getSearchIcon());
		Commonactions.isElementPresent(driver.findElement(By.xpath("//a[@class='csi-card-anchor' and @title='"+StyleName+"']")));
		ca.click(driver.findElement(By.xpath("//a[@class='csi-card-anchor' and @title='"+StyleName+"']")));
		
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy");  
		LocalDateTime now = LocalDateTime.now();  
		date = dtf.format(now);

		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		Calendar c1 = Calendar.getInstance();
		c1.setTime(sdf.parse(date));
		System.out.println(date);
		c1.add(Calendar.DAY_OF_MONTH, 1);  
		futuredate = sdf.format(c1.getTime());  
		System.out.println("Date after Addition: "+futuredate);

		c1.add(Calendar.DAY_OF_MONTH, -3);  
		pastdate = sdf.format(c1.getTime());  
		System.out.println("Date after sub: "+pastdate);
		
		Commonactions.isElementPresent(cp.getBrandcalendartab());
		ca.click(cp.getBrandcalendartab());
		Commonactions.isElementPresent(cp.getCalendarseasonlink());
		ca.click(cp.getCalendarseasonlink());
		ca.eleToBeClickable();
		driver.navigate().refresh();
		ca.jsWaitForPageLoad();
		ca.eleToBeClickable();
		Commonactions.isElementPresent(cp.getActivitiestab());
		ca.click(cp.getActivitiestab());
		
		Commonactions.isElementPresent(cp.getCalmanualcompdate());
		ca.click(cp.getCalmanualcompdate());
		ca.eleToBeClickable();
		WebElement e1 = ca.activeElement();
		ca.eleToBeClickable();
		e1.sendKeys(date);
		ca.eleToBeClickable();//parallel
		//e1.sendKeys(Keys.TAB);
		ca.click(lct.getActivities());
		ca.eleToBeClickable();
		driver.navigate().refresh();
		ca.eleToBeClickable();
		ca.accept_Alert();
		ca.eleToBeClickable();
		System.out.println("user entered date for calendar season in Style");
	}

	@And("Go To the Collection and Modify Completion Date in the Manual Activities {string}") 
	public void Go_To_the_Collection_and_Modify_Completion_Date_in_the_Manual_Activities(String CollectionName) throws Throwable {
    	Commonactions.isElementPresent(pc.getHeaderSearch());
    	ca.click(pc.getHeaderSearch());
    	Commonactions.isElementPresent(lct.getTextcollet());
    	ca.click(lct.getTextcollet());
		Commonactions.isElementPresent(pc.getHeaderSearchField());
		ca.insertText(pc.getHeaderSearchField(), CollectionName);
		ca.eleToBeClickable();
		ca.click(pc.getSearchIcon());
		Commonactions.isElementPresent(driver.findElement(By.xpath("//a[@class='csi-card-anchor' and @title='"+CollectionName+"']")));
		ca.click(driver.findElement(By.xpath("//a[@class='csi-card-anchor' and @title='"+CollectionName+"']")));
		
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy");  
		LocalDateTime now = LocalDateTime.now();  
		date = dtf.format(now);

		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		Calendar c1 = Calendar.getInstance();
		c1.setTime(sdf.parse(date));
		System.out.println(date);
		c1.add(Calendar.DAY_OF_MONTH, 1);  
		futuredate = sdf.format(c1.getTime());  
		System.out.println("Date after Addition: "+futuredate);

		c1.add(Calendar.DAY_OF_MONTH, -3);  
		pastdate = sdf.format(c1.getTime());  
		System.out.println("Date after sub: "+pastdate);
		
		Commonactions.isElementPresent(cp.getBrandcalendartab());
		ca.click(cp.getBrandcalendartab());
		Commonactions.isElementPresent(cp.getCalendarseasonlink());
		ca.click(cp.getCalendarseasonlink());
		ca.eleToBeClickable();
		driver.navigate().refresh();
		ca.jsWaitForPageLoad();
		ca.eleToBeClickable();
		Commonactions.isElementPresent(cp.getActivitiestab());
		ca.click(cp.getActivitiestab());
		
		Commonactions.isElementPresent(cp.getCalmanualcompdate());
		ca.click(cp.getCalmanualcompdate());
		ca.eleToBeClickable();
		WebElement e1 = ca.activeElement();
		ca.eleToBeClickable();
		e1.sendKeys(date);
		ca.eleToBeClickable();//parallel
		//e1.sendKeys(Keys.TAB);
		ca.click(lct.getActivities());
		ca.eleToBeClickable();
		driver.navigate().refresh();
		ca.eleToBeClickable();
		ca.accept_Alert();
		ca.eleToBeClickable();
		System.out.println("user entered date for calendar season in Collection");
	}
	@And("Go To the Department and Modify Completion Date in the Manual Activities {string}") 
	public void Go_To_the_Department_and_Modify_Completion_Date_in_the_Manual_Activities(String DeptName) throws Throwable {
    	Commonactions.isElementPresent(pc.getHeaderSearch());
    	ca.click(pc.getHeaderSearch());
    	Commonactions.isElementPresent(driver.findElement(By.xpath("//td[@class='dijitReset dijitMenuItemLabel' and text()='Department']")));
    	ca.click(driver.findElement(By.xpath("//td[@class='dijitReset dijitMenuItemLabel' and text()='Department']")));
		Commonactions.isElementPresent(pc.getHeaderSearchField());
		ca.insertText(pc.getHeaderSearchField(), DeptName);
		ca.eleToBeClickable();
		ca.click(pc.getSearchIcon());
		Commonactions.isElementPresent(driver.findElement(By.xpath("//a[@class='csi-card-anchor' and @title='"+DeptName+"']")));
		ca.click(driver.findElement(By.xpath("//a[@class='csi-card-anchor' and @title='"+DeptName+"']")));
		
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy");  
		LocalDateTime now = LocalDateTime.now();  
		date = dtf.format(now);

		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		Calendar c1 = Calendar.getInstance();
		c1.setTime(sdf.parse(date));
		System.out.println(date);
		c1.add(Calendar.DAY_OF_MONTH, 1);  
		futuredate = sdf.format(c1.getTime());  
		System.out.println("Date after Addition: "+futuredate);

		c1.add(Calendar.DAY_OF_MONTH, -3);  
		pastdate = sdf.format(c1.getTime());  
		System.out.println("Date after sub: "+pastdate);
		
		Commonactions.isElementPresent(cp.getBrandcalendartab());
		ca.click(cp.getBrandcalendartab());
		Commonactions.isElementPresent(cp.getCalendarseasonlink());
		ca.click(cp.getCalendarseasonlink());
		ca.eleToBeClickable();
		driver.navigate().refresh();
		ca.jsWaitForPageLoad();
		ca.eleToBeClickable();
		Commonactions.isElementPresent(cp.getActivitiestab());
		ca.click(cp.getActivitiestab());
		
		Commonactions.isElementPresent(cp.getCalmanualcompdate());
		ca.click(cp.getCalmanualcompdate());
		ca.eleToBeClickable();
		WebElement e1 = ca.activeElement();
		ca.eleToBeClickable();
		e1.sendKeys(date);
		ca.eleToBeClickable();//parallel
		//e1.sendKeys(Keys.TAB);
		ca.click(lct.getActivities());
		ca.eleToBeClickable();
		driver.navigate().refresh();
		ca.eleToBeClickable();
		ca.accept_Alert();
		ca.eleToBeClickable();
		System.out.println("user entered date for calendar season in Department");
	}
	@And("Go To the Brand and Modify Completion Date in the Manual Activities {string}") 
	public void Go_To_the_Brand_and_Modify_Completion_Date_in_the_Manual_Activities(String BrandName) throws Throwable {
    	Commonactions.isElementPresent(pc.getHeaderSearch());
    	ca.click(pc.getHeaderSearch());
    	Commonactions.isElementPresent(driver.findElement(By.xpath("//td[@class='dijitReset dijitMenuItemLabel' and text()='Brand']")));
    	ca.click(driver.findElement(By.xpath("//td[@class='dijitReset dijitMenuItemLabel' and text()='Brand']")));
		Commonactions.isElementPresent(pc.getHeaderSearchField());
		ca.insertText(pc.getHeaderSearchField(), BrandName);
		ca.eleToBeClickable();
		ca.click(pc.getSearchIcon());
		Commonactions.isElementPresent(driver.findElement(By.xpath("//a[@class='csi-card-anchor' and @title='"+BrandName+"']")));
		ca.click(driver.findElement(By.xpath("//a[@class='csi-card-anchor' and @title='"+BrandName+"']")));
		
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy");  
		LocalDateTime now = LocalDateTime.now();  
		date = dtf.format(now);

		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		Calendar c1 = Calendar.getInstance();
		c1.setTime(sdf.parse(date));
		System.out.println(date);
		c1.add(Calendar.DAY_OF_MONTH, 1);  
		futuredate = sdf.format(c1.getTime());  
		System.out.println("Date after Addition: "+futuredate);

		c1.add(Calendar.DAY_OF_MONTH, -3);  
		pastdate = sdf.format(c1.getTime());  
		System.out.println("Date after sub: "+pastdate);
		
		Commonactions.isElementPresent(cp.getBrandcalendartab());
		ca.click(cp.getBrandcalendartab());
		Commonactions.isElementPresent(cp.getCalendarseasonlink());
		ca.click(cp.getCalendarseasonlink());
		ca.eleToBeClickable();
		driver.navigate().refresh();
		ca.jsWaitForPageLoad();
		ca.eleToBeClickable();
		Commonactions.isElementPresent(cp.getActivitiestab());
		ca.click(cp.getActivitiestab());
		
		Commonactions.isElementPresent(cp.getCalmanualcompdate());
		ca.click(cp.getCalmanualcompdate());
		ca.eleToBeClickable();
		WebElement e1 = ca.activeElement();
		ca.eleToBeClickable();
		e1.sendKeys(date);
		ca.eleToBeClickable();//parallel
		//e1.sendKeys(Keys.TAB);
		ca.click(lct.getActivities());
		ca.eleToBeClickable();
		driver.navigate().refresh();
		ca.eleToBeClickable();
		ca.accept_Alert();
		ca.eleToBeClickable();
		System.out.println("user entered date for calendar season in Brand");
	}
	@Then("user enter date for calendar season")
	public void user_enter_date_for_calendar_season() throws Throwable {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy");  
		LocalDateTime now = LocalDateTime.now();  
		date = dtf.format(now);

		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		Calendar c1 = Calendar.getInstance();
		c1.setTime(sdf.parse(date));
		System.out.println(date);
		c1.add(Calendar.DAY_OF_MONTH, 1);  
		futuredate = sdf.format(c1.getTime());  
		System.out.println("Date after Addition: "+futuredate);

		c1.add(Calendar.DAY_OF_MONTH, -3);  
		pastdate = sdf.format(c1.getTime());  
		System.out.println("Date after sub: "+pastdate);

		ca.click(hp.getUser_homeBtn());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(hp.getStyleBtn());
		ca.click(hp.getStyleBtn());
		Commonactions.isElementPresent(st.getStyles_Btn());
		ca.click(st.getStyles_Btn());
		ca.eleToBeClickable();

		for(int i=0;i<100;i++)
		{
			ca.click(cp.getStyleslider());			
		}
		Commonactions.isElementPresent(cp.getWinterseason());
		ca.click(cp.getWinterseason());

		Commonactions.isElementPresent(cp.getMastercalander());
		ca.click(cp.getMastercalander());
		Commonactions.isElementPresent(cp.getCalendarseasonlink());
		ca.click(cp.getCalendarseasonlink());
		ca.eleToBeClickable();
		driver.navigate().refresh();
		ca.jsWaitForPageLoad();
		ca.eleToBeClickable();
		

		Commonactions.isElementPresent(cp.getTargetdatemanual());
		ca.click(cp.getTargetdatemanual());
		ca.eleToBeClickable();
		WebElement e1 = ca.activeElement();
		ca.eleToBeClickable();
		e1.sendKeys(pastdate);
		ca.eleToBeClickable();//parallel
		//e1.sendKeys(Keys.TAB);
		ca.click(lct.getActivities());
		ca.eleToBeClickable();
		driver.navigate().refresh();
		ca.eleToBeClickable();
		ca.accept_Alert();
		ca.eleToBeClickable();

		Commonactions.isElementPresent(cp.getTargetdatemilestone());
		ca.click(cp.getTargetdatemilestone());
		ca.eleToBeClickable();
		WebElement e2 = ca.activeElement();
		ca.eleToBeClickable();
		e2.sendKeys(futuredate);
		ca.eleToBeClickable();//parallel
		//e1.sendKeys(Keys.TAB);
		ca.click(lct.getActivities());
		ca.eleToBeClickable();
		driver.navigate().refresh();
		ca.eleToBeClickable();
		ca.accept_Alert();
		ca.eleToBeClickable();

		Commonactions.isElementPresent(cp.getTargetdateartwork());

		ca.click(cp.getTargetdateartwork());
		ca.eleToBeClickable();
		WebElement e3 = ca.activeElement();
		ca.eleToBeClickable();
		e3.sendKeys(futuredate);
		ca.eleToBeClickable();//parallel
		//e1.sendKeys(Keys.TAB);
		ca.click(lct.getActivities());
		ca.eleToBeClickable();
		driver.navigate().refresh();
		ca.eleToBeClickable();
		ca.accept_Alert();
		ca.eleToBeClickable();
		Commonactions.isElementPresent(cp.getTargetdateidswork());

		ca.click(cp.getTargetdateidswork());
		ca.eleToBeClickable();
		WebElement e4 = ca.activeElement();
		ca.eleToBeClickable();
		e4.sendKeys(futuredate);
		ca.eleToBeClickable();//parallel
		//e1.sendKeys(Keys.TAB);
		ca.click(lct.getActivities());
		ca.eleToBeClickable();
		driver.navigate().refresh();
		ca.eleToBeClickable();
		ca.accept_Alert();
		ca.eleToBeClickable();
		System.out.println("user entered date for calendar season");
	}


	@And("user modify the manual date and approves it")
	public void user_modify_the_manual_date_and_approves_it() throws Throwable {

		Commonactions.isElementPresent(cp.getWinterseasonlink());
		ca.click(cp.getWinterseasonlink());
		Commonactions.isElementPresent(cp.getPropagatenewcheckbox());
		ca.click(cp.getPropagatenewcheckbox());
		Commonactions.isElementPresent(cp.getThreedotline());
		ca.click(cp.getThreedotline());
		Commonactions.isElementPresent(cp.getFreeze());
		ca.click(cp.getFreeze());
		Commonactions.isElementPresent(cp.getThreedotline());
		ca.click(cp.getThreedotline());
		Commonactions.isElementPresent(cp.getApplycalendar());
		ca.click(cp.getApplycalendar());
		Commonactions.isElementPresent(cp.getColorsizecheckbox());
		ca.click(cp.getColorsizecheckbox());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		System.out.println("freeze and apply calendar has done");
		Commonactions.isElementPresent(hp.getUser_homeBtn());
		ca.click(hp.getUser_homeBtn());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(hp.getStyleBtn());
		ca.click(hp.getStyleBtn());
		Commonactions.isElementPresent(st.getStyles_Btn());
		ca.click(st.getStyles_Btn());
		for(int i=0;i<100;i++)
		{
			ca.click(cp.getStyleslider());			
		}
		Commonactions.isElementPresent(cp.getDenimseason());
		ca.click(cp.getDenimseason());
		ca.eleToBeClickable();
		ca.click(cp.getBrandcalendartab());
		ca.eleToBeClickable();
		for(int i=0;i<5;i++)
		{
			try
			{
				driver.navigate().refresh();
				Commonactions.isElementPresent(cp.getCalendarseasonlink());
				ca.click(cp.getCalendarseasonlink());
				ca.eleToBeClickable();
			}
			catch(Exception e){	}
		}
		ca.eleToBeClickable();
		Commonactions.isElementPresent(cp.getStyleheirarchytab());
		ca.click(cp.getStyleheirarchytab());
		Commonactions.isElementPresent(cp.getManualdate());
		ca.click(cp.getManualdate());
		ca.eleToBeClickable();
		WebElement e5 = ca.activeElement();
		ca.eleToBeClickable();
		e5.sendKeys(date);
		ca.eleToBeClickable();
		e5.sendKeys(Keys.TAB);
		ca.eleToBeClickable();
		ca.click(cp.getStyleheirarchytab());
		ca.eleToBeClickable();
		driver.navigate().refresh();
		ca.eleToBeClickable();
		Commonactions.isElementPresent(cp.getStyleheirarchytab());
		ca.click(cp.getStyleheirarchytab());
		ca.eleToBeClickable();

		//		for(int i=0;i<50;i++)
		//		{
		//			ca.click(cp.getCalendarslider());
		//		}

		Commonactions.isElementPresent(cp.getMilestonedate());
		ca.click(cp.getMilestonedate());
		ca.eleToBeClickable();
		WebElement e6 = ca.activeElement();
		ca.eleToBeClickable();
		e6.sendKeys(date);
		ca.eleToBeClickable();
		e6.sendKeys(Keys.TAB);
		ca.eleToBeClickable();
		Commonactions.isElementPresent(cp.getStyleheirarchytab());
		ca.click(cp.getStyleheirarchytab());
		ca.eleToBeClickable();

		driver.navigate().refresh();
		ca.eleToBeClickable();
		System.out.println("user modify the manual date and milestone date");

	}

	@Then("user navigates into Artwork tab and creates {string},{string}")
	public void user_navigates_into_Artwork_tab_and_creates(String StyleName,String artworkname) throws Throwable {
	   	ca.click(pc.getHeaderSearch());
    	Commonactions.isElementPresent(driver.findElement(By.xpath("//td[@class='dijitReset dijitMenuItemLabel' and text()='Style']")));
    	ca.click(driver.findElement(By.xpath("//td[@class='dijitReset dijitMenuItemLabel' and text()='Style']")));
		Commonactions.isElementPresent(pc.getHeaderSearchField());
		ca.insertText(pc.getHeaderSearchField(), StyleName);
		ca.eleToBeClickable();
		ca.click(pc.getSearchIcon());
		Commonactions.isElementPresent(driver.findElement(By.xpath("//a[@class='csi-card-anchor' and @title='"+StyleName+"']")));
		ca.click(driver.findElement(By.xpath("//a[@class='csi-card-anchor' and @title='"+StyleName+"']")));
		
		Commonactions.isElementPresent(cp.getSpecificationtab());
		ca.click(cp.getSpecificationtab());
		Commonactions.isElementPresent(cp.getArtworktab());
		ca.click(cp.getArtworktab());
		Commonactions.isElementPresent(cp.getNewartworkaction());
		ca.click(cp.getNewartworkaction());
		ca.eleToBeClickable();

		WebElement e7 = ca.activeElement();
		ca.eleToBeClickable();
		e7.sendKeys(Keys.DELETE);
		ca.eleToBeClickable();
		e7.sendKeys(artworkname);
		ca.eleToBeClickable();
		e7.sendKeys(Keys.TAB);
		ca.eleToBeClickable();
		Commonactions.isElementPresent(cp.getArtworkcheckcircle());
		ca.click(cp.getArtworkcheckcircle());
		ca.eleToBeClickable();
		System.out.println("Artwork Created");


	}

	@Then("user navigates into Image tab and creates {string}")
	public void user_navigates_into_Image_tab_and_creates(String ldsname) throws Throwable {

		Commonactions.isElementPresent(cp.getImagetab());
		ca.click(cp.getImagetab());
		Commonactions.isElementPresent(cp.getImagedatasheetaction());
		ca.click(cp.getImagedatasheetaction());
		ca.eleToBeClickable();

		WebElement e8 = ca.activeElement();
		ca.eleToBeClickable();
		e8.sendKeys(Keys.DELETE);
		ca.eleToBeClickable();
		e8.sendKeys(ldsname);
		ca.eleToBeClickable();
		e8.sendKeys(Keys.TAB);
		ca.eleToBeClickable();
		Commonactions.isElementPresent(cp.getCalendardatasheetcircle());
		ca.click(cp.getCalendardatasheetcircle());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(cp.getCalendardatasheetcircle());
		ca.click(cp.getCalendardatasheetcircle());
		ca.eleToBeClickable();
		System.out.println("Image sheet created ");
	}

	@Then("user select calendar season under style denim and verify the screen")
	public void user_select_calendar_season_under_style_denim_and_verify_the_screen() throws Throwable {

		ca.click(hp.getUser_homeBtn());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(hp.getStyleBtn());
		ca.click(hp.getStyleBtn());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(st.getStyles_Btn());
		ca.click(st.getStyles_Btn());
		ca.eleToBeClickable();
		for(int i=0;i<100;i++)
		{
			ca.click(cp.getStyleslider());			
		}
		ca.eleToBeClickable();
		Commonactions.isElementPresent(cp.getDenimseason());
		ca.eleToBeClickable();
		ca.click(cp.getDenimseason());
		ca.eleToBeClickable();
		ca.click(cp.getBrandcalendartab());
		ca.eleToBeClickable();
		try{
			Commonactions.isElementPresent(cp.getCalendarseasonlink());
			ca.click(cp.getCalendarseasonlink());
			ca.eleToBeClickable();
		}
		catch(Exception e)
		{
			driver.navigate().refresh();
			ca.eleToBeClickable();
			Commonactions.isElementPresent(cp.getCalendarseasonlink());
			ca.click(cp.getCalendarseasonlink());
		}
		System.out.println("calendar season link present");
	}

	
	@And("User Assigns Material to MSG {string}")
	public void User_Assigns_Material_to_MSG(String material) throws Throwable {

		Commonactions.isElementPresent(hp.getUser_homeBtn());
		ca.click(hp.getUser_homeBtn());
		Commonactions.isElementPresent(hp.getMaterialBtn());
		ca.click(hp.getMaterialBtn());
		Commonactions.isElementPresent(cp.getMaterialsecutab());
		ca.click(cp.getMaterialsecutab());
		Commonactions.isElementPresent(cp.getMaterialmsgstandalone());
		ca.click(cp.getMaterialmsgstandalone());
		Commonactions.isElementPresent(cp.getMaterialstab());
		ca.click(cp.getMaterialstab());
		Commonactions.isElementPresent(cp.getMaterialdownarrow());
		ca.click(cp.getMaterialdownarrow());
		Commonactions.isElementPresent(cp.getAddmaterials());
		ca.click(cp.getAddmaterials());
		Commonactions.isElementPresent(cp.getCotraychkbox());
		ca.click(cp.getCotraychkbox());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		System.out.println("Material Added to calendae cotton rayon jersey");
	}
		
	@And("Create Master Calendar in the MSG {string}")
	public void Create_Master_Calendar_in_the_MSG(String TemplateCalendar) throws Throwable {

		Commonactions.isElementPresent(cp.getMastercalander());
		ca.click(cp.getMastercalander());
		Commonactions.isElementPresent(cp.getTemplatecalendaraction());
		ca.click(cp.getTemplatecalendaraction());
		Commonactions.isElementPresent(cp.getCalendarseasoncheckbox());
		ca.click(cp.getCalendarseasoncheckbox());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		System.out.println("Master calendar created under Material Security Group");
	}
	
	@Then("Freeze the Calendar and Apply Calendar to Material {string}")
	public void Freeze_the_Calendar_and_Apply_Calendar_to_Material(String Material) throws Throwable {
		Commonactions.isElementPresent(cp.getCalendarmsgchkbox());
		Commonactions.isElementPresent(cp.getPropagatenewcalmsgchkbx());
		ca.click(cp.getPropagatenewcalmsgchkbx());
		Commonactions.isElementPresent(cp.getThreedotcalmsg());
		ca.click(cp.getThreedotcalmsg());
		Commonactions.isElementPresent(cp.getFreeze());
		ca.click(cp.getFreeze());
		ca.eleToBeClickable();

		/*for(int i=0;i<50;i++)
		{
		ca.click(cp.getMastercalslider());
		}*/
		Commonactions.isElementPresent(cp.getRefreshmastercalpg());
		ca.click(cp.getRefreshmastercalpg());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(cp.getThreedotcalmsg());
		ca.click(cp.getThreedotcalmsg());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(cp.getApplycalendar());
		ca.click(cp.getApplycalendar());
		Commonactions.isElementPresent(driver.findElement(By.xpath("//td[contains(text(),'100% Cotton')]")));
		ca.click(driver.findElement(By.xpath("//td[contains(text(),'100% Cotton')]")));
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();

		for(int i=0;i<10;i++)
		{
			Commonactions.isElementPresent(cp.getRefreshmastercalpg());
			ca.click(cp.getRefreshmastercalpg());
			ca.eleToBeClickable();
			ca.eleToBeClickable();
			WebElement create = driver.findElement(By.xpath("//td[contains(text(),'Create')]"));
			String status = create.getText();
			if(status.contains("Succeeded"))
			{
				System.out.println(status +" calendar status");
				break;
			}
		}
		System.out.println("verified Applied calendar is succeeded or not");
	}
	
	@Then("user create material sku under material {string}")
	public void user_create_material_sku_under_material(String materialsku) throws Throwable {
		Commonactions.isElementPresent(hp.getUser_homeBtn());
		ca.click(hp.getUser_homeBtn());
		Commonactions.isElementPresent(hp.getMaterialBtn());
		ca.click(hp.getMaterialBtn());
		Commonactions.isElementPresent(sm.getCottonName());
		ca.click(sm.getCottonName());
		Commonactions.isElementPresent(hp.getMaterialBtn());
		ca.click(hp.getMaterialBtn());
		Commonactions.isElementPresent(cp.getSKU());
		ca.click(cp.getSKU());
		Commonactions.isElementPresent(cp.getNew_mat_sku_Btn());
		ca.click(cp.getNew_mat_sku_Btn());
		Commonactions.isElementPresent(cp.getMat_sku_value());
		ca.insertText(cp.getMat_sku_value(), materialsku);
		Commonactions.isElementPresent(cp.getUseMatrix_chkBox());
		ca.click(cp.getUseMatrix_chkBox());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		System.out.println("Material SKU created for calendar");

	}

	@Then("Go To the Material Security Group modify the date and Verify the Manual Activities {string}")
	public void Go_To_the_Material_Security_Group_modify_the_date_and_Verify_the_Manual_Activities(String MSGName) throws Throwable {
	   	ca.click(pc.getHeaderSearch());
    	Commonactions.isElementPresent(driver.findElement(By.xpath("//td[@class='dijitReset dijitMenuItemLabel' and text()='Material Security Group']")));
    	ca.click(driver.findElement(By.xpath("//td[@class='dijitReset dijitMenuItemLabel' and text()='Material Security Group']")));
		Commonactions.isElementPresent(pc.getHeaderSearchField());
		ca.insertText(pc.getHeaderSearchField(), MSGName);
		ca.eleToBeClickable();
		ca.click(pc.getSearchIcon());
		Commonactions.isElementPresent(driver.findElement(By.xpath("//a[@class='csi-card-anchor' and @title='"+MSGName+"']")));
		ca.click(driver.findElement(By.xpath("//a[@class='csi-card-anchor' and @title='"+MSGName+"']")));

		Commonactions.isElementPresent(cp.getBrandcalendartab());
		ca.click(cp.getBrandcalendartab());
		Commonactions.isElementPresent(cp.getCalendarmsgname());
		ca.click(cp.getCalendarmsgname());
		ca.eleToBeClickable();
		driver.navigate().refresh();
		ca.jsWaitForPageLoad();
		ca.eleToBeClickable();
		Commonactions.isElementPresent(cp.getActivitiestab());
		ca.click(cp.getActivitiestab());
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy");  
		LocalDateTime now = LocalDateTime.now();  
		date = dtf.format(now);
		Commonactions.isElementPresent(cp.getCalmanualcompdate());
		ca.click(cp.getCalmanualcompdate());
		ca.eleToBeClickable();
		WebElement e1 = ca.activeElement();
		ca.eleToBeClickable();
		e1.sendKeys(date);
		ca.eleToBeClickable();//parallel
		//e1.sendKeys(Keys.TAB);
		ca.click(lct.getActivities());
		ca.eleToBeClickable();
		driver.navigate().refresh();
		ca.eleToBeClickable();
		ca.accept_Alert();
		ca.eleToBeClickable();
		System.out.println("user entered calendar date for the calendar-MSG under Material standalone");

	}

	@Then("Go To the Material and Verify the Manual Activities {string}")
	public void Go_To_the_Material_and_Verify_the_Manual_Activities(String MaterialName) throws Throwable {
	   	ca.click(pc.getHeaderSearch());
    	Commonactions.isElementPresent(driver.findElement(By.xpath("//td[@class='dijitReset dijitMenuItemLabel' and text()='Material']")));
    	ca.click(driver.findElement(By.xpath("//td[@class='dijitReset dijitMenuItemLabel' and text()='Material']")));
		Commonactions.isElementPresent(pc.getHeaderSearchField());
		ca.insertText(pc.getHeaderSearchField(), MaterialName);
		ca.eleToBeClickable();
		ca.click(pc.getSearchIcon());
		Commonactions.isElementPresent(driver.findElement(By.xpath("//a[@class='csi-card-anchor' and @title='"+MaterialName+"']")));
		ca.click(driver.findElement(By.xpath("//a[@class='csi-card-anchor' and @title='"+MaterialName+"']")));
		ca.eleToBeClickable();
		Commonactions.isElementPresent(cp.getBrandcalendartab());
		ca.click(cp.getBrandcalendartab());
		Commonactions.isElementPresent(cp.getCalendarmsgname());
		ca.click(cp.getCalendarmsgname());
		ca.eleToBeClickable();
		driver.navigate().refresh();
		ca.jsWaitForPageLoad();
		ca.eleToBeClickable();
		Commonactions.isElementPresent(cp.getActivitiestab());
		ca.click(cp.getActivitiestab());
		
		Commonactions.isElementPresent(cp.getManualMatMSGActivity());
		System.out.println("Manual activities are present under Material standalone");
	}
	@Then("Go To the Colored Material and Verify the Manual Activities {string}")
	public void Go_To_the_Colored_Material_and_Verify_the_Manual_Activities(String ColMaterialName) throws Throwable {
	   	ca.click(pc.getHeaderSearch());
    	Commonactions.isElementPresent(driver.findElement(By.xpath("//td[@class='dijitReset dijitMenuItemLabel' and text()='Colored Material']")));
    	ca.click(driver.findElement(By.xpath("//td[@class='dijitReset dijitMenuItemLabel' and text()='Colored Material']")));
		Commonactions.isElementPresent(pc.getHeaderSearchField());
		ca.insertText(pc.getHeaderSearchField(), ColMaterialName);
		ca.eleToBeClickable();
		ca.click(pc.getSearchIcon());
		Commonactions.isElementPresent(driver.findElement(By.xpath("//a[@class='csi-card-anchor' and @title='"+ColMaterialName+"']")));
		ca.click(driver.findElement(By.xpath("//a[@class='csi-card-anchor' and @title='"+ColMaterialName+"']")));
		
		Commonactions.isElementPresent(cp.getBrandcalendartab());
		ca.click(cp.getBrandcalendartab());
		Commonactions.isElementPresent(cp.getCalendarmsgname());
		ca.click(cp.getCalendarmsgname());
		ca.eleToBeClickable();
		driver.navigate().refresh();
		ca.jsWaitForPageLoad();
		ca.eleToBeClickable();
		Commonactions.isElementPresent(cp.getActivitiestab());
		ca.click(cp.getActivitiestab());
		
		Commonactions.isElementPresent(cp.getManualColoredMatMSGActivity());
		ca.click(lct.getActivities());
		System.out.println("Manual Activity is present under Colored Material standalone");
	}
	@Then("user freeze and apply calendar")
	public void user_freeze_and_apply_calendar() throws Throwable {
		Commonactions.isElementPresent(cp.getMsgstandalonelink());
		ca.click(cp.getMsgstandalonelink());
		Commonactions.isElementPresent(cp.getCalendarmsgchkbox());
		ca.click(cp.getCalendarmsgchkbox());
		Commonactions.isElementPresent(cp.getThreedotcalmsg());
		ca.click(cp.getThreedotcalmsg());
		Commonactions.isElementPresent(cp.getFreeze());
		ca.click(cp.getFreeze());
		ca.eleToBeClickable();

		/*for(int i=0;i<50;i++)
		{
		ca.click(cp.getMastercalslider());
		}*/
		Commonactions.isElementPresent(cp.getThreedotcalmsg());
		ca.click(cp.getThreedotcalmsg());
		Commonactions.isElementPresent(cp.getApplycalendar());
		ca.click(cp.getApplycalendar());
		Commonactions.isElementPresent(cp.getCottonrayon());
		ca.click(cp.getCottonrayon());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();

		for(int i=0;i<10;i++)
		{
			Commonactions.isElementPresent(cp.getRefreshmastercalpg());
			ca.click(cp.getRefreshmastercalpg());
			ca.eleToBeClickable();
			ca.eleToBeClickable();
			WebElement create = driver.findElement(By.xpath("//td[contains(text(),'Create')]"));
			String status = create.getText();
			if(status.contains("Succeeded"))
			{
				System.out.println(status +" calendar status");
				break;
			}
		}
		System.out.println("verified Applied calendar is succeeded or not");
	}

	@Then("user edit manual date under material activities")
	public void user_edit_manual_date_under_material_activities() throws Throwable {
		Commonactions.isElementPresent(cp.getMaterialstab());
		ca.click(cp.getMaterialstab());
		Commonactions.isElementPresent(cp.getCotrayjersey());
		ca.click(cp.getCotrayjersey());
		Commonactions.isElementPresent(cp.getBrandcalendartab());
		ca.click(cp.getBrandcalendartab());
		Commonactions.isElementPresent(cp.getCalendarmsgname());
		ca.click(cp.getCalendarmsgname());
		ca.eleToBeClickable();
		/*ca.click(driver.findElement(By.xpath("//span[contains(@data-csi-automation,'plugin-Calendar-CalendarActivities-refresh')]//span[text()='refresh']")));	
		ca.eleToBeClickable();*/
		Commonactions.isElementPresent(hp.getUser_homeBtn());
		ca.click(hp.getUser_homeBtn());
		Commonactions.isElementPresent(hp.getMaterialBtn());
		ca.click(hp.getMaterialBtn());
		Commonactions.isElementPresent(cp.getMaterialsecutab());
		ca.click(cp.getMaterialsecutab());
		Commonactions.isElementPresent(cp.getMaterialmsgstandalone());
		ca.click(cp.getMaterialmsgstandalone());
		Commonactions.isElementPresent(cp.getBrandcalendartab());
		ca.click(cp.getBrandcalendartab());
		Commonactions.isElementPresent(cp.getCalendarmsgname());
		ca.click(cp.getCalendarmsgname());
		Commonactions.isElementPresent(cp.getActivitiestab());
		ca.click(cp.getActivitiestab());
		ca.eleToBeClickable();
		/*for(int i=0;i<50;i++)//parallel
		{
			boolean displayed = driver.findElement(By.xpath("(//div[contains(@class,'dijitSliderIncrementIconH')]//span[text()='+']/parent::div)[2]")).isDisplayed();
			if(displayed==true)
			{
				driver.findElement(By.xpath("(//div[contains(@class,'dijitSliderIncrementIconH')]//span[text()='+']/parent::div)[2]")).click();
			}
			boolean displayed1 = driver.findElement(By.xpath("(//div[contains(@class,'dijitSliderIncrementIconH')]//span[text()='+']/parent::div)[1]")).isDisplayed();
			if(displayed1==true)
			{
				driver.findElement(By.xpath("(//div[contains(@class,'dijitSliderIncrementIconH')]//span[text()='+']/parent::div)[1]")).click();
			}
		}*/
		Commonactions.isElementPresent(cp.getCalmanualcompdate());
		ca.click(cp.getCalmanualcompdate());
		ca.eleToBeClickable();
		WebElement a6 = ca.activeElement();
		ca.eleToBeClickable();
		a6.sendKeys(date);
		ca.eleToBeClickable();
		a6.sendKeys(Keys.TAB);
		ca.eleToBeClickable();
		driver.navigate().refresh();
		ca.eleToBeClickable();
		ca.accept_Alert();
		ca.eleToBeClickable();
		System.out.println("manual date entered for calendar-msg under Material");
	}
	@Then("user navigates Material creates BOM and approves it {string}")
	public void user_navigates_Material_creates_BOM_and_approves_it(String bomname) throws Throwable {
	
		Commonactions.isElementPresent(cp.getSpecificationtab());
		ca.click(cp.getSpecificationtab());
		Commonactions.isElementPresent(cp.getBomtab());
		ca.click(cp.getBomtab());
		Commonactions.isElementPresent(cp.getActionmatbom());
		ca.click(cp.getActionmatbom());
		Commonactions.isElementPresent(cp.getMatbominput());
		ca.insertText(cp.getMatbominput(), bomname);
		ca.eleToBeClickable();
	
		
		lct.getMaterialBomfield().sendKeys("Material");
		ca.jsMouseOver();
		ca.eleToBeClickable();
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		try
		{   ca.click(cp.getCalbomenable());  }
		catch(Exception e)
		{   ca.click(cp.getCalbomenable2());   }
		System.out.println("Calendar BOM approved");
	}
	@Then("user approves created MDS and MCDS {string},{string}")
	public void user_approves_created_MDS_and_MCDS(String mdsvalue, String ColorValue) throws Throwable {
		Commonactions.isElementPresent(cp.getMDStab());
		ca.click(cp.getMDStab());
		
		
		Commonactions.isElementPresent(cp.getActionMDS());
		ca.click(cp.getActionMDS());
		ca.eleToBeClickable();
		WebElement a7 = ca.activeElement();
		a7.sendKeys(mdsvalue);
		ca.eleToBeClickable();
		a7.sendKeys(Keys.TAB);
		ca.eleToBeClickable();
		Commonactions.isElementPresent(cp.getThreedotcalMDS());
		ca.click(cp.getThreedotcalMDS());
		Commonactions.isElementPresent(cp.getApprove());
		ca.click(cp.getApprove());
		ca.eleToBeClickable();
		System.out.println("MDS created and approved");
		Commonactions.isElementPresent(cp.getActionMCDS());
		ca.click(cp.getActionMCDS());
		Commonactions.isElementPresent(cp.getColorvalue());
		ca.insertText(cp.getColorvalue(), ColorValue);
		co.jsMouseOver();
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(driver.findElement(By.xpath("//a[text()='"+ColorValue+"']//following::span[1][@data-csi-act='EndPhase']")));
		ca.click(driver.findElement(By.xpath("//a[text()='"+ColorValue+"']//following::span[1][@data-csi-act='EndPhase']")));
		ca.eleToBeClickable();
		System.out.println("MCDS created and approved");
	}

	@Then("create calendar po template for order po group")
	public void create_calendar_po_template_for_order_po_group() throws Throwable {
		Commonactions.isElementPresent(cp.getSourcingtab());
		ca.click(cp.getSourcingtab());
		Commonactions.isElementPresent(cp.getSuppotab());
		ca.click(cp.getSuppotab());
		Commonactions.isElementPresent(cp.getPogrptab());
		ca.click(cp.getPogrptab());
		ca.eleToBeClickable();
		try{Commonactions.isElementPresent(cp.getOrdpogrp());
		ca.click(cp.getOrdpogrp());}
		catch(Exception e){driver.findElement(By.xpath("(//a[text()='order po group'])")).click();}
		ca.eleToBeClickable();		
		ca.click(cp.getMastercalander());		
		Commonactions.isElementPresent(cp.getTemplatecalendaraction());
		ca.click(cp.getTemplatecalendaraction());		
		Commonactions.isElementPresent(cp.getCalpochkbox());
		ca.click(cp.getCalpochkbox());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		System.out.println("created calendar po within order po group");
	}

	@Then("Navigate to calendarpo and enter date for the calendar")
	public void navigate_to_calendarpo_and_enter_date_for_the_calendar()throws Throwable {

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy");  
		LocalDateTime now = LocalDateTime.now();  
		date = dtf.format(now);

		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		Calendar c1 = Calendar.getInstance();
		c1.setTime(sdf.parse(date));
		System.out.println(date);
		c1.add(Calendar.DAY_OF_MONTH, 1);  
		futuredate = sdf.format(c1.getTime());  
		System.out.println("Date after Addition: "+futuredate);

		c1.add(Calendar.DAY_OF_MONTH, -3);  
		pastdate = sdf.format(c1.getTime());  
		System.out.println("Date after sub: "+pastdate);

		Commonactions.isElementPresent(cp.getCalpopropagchk());
		ca.click(cp.getCalpopropagchk());		
		Commonactions.isElementPresent(cp.getCalandarpo());
		ca.click(cp.getCalandarpo());
		ca.click(cp.getManualtardate());
		ca.eleToBeClickable();
		WebElement x1 = ca.activeElement();
		ca.eleToBeClickable();
		x1.sendKeys(pastdate);
		ca.eleToBeClickable();
		ca.click(cp.getActivitiestab());
		ca.eleToBeClickable();

		ca.click(cp.getStyrevtardate());
		ca.eleToBeClickable();
		WebElement x2 = ca.activeElement();
		ca.eleToBeClickable();
		x2.sendKeys(futuredate);
		ca.eleToBeClickable();
		ca.click(cp.getActivitiestab());
		ca.eleToBeClickable();

		ca.click(cp.getSizechartardate());
		ca.eleToBeClickable();
		WebElement x3 = ca.activeElement();
		ca.eleToBeClickable();
		x3.sendKeys(futuredate);
		ca.eleToBeClickable();
		ca.click(cp.getActivitiestab());
		ca.eleToBeClickable();

		ca.click(cp.getMiltardate());
		ca.eleToBeClickable();
		WebElement x4 = ca.activeElement();
		ca.eleToBeClickable();
		x4.sendKeys(futuredate);
		ca.eleToBeClickable();
		ca.click(cp.getActivitiestab());
		ca.eleToBeClickable();
		System.out.println("date applied for the respected activity ");
	}
	
	@Then("user freeze PO Calendar and apply calendar for the data")
	public void user_freeze_PO_Calenda_and_apply_calendar_for_the_data()throws Throwable  {
		//Commonactions.isElementPresent(cp.getOrderpogrplink());
		//ca.click(cp.getOrderpogrplink());
		Commonactions.isElementPresent(cp.getMastercalander());
		//ca.click(cp.getMastercalander());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(cp.getCalpopropagchk());
		ca.click(cp.getCalpopropagchk());
		Commonactions.isElementPresent(cp.getCalpothreedot());
		ca.click(cp.getCalpothreedot());
		Commonactions.isElementPresent(cp.getFreeze());
		ca.click(cp.getFreeze());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(cp.getCalpothreedot());
		ca.click(cp.getCalpothreedot());
		Commonactions.isElementPresent(cp.getApplycalendar());
		ca.click(cp.getApplycalendar());
		ca.eleToBeClickable();		
		Commonactions.isElementPresent(cp.getPocolorbasedchkbox());
		ca.click(cp.getPocolorbasedchkbox());
		Commonactions.isElementPresent(mp.getSave_btn1());	
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();

		for(int i=0;i<20;i++)
		{
			try
			{
				Commonactions.isElementPresent(cp.getMastercalporefresh());
				ca.click(cp.getMastercalporefresh());
				ca.eleToBeClickable();
				ca.eleToBeClickable();
				WebElement create = driver.findElement(By.xpath("//td[contains(text(),'Create')]"));
				String status = create.getText();
				if(status.contains("Succeeded"))
				{
					System.out.println(status +" calendar status");
					System.out.println("status viewed as Succeeded");
					break;
				}}
			catch(Exception e){}
		}
	}

	@And("Navigate Supplier PO and Verify the Manual Activities then Fill The completion dates {string}")
	public void Navigate_Supplier_PO_and_Verify_the_Manual_Activities_then_Fill_The_completion_dates(String SupplierPO)throws Throwable {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy");  
		LocalDateTime now = LocalDateTime.now();  
		date = dtf.format(now);
		Commonactions.isElementPresent(pc.getHeaderSearch());
    	ca.click(pc.getHeaderSearch());
    	Commonactions.isElementPresent(driver.findElement(By.xpath("//td[@class='dijitReset dijitMenuItemLabel' and text()='Supplier PO']")));
    	ca.click(driver.findElement(By.xpath("//td[@class='dijitReset dijitMenuItemLabel' and text()='Supplier PO']")));
		Commonactions.isElementPresent(pc.getHeaderSearchField());
		ca.insertText(pc.getHeaderSearchField(), SupplierPO);
		ca.eleToBeClickable();
		ca.click(pc.getSearchIcon());
		Commonactions.isElementPresent(driver.findElement(By.xpath("//a[@class='csi-card-anchor' and @title='"+SupplierPO+"']")));
		ca.click(driver.findElement(By.xpath("//a[@class='csi-card-anchor' and @title='"+SupplierPO+"']")));
		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("MM/dd/yyyy");  
		LocalDateTime now1 = LocalDateTime.now();  
		date = dtf1.format(now1);
    	Commonactions.isElementPresent(cp.getBrandcalendartab());
		ca.click(cp.getBrandcalendartab());
		Commonactions.isElementPresent(cp.getCalandarpo());
		ca.click(cp.getCalandarpo());
		ca.eleToBeClickable();
		driver.navigate().refresh();
		ca.jsWaitForPageLoad();
		ca.eleToBeClickable();
		Commonactions.isElementPresent(cp.getActivitiestab());
		ca.click(cp.getActivitiestab());
		Commonactions.isElementPresent(cp.getCalmanualcompdate());
		ca.click(cp.getCalmanualcompdate());
		ca.eleToBeClickable();
		WebElement e1 = ca.activeElement();
		ca.eleToBeClickable();
		e1.sendKeys(date);
		ca.eleToBeClickable();//parallel
		//e1.sendKeys(Keys.TAB);
		ca.click(lct.getActivities());
		ca.eleToBeClickable();
		driver.navigate().refresh();
		ca.eleToBeClickable();
		ca.accept_Alert();
		ca.eleToBeClickable();
		System.out.println("user entered date for Supplier PO ");
	}	

	@Then("Navigate PO Colors Tab and Verify the Manual Activities Fill The completion dates {string},{string}")
	public void navigate_PO_Colors_Tab_and_Verify_the_Manual_Activities_Fill_The_completion_dates(String POG,String POColors)throws Throwable {
		//POGroup-CalendarNode-POColors
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy");  
		LocalDateTime now = LocalDateTime.now();  
		date = dtf.format(now);
		
		Commonactions.isElementPresent(pc.getHeaderSearch());
    	ca.click(pc.getHeaderSearch());
    	Commonactions.isElementPresent(lct.getPoGroup());
    	ca.click(lct.getPoGroup());
		Commonactions.isElementPresent(pc.getHeaderSearchField());
		ca.insertText(pc.getHeaderSearchField(), POG);
		ca.eleToBeClickable();
		ca.click(pc.getSearchIcon());
		Commonactions.isElementPresent(driver.findElement(By.xpath("//a[@class='csi-card-anchor' and @title='"+POG+"']")));
		ca.click(driver.findElement(By.xpath("//a[@class='csi-card-anchor' and @title='"+POG+"']")));
		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("MM/dd/yyyy");  
		LocalDateTime now1 = LocalDateTime.now();  
		date = dtf1.format(now1);
    	Commonactions.isElementPresent(cp.getBrandcalendartab());
		ca.click(cp.getBrandcalendartab());
		Commonactions.isElementPresent(cp.getCalandarpo());
		ca.click(cp.getCalandarpo());
		
		
		
		Commonactions.isElementPresent(lct.getPOColors());
		ca.click(lct.getPOColors());
		ca.eleToBeClickable();
		//ca.click(driver.findElement(By.xpath("(//a[text()='"+POColors+"'])[2]")));
		ca.eleToBeClickable();
		ca.click(driver.findElement(By.xpath("//td[@data-csi-heading='Node Name:Child:__Parent__:0']/a[@class='browse' and text()='"+POColors+"']")));
		ca.eleToBeClickable();
    	Commonactions.isElementPresent(cp.getBrandcalendartab());
		ca.click(cp.getBrandcalendartab());
		Commonactions.isElementPresent(cp.getCalandarpo());
		//Commonactions.isElementPresent(cp.getCalendarseasonlink());
		ca.click(cp.getCalandarpo());
		//ca.click(cp.getCalendarseasonlink());
		ca.eleToBeClickable();
		driver.navigate().refresh();
		ca.jsWaitForPageLoad();
		ca.eleToBeClickable();
		Commonactions.isElementPresent(cp.getActivitiestab());
		ca.click(cp.getActivitiestab());
		
		Commonactions.isElementPresent(cp.getCalmanualcompdate());
		ca.click(cp.getCalmanualcompdate());
		ca.eleToBeClickable();
		WebElement e1 = ca.activeElement();
		ca.eleToBeClickable();
		e1.sendKeys(date);
		ca.eleToBeClickable();//parallel
		//e1.sendKeys(Keys.TAB);
		ca.click(lct.getActivities());
		ca.eleToBeClickable();
		driver.navigate().refresh();
		ca.eleToBeClickable();
		ca.accept_Alert();
		ca.eleToBeClickable();
		System.out.println("user entered date for POColors ");
	}

	@Then("Navigate PO Products Tab and Verify the Manual Activities Fill The completion dates {string},{string}")
	public void navigate_PO_Products_Tab_and_Verify_the_Manual_Activities_Fill_The_completion_dates(String POG,String POProducts)throws Throwable {
		//POGroup-CalendarNode-POProductsTab-Style
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy");  
		LocalDateTime now = LocalDateTime.now();  
		date = dtf.format(now);
		
		Commonactions.isElementPresent(pc.getHeaderSearch());
    	ca.click(pc.getHeaderSearch());
    	Commonactions.isElementPresent(lct.getPoGroup());
    	ca.click(lct.getPoGroup());
		Commonactions.isElementPresent(pc.getHeaderSearchField());
		ca.insertText(pc.getHeaderSearchField(), POG);
		ca.eleToBeClickable();
		ca.click(pc.getSearchIcon());
		Commonactions.isElementPresent(driver.findElement(By.xpath("//a[@class='csi-card-anchor' and @title='"+POG+"']")));
		ca.click(driver.findElement(By.xpath("//a[@class='csi-card-anchor' and @title='"+POG+"']")));
		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("MM/dd/yyyy");  
		LocalDateTime now1 = LocalDateTime.now();  
		date = dtf1.format(now1);
    	Commonactions.isElementPresent(cp.getBrandcalendartab());
		ca.click(cp.getBrandcalendartab());
		Commonactions.isElementPresent(cp.getCalandarpo());
		ca.click(cp.getCalandarpo());
		Commonactions.isElementPresent(cp.getPOProductsTab());
		ca.click(cp.getPOProductsTab());
		ca.eleToBeClickable();
		ca.click(driver.findElement(By.xpath("//td[@data-csi-heading='Node Name:Child:__Parent__:0']/a[@class='browse' and text()='"+POProducts+"']")));

		//Commonactions.isElementPresent(driver.findElement(By.xpath("//a[text()='"+POProducts+"']")));
		//ca.click(driver.findElement(By.xpath("(//a[text()='"+POProducts+"'])[2]")));
		ca.eleToBeClickable();
    	Commonactions.isElementPresent(cp.getBrandcalendartab());
		ca.click(cp.getBrandcalendartab());
		Commonactions.isElementPresent(cp.getCalandarpo());
		ca.click(cp.getCalandarpo());
		ca.eleToBeClickable();
		driver.navigate().refresh();
		ca.jsWaitForPageLoad();
		ca.eleToBeClickable();
		Commonactions.isElementPresent(cp.getActivitiestab());
		ca.click(cp.getActivitiestab());
		
		Commonactions.isElementPresent(cp.getCalmanualcompdate());
		ca.click(cp.getCalmanualcompdate());
		ca.eleToBeClickable();
		WebElement e1 = ca.activeElement();
		ca.eleToBeClickable();
		e1.sendKeys(date);
		ca.eleToBeClickable();//parallel
		//e1.sendKeys(Keys.TAB);
		ca.click(lct.getActivities());
		ca.eleToBeClickable();
		driver.navigate().refresh();
		ca.eleToBeClickable();
		ca.accept_Alert();
		ca.eleToBeClickable();
		System.out.println("user entered date for PO Products ");
	}	

	@Then("Go back to POG Calendar Fill Completion date for POG {string}")
	public void Go_back_to_POG_Calendar_Fill_Completion_date_for_POG(String POG)throws Throwable {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy");  
		LocalDateTime now = LocalDateTime.now();  
		date = dtf.format(now);
		
		Commonactions.isElementPresent(pc.getHeaderSearch());
    	ca.click(pc.getHeaderSearch());
    	Commonactions.isElementPresent(lct.getPoGroup());
    	ca.click(lct.getPoGroup());
		Commonactions.isElementPresent(pc.getHeaderSearchField());
		ca.insertText(pc.getHeaderSearchField(), POG);
		ca.eleToBeClickable();
		ca.click(pc.getSearchIcon());
		Commonactions.isElementPresent(driver.findElement(By.xpath("//a[@class='csi-card-anchor' and @title='"+POG+"']")));
		ca.click(driver.findElement(By.xpath("//a[@class='csi-card-anchor' and @title='"+POG+"']")));
		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("MM/dd/yyyy");  
		LocalDateTime now1 = LocalDateTime.now();  
		date = dtf1.format(now1);
    	Commonactions.isElementPresent(cp.getBrandcalendartab());
		ca.click(cp.getBrandcalendartab());
		Commonactions.isElementPresent(cp.getCalandarpo());
		ca.click(cp.getCalandarpo());
		ca.eleToBeClickable();
		driver.navigate().refresh();
		ca.jsWaitForPageLoad();
		ca.eleToBeClickable();
		Commonactions.isElementPresent(cp.getActivitiestab());
		ca.click(cp.getActivitiestab());
		
		Commonactions.isElementPresent(cp.getCalmanualcompdate());
		ca.click(cp.getCalmanualcompdate());
		ca.eleToBeClickable();
		WebElement e1 = ca.activeElement();
		ca.eleToBeClickable();
		e1.sendKeys(date);
		ca.eleToBeClickable();//parallel
		//e1.sendKeys(Keys.TAB);
		ca.click(lct.getActivities());
		ca.eleToBeClickable();
		driver.navigate().refresh();
		ca.eleToBeClickable();
		ca.accept_Alert();
		ca.eleToBeClickable();
		System.out.println("user entered date for PO Group ");
	}
	@Then("Navigate to style create review {string}")
	public void navigate_to_style_create_review(String string)throws Throwable {
		/*Commonactions.isElementPresent(cp.getBackarrowbtn());
		ca.click(cp.getBackarrowbtn());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(cp.getApparelcolsize());
		ca.click(cp.getApparelcolsize());*/
		Commonactions.isElementPresent(hp.getUser_homeBtn());
		hp.getUser_homeBtn().click();
		Commonactions.isElementPresent(hp.getStyleBtn());
		hp.getStyleBtn().click();
		Commonactions.isElementPresent(st.getStyles_Btn());
		st.getStyles_Btn().click();
		Commonactions.isElementPresent(si.getColorandSize());
		si.getColorandSize().click();
		Commonactions.isElementPresent(cp.getSpecificationtab());
		ca.click(cp.getSpecificationtab());
		Commonactions.isElementPresent(cp.getReviewtab());
		ca.click(cp.getReviewtab());
		ca.eleToBeClickable();		
		Commonactions.isElementPresent(cp.getStylerevaction());
		ca.click(cp.getStylerevaction());
		ca.eleToBeClickable();
		WebElement y1 = ca.activeElement();
		ca.eleToBeClickable();
		y1.sendKeys(Keys.DELETE);
		ca.eleToBeClickable();
		ca.insertText(y1,"Calendar Style Review");
		ca.eleToBeClickable();
		y1.sendKeys(Keys.TAB);
		System.out.println("review created");
		Commonactions.isElementPresent(cp.getCalstylerevthreedot());
		ca.click(cp.getCalstylerevthreedot());		
		Commonactions.isElementPresent(cp.getApprove());
		ca.click(cp.getApprove());
		Commonactions.isElementPresent(cp.getCalstylerevthreedot());
		ca.click(cp.getCalstylerevthreedot());
		Commonactions.isElementPresent(cp.getIterate());
		ca.click(cp.getIterate());
		Commonactions.isElementPresent(cp.getCalstylrevdelete());
		ca.click(cp.getCalstylrevdelete());
		Commonactions.isElementPresent(pp.getDelete_Btn());
		ca.click(pp.getDelete_Btn());
		ca.eleToBeClickable();
		System.out.println("Successfully iterated and deleted the review");
	}
	
	
}

