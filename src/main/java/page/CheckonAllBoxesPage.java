package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CheckonAllBoxesPage {
	WebDriver driver;
	
	public CheckonAllBoxesPage(WebDriver driver) {
		this.driver=driver;
		
	}
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/input[3]") 
	WebElement TOGGLE_ALL_FIELD_BUTTON;
	
	public void clickonToggleAll() {
		TOGGLE_ALL_FIELD_BUTTON.click();
	}
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/input[1]") WebElement REMOVE_FIELD_BUTTON;
	
	public void clickremoveFieldButton() {
		REMOVE_FIELD_BUTTON.click();
		
	}
}
