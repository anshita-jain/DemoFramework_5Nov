package TestCases;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Factory.BrowserFactory;
import Factory.DataProviderFactory;
/*import junit.framework.Assert;*/
import ApplicatonPages.HomePage;

public class VerifyHomePage{
	
	WebDriver driver;

	@BeforeMethod
	
	public void setUp() {
	driver = BrowserFactory.getBrowser("chrome");
	
	driver.get(DataProviderFactory.getConfig().getApplicationUrl());
	
}
	
@Test
public void HomePage() {
	
	HomePage home = PageFactory.initElements(driver, HomePage.class);
	String title = home.getApplicationTitle();
	Assert.assertTrue(title.contains("Avactis Demo Store"));
}
	
	
	
	
	
	
	
	
	
	
}