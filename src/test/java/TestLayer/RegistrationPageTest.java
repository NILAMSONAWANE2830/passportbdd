package TestLayer;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import BaseLaye.BaseClass;
import PageLayer.Registartion;
import UtilityLayer.ExcelReader;
import UtilityLayer.TakeScreenShot;

public class RegistrationPageTest extends BaseClass {
	
	
	private Registartion  reg;
	@BeforeMethod
	public void setUp() {
		
		BaseClass.intilization();
	}
	
	
	@Test(priority=1,dataProvider="fdata")
	public void registartionpagevalidate(String city, String fname, String lname, String dmy, String mail, String yesno,
			String logID, String pass, String cnfpass, String question, String ans) {
		reg = new Registartion();
		
		reg.registrationfunctinality(city, fname, lname, dmy, mail, yesno, logID, pass, cnfpass, question, ans);
			
		
	}
	
	@DataProvider(name="fdata")
	public Object[][]   getdata() throws IOException {
		
		ExcelReader excel = new ExcelReader(System.getProperty("user.dir")+"\\src\\main\\java\\TestDataPackage\\testData.xlsx");
		
		
		
		return excel.getAllShetData(0);
		
	}
	
	@AfterMethod
	
	public void tearDown() throws InterruptedException, IOException {
		
		Thread.sleep(3000);
		
		TakeScreenShot.screenShot();		
		
		driver.quit();
		
		
	}
	

}
