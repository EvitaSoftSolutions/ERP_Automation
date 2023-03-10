package com.lpg.qa.lpgPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class ReasonForm {
	
	@FindBy(xpath="//input[@id='txtAgencyCode']")private WebElement agancycode;
	@FindBy(xpath="//input[@id='txtEmail']")private WebElement userid;
	@FindBy(xpath="//input[@id='password-field']")private WebElement password;
	@FindBy(xpath="//button[@id='btnLogin']")private WebElement login;
	@FindBy(xpath="//*[@id=\"menuMasters\"]/a")private WebElement master;
	@FindBy(xpath="//li[@id='menuMasters']/child::a/following-sibling::ul/child::li/child::a")private WebElement generalmaster;
	@FindBy(xpath="//a[text()='Next']")private WebElement pagena1;
	@FindBy(xpath="//a[text()='Next']")private WebElement pagena2;
	@FindBy(xpath="//a[text()='Reason']")private WebElement reasonopn;
	@FindBy(xpath="//input[@id='txtReason_Name']")private WebElement reasonname;
	@FindBy(xpath="//input[@id='txtReason_Desc']")private WebElement resondescription;
	@FindBy(xpath="//input[@id='chkActive']")private WebElement checkactivebtn;
	@FindBy(xpath="//button[@id='btnclear']")private WebElement clearbtn;
	@FindBy(xpath="//button[@id='btnSubmit']")private WebElement submitbtn;
	@FindBy(xpath="//button[text()='OK']")private WebElement okbuttonclick;
	@FindBy(xpath="//a[@id='btnEdit']")private WebElement editbtn;
	@FindBy(xpath="//button[@class='confirm']")private WebElement confirmbtn;
	@FindBy(xpath="//button[@id='btnSubmit']")private WebElement updatebtn;
	@FindBy(xpath="//button[@class='confirm']")private WebElement updateokbtn;
	@FindBy(xpath="//input[@id='btnExportToExcel']")private WebElement exportbtn;
	@FindBy (xpath="//input[@class='form-control input-sm']") private WebElement  pcsearchbar;

	
	//initialization
		public ReasonForm(WebDriver driver) {
			PageFactory.initElements(driver,this);
			}

	//usage
		
		public void verifyMyerpagancycode() {
			Assert.assertTrue(agancycode.isEnabled(),"agancycode find is enable");
			Reporter.log("verifyMyerpagancycode",true);
			agancycode.sendKeys("ERP_00001");
			
		}
		public void verifyMyerpusrname() {
			Assert.assertTrue(userid.isEnabled(),"username find is enable");
			Reporter.log("verifyMyerpUserid",true);
			userid.sendKeys("admin");
		}
		public void verifyMyerppassword() {
			Assert.assertTrue(password.isEnabled(),"password find is enable");
			Reporter.log("verifyMyerppassword",true);
			password.sendKeys("admin@123");
		}
		public void verifyMyerploginbtn() {
			Assert.assertTrue(login.isEnabled(),"loginbtn is enable");
			Reporter.log("verifyMyerplogin",true);
			login.click();
		}
		public void verifyMyerpMasterModule() {
			Assert.assertTrue(master.isEnabled()," Mastermodule is enable");
			Reporter.log("verifyMyerpmastermodule",true);
			master.click();
		}
		public void verifyMyerpGeneralMaster() throws InterruptedException {
	    	  Thread.sleep(500);
			Assert.assertTrue(generalmaster.isEnabled(),"GeneralMaster is Enable");
			Reporter.log("verifyMyerpgeneralmaster",true);
			generalmaster.click();
			
		}
		public void verifyMyerpPageNavigation1() throws InterruptedException {
	    	  Thread.sleep(500);
			Assert.assertTrue(pagena1.isEnabled(),"PageNavigation1 is Enable");
			Reporter.log("verifyMyerppagena",true);
			pagena1.click();
			
		}
		public void verifyMyerpPageNavigation2() throws InterruptedException {
	    	  Thread.sleep(500);
			Assert.assertTrue(pagena2.isEnabled(),"PageNavigation2 is Enable");
			Reporter.log("verifyMyerppagena",true);
			pagena2.click();
		}
		public void verifyMyerpReasonopn() throws InterruptedException {
	    	  Thread.sleep(500);
			Assert.assertTrue(reasonopn.isEnabled(),"Reasonopn is Enable");
			Reporter.log("verifyMyerpreasonopn",true);
			reasonopn.click();
		}
		public void verifyMyerpReasonName() throws InterruptedException {
	    	  Thread.sleep(500);
			Assert.assertTrue(reasonname.isEnabled(),"ReasonName is Enable");
			Reporter.log("verifyMyerpreasonname",true);
			reasonname.sendKeys("Gas Leakage");
		}
		public void verifyMyerpResonDescription() throws InterruptedException {
	    	  Thread.sleep(500);
			Assert.assertTrue(resondescription.isEnabled(),"ResonDescription is Enable");
			Reporter.log("verifyMyerpresondescription",true);
			resondescription.sendKeys("Gas Leakage");
		}
		public void verifyMyerpCheckActivebtn() throws InterruptedException {
	    	  Thread.sleep(500);
			Assert.assertTrue(checkactivebtn.isEnabled(),"CheckActivebtn is Enable");
			Reporter.log("verifyMyerpcheckactivebtn",true);
			checkactivebtn.click();
		}
		public void verifyMyerpClearbtn() throws InterruptedException {
	    	  Thread.sleep(500);
			Assert.assertTrue(clearbtn.isEnabled(),"Clearbtn is Enable");
			Reporter.log("verifyMyerpclearbtn",true);
			clearbtn.click();
		}
		public void verifyMyerpReasonName1() throws InterruptedException {
	    	  Thread.sleep(500);
			Assert.assertTrue(reasonname.isEnabled(),"ReasonName is Enable");
			Reporter.log("verifyMyerpreasonname",true);
			reasonname.sendKeys("Empty Gas Problem");
		}
		public void verifyMyerpResonDescription1() throws InterruptedException {
	    	  Thread.sleep(500);
			Assert.assertTrue(resondescription.isEnabled(),"ResonDescription is Enable");
			Reporter.log("verifyMyerpresondescription",true);
			resondescription.sendKeys("Empty Gas Problem");
		}
		public void verifyMyerpCheckActivebtn1() throws InterruptedException {
	    	  Thread.sleep(500);
			Assert.assertTrue(checkactivebtn.isEnabled(),"CheckActivebtn is Enable");
			Reporter.log("verifyMyerpcheckactivebtn",true);
			checkactivebtn.click();
		}
		public void verifyMyerpSubmitbtn() throws InterruptedException {
	    	  Thread.sleep(500);
			Assert.assertTrue(submitbtn.isEnabled(),"Submitbtn is Enable");
			Reporter.log("verifyMyerpsubmitbtn",true);
			submitbtn.click();
		}
		public void verifyMyerpokbuttonclick() throws InterruptedException {
	    	  Thread.sleep(500);
			Assert.assertTrue(okbuttonclick.isEnabled(),"okbuttonclick is Enable");
			Reporter.log("verifyMyerpokbuttonclick",true);
			okbuttonclick.click();
		}
		public void VerifyandClickonPSearchbar1() throws InterruptedException {
	    	  Thread.sleep(500);
	    	  Assert.assertTrue(pcsearchbar.isEnabled()," pcsearchbar field is enabled");
	    	  Reporter.log(" verifyMyerp pcsearchbar", true);
	    	  pcsearchbar.click(); 
	    	  pcsearchbar.clear();
	    	  pcsearchbar.sendKeys("Empty Gas Problem");
	    	  
	    	  Thread.sleep(500);
	    	  }
		public void verifyMyerpEditbtn() throws InterruptedException {
	    	  Thread.sleep(500);
			Assert.assertTrue(editbtn.isEnabled(),"Editbtn is Enable");
			Reporter.log("verifyMyerpeditbtn",true);
			editbtn.click();
		}
		public void verifyMyerpConfirmbtn() throws InterruptedException {
	    	  Thread.sleep(500);
			Assert.assertTrue(confirmbtn.isEnabled(),"Confirmbtn is Enable");
			Reporter.log("verifyMyerpconfirmbtn",true);
			confirmbtn.click();
		}
		public void verifyMyerpUpdatebtn() throws InterruptedException {
	    	  Thread.sleep(500);
			Assert.assertTrue(updatebtn.isEnabled(),"Updatebtn is Enable");
			Reporter.log("verifyMyerpupdatebtn",true);
			updatebtn.click();
		}
		public void verifyMyerpReasonName2() throws InterruptedException {
	    	  Thread.sleep(500);
			Assert.assertTrue(reasonname.isEnabled(),"ReasonName is Enable");
			Reporter.log("verifyMyerpreasonname",true);
			reasonname.click();
			reasonname.clear();
			reasonname.sendKeys("Burner Leakage");
		}
		public void verifyMyerpResonDescription2() throws InterruptedException {
	    	  Thread.sleep(500);
			Assert.assertTrue(resondescription.isEnabled(),"ResonDescription is Enable");
			Reporter.log("verifyMyerpresondescription",true);
			resondescription.click();
			resondescription.clear();
			resondescription.sendKeys("Burner Leakage");
		}
		public void verifyMyerpupdateokbtn() throws InterruptedException{
			Thread.sleep(800);
			Assert.assertTrue(updateokbtn.isEnabled(),"updateokbtn is Enable");
			Reporter.log("verifyMyerpupdateokbtn",true);
			updateokbtn.click();
			
		}
		public void verifyMyerpexportbtn() throws InterruptedException{
			Thread.sleep(800);
			Assert.assertTrue(exportbtn.isEnabled(),"exportbtn is Enable");
			Reporter.log("verifyMyerpexportbtn",true);
			exportbtn.click();
			
		}
		public void VerifyandClickonPSearchbar2() throws InterruptedException {
	    	  Thread.sleep(500);
	    	  Assert.assertTrue(pcsearchbar.isEnabled()," pcsearchbar field is enabled");
	    	  Reporter.log(" verifyMyerp pcsearchbar", true);
	    	  pcsearchbar.click(); 
	    	  pcsearchbar.clear();
	    	  pcsearchbar.sendKeys("Burner Leakage");
	    	  
	    	  Thread.sleep(500);
	    	  }
}
