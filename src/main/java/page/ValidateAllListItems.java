package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ValidateAllListItems {
	WebDriver driver;
	
	public ValidateAllListItems(WebDriver driver) {
		this.driver=driver;
		
	}
	
	@FindBy(how = How.XPATH, using = "//div[@class='controls']//input[3]") WebElement TOGGLE_ALL_BUTTON;
	
	public void clickonToggleAll() {
		TOGGLE_ALL_BUTTON.click();
	}
	
	@FindBy(how = How.XPATH, using = "//div[@class='controls']//input[1]") WebElement REMOVE_BUTTON;
	
	public void clickremoveFieldButton() {
		REMOVE_BUTTON.click();
	

}
	
}
