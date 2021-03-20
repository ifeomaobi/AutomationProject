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
	
	@FindBy(how = How.XPATH, using = "//div[@class='controls']//input[3]") 
	WebElement TOGGLE_ALL_FIELD_BUTTON;
	
	public void clickonToggleAll() {
		TOGGLE_ALL_FIELD_BUTTON.click();
	}
	

	@FindBy(how = How.XPATH, using ="//div[4][@class='advance-controls']//input[@name=\"data\"]") 
	WebElement ADD_CATEGORY_FIELD;
	@FindBy(how = How.XPATH, using ="//div[4][@class='advance-controls']//input[@name=\"submit\"]") 
	WebElement SUBMIT_CATEGORY_FIELD;
	@FindBy(how = How.XPATH, using ="//div[4][@class='advance-controls']//span//select//option[3]")
	WebElement CATEGORY_SELECTION_FIELD;

	
	public void addCategory() {
		ADD_CATEGORY_FIELD.sendKeys("IfeyO");
		
		}
	
	public void submitButton() {
		SUBMIT_CATEGORY_FIELD.click();
	
	}
	
	public void categorySelection() {
		CATEGORY_SELECTION_FIELD.click();
	}
}
