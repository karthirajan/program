package com.centric.stepdefinition;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.centric.objectrepository.ConfigurationPage;
import com.centric.objectrepository.HomePage;
import com.centric.objectrepository.HybridAgentPage;
import com.centric.objectrepository.LoginPage;
import com.centric.objectrepository.MaterialSpecificationPage;
import com.centric.objectrepository.PopupPage;
import com.centric.objectrepository.ProjectPage;
import com.centric.objectrepository.SourcingPage;
import com.centric.objectrepository.StylePage;
import com.centric.objectrepository.UserManagementPage;
import com.centric.resources.Commonactions;
import com.centric.objectrepository.ProductCustomizationPage;



import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HybridAgentSteps extends Commonactions {
	Commonactions ca = new Commonactions();
	HomePage hp = new HomePage();
	SourcingPage sp = new SourcingPage();
	PopupPage pp=new PopupPage();
	StylePage st = new StylePage();
	UserManagementPage up = new UserManagementPage();
	HybridAgentPage hap	=new HybridAgentPage();
	MaterialSpecificationPage mp = new MaterialSpecificationPage();
	StylePage sp1=new StylePage();
	LoginPage lp = new LoginPage();
	ProjectPage prp = new ProjectPage();
	ProductCustomizationPage pc=new ProductCustomizationPage();


	@Then("Go to setup icon and create native import jobs")
	public void go_to_setup_icon_and_create_native_import_jobs()throws Throwable {
		Commonactions.isElementPresent(hp.getUser_settingsBtn());
		ca.click(hp.getUser_settingsBtn());
		Commonactions.clickjs(hp.getSystem_config());		
		Commonactions.isElementPresent(hap.getServicetab());
		ca.click(hap.getServicetab());	
		Thread.sleep(2000);
		Commonactions.isElementPresent(hap.getEximtab());
		ca.click(hap.getEximtab());	
		Thread.sleep(2000);
		Commonactions.isElementPresent(hap.getImportjobtab());
		ca.click(hap.getImportjobtab());	
		Thread.sleep(5000);
		Commonactions.isElementPresent(hap.getNewjobactbtn());
		ca.click(hap.getNewjobactbtn());
		Thread.sleep(2000);
		WebElement a3 = ca.activeElement();
		ca.eleToBeClickable();
		a3.sendKeys("Native Import");
		ca.eleToBeClickable();
		ca.click(hap.getImportjobtab());		
		Commonactions.isElementPresent(hap.getFiletextbox());
		ca.click(hap.getFiletextbox());	
		Thread.sleep(2000);
		WebElement a4 = ca.activeElement();
		ca.eleToBeClickable();
		a4.sendKeys("C:/Test/NativeImport/files.cfg");
		ca.eleToBeClickable();
		ca.click(hap.getImportjobtab());		
		Commonactions.isElementPresent(hap.getTypetextbox());
		ca.click(hap.getTypetextbox());	
		Thread.sleep(5000);
		WebElement a5 = ca.activeElement();
		ca.eleToBeClickable();
		a5.sendKeys("One Time");
		//		ca.insertText(a4, "One Time");
		ca.eleToBeClickable();
		ca.click(hap.getImportjobtab());
		System.out.println("created native import jobs");
	}


	@Then("Update the suppliers")
	public void update_the_suppliers()throws Throwable  {
		Commonactions.isElementPresent(hp.getSourcingBtn());
		ca.click(hp.getSourcingBtn());		
		Commonactions.isElementPresent(hap.getSuppliertab());
		ca.click(hap.getSuppliertab());

		for (int i=0;i<100;i++) {
			Commonactions.isElementPresent(hap.getSlidersup());
			ca.click(hap.getSlidersup());
			boolean disp = hap.getAgenttext().isDisplayed();
			if(disp==true) {
				break;
			}
		}
		Commonactions.isElementPresent(hap.getAgenthucdrp());
		ca.click(hap.getAgenthucdrp());
		Commonactions.isElementPresent(driver.findElement(By.xpath("//label[text()='Fig (Agent)']")));
		ca.click(driver.findElement(By.xpath("//label[text()='Fig (Agent)']")));
		ca.click(hap.getSuppliertab());

		Commonactions.isElementPresent(hap.getIceagentdrop());
		ca.click(hap.getIceagentdrop());
		Commonactions.isElementPresent(driver.findElement(By.xpath("//label[text()='Grape (Agent)']")));
		ca.click(driver.findElement(By.xpath("//label[text()='Grape (Agent)']")));
		ca.click(hap.getSuppliertab());

		System.out.println("updated the supplier successfully");

	}

	@Then("Update user assignment for Global users {string}")
	public void update_user_assignment_for_Global_users(String string)throws Throwable {	
		String[] user=string.split(",");
		Commonactions.isElementPresent(hap.getRolesalldrpdown());
		ca.click(hap.getRolesalldrpdown());
		ca.eleToBeClickable();
		driver.findElement(By.xpath("//*[contains(text(),'Online Supplier Global Role')]//parent::div/div/input")).click();
		ca.eleToBeClickable();
		WebElement a3 = ca.activeElement();
		ca.eleToBeClickable();
		a3.sendKeys(Keys.TAB);
		ca.eleToBeClickable();
		ca.click(up.getUsrMgmt_Roles());

		Commonactions.isElementPresent(hap.getThreedotonlsup());
		ca.click(hap.getThreedotonlsup());		
		Commonactions.isElementPresent(hap.getSelectmemblink());
		ca.click(hap.getSelectmemblink());	
		for (int i=0;i<2;i++) {
			Thread.sleep(5000);
			Commonactions.isElementPresent(hap.getUseridalldrp());
			ca.click(hap.getUseridalldrp());	
			ca.eleToBeClickable();
			WebElement b1 = ca.activeElement();
			ca.eleToBeClickable();
			b1.sendKeys(user[i]);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[contains(text(),'"+user[i]+"')]//parent::div/div/input")).click();
			Thread.sleep(2000);       
			WebElement activeElement = driver.switchTo().activeElement();
			Thread.sleep(2000);
			activeElement.sendKeys(Keys.TAB);
			Thread.sleep(2000);
			//		        driver.findElement(By.xpath("(//td[contains(text(),'"+user[0]+"')]//parent::tr//div/input)[1]")).click();
		}

		Commonactions.isElementPresent(hap.getUserallchek());
		ca.click(hap.getUserallchek());
		Commonactions.isElementPresent(mp.getSave_btn1());		
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		System.out.println("Sucessfully assigned the user with global users");
	}

	@Then("Update Local User Security Roles")
	public void update_Local_User_Security_Roles()throws Throwable  {
		Commonactions.isElementPresent(hap.getCompanytab());
		ca.click(hap.getCompanytab());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(hap.getFigradiobt());
		ca.click(hap.getFigradiobt());
		Thread.sleep(2000);
		Commonactions.isElementPresent(hap.getRolestab());
		ca.click(hap.getRolestab());
		Commonactions.isElementPresent(hap.getHybridactico());
		ca.click(hap.getHybridactico());
		Thread.sleep(2000);
		Commonactions.isElementPresent(hap.getCrewalldrpdw());
		ca.click(hap.getCrewalldrpdw());
		WebElement b1 = ca.activeElement();
		ca.eleToBeClickable();
		b1.sendKeys("f1");
		ca.eleToBeClickable();
		Commonactions.isElementPresent(driver.findElement(By.xpath("//*[contains(text(),'f1')]//parent::div/div/input")));
		ca.click(driver.findElement(By.xpath("//*[contains(text(),'f1')]//parent::div/div/input")));
		ca.eleToBeClickable();
		WebElement b2 = ca.activeElement();
		ca.eleToBeClickable();
		b2.sendKeys(Keys.TAB);		
		ca.eleToBeClickable();
		Commonactions.isElementPresent(hap.getUserallchek());
		ca.click(hap.getUserallchek());	
		Thread.sleep(2000);
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();

		Commonactions.isElementPresent(hap.getGraperadiobt());
		ca.click(hap.getGraperadiobt());
		Commonactions.isElementPresent(hap.getRolestab());
		ca.click(hap.getRolestab());
		Commonactions.isElementPresent(hap.getHybridactico());
		ca.click(hap.getHybridactico());		
		Commonactions.isElementPresent(hap.getCrewalldrpdw());
		ca.click(hap.getCrewalldrpdw());
		WebElement a6 = ca.activeElement();
		ca.eleToBeClickable();
		a6.sendKeys("g1");
		ca.eleToBeClickable();
		Commonactions.isElementPresent(driver.findElement(By.xpath("//*[contains(text(),'g1')]//parent::div/div/input")));
		ca.click(driver.findElement(By.xpath("//*[contains(text(),'g1')]//parent::div/div/input")));
		ca.eleToBeClickable();
		WebElement a5 = ca.activeElement();
		ca.eleToBeClickable();
		a5.sendKeys(Keys.TAB);
		ca.eleToBeClickable();
		Commonactions.isElementPresent(hap.getUserallchek());
		ca.click(hap.getUserallchek());	
		Thread.sleep(2000);
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();


		Commonactions.isElementPresent(hap.getHuckleberryradiobt());
		ca.click(hap.getHuckleberryradiobt());
		Commonactions.isElementPresent(hap.getRolestab());
		ca.click(hap.getRolestab());
		Commonactions.isElementPresent(hap.getHybridactico());
		ca.click(hap.getHybridactico());		
		Commonactions.isElementPresent(hap.getCrewalldrpdw());
		ca.click(hap.getCrewalldrpdw());
		WebElement a7 = ca.activeElement();
		ca.eleToBeClickable();
		a7.sendKeys("f1");
		ca.eleToBeClickable();
		Commonactions.isElementPresent(driver.findElement(By.xpath("//*[contains(text(),'f1')]//parent::div/div/input")));
		ca.click(driver.findElement(By.xpath("//*[contains(text(),'f1')]//parent::div/div/input")));
		ca.eleToBeClickable();
		WebElement a8 = ca.activeElement();
		ca.eleToBeClickable();
		a8.sendKeys(Keys.TAB);
		ca.eleToBeClickable();
		Commonactions.isElementPresent(hap.getUserallchek());
		ca.click(hap.getUserallchek());	
		Thread.sleep(2000);
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();		

		Commonactions.isElementPresent(hap.getOnsupadmactico());
		ca.click(hap.getOnsupadmactico());	
		Thread.sleep(2000);
		Commonactions.isElementPresent(hap.getCrewalldrpdw());
		ca.click(hap.getCrewalldrpdw());
		WebElement a9 = ca.activeElement();
		ca.eleToBeClickable();
		a9.sendKeys("h1");
		ca.eleToBeClickable();
		Commonactions.isElementPresent(driver.findElement(By.xpath("//*[contains(text(),'h1')]//parent::div/div/input")));
		ca.click(driver.findElement(By.xpath("//*[contains(text(),'h1')]//parent::div/div/input")));
		ca.eleToBeClickable();
		WebElement b4 = ca.activeElement();
		ca.eleToBeClickable();
		b4.sendKeys(Keys.TAB);
		ca.eleToBeClickable();
		Commonactions.isElementPresent(hap.getUserallchek());
		ca.click(hap.getUserallchek());	
		Thread.sleep(2000);
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();


		Commonactions.isElementPresent(hap.getIceplantradiobt());
		ca.click(hap.getIceplantradiobt());
		Commonactions.isElementPresent(hap.getRolestab());
		ca.click(hap.getRolestab());
		Commonactions.isElementPresent(hap.getHybridactico());
		ca.click(hap.getHybridactico());		
		Commonactions.isElementPresent(hap.getCrewalldrpdw());
		ca.click(hap.getCrewalldrpdw());
		WebElement b3 = ca.activeElement();
		ca.eleToBeClickable();
		b3.sendKeys("g1");
		ca.eleToBeClickable();
		Commonactions.isElementPresent(driver.findElement(By.xpath("//*[contains(text(),'g1')]//parent::div/div/input")));
		ca.click(driver.findElement(By.xpath("//*[contains(text(),'g1')]//parent::div/div/input")));
		ca.eleToBeClickable();
		WebElement b9 = ca.activeElement();
		ca.eleToBeClickable();
		b9.sendKeys(Keys.TAB);
		ca.eleToBeClickable();
		Commonactions.isElementPresent(hap.getUserallchek());
		ca.click(hap.getUserallchek());	
		Thread.sleep(2000);
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();		

		Commonactions.isElementPresent(hap.getOnsupadmactico());
		ca.click(hap.getOnsupadmactico());

		Thread.sleep(2000);
		Commonactions.isElementPresent(hap.getCrewalldrpdw());
		ca.click(hap.getCrewalldrpdw());
		WebElement b5 = ca.activeElement();
		ca.eleToBeClickable();
		b5.sendKeys("i1");
		ca.eleToBeClickable();
		Commonactions.isElementPresent(driver.findElement(By.xpath("//*[contains(text(),'i1')]//parent::div/div/input")));
		ca.click(driver.findElement(By.xpath("//*[contains(text(),'i1')]//parent::div/div/input")));
		ca.eleToBeClickable();
		WebElement b7 = ca.activeElement();
		ca.eleToBeClickable();
		b7.sendKeys(Keys.TAB);
		ca.eleToBeClickable();
		Commonactions.isElementPresent(hap.getUserallchek());
		ca.click(hap.getUserallchek());	
		Thread.sleep(2000);
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		System.out.println("updated the local user with security roles");
	}

	@Then("Create HTS Code {string}")
	public void create_HTS_Code(String string)throws Throwable  {
		String[] h=string.split(",");
		Commonactions.isElementPresent(hp.getDatasetup());
		ca.click(hp.getDatasetup());
		Commonactions.isElementPresent(hp.getData_Spec());
		ca.click(hp.getData_Spec());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(hp.getSetupSearch());
		ca.insertText(hp.getSetupSearch(), "HTS Code" +Keys.ENTER);
		ca.eleToBeClickable();	

		for(int i=0;i<2;i++) {			
			Commonactions.isElementPresent(hap.getHtsactionbtn());
			ca.click(hap.getHtsactionbtn());
			ca.eleToBeClickable();
			WebElement b5 = ca.activeElement();
			ca.eleToBeClickable();
			ca.insertText(b5,h[i] );
			ca.eleToBeClickable();		
			Commonactions.isElementPresent(driver.findElement(By.xpath("//span[@class='MuiTypography-root MuiTypography-body1 MuiTypography-colorTextPrimary' and text()='HTS Codes']")));
			ca.click(driver.findElement(By.xpath("//span[@class='MuiTypography-root MuiTypography-body1 MuiTypography-colorTextPrimary' and text()='HTS Codes']")));
			ca.eleToBeClickable();
		}
		System.out.println("created hts code");
	}


	@Then("Create supplier quotes templates and data package template {string},{string},{string}")
	public void create_supplier_quotes_templates_and_data_package_template(String string, String string2, String string3)throws Throwable {
		String[] s=string.split(",");
		String[] tem=string2.split(",");
		String[] type=string3.split(",");

		Commonactions.isElementPresent(hp.getSetupSearch());
		ca.click(hp.getSetupSearch());		
		ca.insertText(hp.getSetupSearch(), "Supplier Quote Templates"+Keys.ENTER);		
		Thread.sleep(2000);
		for (int i=0;i<2;i++) {			
			Commonactions.isElementPresent(hap.getSqtactbtn());
			ca.click(hap.getSqtactbtn());
			ca.eleToBeClickable();
			Commonactions.isElementPresent(hap.getSupquotinpt());
			ca.insertText(hap.getSupquotinpt(),s[i] );
			ca.click(mp.getSave_btn1());
			ca.eleToBeClickable();			
		}
		ca.click(driver.findElement(By.xpath("//a[text()='"+s[0]+"']")));
		ca.eleToBeClickable();		
		Commonactions.isElementPresent(hap.getSQTSupQuotetab());
		ca.click(hap.getSQTSupQuotetab());		
		Commonactions.isElementPresent(hap.getSqtsupquoactbtn());
		ca.click(hap.getSqtsupquoactbtn());
		ca.eleToBeClickable();		
		Commonactions.isElementPresent(hap.getHtschkbox());
		ca.click(hap.getHtschkbox());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();	
		ca.click(hap.getSupquotemplink());
		ca.eleToBeClickable();
		ca.click(driver.findElement(By.xpath("//a[text()='"+s[1]+"']")));
		ca.eleToBeClickable();		
		Commonactions.isElementPresent(hap.getSQTSupQuotetab());
		ca.click(hap.getSQTSupQuotetab());		
		Commonactions.isElementPresent(hap.getSqtsupquoactbtn());
		ca.click(hap.getSqtsupquoactbtn());
		ca.eleToBeClickable();		
		Commonactions.isElementPresent(hap.getHts2chkbox());
		ca.click(hap.getHts2chkbox());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();	

		Commonactions.isElementPresent(hp.getSetupSearch());
		ca.click(hp.getSetupSearch());
		ca.insertText(hp.getSetupSearch(), "Data Package Templates" +Keys.ENTER);
		ca.eleToBeClickable();

		for(int i=0;i<2;i++) {					
			Commonactions.isElementPresent(hap.getDatapacactbtn());
			ca.click(hap.getDatapacactbtn());
			ca.eleToBeClickable();
			Commonactions.isElementPresent(hap.getDatapackinp());
			ca.insertText(hap.getDatapackinp(), "DataPackTmp-"+tem[i]);
			Commonactions.isElementPresent(hap.getDatapaccktypedrop());
			ca.click(hap.getDatapaccktypedrop());
			WebElement b5 = ca.activeElement();
			ca.eleToBeClickable();
			b5.sendKeys(tem[i] +Keys.TAB);
			ca.eleToBeClickable();
			ca.click(mp.getSave_btn1());
			ca.eleToBeClickable();
			ca.click(driver.findElement(By.xpath("//*[@class='browse' and text()='DataPackTmp-"+tem[i]+"']")));
			ca.eleToBeClickable();			
			Commonactions.isElementPresent(hap.getDatasheettempact());
			ca.click(hap.getDatasheettempact());
			Thread.sleep(2000);
			Commonactions.isElementPresent(hap.getDatasheettempdrpdown());
			ca.insertText(hap.getDatasheettempdrpdown(), type[i]);
			Thread.sleep(2000);			
			Commonactions.isElementPresent(hap.getStatedropdwn());
			ca.click(hap.getStatedropdwn());
			ca.insertText(hap.getStatedropdwn(), "APPROVED");
			ca.click(mp.getSave_btn1());
			ca.eleToBeClickable();
			ca.click(hap.getDatapacklink());
			ca.eleToBeClickable();
		}	
		System.out.println("created data package template data");

	}
	@Then("create supplier request template {string},{string}")
	public void create_supplier_request_template(String string, String string2)throws Throwable {
		String[] samtype= string.split(",");
		String[] dptype=string2.split(",");

		Commonactions.isElementPresent(hp.getSetupSearch());
		ca.click(hp.getSetupSearch());
		ca.insertText(hp.getSetupSearch(), "Supplier Request Templates" +Keys.ENTER);
		ca.eleToBeClickable();	
		for(int i=0;i<2;i++) {
			Commonactions.isElementPresent(hap.getSuprqtempact());
			ca.click(hap.getSuprqtempact());
			ca.eleToBeClickable();	
			Commonactions.isElementPresent(sp.getSRTValue());
			ca.insertText(sp.getSRTValue(), "SupReqTmp-"+dptype[i]);
			Thread.sleep(2000);		
			Commonactions.isElementPresent(hap.getTypedropdown());
			ca.click(hap.getTypedropdown());
			ca.insertText(hap.getTypedropdown(), dptype[i]+Keys.TAB);	
			Thread.sleep(2000);		
			Commonactions.isElementPresent(hap.getSupdrpdown());
			ca.click(hap.getSupdrpdown());
			Thread.sleep(2000);
			ca.click(driver.findElement(By.xpath("//label[text()='Huckleberry']//preceding-sibling::div//input")));
			Thread.sleep(2000);
			ca.click(driver.findElement(By.xpath("//label[text()='Iceplant']//preceding-sibling::div//input")));
			ca.click(driver.findElement(By.xpath("//th[text()='Type']")));		
			Commonactions.isElementPresent(hap.getSupquotempdropdwn());
			ca.click(hap.getSupquotempdropdwn());
			Thread.sleep(2000);
			ca.insertText(hap.getSupquotempdropdwn(), "SupQteTemp");
			ca.click(driver.findElement(By.xpath("//label[text()='SupQteTmp1']//preceding-sibling::div//input")));
			ca.click(driver.findElement(By.xpath("//label[text()='SupQteTmp2']//preceding-sibling::div//input")));
			Thread.sleep(2000);	
			ca.click(driver.findElement(By.xpath("//th[text()='Type']")));		
			Commonactions.isElementPresent(hap.getSamptypedrpdwn());
			ca.click(hap.getSamptypedrpdwn());
			ca.insertText(hap.getSamptypedrpdwn(), samtype[i]);
			Thread.sleep(2000);			
			ca.click(mp.getSave_btn1());
			ca.eleToBeClickable();
			Commonactions.isElementPresent(driver.findElement(By.xpath("//td[@data-csi-heading='Node Name::0']//a[text()='SupReqTmp-"+dptype[i]+"']")));
		}
		System.out.println("created supplier request template");

	}


	@Then("Test Data to Create Material Security Group and Assign Context Security Role For Material Security Group {string},{string}")
	public void test_Data_to_Create_Material_Security_Group_and_Assign_Context_Security_Role_For_Material_Security_Group(String string, String string2)throws Throwable {
		String[] msgtype= string.split(",");	
		String[] user=string2.split(",");
		ca.click(hp.getUser_homeBtn());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(hp.getMaterialBtn());
		ca.click(hp.getMaterialBtn());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(mp.getMatSecGrps());
		ca.click(mp.getMatSecGrps());
		ca.eleToBeClickable();	
		Commonactions.isElementPresent(hap.getMsgactbtn());
		ca.click(hap.getMsgactbtn());
		ca.eleToBeClickable();	
		WebElement b5 = ca.activeElement();
		ca.eleToBeClickable();
		b5.sendKeys(msgtype[0]);
		ca.eleToBeClickable();
		Commonactions.isElementPresent(hap.getMsgactbtn());
		ca.click(hap.getMsgactbtn());
		ca.eleToBeClickable();	
		WebElement b4 = ca.activeElement();
		ca.eleToBeClickable();
		b4.sendKeys(msgtype[1]);
		ca.eleToBeClickable();	

		for (int i=0;i<2;i++) {
			ca.click(hp.getUser_homeBtn());
			Thread.sleep(2000);
			Commonactions.isElementPresent(hp.getMaterialBtn());
			ca.click(hp.getMaterialBtn());
			ca.eleToBeClickable();
			Commonactions.isElementPresent(mp.getMatSecGrps());
			ca.click(mp.getMatSecGrps());
			ca.eleToBeClickable();	
			ca.click(driver.findElement(By.xpath("//td[@data-csi-heading='Node Name::0']/a[text()='"+msgtype[i]+"']")));	
			ca.eleToBeClickable();		
			Commonactions.isElementPresent(hap.getTeamtab());
			ca.click(hap.getTeamtab());
			ca.eleToBeClickable();			
			Commonactions.isElementPresent(hap.getRoletab());
			ca.click(hap.getRoletab());
			ca.eleToBeClickable();
			Commonactions.isElementPresent(driver.findElement(By.xpath("//td[@data-csi-heading='Node Name::0' and text()='Hybrid Agent Materials Role']//following-sibling::td[contains(@class,'actionsColumn')]/div/span[@data-csi-act='AggregateCrewRoleUsers']")));
			ca.click(driver.findElement(By.xpath("//td[@data-csi-heading='Node Name::0' and text()='Hybrid Agent Materials Role']//following-sibling::td[contains(@class,'actionsColumn')]/div/span[@data-csi-act='AggregateCrewRoleUsers']")));
			ca.eleToBeClickable();
			Commonactions.isElementPresent(hap.getAlldrpdwnmat());
			ca.click(hap.getAlldrpdwnmat());
			WebElement b2 = ca.activeElement();
			ca.eleToBeClickable();
			b2.sendKeys(user[i]);
			ca.eleToBeClickable();
			Commonactions.isElementPresent(driver.findElement(By.xpath("//*[contains(text(),'"+user[i]+"')]//parent::div/div/input")));
			ca.click(driver.findElement(By.xpath("//*[contains(text(),'"+user[i]+"')]//parent::div/div/input")));
			ca.eleToBeClickable();
			WebElement b7 = ca.activeElement();
			ca.eleToBeClickable();
			b7.sendKeys(Keys.TAB);
			ca.eleToBeClickable();
			Commonactions.isElementPresent(hap.getUserallchek());
			ca.click(hap.getUserallchek());	
			Thread.sleep(2000);
			ca.click(mp.getSave_btn1());
			ca.eleToBeClickable();
		}
		System.out.println("create material security group and assign user for it");
	}
	@Then("Test Data to Create Materials Under MSG-Fig  and MSG-Grape {string},{string},{string}")
	public void test_Data_to_Create_Materials_Under_MSG_Fig_and_MSG_Grape(String string, String string2, String string3)throws Throwable  {
		String[] msgrp=string3.split(",");
		String[] msgfig=string.split(",");
		String[] msggrap=string2.split(",");
		ca.click(hp.getUser_homeBtn());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(hp.getMaterialBtn());
		ca.click(hp.getMaterialBtn());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(mp.getMatSecGrps());
		ca.click(mp.getMatSecGrps());
		ca.eleToBeClickable();	
		ca.click(driver.findElement(By.xpath("//td[@data-csi-heading='Node Name::0']/a[text()='"+msgrp[0]+"']")));
		ca.eleToBeClickable();
		Commonactions.isElementPresent(hap.getMatstab());
		ca.click(hap.getMatstab());	
		for (int i=0;i<2;i++) {				
			Commonactions.isElementPresent(hap.getNewmatactbtn());
			ca.click(hap.getNewmatactbtn());
			Thread.sleep(2000);
			Commonactions.isElementPresent(hap.getMattypedrp());
			ca.click(hap.getMattypedrp());
			WebElement b7 = ca.activeElement();
			ca.eleToBeClickable();
			b7.sendKeys("Fabric - Tool");
			ca.eleToBeClickable();
			WebElement b1 = ca.activeElement();
			ca.eleToBeClickable();
			b1.sendKeys(Keys.TAB);
			ca.eleToBeClickable();
			Commonactions.isElementPresent(hap.getMateriinp());
			ca.click(hap.getMateriinp());
			WebElement b4 = ca.activeElement();
			ca.eleToBeClickable();
			b4.sendKeys(msgfig[i]);
			ca.eleToBeClickable();
			ca.click(mp.getSave_btn1());
			ca.eleToBeClickable();
		}
		System.out.println("created material under fig material sec grp");

		ca.click(hp.getUser_homeBtn());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(hp.getMaterialBtn());
		ca.click(hp.getMaterialBtn());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(mp.getMatSecGrps());
		ca.click(mp.getMatSecGrps());
		ca.eleToBeClickable();	
		ca.click(driver.findElement(By.xpath("//td[@data-csi-heading='Node Name::0']/a[text()='"+msgrp[1]+"']")));
		ca.eleToBeClickable();
		Commonactions.isElementPresent(hap.getMatstab());
		ca.click(hap.getMatstab());	
		for (int i=0;i<2;i++) {				
			Commonactions.isElementPresent(hap.getNewmatactbtn());
			ca.click(hap.getNewmatactbtn());
			Thread.sleep(2000);
			Commonactions.isElementPresent(hap.getMattypedrp());
			ca.click(hap.getMattypedrp());
			WebElement b7 = ca.activeElement();
			ca.eleToBeClickable();
			b7.sendKeys("Fabric - Tool");
			ca.eleToBeClickable();
			WebElement b1 = ca.activeElement();
			ca.eleToBeClickable();
			b1.sendKeys(Keys.TAB);
			ca.eleToBeClickable();
			Commonactions.isElementPresent(hap.getMateriinp());
			ca.click(hap.getMateriinp());
			WebElement b4 = ca.activeElement();
			ca.eleToBeClickable();
			b4.sendKeys(msggrap[i]);
			ca.eleToBeClickable();
			ca.click(mp.getSave_btn1());
		}
		System.out.println("created material under grape material sec grp");
	}

	@Then("user verify the tabs for the user {string}")
	public void user_verify_the_tabs_for_the_user(String string) throws Throwable {
		String[] tabs = string.split(",");

		for(int i=0;i<tabs.length;i++)
		{
			String tab =tabs[i];
			boolean displayed = driver.findElement(By.xpath("//span[@data-csi-tab-name='"+tab+"']")).isDisplayed();
			if(displayed==true)
			{
				ca.click(driver.findElement(By.xpath("//span[@data-csi-tab-name='"+tab+"']")));
				ca.eleToBeClickable();
				System.out.println(tab +" tab is present");
				if(tab.equals("Styles"))
				{
					String i1="Supplier Requests,Styles (pre-7.0),Supplier Quotes,Samples,Supplier Responses,SKUs";
					String[] styles = i1.split(",");
					for(int l=0;l<styles.length;l++)
					{
						String style=styles[l];
						boolean stylee = driver.findElement(By.xpath("//span[@data-csi-tab-name='"+style+"']")).isDisplayed();
						if(stylee==true)
						{
							System.out.println(style +" tab is present under styles");



						}
					}
					boolean styledisplay = ca.isElementPresent(hap.getStyletab());
					if(styledisplay==true)
					{
						System.out.println(hap.getStyletab().getText() +" tab is present under styles");



					}
				}
				if(tab.equals("Materials"))
				{



					String i2="Supplier Requests,Materials (pre-7.0),Supplier Quotes,Material Samples,Material SKUs";
					String[] materials = i2.split(",");
					for(int l=0;l<materials.length;l++)
					{
						String mat=materials[l];
						boolean stylee = driver.findElement(By.xpath("//span[@data-csi-tab-name='"+mat+"']")).isDisplayed();
						if(stylee==true)
						{
							System.out.println(mat +" tab is present under materials");



						}
					}
					boolean matdisplay = ca.isElementPresent(hap.getMaterialsubtab());
					if(matdisplay==true)
					{
						System.out.println(hap.getMaterialsubtab().getText() +" tab is present under materials");



					}

				}
				if(tab.equals("Supplier POs"))
				{



					boolean supppodisp = ca.isElementPresent(hap.getSupplierPOtab());
					if(supppodisp==true)
					{
						System.out.println(hap.getSupplierPOtab().getText() +" tab is present under supplier po");



					}
					String i4="Orders,Shipments";
					String[] supppo = i4.split(",");
					for(int j=0;j<supppo.length;j++)
					{
						String sup=supppo[j];
						boolean supp_po = driver.findElement(By.xpath("//span[@data-csi-tab-name='"+sup+"']")).isDisplayed();
						if(supp_po==true)
						{
							System.out.println(sup +" tab is present under supplier po");



						}
					}
				}
				if(tab.equals("Supplier"))
				{
					String i5="Properties,Factories,Capabilities,Contractual Documents,Discounts,Documents";
					String[] supplier = i5.split(",");
					for(int k=0;k<supplier.length;k++)
					{
						String suplier=supplier[k];
						boolean supp = driver.findElement(By.xpath("//span[@data-csi-tab-name='"+suplier+"']")).isDisplayed();
						if(supp==true)
						{
							System.out.println(suplier +" tab is present under Supplier");



						}
					}



				}
			}
		}
	}

	@Then("user verify the specific tab and sub tab for the user {string}")
	public void user_verify_the_specific_tab_and_sub_tab_for_the_user(String string) throws Throwable {

		String[] tabs = string.split(",");

		String[] style={"Seasons","Styles","Style Gallery","Colorways","Samples","Sample Storage","Style SKUs","Competitive Styles","Inspiration","Supplier Requests"};
		String[] material={"Material","Material Gallery","Material Security Groups","Colored Material","Material Samples","Material SKUs","Material Libraries","Sourcing"};
		String[] shapetheme={"Shape Security Groups","Shape Masters","Shapes","Shape Samples","Theme Security Groups","Theme Masters","Themes","Color Matching Types"};
		String[] sourcing={"Supplier PO","Customer PO","Shipment","Supplier","Factory","Reviews","Customers"};
		String[] Doc={"All Documents","Contractual Documents","Contractual Document Groups","Supplier Contractual Documents"};
		String[] Coll={"Marketing Collections","Marketing Looks","Marketing Tools","Sales Order","Sales Order Groups","Catalog Configuration"};
		String[] BusPlan={"Business Plans","Business Categories"};
		String[] quality={"Test Runs","Tests"};
		String[] inspection={"Inspections","Inspection Security Groups"};
		String[] schedule={"Milestone Report","Deliverables Report"};



		for(int i=0;i<tabs.length;i++)
		{
			String tab =tabs[i];
			boolean displayed = driver.findElement(By.xpath("//span[@data-csi-tab-name='"+tab+"']")).isDisplayed();
			if(displayed==true)
			{
				ca.click(driver.findElement(By.xpath("//span[@data-csi-tab-name='"+tab+"']")));
				ca.eleToBeClickable();
				System.out.println(tab +" tab is present");

				if(tab.equals("Style"))
				{
					for(int l=0;l<style.length;l++)
					{
						String styles=style[l];
						boolean stylee = driver.findElement(By.xpath("//span[@data-csi-tab-name='"+styles+"']")).isDisplayed();
						if(stylee==true)
						{
							System.out.println(styles +" tab is present under style");
						}
					}

				}

				if(tab.equals("Material"))
				{
					for(int l=0;l<material.length;l++)
					{
						String materials=material[l];
						boolean mat = driver.findElement(By.xpath("//span[@data-csi-tab-name='"+materials+"']")).isDisplayed();
						if(mat==true)
						{
							System.out.println(materials +" tab is present under materials");
						}
					}

				}

				if(tab.equals("Shape and Theme"))
				{
					for(int l=0;l<shapetheme.length;l++)
					{
						String st=shapetheme[l];
						boolean theme = driver.findElement(By.xpath("//span[@data-csi-tab-name='"+st+"']")).isDisplayed();
						if(theme==true)
						{
							System.out.println(st +" tab is present under shapeandtheme");
						}
					}

				}

				if(tab.equals("Sourcing"))
				{
					for(int l=0;l<sourcing.length;l++)
					{
						String src=sourcing[l];
						boolean srcing = driver.findElement(By.xpath("//span[@data-csi-tab-name='"+src+"']")).isDisplayed();
						if(srcing==true)
						{
							System.out.println(src +" tab is present under sourcing");
						}
					}

				}

				if(tab.equals("Documents"))
				{
					for(int l=0;l<Doc.length;l++)
					{
						String docs=Doc[l];
						boolean docum = driver.findElement(By.xpath("//span[@data-csi-tab-name='"+docs+"']")).isDisplayed();
						if(docum==true)
						{
							System.out.println(docs +" tab is present under documents");
						}
					}

				}

				if(tab.equals("Collection Management"))
				{
					for(int l=0;l<Coll.length;l++)
					{
						String collec=Coll[l];
						boolean colle = driver.findElement(By.xpath("//span[@data-csi-tab-name='"+collec+"']")).isDisplayed();
						if(colle==true)
						{
							System.out.println(collec +" tab is present under collection");
						}
					}

				}

				if(tab.equals("Business Planning"))
				{
					for(int l=0;l<BusPlan.length;l++)
					{
						String plan=BusPlan[l];
						boolean BPlan = driver.findElement(By.xpath("//span[@data-csi-tab-name='"+plan+"']")).isDisplayed();
						if(BPlan==true)
						{
							System.out.println(plan +" tab is present under Business Planning");
						}
					}

				}

				if(tab.equals("Quality"))
				{
					for(int l=0;l<quality.length;l++)
					{
						String qlty=quality[l];
						boolean qty = driver.findElement(By.xpath("//span[@data-csi-tab-name='"+qlty+"']")).isDisplayed();
						if(qty==true)
						{
							System.out.println(qlty +" tab is present under styles");
						}
					}

				}

				if(tab.equals("Inspection"))
				{
					for(int l=0;l<inspection.length;l++)
					{
						String ins=inspection[l];
						boolean inspect = driver.findElement(By.xpath("//span[@data-csi-tab-name='"+ins+"']")).isDisplayed();
						if(inspect==true)
						{
							System.out.println(ins +" tab is present under styles");
						}
					}

				}

				if(tab.equals("Schedule"))
				{
					for(int l=0;l<schedule.length;l++)
					{
						String shdle=schedule[l];
						boolean shl = driver.findElement(By.xpath("//span[@data-csi-tab-name='"+shdle+"']")).isDisplayed();
						if(shl==true)
						{
							System.out.println(shdle +" tab is present under styles");
						}
					}
					try{
						WebElement scroll = driver.findElement(By.xpath("//button[@aria-label='Scroll Right']"));
						ca.click(scroll);
					}
					catch(Exception e){}

				}}}}

	@Then("Create Style Supplier Request for h{int} users{string}")
	public void create_Style_Supplier_Request_for_h_users(Integer int1, String string)throws Throwable {	
		String[] req=string.split(",");
		Commonactions.isElementPresent(hp.getStyleBtn());
		ca.click(hp.getStyleBtn());		
		Commonactions.isElementPresent(sp1.getStyles_Btn());
		ca.click(sp1.getStyles_Btn());
		ca.eleToBeClickable();		
		Commonactions.isElementPresent(hap.getAccessorlink());
		ca.click(hap.getAccessorlink());
		ca.eleToBeClickable();		
		Commonactions.isElementPresent(hp.getSourcingBtn());
		ca.click(hp.getSourcingBtn());	
		ca.eleToBeClickable();
		Commonactions.isElementPresent(sp.getMaterialSuppReq());
		ca.click(sp.getMaterialSuppReq());
		ca.eleToBeClickable();		
		Commonactions.isElementPresent(sp.getNewsupplierrequestbtn());
		ca.click(sp.getNewsupplierrequestbtn());
		Thread.sleep(2000);		
		Commonactions.isElementPresent(sp.getSupplierreqvalue());
		ca.click(sp.getSupplierreqvalue());
		ca.insertText(sp.getSupplierreqvalue(), req[0]);		
		Commonactions.isElementPresent(hap.getSupplierSRreq());
		ca.click(hap.getSupplierSRreq());
		Thread.sleep(2000);
		ca.click(driver.findElement(By.xpath("//label[text()='Huckleberry']//preceding-sibling::div//input")));
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		System.out.println("Created Style Supplier Request for h1 users");

	}

	@Then("Create Style Supplier Quotes and Issued for h{int} user{string}")
	public void create_Style_Supplier_Quotes_and_Issued_for_h_user(Integer int1, String string)throws Throwable {
		String[] quot=string.split(",");
		Commonactions.isElementPresent(hap.getAutsr1link());
		ca.click(hap.getAutsr1link());
		ca.eleToBeClickable();		
		Commonactions.isElementPresent(sp.getSRQuotes());
		ca.click(sp.getSRQuotes());
		Commonactions.isElementPresent(hap.getSupqotactbtn());
		ca.click(hap.getSupqotactbtn());
		Thread.sleep(2000);		
		Commonactions.isElementPresent(sp.getSupplierQteValue());
		ca.click(sp.getSupplierQteValue());
		ca.insertText(sp.getSupplierQteValue(), quot[0]);
		Thread.sleep(2000);
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(hap.getArrowbtn());
		ca.click(hap.getArrowbtn());
		Thread.sleep(2000);	
		System.out.println("Created Style Supplier Quotes and Issued for for h1 users");
	}

	@Then("Create Style Supplier Request for i{int} user{string}")
	public void create_Style_Supplier_Request_for_i_user(Integer int1, String string)throws Throwable {
		String[] req=string.split(",");

		ca.click(hp.getUser_homeBtn());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(hp.getStyleBtn());
		ca.click(hp.getStyleBtn());		
		Commonactions.isElementPresent(sp1.getStyles_Btn());
		ca.click(sp1.getStyles_Btn());
		ca.eleToBeClickable();		
		Commonactions.isElementPresent(hap.getAccessorlink());
		ca.click(hap.getAccessorlink());
		ca.eleToBeClickable();		
		Commonactions.isElementPresent(hp.getSourcingBtn());
		ca.click(hp.getSourcingBtn());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(sp.getMaterialSuppReq());
		ca.click(sp.getMaterialSuppReq());
		ca.eleToBeClickable();		
		Commonactions.isElementPresent(sp.getNewsupplierrequestbtn());
		ca.click(sp.getNewsupplierrequestbtn());
		Thread.sleep(2000);		
		Commonactions.isElementPresent(sp.getSupplierreqvalue());
		ca.click(sp.getSupplierreqvalue());
		ca.insertText(sp.getSupplierreqvalue(), req[1]);		
		Commonactions.isElementPresent(hap.getSupplierSRreq());
		ca.click(hap.getSupplierSRreq());
		Thread.sleep(2000);
		ca.click(driver.findElement(By.xpath("//label[text()='Iceplant']//preceding-sibling::div//input")));
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();	
		System.out.println("Created Style Supplier Request for i1 users");

	}

	@Then("Create Style Supplier Quotes and Issued for i{int} user{string}")
	public void create_Style_Supplier_Quotes_and_Issued_for_i_user(Integer int1, String string)throws Throwable {
		String[] quot=string.split(",");
		Commonactions.isElementPresent(hap.getAutsr3link());
		ca.click(hap.getAutsr3link());
		ca.eleToBeClickable();		
		Commonactions.isElementPresent(sp.getSRQuotes());
		ca.click(sp.getSRQuotes());
		Commonactions.isElementPresent(hap.getSupqotactbtn());
		ca.click(hap.getSupqotactbtn());
		Thread.sleep(2000);		
		Commonactions.isElementPresent(sp.getSupplierQteValue());
		ca.click(sp.getSupplierQteValue());
		ca.insertText(sp.getSupplierQteValue(), quot[1]);
		Thread.sleep(2000);
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(hap.getArrowbtn());
		ca.click(hap.getArrowbtn());
		Thread.sleep(2000);	
		System.out.println("Created Style Supplier Quotes and Issued for for i1 users");
	}

	@Then("Create Material Supplier Request for h{int} user{string}")
	public void create_Material_Supplier_Request_for_h_user(Integer int1, String string)throws Throwable {
		String[] matreq=string.split(",");
		Commonactions.isElementPresent(hap.getMaterialBtn());
		ca.click(hap.getMaterialBtn());
		Commonactions.isElementPresent(hap.getMaterialBtn2());
		ca.click(hap.getMaterialBtn2());		
		Commonactions.isElementPresent(hap.getCottonlink());
		ca.click(hap.getCottonlink());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(hp.getSourcingBtn());
		ca.click(hp.getSourcingBtn());
		Commonactions.isElementPresent(sp.getMaterialSuppReq());
		ca.click(sp.getMaterialSuppReq());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(sp.getNewsupplierrequestbtn());
		ca.click(sp.getNewsupplierrequestbtn());
		Thread.sleep(2000);	
		Commonactions.isElementPresent(sp.getSupplierreqvalue());
		ca.click(sp.getSupplierreqvalue());
		ca.insertText(sp.getSupplierreqvalue(),matreq[0]);		
		Commonactions.isElementPresent(hap.getSupplierSRreq());
		String sup=Commonactions.getText(hap.getSupplierSRreq());
		try {
		if(sup.equalsIgnoreCase("Huckleberry")) {
		}
		else {
			System.out.println(sup);
			ca.click(hap.getSupplierSRreq());
			ca.click(driver.findElement(By.xpath("//label[text()='Huckleberry']//preceding-sibling::div//input")));
		}	}
		catch(Exception e) {
			
		}
		Thread.sleep(2000);
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		System.out.println("Created Material Supplier Request for h1 users");
	}

	@Then("Creat Material Supplier Quotes and Issue for h{int} user{string}")
	public void creat_Material_Supplier_Quotes_and_Issue_for_h_user(Integer int1, String string)throws Throwable {
		String[] matquo=string.split(",");		
		Commonactions.isElementPresent(hap.getAutmsr1link());
		ca.click(hap.getAutmsr1link());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(sp.getSRQuotes());
		ca.click(sp.getSRQuotes());
		Commonactions.isElementPresent(hap.getMatsupqotactbtn());
		ca.click(hap.getMatsupqotactbtn());
		Thread.sleep(2000);		
		Commonactions.isElementPresent(sp.getSupplierQteValue());
		ca.click(sp.getSupplierQteValue());
		ca.insertText(sp.getSupplierQteValue(), matquo[0]);
		Thread.sleep(2000);
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();		
		Commonactions.isElementPresent(hap.getArrowbtn());
		ca.click(hap.getArrowbtn());
		Thread.sleep(2000);		
//		Commonactions.isElementPresent(hap.getArrowbtn2());
//		ca.click(hap.getArrowbtn2());
		System.out.println("Created Material Supplier Quotes and Issued for for h1 users");
	}

	@Then("Create Material Supplier Request for i{int} user{string}")
	public void create_Material_Supplier_Request_for_i_user(Integer int1, String string)throws Throwable {
		String[] matreq=string.split(",");
		ca.click(hp.getUser_homeBtn());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(hap.getMaterialBtn());
		ca.click(hap.getMaterialBtn());
		Commonactions.isElementPresent(hap.getMaterialBtn2());
		ca.click(hap.getMaterialBtn2());		
		Commonactions.isElementPresent(hap.getCottonlink());
		ca.click(hap.getCottonlink());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(hp.getSourcingBtn());
		ca.click(hp.getSourcingBtn());
		Commonactions.isElementPresent(sp.getMaterialSuppReq());
		ca.click(sp.getMaterialSuppReq());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(sp.getNewsupplierrequestbtn());
		ca.click(sp.getNewsupplierrequestbtn());
		Thread.sleep(2000);	
		Commonactions.isElementPresent(sp.getSupplierreqvalue());
		ca.click(sp.getSupplierreqvalue());
		ca.insertText(sp.getSupplierreqvalue(),matreq[1]);		
		Commonactions.isElementPresent(hap.getSupplierSRreq());
		ca.click(hap.getSupplierSRreq());
		Thread.sleep(2000);
		String sup=Commonactions.getText(hap.getSupplierSRreq());
		try {
		if(sup.equalsIgnoreCase("Huckleberry")) {
			ca.click(driver.findElement(By.xpath("//label[text()='Iceplant']//preceding-sibling::div//input")));
			ca.click(driver.findElement(By.xpath("//label[text()='Huckleberry']//preceding-sibling::div//input")));
		}
		else {
			System.out.println(sup);
			ca.click(hap.getSupplierSRreq());
			ca.click(driver.findElement(By.xpath("//label[text()='Iceplant']//preceding-sibling::div//input")));
		}}
		catch(Exception e) {
			
		}
		Thread.sleep(2000);
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		System.out.println("Created Material Supplier Request for i1 users");
	}

	@Then("Create Material Supplier Quotes and issued for i{int} User{string}")
	public void create_Material_Supplier_Quotes_and_issued_for_i_User(Integer int1, String string)throws Throwable {		
		String[] matquo=string.split(",");		
		Commonactions.isElementPresent(hap.getAutmsr3link());
		ca.click(hap.getAutmsr3link());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(sp.getSRQuotes());
		ca.click(sp.getSRQuotes());
		Commonactions.isElementPresent(hap.getMatsupqotactbtn());
		ca.click(hap.getMatsupqotactbtn());
		Thread.sleep(2000);		
		Commonactions.isElementPresent(sp.getSupplierQteValue());
		ca.click(sp.getSupplierQteValue());
		ca.insertText(sp.getSupplierQteValue(), matquo[1]);
		Thread.sleep(2000);
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();		
		Commonactions.isElementPresent(hap.getArrowbtn());
		ca.click(hap.getArrowbtn());
		Thread.sleep(2000);		
//		Commonactions.isElementPresent(hap.getArrowbtn2());
//		ca.click(hap.getArrowbtn2());
		System.out.println("Created aterial Supplier Quotes and issued for i1 users");
	}

	@Then("Login as h{int} User and Verify Supplier Request Name, Type and State for Style{string},{string}")
	public void login_as_h_User_and_Verify_Supplier_Request_Name_Type_and_State_for_Style(Integer int1, String string, String string2) throws Throwable{
		String[] sr=string.split(",");
		String[] sq=string2.split(",");

		ca.click(hp.getUser_homeBtn());
		ca.eleToBeClickable();        
		Commonactions.isElementPresent(sp1.getStyles_Btn());
		ca.click(sp1.getStyles_Btn());
		Commonactions.isElementPresent(sp.getMaterialSuppReq());
		ca.click(sp.getMaterialSuppReq());
		Commonactions.isElementPresent(driver.findElement(By.xpath("//td[a[text()='"+sr[0]+"']]/following-sibling::td[ text()='ISSUED']")));
//		Commonactions.isElementPresent(driver.findElement(By.xpath("//td[@data-csi-heading='RequestType::0']//div[text()='Style']")));
		Commonactions.isElementPresent(driver.findElement(By.xpath("//td[@data-csi-heading='Node Name::0']//a[text()='"+sr[0]+"']")));
		ca.click(driver.findElement(By.xpath("//td[@data-csi-heading='Node Name::0']//a[text()='"+sr[0]+"']")));
		Commonactions.isElementPresent(sp.getSRQuotes());
		ca.click(sp.getSRQuotes());
		Commonactions.isElementPresent(driver.findElement(By.xpath("//a[text()='Accessories - No color and Size - "+sr[0]+"']//following::a[text()='Huckleberry-"+sq[0]+"']")));
		ca.eleToBeClickable();
		Commonactions.isElementPresent(hap.getSetuptab());
		ca.click(hap.getSetuptab());		
		Commonactions.isElementPresent(driver.findElement(By.xpath("//td[@data-csi-heading='Node Name::0']//a[text()='Accessories - No color and Size - "+sr[0]+"']")));
		ca.click(hp.getUser_homeBtn());
		ca.eleToBeClickable();        
		Commonactions.isElementPresent(sp1.getStyles_Btn());
		ca.click(sp1.getStyles_Btn());
		Commonactions.isElementPresent(sp.getSRQuotes());
		ca.click(sp.getSRQuotes());		
		Commonactions.isElementPresent(driver.findElement(By.xpath("//td[@data-csi-heading='Node Name::0']//a[text()='Huckleberry-"+sq[0]+"']")));		
		Commonactions.isElementPresent(driver.findElement(By.xpath("//td[a[text()='Huckleberry-"+sq[0]+"']]/following-sibling::td//div[ text()='DRAFT']")));		
		Commonactions.isElementPresent(sp1.getStyles_Btn());
		ca.click(sp1.getStyles_Btn());		
		Commonactions.isElementPresent(hap.getStyletab());
		ca.click(hap.getStyletab());
		Commonactions.isElementPresent(driver.findElement(By.xpath("//td[@data-csi-heading='Node Name:Child:SRLineItems:0{SRLineItems}']//a[text()='Accessories - No color and Size - "+sr[0]+"']")));
		System.out.println("Verified Supplier Request Name, Type and State for Style h1");
		Commonactions.isElementPresent(prp.getLogouticon());
		ca.click(prp.getLogouticon());
		Commonactions.isElementPresent(prp.getLogout());
		ca.click(prp.getLogout());	

		Commonactions.isElementPresent(lp.getUsername());
		ca.insertText(lp.getUsername(), "i1");
		ca.insertText(lp.getPassword(), "centric8");
		ca.clickjs(lp.getLogin());
		ca.eleToBeClickable();   
	}
	@Then("Login as i{int} User and Verify Supplier Request Name, Type and State for Style{string},{string}")
	public void login_as_i_User_and_Verify_Supplier_Request_Name_Type_and_State_for_Style(Integer int1, String string, String string2) throws Throwable {
		String[] sr=string.split(",");
		String[] sq=string2.split(",");

		ca.click(hp.getUser_homeBtn());
		ca.eleToBeClickable();        
		Commonactions.isElementPresent(sp1.getStyles_Btn());
		ca.click(sp1.getStyles_Btn());
		Commonactions.isElementPresent(sp.getMaterialSuppReq());
		ca.click(sp.getMaterialSuppReq());
		Commonactions.isElementPresent(driver.findElement(By.xpath("//td[a[text()='"+sr[1]+"']]/following-sibling::td[text()='ISSUED']")));
//		Commonactions.isElementPresent(driver.findElement(By.xpath("//td[@data-csi-heading='RequestType::0']//div[text()='Style']")));
		Commonactions.isElementPresent(driver.findElement(By.xpath("//td[@data-csi-heading='Node Name::0']//a[text()='"+sr[1]+"']")));
		ca.click(driver.findElement(By.xpath("//td[@data-csi-heading='Node Name::0']//a[text()='"+sr[1]+"']")));
		Commonactions.isElementPresent(sp.getSRQuotes());
		ca.click(sp.getSRQuotes());
		Commonactions.isElementPresent(driver.findElement(By.xpath("//a[text()='Accessories - No color and Size - "+sr[1]+"']//following::a[text()='Iceplant-"+sq[1]+"']")));
		Commonactions.isElementPresent(hap.getSetuptab());
		ca.click(hap.getSetuptab());		
		Commonactions.isElementPresent(driver.findElement(By.xpath("//td[@data-csi-heading='Node Name::0']//a[text()='Accessories - No color and Size - "+sr[1]+"']")));
		ca.click(hp.getUser_homeBtn());
		ca.eleToBeClickable();        
		Commonactions.isElementPresent(sp1.getStyles_Btn());
		ca.click(sp1.getStyles_Btn());
		Commonactions.isElementPresent(sp.getSRQuotes());
		ca.click(sp.getSRQuotes());		
		Commonactions.isElementPresent(driver.findElement(By.xpath("//td[@data-csi-heading='Node Name::0']//a[text()='Iceplant-"+sq[1]+"']")));		
		Commonactions.isElementPresent(driver.findElement(By.xpath("//td[a[text()='Iceplant-"+sq[1]+"']]/following-sibling::td//div[ text()='DRAFT']")));		
		Commonactions.isElementPresent(sp1.getStyles_Btn());
		ca.click(sp1.getStyles_Btn());
		Commonactions.isElementPresent(hap.getStyletab());
		ca.click(hap.getStyletab());
		Commonactions.isElementPresent(driver.findElement(By.xpath("//td[@data-csi-heading='Node Name:Child:SRLineItems:0{SRLineItems}']//a[text()='Accessories - No color and Size - "+sr[1]+"']")));
		System.out.println("Verified Supplier Request Name, Type and State for Style i1");
		Commonactions.isElementPresent(prp.getLogouticon());
		ca.click(prp.getLogouticon());
		Commonactions.isElementPresent(prp.getLogout());
		ca.click(prp.getLogout());	

		Commonactions.isElementPresent(lp.getUsername());
		ca.insertText(lp.getUsername(), "h1");
		ca.insertText(lp.getPassword(), "centric8");
		ca.clickjs(lp.getLogin());
		ca.eleToBeClickable();   
	}
	@Then("Login as h{int} User and Verify Supplier Request Name, Type and State for Material{string},{string}")
	public void login_as_h_User_and_Verify_Supplier_Request_Name_Type_and_State_for_Material(Integer int1, String string, String string2)throws Throwable {
		String[] sr=string.split(",");
		String[] sq=string2.split(",");

		ca.click(hp.getUser_homeBtn());
		ca.eleToBeClickable(); 
		Commonactions.isElementPresent(hap.getMatstab());
		ca.click(hap.getMatstab());
		Commonactions.isElementPresent(sp.getMaterialSuppReq());
		ca.click(sp.getMaterialSuppReq());
		Thread.sleep(2000);
		Commonactions.isElementPresent(driver.findElement(By.xpath("//td[a[text()='AUT_MSR_001']]/following-sibling::td[text()='ISSUED']")));
//		Commonactions.isElementPresent(driver.findElement(By.xpath("//td[@data-csi-heading='RequestType::0']//div[text()='Material']")));
		Commonactions.isElementPresent(driver.findElement(By.xpath("//td[@data-csi-heading='Node Name::0']//a[text()='"+sr[2]+"']")));
		ca.click(driver.findElement(By.xpath("//td[@data-csi-heading='Node Name::0']//a[text()='"+sr[2]+"']")));
		Commonactions.isElementPresent(sp.getSRQuotes());
		ca.click(sp.getSRQuotes());
		Commonactions.isElementPresent(driver.findElement(By.xpath("//a[text()='100% Cotton/Rayon Jersey - "+sr[2]+"']//following::a[text()='Huckleberry-"+sq[2]+"']")));
		Commonactions.isElementPresent(hap.getSetuptab());
		ca.click(hap.getSetuptab());		
		Commonactions.isElementPresent(driver.findElement(By.xpath("//td[@data-csi-heading='Node Name::0']//a[text()='100% Cotton/Rayon Jersey - "+sr[2]+"']")));
		ca.click(hp.getUser_homeBtn());
		ca.eleToBeClickable();        
		Commonactions.isElementPresent(hap.getMatstab());
		ca.click(hap.getMatstab());
		Commonactions.isElementPresent(sp.getSRQuotes());
		ca.click(sp.getSRQuotes());		
		Commonactions.isElementPresent(driver.findElement(By.xpath("//td[@data-csi-heading='Node Name::0']//a[text()='Huckleberry-"+sq[2]+"']")));		
		Commonactions.isElementPresent(driver.findElement(By.xpath("//td[a[text()='Huckleberry-"+sq[2]+"']]/following-sibling::td//div[ text()='DRAFT']")));		
		Commonactions.isElementPresent(hap.getMatstab());
		ca.click(hap.getMatstab());
		Commonactions.isElementPresent(hap.getMaterialsubtab());
		ca.click(hap.getMaterialsubtab());
		Commonactions.isElementPresent(driver.findElement(By.xpath("//td[@data-csi-heading='Node Name:Child:SRLineItems:0{SRLineItems}']//a[text()='100% Cotton/Rayon Jersey - "+sr[2]+"']")));
		System.out.println("Verified Supplier Request Name, Type and State for Material h1");
		Commonactions.isElementPresent(prp.getLogouticon());
		ca.click(prp.getLogouticon());
		Commonactions.isElementPresent(prp.getLogout());
		ca.click(prp.getLogout());	

		Commonactions.isElementPresent(lp.getUsername());
		ca.insertText(lp.getUsername(), "i1");
		ca.insertText(lp.getPassword(), "centric8");
		ca.clickjs(lp.getLogin());
		ca.eleToBeClickable();   
	}
	@Then("Login as i{int} User and Verify Supplier Request Name, Type and State for Material{string},{string}")
	public void login_as_i_User_and_Verify_Supplier_Request_Name_Type_and_State_for_Material(Integer int1, String string, String string2)throws Throwable {
		String[] sr=string.split(",");
		String[] sq=string2.split(",");

		ca.click(hp.getUser_homeBtn());
		ca.eleToBeClickable(); 
		Commonactions.isElementPresent(hap.getMatstab());
		ca.click(hap.getMatstab());
		Commonactions.isElementPresent(sp.getMaterialSuppReq());
		ca.click(sp.getMaterialSuppReq());
		Commonactions.isElementPresent(driver.findElement(By.xpath("//td[a[text()='"+sr[3]+"']]/following-sibling::td[ text()='ISSUED']")));
//		Commonactions.isElementPresent(driver.findElement(By.xpath("//td[@data-csi-heading='RequestType::0']//div[text()='Material']")));
		Commonactions.isElementPresent(driver.findElement(By.xpath("//td[@data-csi-heading='Node Name::0']//a[text()='"+sr[3]+"']")));
		ca.click(driver.findElement(By.xpath("//td[@data-csi-heading='Node Name::0']//a[text()='"+sr[3]+"']")));
		Commonactions.isElementPresent(sp.getSRQuotes());
		ca.click(sp.getSRQuotes());
		Commonactions.isElementPresent(driver.findElement(By.xpath("//a[text()='100% Cotton/Rayon Jersey - "+sr[3]+"']//following::a[text()='Iceplant-"+sq[3]+"']")));
		Commonactions.isElementPresent(hap.getSetuptab());
		ca.click(hap.getSetuptab());		
		Commonactions.isElementPresent(driver.findElement(By.xpath("//td[@data-csi-heading='Node Name::0']//a[text()='100% Cotton/Rayon Jersey - "+sr[3]+"']")));
		ca.click(hp.getUser_homeBtn());
		ca.eleToBeClickable();        
		Commonactions.isElementPresent(hap.getMatstab());
		ca.click(hap.getMatstab());
		Commonactions.isElementPresent(sp.getSRQuotes());
		ca.click(sp.getSRQuotes());		
		Commonactions.isElementPresent(driver.findElement(By.xpath("//td[@data-csi-heading='Node Name::0']//a[text()='Iceplant-"+sq[3]+"']")));		
		Commonactions.isElementPresent(driver.findElement(By.xpath("//td[a[text()='Iceplant-"+sq[3]+"']]/following-sibling::td//div[ text()='DRAFT']")));		
		Commonactions.isElementPresent(hap.getMatstab());
		ca.click(hap.getMatstab());
		Commonactions.isElementPresent(hap.getMaterialsubtab());
		ca.click(hap.getMaterialsubtab());
		Commonactions.isElementPresent(driver.findElement(By.xpath("//td[@data-csi-heading='Node Name:Child:SRLineItems:0{SRLineItems}']//a[text()='100% Cotton/Rayon Jersey - "+sr[3]+"']")));
		System.out.println("Verified Supplier Request Name, Type and State for Material i1");
	}

	@Then("Create sample to material for the Huckleberry user{string},{string}")
	public void create_sample_to_material_for_the_Huckleberry_user(String string, String string2)throws Throwable {
		String[] sr=string.split(",");
		String[] sq=string2.split(",");
		Commonactions.isElementPresent(hap.getMaterialBtn());
		ca.click(hap.getMaterialBtn());
		Commonactions.isElementPresent(hap.getMaterialBtn2());
		ca.click(hap.getMaterialBtn2());		
		Commonactions.isElementPresent(hap.getCottonlink());
		ca.click(hap.getCottonlink());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(hp.getSourcingBtn());
		ca.click(hp.getSourcingBtn());
		Commonactions.isElementPresent(sp.getMaterialSuppReq());
		ca.click(sp.getMaterialSuppReq());		
		ca.click(driver.findElement(By.xpath("//td[@data-csi-heading='Node Name::0']//a[text()='"+sr[0]+"']")));	
		ca.eleToBeClickable();	
		Commonactions.isElementPresent(mp.getSamples1());
		ca.click(mp.getSamples1());		
		Commonactions.isElementPresent(hap.getSampactbtn());
		ca.click(hap.getSampactbtn());	
		Commonactions.isElementPresent(hap.getMatsampinput());
		ca.click(hap.getMatsampinput());
		ca.insertText(hap.getMatsampinput(), "AUT_HMSRS_001");
		Thread.sleep(2000);
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();		
		Commonactions.isElementPresent(hap.getReissarrowbtn());
		ca.click(hap.getReissarrowbtn());
		Thread.sleep(2000);			
		Commonactions.isElementPresent(driver.findElement(By.xpath("//td[text()='100% Cotton/Rayon Jersey - "+sr[0]+"']//preceding::div[1]/input[1]")));
		ca.click(driver.findElement(By.xpath("//td[text()='100% Cotton/Rayon Jersey - "+sr[0]+"']//preceding::div[1]/input[1]")));
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		System.out.println("Created sample to material for the Huckleberry user");

	}

	@Then("Create sample to material for the Iceplant user{string}")
	public void create_sample_to_material_for_the_Iceplant_user(String string)throws Throwable {
		String[] sr=string.split(",");
		
		Commonactions.isElementPresent(hp.getUser_homeBtn());
		ca.click(hp.getUser_homeBtn());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(hap.getMaterialBtn());
		ca.click(hap.getMaterialBtn());
		Commonactions.isElementPresent(hap.getMaterialBtn2());
		ca.click(hap.getMaterialBtn2());
		Thread.sleep(2000);
		Commonactions.isElementPresent(hap.getCottonlink());
		ca.click(hap.getCottonlink());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(hp.getSourcingBtn());
		ca.click(hp.getSourcingBtn());
		Commonactions.isElementPresent(sp.getMaterialSuppReq());
		ca.click(sp.getMaterialSuppReq());	
		Thread.sleep(2000);
		ca.click(driver.findElement(By.xpath("//td[@data-csi-heading='Node Name::0']//a[text()='"+sr[1]+"']")));	
		ca.eleToBeClickable();	
		Commonactions.isElementPresent(mp.getSamples1());
		ca.click(mp.getSamples1());		
		Commonactions.isElementPresent(hap.getSampactbtn());
		ca.click(hap.getSampactbtn());	
		Commonactions.isElementPresent(hap.getMatsampinput());
		ca.click(hap.getMatsampinput());
		ca.insertText(hap.getMatsampinput(), "AUT_IMSRS_003");
		Thread.sleep(2000);
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();		
		Commonactions.isElementPresent(hap.getReissarrowbtn());
		ca.click(hap.getReissarrowbtn());
		Thread.sleep(2000);			
		Commonactions.isElementPresent(driver.findElement(By.xpath("//td[text()='100% Cotton/Rayon Jersey - "+sr[1]+"']//preceding::div[1]/input[1]")));
		ca.click(driver.findElement(By.xpath("//td[text()='100% Cotton/Rayon Jersey - "+sr[1]+"']//preceding::div[1]/input[1]")));
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();	
		System.out.println("Create sample to material for the Iceplant user");
		Commonactions.isElementPresent(prp.getLogouticon());
		ca.click(prp.getLogouticon());
		Commonactions.isElementPresent(prp.getLogout());
		ca.click(prp.getLogout());	

		Commonactions.isElementPresent(lp.getUsername());
		ca.insertText(lp.getUsername(), "h1");
		ca.insertText(lp.getPassword(), "centric8");
		ca.clickjs(lp.getLogin());
		ca.eleToBeClickable();   
		
	}
	@Then("Login as Huckleberry and verify the sample data is visible for style  and material")
	public void login_as_Huckleberry_and_verify_the_sample_data_is_visible_for_style_and_material()throws Throwable  {
		ca.click(hp.getUser_homeBtn());
		ca.eleToBeClickable();        
		Commonactions.isElementPresent(sp1.getStyles_Btn());
		ca.click(sp1.getStyles_Btn());
		Commonactions.isElementPresent(mp.getSamples1());
		ca.click(mp.getSamples1());	
		Thread.sleep(2000);
		Commonactions.isElementPresent(driver.findElement(By.xpath("//td[@data-csi-act='Node Name::0']//a[text()='AUT_HSSRS_001-Huckleberry']")));
		ca.click(hp.getUser_homeBtn());
		ca.eleToBeClickable(); 
		Commonactions.isElementPresent(hap.getMatstab());
		ca.click(hap.getMatstab());		
		Commonactions.isElementPresent(hap.getMatersamtab());
		ca.click(hap.getMatersamtab());	
		Thread.sleep(2000);
		Commonactions.isElementPresent(driver.findElement(By.xpath("//td[@data-csi-act='Node Name::0']//a[contains(text(),'AUT_HMSRS_001-Huckleberry')]")));
		Thread.sleep(2000);
		System.out.println("verify the sample data is visible for style h1 user ");
		Commonactions.isElementPresent(prp.getLogouticon());
		ca.click(prp.getLogouticon());
		Commonactions.isElementPresent(prp.getLogout());
		ca.click(prp.getLogout());	

		Commonactions.isElementPresent(lp.getUsername());
		ca.insertText(lp.getUsername(), "i1");
		ca.insertText(lp.getPassword(), "centric8");
		ca.clickjs(lp.getLogin());
		ca.eleToBeClickable();   
	}

	@Then("Login as Iceplant and verify the sample data is visible for style  and material tab")
	public void login_as_Iceplant_and_verify_the_sample_data_is_visible_for_style_and_material_tab()throws Throwable  {
		ca.click(hp.getUser_homeBtn());
		ca.eleToBeClickable();        
		Commonactions.isElementPresent(sp1.getStyles_Btn());
		ca.click(sp1.getStyles_Btn());
		Commonactions.isElementPresent(mp.getSamples1());
		ca.click(mp.getSamples1());		
		ca.eleToBeClickable(); 
		Commonactions.isElementPresent(driver.findElement(By.xpath("//td[@data-csi-act='Node Name::0']//a[text()='AUT_ISRS_003-Iceplant']")));
		ca.click(hp.getUser_homeBtn());
		ca.eleToBeClickable(); 
		Commonactions.isElementPresent(hap.getMatstab());
		ca.click(hap.getMatstab());		
		Commonactions.isElementPresent(hap.getMatersamtab());
		ca.click(hap.getMatersamtab());	
		Thread.sleep(2000);
		Commonactions.isElementPresent(driver.findElement(By.xpath("//td[@data-csi-act='Node Name::0']//a[contains(text(),'AUT_IMSRS_003-Iceplant')]")));
		Thread.sleep(2000);
		System.out.println("verify the sample data is visible for style i1 user ");
	}


	@Then("user navigates into supplier request under soucring for  {string}")
	public void user_navigates_into_supplier_request_under_soucring_for(String string) throws Throwable {

		String[] SV = string.split(",");

		ca.click(hp.getUser_homeBtn());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(hp.getStyleBtn());
		ca.click(hp.getStyleBtn());
		Commonactions.isElementPresent(st.getStyles_Btn());
		ca.click(st.getStyles_Btn());

//		Commonactions.isElementPresent(driver.findElement(By.xpath("//span[@data-csi-automation='filter-ApparelViews-AllStyles-Node Name']")));
//		ca.click(driver.findElement(By.xpath("//span[@data-csi-automation='filter-ApparelViews-AllStyles-Node Name']")));
//		WebElement a3 = ca.activeElement();
//		ca.eleToBeClickable();
//		a3.sendKeys("Accessories - No color and Size");
//		ca.eleToBeClickable();
//		//		Commonactions.isElementPresent(driver.findElement(By.xpath("//span[text()='Accessories - No color and Size']//parent::label//parent::div/div/input[@value='Style']")));
//		//		ca.click(driver.findElement(By.xpath("//span[text()='Accessories - No color and Size']//parent::label//parent::div/div/input[@value='Style']")));
//		driver.findElement(By.xpath("//*[contains(text(),'Accessories')]//parent::div/div/input")).click();
//		ca.eleToBeClickable();
//		WebElement a4 = ca.activeElement();
//		ca.eleToBeClickable();
//		a4.sendKeys(Keys.TAB);
//		ca.eleToBeClickable();


		Commonactions.isElementPresent(hap.getNoclorandsize());
		ca.click(hap.getNoclorandsize());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(hp.getSourcingBtn());
		ca.click(hp.getSourcingBtn());
		Commonactions.isElementPresent(sp.getSupplierrequest());
		ca.click(sp.getSupplierrequest());
		Commonactions.isElementPresent(hap.getAUT_SR_001());
		ca.click(hap.getAUT_SR_001());
		Commonactions.isElementPresent(sp.getSRSamples());
		ca.click(sp.getSRSamples());

		SRcreation(SV[0]);

		Commonactions.isElementPresent(pc.getHeaderSearch());
		ca.click(pc.getHeaderSearch());
		Commonactions.isElementPresent(hap.getSRsearch());
		ca.click(hap.getSRsearch());
		Commonactions.isElementPresent(pc.getHeaderSearchField());
		ca.insertText(pc.getHeaderSearchField(), "AUT_SR_003");
		ca.eleToBeClickable();
		ca.click(pc.getSearchIcon());
		Commonactions.isElementPresent(driver.findElement(By.xpath("//a[@class='csi-card-anchor' and @title='AUT_SR_003']")));
		ca.click(driver.findElement(By.xpath("//a[@class='csi-card-anchor' and @title='AUT_SR_003']")));

		SRcreation(SV[1]);
	}

	public void SRcreation(String samplevalue) throws Throwable
	{
		Commonactions.isElementPresent(hap.getNewsamplebtn());
		ca.click(hap.getNewsamplebtn());
		ca.insertText(hap.getSamplename(), samplevalue);
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(hap.getResissue());
		ca.click(hap.getResissue());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(hap.getNocolrchkbox());
		ca.click(hap.getNocolrchkbox());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		System.out.println(samplevalue +" has created and reissue done ");
		WebElement value = driver.findElement(By.xpath("//a[contains(text(),'"+samplevalue+"')]"));
		ca.eleToBeClickable();
		System.out.println(value.getText() +" element is found after re issue - validation done");

	}

	@Then("user navigates into styles and validate the values {string}")
	public void user_navigates_into_styles_and_validate_the_values(String user) throws Throwable {

		ca.click(hp.getUser_homeBtn());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(hp.getStyleBtn());
		ca.click(hp.getStyleBtn());
		Commonactions.isElementPresent(sp.getSupplierrequest());
		ca.click(sp.getSupplierrequest());
		if(user.equals("f1"))
		{
			Commonactions.isElementPresent(hap.getAUT_SR_001one());
			ca.click(hap.getAUT_SR_001one());
			Commonactions.isElementPresent(sp.getSRSamples());
			ca.click(sp.getSRSamples());
			WebElement value = driver.findElement(By.xpath("//a[contains(text(),'AUT_HSSRS')]"));
		}
		if(user.equals("g1"))
		{
			Commonactions.isElementPresent(hap.getAUT_SR_003());
			ca.click(hap.getAUT_SR_003());
			Commonactions.isElementPresent(sp.getSRSamples());
			ca.click(sp.getSRSamples());
			WebElement value = driver.findElement(By.xpath("//a[contains(text(),'AUT_ISRS')]"));
		}
		
		System.out.println(" present under style -> supplier request for the user "+user);

	}

	@Then("user navigates into material and validate the supplier quotes {string}")
	public void user_navigates_into_material_and_validate_the_supplier_quotes(String user) throws Throwable {

		ca.click(hp.getUser_homeBtn());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(hp.getMaterialBtn());
		ca.click(hp.getMaterialBtn());
		if(user.equals("f1"))
		{
			Commonactions.isElementPresent(hap.getMat4());
			ca.click(hap.getMat4());
		}
		if(user.equals("g1"))
		{
			Commonactions.isElementPresent(hap.getMat6());
			ca.click(hap.getMat6());
		}
		Commonactions.isElementPresent(hp.getSourcingBtn());
		ca.click(hp.getSourcingBtn());
		Commonactions.isElementPresent(sp.getSupplierrequest());
		ca.click(sp.getSupplierrequest());
		Thread.sleep(2000);
//		WebElement value = driver.findElement(By.xpath("(//a[contains(text(),'AUT')])[2]"));
//		System.out.println(value.getText() +" present under material -> supplier request  "+user);

		Commonactions.isElementPresent(sp.getSupplierquotes());
		ca.click(sp.getSupplierquotes());

//		WebElement value1 = driver.findElement(By.xpath("(//a[contains(text(),'AUT')])[2]"));
		System.out.println(" present under material -> supplier quotes "+user);

	}


}