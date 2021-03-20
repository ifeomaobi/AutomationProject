package test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.ValidateAllListItems;
import util.BrowserFactory;

public class ValidateAllListItemsTest {
		WebDriver driver;
		
		@Test
		public void ValidateToggleBox2() {
			
			driver = BrowserFactory.init();
			
			ValidateAllListItems validateAllListItems = PageFactory.initElements(driver, ValidateAllListItems.class);
			validateAllListItems.clickonToggleAll();
			validateAllListItems.clickremoveFieldButton();
			
			
			
			
			
			BrowserFactory.tearDown();
		
			
}
		
}
