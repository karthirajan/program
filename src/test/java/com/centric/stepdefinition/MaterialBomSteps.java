package com.centric.stepdefinition;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.centric.objectrepository.BOMCreationPage;
import com.centric.objectrepository.BusinessPlanningPage;
import com.centric.objectrepository.ConfigurationPage;
import com.centric.objectrepository.DocumentPage;
import com.centric.objectrepository.HomePage;
import com.centric.objectrepository.InspectionPage;
import com.centric.objectrepository.Locators;
import com.centric.objectrepository.MaterialSpecificationPage;
import com.centric.objectrepository.PopupPage;
import com.centric.objectrepository.QualityPage;
import com.centric.objectrepository.SetupPageTK;
import com.centric.objectrepository.SourcingPage;
import com.centric.objectrepository.StyleInspectionPage;
import com.centric.objectrepository.StylePage;
import com.centric.objectrepository.UserManagementPage;
import com.centric.resources.Commonactions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MaterialBomSteps extends Commonactions {

	HomePage hp = new HomePage();
	Commonactions ca = new  Commonactions();
	MaterialSpecificationPage mp = new  MaterialSpecificationPage();
	PopupPage pp = new  PopupPage();
	SourcingPage sp = new  SourcingPage();
	DocumentPage dp = new  DocumentPage();
	StylePage st = new  StylePage();
	InspectionPage in = new  InspectionPage();
	UserManagementPage up = new  UserManagementPage();
	StyleInspectionPage si = new  StyleInspectionPage();
	SetupPageTK su = new  SetupPageTK();
	ConfigurationPage co = new  ConfigurationPage();
	BOMCreationPage bc = new  BOMCreationPage();
	BusinessPlanningPage bp = new  BusinessPlanningPage();
	QualityPage qp = new   QualityPage();
	Locators lct = new Locators();


	@Then("Go to datasetup and create new placement and BOMSection{string},{string},{string}")
	public void go_to_datasetup_and_create_new_placement_and_BOMSection(String string, String string2, String string3) throws Throwable {
		String[] p=string.split(",");
		String[] bom=string2.split(",");
		String[] sort=string3.split(",");
		Commonactions.isElementPresent(hp.getDatasetup());
		ca.eleToBeClickable();
		ca.click(hp.getDatasetup());
		Commonactions.isElementPresent(hp.getData_Spec());
		ca.click(hp.getData_Spec());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(hp.getSetupSearch());
		ca.insertText(hp.getSetupSearch(), "Placements");
		ca.eleToBeClickable();

		Commonactions.isElementPresent(mp.getPlacement());
		Thread.sleep(1000);
		Commonactions.clickjs(mp.getPlacement());
		for (int i=0;i<4;i++) {
			Commonactions.isElementPresent(mp.getNew_placement_Btn());
			Thread.sleep(1000);
			Commonactions.clickjs(mp.getNew_placement_Btn());
			Commonactions.isElementPresent(mp.getPlacement_value());
			ca.insertText(mp.getPlacement_value(), p[i]);
			Commonactions.isElementPresent(pp.getConfig_save_Btn());
			ca.click(pp.getConfig_save_Btn());
			ca.eleToBeClickable();
		}	
		Commonactions.isElementPresent(hp.getSetupSearch());
		ca.click(hp.getSetupSearch());
		ca.insertText(hp.getSetupSearch(), "BOM Sections"+Keys.ENTER);
		ca.eleToBeClickable();

		for(int i=0;i<4;i++) {
			Commonactions.isElementPresent(bc.getMaterailBomSectionBtn());
			ca.click(bc.getMaterailBomSectionBtn());
			Commonactions.isElementPresent(bc.getBOMSecVaue());
			ca.insertText(bc.getBOMSecVaue(), bom[i]);			
			Commonactions.isElementPresent(bc.getBomsortvalue());
			ca.click(bc.getBomsortvalue());
			ca.insertText(bc.getBomsortvalue(),sort[i] );
			Commonactions.isElementPresent(mp.getSave_btn1());
			ca.click(mp.getSave_btn1());
			ca.eleToBeClickable();
		}
		for(int i=0;i<100;i++)
		{
			ca.click(driver.findElement(By.xpath("(//div[text()='Material BOMs']//following::div[contains(@class,'dijitSliderIncrementIconH')]//span[text()='+']/parent::div)[1]")));           
		}	

		ca.click(lct.getActivestate());
		ca.click(lct.getActive2());
		ca.click(lct.getActive3());
		ca.click(lct.getActive4());
		Thread.sleep(2000);
		ca.click(hp.getUser_homeBtn());
		ca.eleToBeClickable();        
		Commonactions.isElementPresent(hp.getMaterialBtn());
		ca.click(hp.getMaterialBtn());
		Commonactions.isElementPresent(bc.getCottonlink());
		ca.click(bc.getCottonlink());
		ca.eleToBeClickable();	
		System.out.println("created new placement and BOMSection");
	}

	@Then("Navigate to material create bom section {string}")
	public void navigate_to_material_create_bom_section(String string)throws Throwable  {			
		Commonactions.isElementPresent(hp.getSpecificationBtn());
		ca.click(hp.getSpecificationBtn());		
		Commonactions.isElementPresent(bc.getBomBtn());
		ca.click(bc.getBomBtn());
		Commonactions.isElementPresent(bc.getBomactBtn());
		ca.click(bc.getBomactBtn());
		Thread.sleep(2000);
		WebElement e1 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(e1, "Material BOM");
		ca.eleToBeClickable();
		WebElement e2 = ca.activeElement();
		ca.eleToBeClickable();
		e2.sendKeys(Keys.TAB);		
		Commonactions.isElementPresent(bc.getBominput());
		ca.click(bc.getBominput());
		ca.eleToBeClickable();
		ca.insertText(bc.getBominput(), string);
		Commonactions.isElementPresent(pp.getSave_and_go_Btn());
		ca.click(pp.getSave_and_go_Btn());
		ca.eleToBeClickable();
		System.out.println("create bom section with material");
	}

	@Then("Navigate to bom create placements for material{string},{string}")
	public void navigate_to_bom_create_placements_for_material(String string,String string1) throws Throwable  {	
		String[] p=string.split(",");
		String[] b=string1.split(",");
		Commonactions.isElementPresent(bc.getDimenBtn());
		ca.click(bc.getDimenBtn());
		Commonactions.isElementPresent(bc.getEgrval());
		Commonactions.isElementPresent(bc.getVanillaval());
		Commonactions.isElementPresent(bc.getSmallval());	
		ca.eleToBeClickable();
		Commonactions.isElementPresent(bc.getPlacement());
		ca.click(bc.getPlacement());	
		ca.eleToBeClickable();
		Commonactions.isElementPresent(bc.getPlacecretebtn());
		ca.click(bc.getPlacecretebtn());
		Commonactions.isElementPresent(bc.getPlacenewfrommatebtn());
		ca.click(bc.getPlacenewfrommatebtn());
		ca.eleToBeClickable();		
		ca.click(bc.getCottonchkbx());
		ca.click(bc.getChiffonchkbx());
		ca.click(bc.getLinenchkbx());
		ca.click(bc.getPolystchkbx());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		for (int i=1;i<5;i++) {		
			Commonactions.isElementPresent(driver.findElement(By.xpath("(//td[@data-csi-act='Node Name::0'])["+i+"]")));
			ca.click(driver.findElement(By.xpath("(//td[@data-csi-act='Node Name::0'])["+i+"]")));	
			ca.eleToBeClickable();
			WebElement e1 = ca.activeElement();
			ca.eleToBeClickable();
			e1.sendKeys(p[i-1]);
			ca.eleToBeClickable();
			WebElement e2 = ca.activeElement();
			ca.eleToBeClickable();
			e2.sendKeys(Keys.TAB);	
			ca.eleToBeClickable();
		}	
		System.out.println("created placements for material bom");
        //Commonactions.isElementPresent(bc.getActionbtn());
		//ca.click(bc.getActionbtn());		
		//Commonactions.isElementPresent(bc.getSectionbtn2());
		//ca.click(bc.getSectionbtn2());		
		//Commonactions.isElementPresent(bc.getSelsectbtn2());
		//ca.click(bc.getSelsectbtn2());
		//Commonactions.isElementPresent(driver.findElement(By.xpath("(//span[text()='Select BOM Section']//following::input[@type='checkbox' and @tabindex='0'])[1]")));
		//ca.click(driver.findElement(By.xpath("(//span[text()='Select BOM Section']//following::input[@type='checkbox' and @tabindex='0'])[1]")));
		//Commonactions.isElementPresent(mp.getSave_btn1());
		//ca.click(mp.getSave_btn1());
		//for (int i=1;i<5;i++) {			
			//Commonactions.isElementPresent(driver.findElement(By.xpath("(//td[@data-csi-act='DSSection::0'])["+i+"]")));
			//ca.click(driver.findElement(By.xpath("(//td[@data-csi-act='DSSection::0'])["+i+"]")));	
			//ca.eleToBeClickable();	
			//WebElement e1 = ca.activeElement();
			//ca.eleToBeClickable();
			//e1.sendKeys(b[i-1]);
			//ca.eleToBeClickable();
			//WebElement e2 = ca.activeElement();
			//ca.eleToBeClickable();
			//e2.sendKeys(Keys.TAB);	
			//ca.eleToBeClickable();
		//}
        //System.out.println("created bom section for placements");
	}
	@Then("Navigate to chiffon material")
	public void navigate_to_chiffon_material() throws Throwable  {
		Commonactions.isElementPresent(lct.getIconCrumb());
		ca.click(lct.getIconCrumb());	
		ca.eleToBeClickable();
		WebElement e1 = ca.activeElement();
		ca.eleToBeClickable();
		e1.sendKeys("100% Polyester Chiffon");
		ca.eleToBeClickable();
		WebElement e2 = ca.activeElement();
		ca.eleToBeClickable();
		e2.sendKeys(Keys.ENTER);	
		ca.eleToBeClickable();
	}

	@Then("create placement using new of material{string},{string}")
	public void create_placement_using_new_of_material(String string, String string2)throws Throwable  {
		String[] p= string2.split(",");

		Commonactions.isElementPresent(bc.getPlacement());
		ca.click(bc.getPlacement());	
		ca.eleToBeClickable();
		Commonactions.isElementPresent(bc.getPlacecretebtn2());
		ca.click(bc.getPlacecretebtn2());		
		Commonactions.isElementPresent(bc.getPlacenewofmatebtn());
		ca.click(bc.getPlacenewofmatebtn());
		ca.eleToBeClickable();	
		WebElement e1 = ca.activeElement();
		ca.eleToBeClickable();
		e1.sendKeys(p[0]);
		ca.eleToBeClickable();
		WebElement e2 = ca.activeElement();
		ca.eleToBeClickable();
		e2.sendKeys(Keys.TAB);	
		ca.eleToBeClickable();

		Commonactions.isElementPresent(bc.getPlacecretebtn2());
		ca.click(bc.getPlacecretebtn2());
		Commonactions.isElementPresent(bc.getPlacenewofmatebtn());
		ca.click(bc.getPlacenewofmatebtn());
		ca.eleToBeClickable();	
		WebElement e3 = ca.activeElement();
		ca.eleToBeClickable();
		e3.sendKeys(p[1]);
		ca.eleToBeClickable();
		WebElement e4 = ca.activeElement();
		ca.eleToBeClickable();
		e4.sendKeys(Keys.TAB);	
		ca.eleToBeClickable();
		System.out.println("created placement using new of material");
	}

	@Then("Navigate to linen material")
	public void navigate_to_linen_material()throws Throwable {
		Commonactions.isElementPresent(lct.getIconCrumb1());
		ca.click(lct.getIconCrumb1());	
		ca.eleToBeClickable();
		WebElement e1 = ca.activeElement();
		ca.eleToBeClickable();
		e1.sendKeys("Linen - Ok for CS - False");
		ca.eleToBeClickable();
		WebElement e2 = ca.activeElement();
		ca.eleToBeClickable();
		e2.sendKeys(Keys.ENTER);	
		ca.eleToBeClickable();
	}
	@Then("create placement using new from bom{string},{string}")
	public void create_placement_using_new_from_bom(String string, String string2)throws Throwable {
		String[] p= string2.split(",");
		Commonactions.isElementPresent(bc.getPlacement());
		ca.click(bc.getPlacement());	
		ca.eleToBeClickable();
		Commonactions.isElementPresent(bc.getPlacecretebtn2());
		ca.click(bc.getPlacecretebtn2());		
		Commonactions.isElementPresent(bc.getPlacenewfrombombtn());
		ca.click(bc.getPlacenewfrombombtn());
		ca.eleToBeClickable();		
		Commonactions.isElementPresent(bc.getBomhshcradbx());
		ca.click(bc.getBomhshcradbx());
		Commonactions.isElementPresent(qp.getNext());
		ca.click(qp.getNext());
		ca.eleToBeClickable();	
		ca.click(bc.getPlac1chk());
		ca.click(bc.getPlac2chk());
		Commonactions.isElementPresent(si.getFinish());
		ca.click(si.getFinish());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(bc.getActiondrp1());
		ca.click(bc.getActiondrp1());
		Commonactions.isElementPresent(bc.getSectionbtn());
		ca.click(bc.getSectionbtn());		
		Commonactions.isElementPresent(bc.getSelsectbtn());
		ca.click(bc.getSelsectbtn());
		ca.eleToBeClickable();	
		Commonactions.isElementPresent(lct.getSec3());
		ca.click(lct.getSec3());
		Commonactions.isElementPresent(lct.getSec4());
		ca.click(lct.getSec4());		
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		System.out.println("created placement using new from bom");
	}
	@Then("create section in material bom and fill bom section value")
	public void create_section_in_material_bom_and_fill_bom_section_value()throws Throwable  {
		ca.click(driver.findElement(By.xpath("//a[text()='AUT_BOMHSHC']")));
		ca.eleToBeClickable();
		Commonactions.isElementPresent(bc.getPlacement());
		ca.click(bc.getPlacement());	
		ca.eleToBeClickable();
		Commonactions.isElementPresent(bc.getActiondrp1());
		ca.click(bc.getActiondrp1());
		Commonactions.isElementPresent(bc.getSectionbtn());
		ca.click(bc.getSectionbtn());		
		Commonactions.isElementPresent(bc.getSelsectbtn());
		ca.click(bc.getSelsectbtn());
		ca.eleToBeClickable();	
		Commonactions.isElementPresent(lct.getSec2());
		ca.click(lct.getSec2());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		//		Commonactions.isElementPresent(driver.findElement(By.xpath("//span[@class='attrPrimary' and contains(text(),'All section')]")));
		System.out.println("created material bom and fill bom section value");
	}

	@Then("Navigate to linen material link")
	public void navigate_to_linen_material_link()throws Throwable {
		Commonactions.isElementPresent(hp.getMaterialBtn());
		ca.click(hp.getMaterialBtn());		 
		Commonactions.isElementPresent(bc.getLinenlink());
		ca.click(bc.getLinenlink());
		ca.eleToBeClickable();
	}

	@Then("Adding placement to the section{string},{string}")
	public void adding_placement_to_the_section(String string, String string2)throws Throwable {
		String[] bom=string.split(",");
		String[] pla=string2.split(",");
		Commonactions.isElementPresent(bc.getTdstab());
		ca.click(bc.getTdstab());	
		Thread.sleep(2000);
		Commonactions.isElementPresent(bc.getTogglebtn());
		ca.click(bc.getTogglebtn());
		Commonactions.isElementPresent(bc.getActiondrp1());
		ca.click(bc.getActiondrp1());
		try{
			Commonactions.isElementPresent(bc.getSectionbtn());
			ca.click(bc.getSectionbtn());	
			ca.eleToBeClickable();
			Commonactions.isElementPresent(bc.getSelsectbtn());
			ca.click(bc.getSelsectbtn());
			ca.eleToBeClickable();
		}catch (Exception e) {
			Commonactions.isElementPresent(bc.getSectionbtn2());
			ca.click(bc.getSectionbtn2());	
			ca.eleToBeClickable();
			Commonactions.isElementPresent(bc.getSelsectbtn2());
			ca.click(bc.getSelsectbtn2());
			ca.eleToBeClickable();
		}

		Commonactions.isElementPresent(driver.findElement(By.xpath("//td[text()='"+bom[2]+"']//preceding-sibling::td//input")));
		ca.click(driver.findElement(By.xpath("//td[text()='"+bom[2]+"']//preceding-sibling::td//input")));
		Commonactions.isElementPresent(driver.findElement(By.xpath("//td[text()='"+bom[3]+"']//preceding-sibling::td//input")));
		ca.click(driver.findElement(By.xpath("//td[text()='"+bom[3]+"']//preceding-sibling::td//input")));		
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		ca.click(bc.getTdstab());			
		Commonactions.isElementPresent(lct.getAdd());
		ca.click(lct.getAdd());	
		ca.eleToBeClickable();
		WebElement e1 = ca.activeElement();
		ca.eleToBeClickable();
		e1.sendKeys("APlac_01");
		ca.eleToBeClickable();
		WebElement e2 = ca.activeElement();
		ca.eleToBeClickable();
		e2.sendKeys(Keys.ENTER);	
		ca.eleToBeClickable();
		Commonactions.isElementPresent(bc.getLinenbompg());
		ca.click(bc.getLinenbompg());
		System.out.println("Added placement to the section");
	}
	@Then("Open Source BOM and placement to first section {string},{string}")
	public void open_Source_BOM_and_placement_to_first_section(String string, String string2)throws Throwable {
		String[] bom=string.split(",");
		String[] pla=string2.split(",");
		Commonactions.isElementPresent(bc.getTdstab());
		ca.click(bc.getTdstab());	
		Commonactions.isElementPresent(bc.getTogglebtn());
		ca.click(bc.getTogglebtn());
		Commonactions.isElementPresent(bc.getActiondrp1());
		ca.click(bc.getActiondrp1());
		Commonactions.isElementPresent(bc.getSectionbtn());
		ca.click(bc.getSectionbtn());	
		Commonactions.isElementPresent(bc.getSelsectbtn());
		ca.click(bc.getSelsectbtn());
		ca.eleToBeClickable();	
		Commonactions.isElementPresent(driver.findElement(By.xpath("//td[text()='"+bom[2]+"']//preceding-sibling::td//input")));
		ca.click(driver.findElement(By.xpath("//td[text()='"+bom[2]+"']//preceding-sibling::td//input")));
		Commonactions.isElementPresent(driver.findElement(By.xpath("//td[text()='"+bom[3]+"']//preceding-sibling::td//input")));
		ca.click(driver.findElement(By.xpath("//td[text()='"+bom[3]+"']//preceding-sibling::td//input")));		
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		ca.click(bc.getTdstab());			
		Commonactions.isElementPresent(lct.getAdd());
		ca.click(lct.getAdd());	
		ca.eleToBeClickable();
		WebElement e1 = ca.activeElement();
		ca.eleToBeClickable();
		e1.sendKeys(pla[2]);
		ca.eleToBeClickable();
		WebElement e2 = ca.activeElement();
		ca.eleToBeClickable();
		e2.sendKeys(Keys.ENTER);	
		ca.eleToBeClickable();
		ca.click(bc.getTdstab());
		Commonactions.isElementPresent(bc.getActiondrp1());
		ca.click(bc.getActiondrp1());
		Commonactions.isElementPresent(bc.getSectionbtn());
		ca.click(bc.getSectionbtn());		
		Commonactions.isElementPresent(bc.getPushsection());
		ca.click(bc.getPushsection());
		Commonactions.isElementPresent(driver.findElement(By.xpath("//td[text()='"+bom[2]+"']//preceding-sibling::td//input")));
		ca.click(driver.findElement(By.xpath("//td[text()='"+bom[2]+"']//preceding-sibling::td//input")));
		Commonactions.isElementPresent(driver.findElement(By.xpath("//td[text()='"+bom[3]+"']//preceding-sibling::td//input")));
		ca.click(driver.findElement(By.xpath("//td[text()='"+bom[3]+"']//preceding-sibling::td//input")));
		Commonactions.isElementPresent(qp.getNext());
		ca.click(qp.getNext());
		ca.eleToBeClickable();	
		ca.click(bc.getLinenchkbx());
		ca.click(qp.getNext());
		ca.eleToBeClickable();			
		ca.click(bc.getDestinachk());
		ca.click(bc.getReplace());
		ca.eleToBeClickable();	
		Commonactions.isElementPresent(bc.getLinenbompg());
		ca.click(bc.getLinenbompg());
		Commonactions.isElementPresent(lct.getDestinationBom());
		ca.click(lct.getDestinationBom());
		Commonactions.isElementPresent(bc.getTdstab());
		ca.click(bc.getTdstab());	
		Commonactions.isElementPresent(driver.findElement(By.xpath("(//span[text()='"+pla[2]+"'])[1]")));
		Commonactions.isElementPresent(bc.getLinenbompg());
		ca.click(bc.getLinenbompg());
		System.out.println("Open Source BOM added placement to first section");
	}
	@Then("Open autbom and placement to first section add append action{string},{string}")
	public void open_autbom_and_placement_to_first_section_add_append_action(String string, String string2)throws Throwable  {
		String[] bom=string.split(",");
		String[] pla=string2.split(",");
		Commonactions.isElementPresent(bc.getAutbomlink());
		ca.click(bc.getAutbomlink()); 
		Commonactions.isElementPresent(bc.getTdstab());
		ca.click(bc.getTdstab());
		Commonactions.isElementPresent(bc.getTogglebtn());
		ca.click(bc.getTogglebtn());
		ca.click(bc.getTdstab());			
		Commonactions.isElementPresent(lct.getAdd());
		ca.click(lct.getAdd());	
		ca.eleToBeClickable();
		WebElement e1 = ca.activeElement();
		ca.eleToBeClickable();
		e1.sendKeys(pla[3]);
		ca.eleToBeClickable();
		WebElement e2 = ca.activeElement();
		ca.eleToBeClickable();
		e2.sendKeys(Keys.ENTER);	
		ca.eleToBeClickable();
		Commonactions.isElementPresent(bc.getActiondrp1());
		ca.click(bc.getActiondrp1());
		Commonactions.isElementPresent(bc.getSectionbtn());
		ca.click(bc.getSectionbtn());		
		Commonactions.isElementPresent(bc.getPushsection());
		ca.click(bc.getPushsection());
		Commonactions.isElementPresent(driver.findElement(By.xpath("//td[text()='"+bom[2]+"']//preceding-sibling::td//input")));
		ca.click(driver.findElement(By.xpath("//td[text()='"+bom[2]+"']//preceding-sibling::td//input")));
		Commonactions.isElementPresent(driver.findElement(By.xpath("//td[text()='"+bom[3]+"']//preceding-sibling::td//input")));
		ca.click(driver.findElement(By.xpath("//td[text()='"+bom[3]+"']//preceding-sibling::td//input")));
		Commonactions.isElementPresent(qp.getNext());
		ca.click(qp.getNext());
		ca.eleToBeClickable();	
		ca.click(bc.getLinenchkbx());
		ca.click(qp.getNext());
		ca.eleToBeClickable();			
		ca.click(bc.getDestina2chk());
		ca.click(bc.getApend());
		ca.eleToBeClickable();	
		Commonactions.isElementPresent(bc.getLinenbompg());
		ca.click(bc.getLinenbompg());
		Commonactions.isElementPresent(lct.getDestinationBom2());
		ca.click(lct.getDestinationBom2());
		Commonactions.isElementPresent(bc.getTdstab());
		ca.click(bc.getTdstab());	
		Commonactions.isElementPresent(driver.findElement(By.xpath("(//span[text()='"+pla[0]+"'])[1]")));
		Commonactions.isElementPresent(driver.findElement(By.xpath("(//span[text()='"+pla[3]+"'])[1]")));
		System.out.println("appended the section");
	}
	@Then("Navigate to destination{int}bom and do delete section{string}")
	public void navigate_to_destination_bom_and_do_delete_section(Integer int1, String string) throws Throwable {
		String[] bom=string.split(",");
		Commonactions.isElementPresent(bc.getLinenbompg());
		ca.click(bc.getLinenbompg());
		Commonactions.isElementPresent(bc.getDestin2link());
		ca.click(bc.getDestin2link());
		Commonactions.isElementPresent(bc.getTdstab());
		ca.click(bc.getTdstab());
		Commonactions.isElementPresent(bc.getTogglebtn());
		ca.click(bc.getTogglebtn());
		Commonactions.isElementPresent(bc.getActiondrp1());
		ca.click(bc.getActiondrp1());
		Commonactions.isElementPresent(bc.getSectionbtn());
		ca.click(bc.getSectionbtn());		
		Commonactions.isElementPresent(bc.getDeletesect());
		ca.click(bc.getDeletesect());
		Commonactions.isElementPresent(driver.findElement(By.xpath("//td[text()='"+bom[2]+"']//preceding-sibling::td//input")));
		ca.click(driver.findElement(By.xpath("//td[text()='"+bom[2]+"']//preceding-sibling::td//input")));		
		Commonactions.isElementPresent(bc.getDeletesecbtn());
		ca.click(bc.getDeletesecbtn());
		//		Commonactions.isElementNotPresent(driver.findElement(By.xpath("//span[text()='"+bom[2]+"']")));
		System.out.println("deleted destination bom");
	}
	@Then("Create placements using new special{string}")
	public void create_placements_using_new_special(String string)throws Throwable {
		Commonactions.isElementPresent(bc.getLinenbompg());
		ca.click(bc.getLinenbompg());		
		Commonactions.isElementPresent(bc.getDestinlink());
		ca.click(bc.getDestinlink());
		Commonactions.isElementPresent(bc.getTdstab());
		ca.click(bc.getTdstab());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(bc.getTogglebtn());
		ca.click(bc.getTogglebtn());		
		Commonactions.isElementPresent(bc.getPlacecretebtn2());
		ca.click(bc.getPlacecretebtn2());		
		Commonactions.isElementPresent(bc.getNewspecialbtn());
		ca.click(bc.getNewspecialbtn());
		Thread.sleep(2000);
		Commonactions.isElementPresent(bc.getMattypedrop());
		ca.click(bc.getMattypedrop());	
		ca.eleToBeClickable();
		WebElement e1 = ca.activeElement();
		ca.eleToBeClickable();
		e1.sendKeys("Fabric - Stanadlone");
		ca.eleToBeClickable();
		WebElement e2 = ca.activeElement();
		ca.eleToBeClickable();
		e2.sendKeys(Keys.TAB);	
		ca.eleToBeClickable();
		Commonactions.isElementPresent(bc.getMaterinput());
		ca.click(bc.getMaterinput());
		ca.eleToBeClickable();
		WebElement e3 = ca.activeElement();
		ca.eleToBeClickable();
		e3.sendKeys("AUT_MaterialType1");
		ca.eleToBeClickable();
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(lct.getPlacement0());
		ca.click(lct.getPlacement0());	
		ca.eleToBeClickable();
		WebElement e5 = ca.activeElement();
		ca.eleToBeClickable();
		e5.sendKeys("A_Plac_02");
		ca.eleToBeClickable();
		//		Commonactions.isElementPresent(driver.findElement(By.xpath("(//span[text()='A_Plac_02'])[1]")));
		System.out.println("created new special placement");

	}
	@Then("Navigate to polyster material link")
	public void navigate_to_polyster_material_link() throws Throwable {
		Commonactions.isElementPresent(hp.getMaterialBtn());
		ca.click(hp.getMaterialBtn());	
		Commonactions.isElementPresent(bc.getPolysterlink());
		ca.click(bc.getPolysterlink());
	}

	@Then("Click action and verify the revision state")
	public void click_action_and_verify_the_revision_state()throws Throwable  {		
		Commonactions.isElementPresent(bc.getDimenBtn());
		ca.click(bc.getDimenBtn());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(bc.getRevision1());
		Commonactions.isElementPresent(bc.getDraft());	    
		Commonactions.isElementPresent(bc.getMatactionbtn());
		ca.click(bc.getMatactionbtn());		
		ca.eleToBeClickable();
		try{
			List<WebElement> revise = driver.findElements(By.xpath("(//td[@class='dijitReset dijitMenuItemLabel' and text()='Revise'])"));
			int i = revise.size();
			ca.click(driver.findElement(By.xpath("(//td[@class='dijitReset dijitMenuItemLabel' and text()='Revise'])["+i+"]")));

		}catch (Exception e) {
			Commonactions.isElementPresent(lct.getActionVerify());	
			ca.click(lct.getActionVerify());
		}
		Thread.sleep(4000);
		Commonactions.isElementPresent(bc.getRevision2());
		Commonactions.isElementPresent(bc.getDraft());
		ca.eleToBeClickable();
		System.out.println("Verified revision state");
	}

	public void freeze() throws Throwable {
		try{
			ca.eleToBeClickable();
			List<WebElement> f = driver.findElements(By.xpath("(//td[text()='Freeze'])"));
			int i = f.size();
			ca.click(driver.findElement(By.xpath("(//td[text()='Freeze'])["+i+"]")));
			ca.eleToBeClickable();
		}catch (Exception e) {
			Commonactions.isElementPresent(bc.getFreeze1());
			ca.click(bc.getFreeze1());
			Thread.sleep(4000);
		}
	}

	public void reopen() throws Throwable {
		try{
			ca.eleToBeClickable();
			List<WebElement> f = driver.findElements(By.xpath("(//td[text()='Reopen'])"));
			int i = f.size();
			ca.click(driver.findElement(By.xpath("(//td[text()='Reopen'])["+i+"]")));
			ca.eleToBeClickable();
		}catch (Exception e) {
			Commonactions.isElementPresent(bc.getReopen1());
			ca.click(bc.getReopen1()); 
			ca.eleToBeClickable();
		}
	}

	public void approve() throws Throwable {
		try{
			ca.eleToBeClickable();
			List<WebElement> f = driver.findElements(By.xpath("(//td[text()='Approve'])"));
			int i = f.size();
			ca.click(driver.findElement(By.xpath("(//td[text()='Approve'])["+i+"]")));
			ca.eleToBeClickable();
		}catch (Exception e) {
			Commonactions.isElementPresent(bc.getApprove1());
			ca.click(bc.getApprove1()); 
			ca.eleToBeClickable();
		}
	}

	public void review() throws Throwable {
		try{
			ca.eleToBeClickable();
			List<WebElement> f = driver.findElements(By.xpath("(//td[text()='Review'])"));
			int i = f.size();
			ca.click(driver.findElement(By.xpath("(//td[text()='Review'])["+i+"]")));
			ca.eleToBeClickable();
		}catch (Exception e) {
			Commonactions.isElementPresent(lct.getRev1());
			ca.click(lct.getRev1()); 
			ca.eleToBeClickable();
		}
	}

	public void revise() throws Throwable {
		
		List<WebElement> num = driver.findElements(By.xpath("(//td[text()='Revise'])"));
		for(int i=1;i<=num.size();i++)
		{
			WebElement revise = driver.findElement(By.xpath("(//td[text()='Revise'])["+i+"]"));
			boolean displayed = revise.isDisplayed();
			if(displayed==true)
			{
				revise.click();
				ca.eleToBeClickable();
				break;
			}}
	}

	public void abandon() throws Throwable {
		try{
			ca.eleToBeClickable();
			List<WebElement> f = driver.findElements(By.xpath("(//td[text()='Abandon'])"));
			int i = f.size();
			ca.click(driver.findElement(By.xpath("(//td[text()='Abandon'])["+i+"]")));
			ca.eleToBeClickable();
		}catch (Exception e) {
			Commonactions.isElementPresent(lct.getAbandom2());
			ca.click(lct.getAbandom2()); 
			ca.eleToBeClickable();
		}
	}

	public void allRevision() throws Throwable {
		try{
			ca.eleToBeClickable();
			List<WebElement> f = driver.findElements(By.xpath("(//td[text()='View All Revisions'])"));
			int i = f.size();
			ca.click(driver.findElement(By.xpath("(//td[text()='View All Revisions'])["+i+"]")));
			ca.eleToBeClickable();
		}catch (Exception e) {
			Commonactions.isElementPresent(lct.getAllRevi2());
			ca.click(lct.getAllRevi2()); 
			ca.eleToBeClickable();
		}
	}

	public void purgeRevision() throws Throwable {
		try{
			ca.eleToBeClickable();
			List<WebElement> f = driver.findElements(By.xpath("(//td[text()='Purge Revisions'])"));
			int i = f.size();
			ca.click(driver.findElement(By.xpath("(//td[text()='Purge Revisions'])["+i+"]")));
			ca.eleToBeClickable();
		}catch (Exception e) {
			Commonactions.isElementPresent(lct.getPurgeRevision2());
			ca.click(lct.getPurgeRevision2()); 
			ca.eleToBeClickable();
		}
	}

	@Then("Freeze & Reopen action verification")
	public void freeze_Reopen_action_verification()throws Throwable {
		Commonactions.isElementPresent(bc.getMatactionbtn());
		ca.click(bc.getMatactionbtn());	
		freeze();
		Commonactions.isElementPresent(bc.getRevision2());
		Commonactions.isElementPresent(bc.getPending());
		Commonactions.isElementPresent(bc.getMatactionbtn());
		ca.click(bc.getMatactionbtn());			
		reopen();
		ca.eleToBeClickable();
		Commonactions.isElementPresent(bc.getRevision3());
		Commonactions.isElementPresent(bc.getDraft());
		System.out.println("Verified freeze, reopen action");
	}
	@Then("Freeze, Review and Revise action verification")
	public void freeze_Review_and_Revise_action_verification()throws Throwable {
		ca.eleToBeClickable();
		Commonactions.isElementPresent(bc.getMatactionbtn());
		ca.click(bc.getMatactionbtn());		
		freeze();
		//		ca.click(driver.findElement(By.xpath("//td[@class='dijitReset dijitMenuItemLabel' and text()='Freeze']")));
		Thread.sleep(4000);
		Commonactions.isElementPresent(bc.getRevision3());
		Commonactions.isElementPresent(bc.getPending());
		Commonactions.isElementPresent(bc.getMatactionbtn());
		ca.click(bc.getMatactionbtn());	
		review();
		Thread.sleep(4000);
		Commonactions.isElementPresent(lct.getRevBtn());
		Commonactions.isElementPresent(bc.getReviewact());
		Commonactions.isElementPresent(bc.getMatactionbtn());
		ca.click(bc.getMatactionbtn());			
		revise();	
		Thread.sleep(4000);
		Commonactions.isElementPresent(lct.getRevBtn1());
		Commonactions.isElementPresent(bc.getReviewact());
		System.out.println("Review and revise action verified");
	}
	@Then("Copy bom in review state and verify copied bom state {string}")
	public void copy_bom_in_review_state_and_verify_copied_bom_state(String string)throws Throwable {
		Commonactions.isElementPresent(bc.getPolyesterbomlink());
		ca.click(bc.getPolyesterbomlink());	
		Thread.sleep(4000);
		Commonactions.isElementPresent(lct.getCopyBom());
		Commonactions.isElementPresent(lct.getCopyBom2());
		ca.click(lct.getCopyBom2());
		Thread.sleep(4000);
		Commonactions.isElementPresent(bc.getBominput());
		ca.click(bc.getBominput());
		ca.eleToBeClickable();
		ca.insertText(bc.getBominput(), string);
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();		
		Commonactions.isElementPresent(lct.getDraftCopy());
		System.out.println("Copied bom in review state and verified");
	}

	@Then("Freeze,Review,Abandon and Reopen action")
	public void freeze_Review_Abandon_and_Reopen_action()throws Throwable {		
		Commonactions.isElementPresent(bc.getBom2link());
		ca.click(bc.getBom2link());
		Commonactions.isElementPresent(bc.getDimenBtn());
		ca.click(bc.getDimenBtn());
		Commonactions.isElementPresent(bc.getRevision1());
		Commonactions.isElementPresent(bc.getDraft());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(bc.getMatactionbtn());
		ca.click(bc.getMatactionbtn());	
		ca.eleToBeClickable();
		freeze();
		Commonactions.isElementPresent(bc.getRevision1());
		Commonactions.isElementPresent(bc.getPending());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(bc.getMatactionbtn());
		ca.click(bc.getMatactionbtn());	
		ca.eleToBeClickable();
		review();	
		Thread.sleep(2000);
		Commonactions.isElementPresent(bc.getRevision2());
		Commonactions.isElementPresent(bc.getReviewact());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(bc.getMatactionbtn());
		ca.click(bc.getMatactionbtn());
		ca.eleToBeClickable();
		abandon();
		Thread.sleep(2000);
		Commonactions.isElementPresent(bc.getRevision2());
		Commonactions.isElementPresent(lct.getPairValue());
		Commonactions.isElementPresent(bc.getMatactionbtn());
		Commonactions.mouseOver(bc.getMatactionbtn());
		ca.eleToBeClickable();
		ca.click(bc.getMatactionbtn());	
		ca.eleToBeClickable();
		reopen();
		Thread.sleep(2000);
		Commonactions.isElementPresent(bc.getRevision3());
		Commonactions.isElementPresent(bc.getDraft());
		System.out.println("verified abandon and reopen action");
	}
	@Then("Approve and reopen action verify")
	public void approve_and_reopen_action_verify()throws Throwable  {
		Commonactions.isElementPresent(bc.getPolyesterbomlink());
		ca.click(bc.getPolyesterbomlink());	
		Thread.sleep(4000);		
		Commonactions.isElementPresent(lct.getCopyBom());
		Commonactions.isElementPresent(lct.getCopyBom2());
		ca.click(lct.getCopyBom2());
		Thread.sleep(4000);
		Commonactions.isElementPresent(bc.getBominput());
		ca.click(bc.getBominput());
		ca.eleToBeClickable();
		ca.insertText(bc.getBominput(), "BOMStateVerify3");
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();		
		Commonactions.isElementPresent(lct.getBomStateVerify5());
		Commonactions.isElementPresent(bc.getBom3link());
		ca.click(bc.getBom3link());
		Commonactions.isElementPresent(bc.getMatactionbtn());
		ca.click(bc.getMatactionbtn());		
		approve();
		Thread.sleep(2000);
		Commonactions.isElementPresent(bc.getRevision1());
		Commonactions.isElementPresent(lct.getPairvalue2());
		Commonactions.isElementPresent(bc.getMatactionbtn());
		ca.click(bc.getMatactionbtn());	
		reopen();
		Thread.sleep(2000);
		Commonactions.isElementPresent(bc.getRevision2());
		Commonactions.isElementPresent(bc.getDraft());
		System.out.println("Approved action verified");
	}

	@Then("Purge action verification")
	public void purge_action_verification()throws Throwable {
		Commonactions.isElementPresent(bc.getPolyesterbomlink());
		ca.click(bc.getPolyesterbomlink());	
		Thread.sleep(4000);	
		Commonactions.isElementPresent(lct.getPurgeAction1());
		ca.click(lct.getPurgeAction1());
		Commonactions.isElementPresent(bc.getDimenBtn());
		ca.click(bc.getDimenBtn());		
		Commonactions.isElementPresent(bc.getRevision());
		ca.click(bc.getRevision());
		allRevision();
		ca.eleToBeClickable();
		revised();
		Commonactions.isElementPresent(bc.getDeletestyleBom());
		ca.click(bc.getDeletestyleBom());
		Commonactions.isElementPresent(bc.getMatactionbtn());
		ca.click(bc.getMatactionbtn());		
		purgeRevision();
		ca.eleToBeClickable();		
		ca.click(lct.getPurgeAction3());
		Thread.sleep(2000);
		Commonactions.isElementPresent(bc.getRevision());
		ca.click(bc.getRevision());
		allRevision();		
		Commonactions.isElementPresent(lct.getHeading1());
		Commonactions.isElementPresent(lct.getHeading2());
		Commonactions.isElementPresent(bc.getDeletestyleBom());
		ca.click(bc.getDeletestyleBom());
		ca.eleToBeClickable();	
		System.out.println("Purge action verified");
	}

	@Then("Purge and reset action verifiation")
	public void purge_and_reset_action_verifiation()throws Throwable {
		Commonactions.isElementPresent(bc.getRevision());
		ca.click(bc.getRevision());
		allRevision();
		revise();
		Commonactions.isElementPresent(driver.findElement(By.xpath("//*[text()='SUBMITTED']")));
		Commonactions.isElementPresent(bc.getDeletestyleBom());
		ca.click(bc.getDeletestyleBom());		
		Commonactions.isElementPresent(bc.getMatactionbtn());
		ca.click(bc.getMatactionbtn());	
		try{
			ca.eleToBeClickable();
			List<WebElement> f = driver.findElements(By.xpath("//td[text()='Purge and Reset Revisions']"));
			int i = f.size();
			ca.click(driver.findElement(By.xpath("(//td[text()='Purge and Reset Revisions'])["+i+"]")));
			ca.eleToBeClickable();
		}catch (Exception e) {
			Commonactions.isElementPresent(lct.getPurgeReset2());
			ca.click(lct.getPurgeReset2()); 
			ca.eleToBeClickable();
		}
		ca.eleToBeClickable();	

		ca.click(lct.getPurgeReset3());
		Thread.sleep(2000);
		Commonactions.isElementPresent(bc.getRevision());
		ca.click(bc.getRevision());
		allRevision();		
		Commonactions.isElementPresent(driver.findElement(By.xpath("//td[@data-csi-heading='___Revision::0' and text()='1']")));
		Commonactions.isElementPresent(bc.getDeletestyleBom());
		ca.click(bc.getDeletestyleBom());
		System.out.println("Verified purge and reset act");
	}

	public void revised() throws Throwable
	{
		List<WebElement> num = driver.findElements(By.xpath("//*[text()='REVISED']"));
		for(int i=1;i<=num.size();i++)
		{
			WebElement revise = driver.findElement(By.xpath("(//*[text()='REVISED'])["+i+"]"));
			boolean displayed = revise.isDisplayed();
			if(displayed==true)
			{
				ca.eleToBeClickable();
				break;
			}}

	}
}