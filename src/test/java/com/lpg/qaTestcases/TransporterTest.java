package com.lpg.qaTestcases;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.lpg.qa.lpgBase.TestBase;
import com.lpg.qa.lpgPages.Transporter;


	public class TransporterTest  extends TestBase{

		WebDriver driver;
		   
		@BeforeClass
		public void setup() {
			intializeBrowser("chrome");
		}
		
		@AfterClass
		public void teardown() {
		//	TestBase.driver.close();
		}
		
			
			
			@Test
			public void TransporterPageTest() throws InterruptedException {
				Transporter tt=new Transporter(TestBase.driver); 
				tt.verifyMyerpagancycode();
				tt.verifyMyerpUserid();
				tt.verifyMyerpPassword();
				tt.VerifyandClickonMyerpLoginBtn();
				tt.VerifyMyerpMasterModule();
				tt.VerifyMyerpGenralMasterModule();
				tt.VerifyMyerpTransporterForm();
				tt.TSelectCompany();
				tt.VerifyMyerpTcompanyCode();
				tt.VerifyMyerpTName();
				tt.TSelectGroup();
				tt.VerifyMyerpTCategory();
				tt.VerifyMyerpTContandDetial();
				tt.VerifyMyerpTAddress();
				tt.VerifyMyerpTSelectCity();
				tt.VerifyMyerpTClearBtn();
				tt.TSelectCompany1();
				tt.VerifyMyerpTcompanyCode1();
				tt.VerifyMyerpTName1();
				tt.TSelectGroup1();
				tt.VerifyMyerpTCategory1();
				tt.VerifyMyerpTContandDetial1();
				tt.VerifyMyerpTAddress1();
				tt.VerifyMyerpTSelectCity1();
				tt.VerifyMyerpTSubmitBtn();
				tt.VerifyMyerpTSubmiOKBtn();
				tt.VerifyandClickonPSearchbar1();
				tt.VerifyMyerpTEditBtn();
				tt.VerifyMyerpTYesUpdateBtn();
				tt.VerifyMyerpTName2();
				tt.TSelectGroup2();
				tt.VerifyMyerpTUpdateBtn();
				tt.VerifyMyerpTUpdateokBtn();
				tt.VerifyMyerpTExportBtn();
				tt.VerifyandClickonPSearchbar2();
				
				
				
			   } 
		}


