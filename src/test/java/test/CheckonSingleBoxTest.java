package test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.CheckonSingleBoxPage;
import util.BrowserFactory;

public class CheckonSingleBoxTest {
	WebDriver driver;
	
	@Test
	public void ValidateSingleCheckBoxisSelected() {
		
		driver = BrowserFactory.init();
		
		CheckonSingleBoxPage checkonSingleBoxPage = PageFactory.initElements(driver, CheckonSingleBoxPage.class);
		checkonSingleBoxPage.clickonSingleBox();
		
		BrowserFactory.tearDown();
		
	}
}
