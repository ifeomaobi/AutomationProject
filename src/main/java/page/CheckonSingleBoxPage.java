package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CheckonSingleBoxPage {
	WebDriver driver;

	public CheckonSingleBoxPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//div[@id='todos-content']//form//ul//li//input[@name='todo[0]']")
	WebElement SINGLE_BOX_CHECKED;

	public void clickonSingleBox() {
		SINGLE_BOX_CHECKED.click();
	}
	
	@FindBy(how = How.XPATH, using = "//div[@class]//input[@type='submit']")
	WebElement REMOVE_BUTTON_FIELD;
	
	public void removetheButtonfield() {
	REMOVE_BUTTON_FIELD.click();
	}
}
