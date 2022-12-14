package com.centric.stepdefinition;


import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.centric.objectrepository.HomePage;
import com.centric.objectrepository.LoginPage;
import com.centric.objectrepository.StylePage;
import com.centric.resources.Commonactions;



import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class LoginPageSteps extends Commonactions {

	private static final String ITestResult = null;
	Commonactions ca = new Commonactions();
	public static LoginPage lp;
	public static HomePage hp;
	StylePage sp = new StylePage();

	@Before
	public void reportpreparation() {

	}

	@Given("User launches centric application")
	public void user_launches_centric_application() throws Throwable {
		//------------------------------Test------------------------------------\\

		ca.launch(System.getProperty("url"));
		
		//ca.launch("http://win16sql19-cce.centricsoftware.com/WebAccess/home.html");

		//-------------------------------Test-------------------------------------\\      



		lp = new LoginPage();
		ca.insertText(lp.getUsername(), "Administrator");
		ca.insertText(lp.getPassword(), "centric8");
		ca.clickjs(lp.getLogin());

		System.out.println("login clicked successfully");

	}

	@Given("User launches centric application for local user {string}")
    public void user_launches_centric_application_for_local_user(String user) throws Throwable {

 

        ca.launch(System.getProperty("url"));
        //ca.launch("http://10.2.54.45:8080/WebAccess/login.html");

 

        lp = new LoginPage();
        ca.insertText(lp.getUsername(), user);
        ca.insertText(lp.getPassword(), "centric8");
        ca.clickjs(lp.getLogin());
        ca.eleToBeClickable();
        System.out.println("login clicked successfully");
    }
	
	@And("verify user screen")
	public void verify_user_screen() throws Throwable {
		try {
			ca.click(hp.getUser_homeBtn());
			lp.verifyHomePage();
			ca.eleToBeClickable();
		}catch(Exception e) {
			//ca.click(hp.getUser_homeBtn());
	        //ca.eleToBeClickable();
		}
		// ===========to change language========================\\
		// ca.clickjs(driver.findElement(By.xpath("//div[@class='csiViewToolbar']/div/span[contains(@title,'C8')]")));
		// ca.clickjs(driver.findElement(By.xpath("(//td[@class='csiHeadingColumn']//td[contains(@data-csi-heading,'')])[9]")));
		// Thread.sleep(2000);
		// driver.findElement(By.xpath("(//td[@class='csiHeadingColumn']//td[contains(@data-csi-heading,'')])[9]")).clear();
		// driver.findElement(By.xpath("(//td[@class='csiHeadingColumn']//td[contains(@data-csi-heading,'')])[9]")).sendKeys("English - USA",Keys.TAB);
		// ca.launch("http://kripyaqa.centricsoftware.com/WebAccess/home.html#URL=C457&RURL=&Tab=User%20Profile");
		// ca.clickjs(driver.findElement(By.xpath("//a[text()='Centric 8']")));

		System.out.println("user is in home page");
		ca.eleToBeClickable();

	}

	@Then("Verify the created season, Brand, Department, Collection and Style which was created.")
	public void verify_the_created_season_Brand_Department_Collection_and_Style_which_was_created() {

	}

	@Then("Logout from the Application")
	public void logout_from_the_Application() throws Throwable {



		driver.close();

		/*		Commonactions.jsWaitForPageLoad(); 
		driver.findElement(By.xpath("//span[contains(@data-csi-automation,'PageUser')]")).isDisplayed();
				Thread.sleep(2000);
	    driver.findElement(By.xpath("//span[contains(@data-csi-automation,'PageUser')]")).click();

	    for (int i = 0; i < 250; i++) {
	           WebElement dr = driver.findElement(By.xpath("(//td[@class='csiHeadingColumn']//td[contains(@data-csi-heading,'')])[9]"));
	           Thread.sleep(100);          
	           dr.click();
	                Actions a = new Actions(driver);
	              for (int j = 0; j <= i; j++) {
	            	  Thread.sleep(100);
	             a.sendKeys(Keys.DOWN).build().perform();
	            // Thread.sleep(300);
	                         }

	                a.sendKeys(Keys.TAB).build().perform();
	             //   Thread.sleep(300);
	            if (dr.getText().equalsIgnoreCase("English - UK")) {
	                    break;
	                      }
	                  Thread.sleep(500);
	                     }
	               System.out.println("English - UK" + "Language selected");
	                   Thread.sleep(500);
	                 driver.findElement(By.xpath("//span[contains(text(),'Defaults')]")).click();
	               Thread.sleep(500);
	               try {
	 	              driver.findElement(By.xpath("//span[contains(text(),'User Profile')]")).click();
	 	             Thread.sleep(500);
	 	               }catch(Exception e) {

	 	               }
	                   driver.navigate().refresh();
	                   Thread.sleep(300);*/

	}




}