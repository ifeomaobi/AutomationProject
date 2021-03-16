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

	@FindBy(how = How.XPATH, using = "/html/body/div[2]/form/ul/li/input")
	WebElement SINGLE_BOX_CHECKED;

	public void clickonSingleBox() {
		SINGLE_BOX_CHECKED.click();
	}
}
