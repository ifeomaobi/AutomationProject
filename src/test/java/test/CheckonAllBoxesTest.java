package test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.CheckonAllBoxesPage;
import util.BrowserFactory;

public class CheckonAllBoxesTest {
	WebDriver driver;
	
	@Test
	public void validateToggleBox() {
		
		driver = BrowserFactory.init();
		
		CheckonAllBoxesPage checkonAllBoxesPage = PageFactory.initElements(driver, CheckonAllBoxesPage.class);
		checkonAllBoxesPage.clickonToggleAll();
		checkonAllBoxesPage.addCategory();
		checkonAllBoxesPage.submitButton();
		checkonAllBoxesPage.categorySelection();
		
		
		
		
		
		
		
		BrowserFactory.tearDown();
	}

}
