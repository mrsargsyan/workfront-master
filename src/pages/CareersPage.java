package pages;

import org.openqa.selenium.*;

/**
 * Created by Sargis on 5/23/15.
 */
public class CareersPage extends SeleniumDriver {
	public void openCareersPage() {
		driver.get("http://www.workfront.com/work-workfront/");
	}

	public void	clickOnOpenPositions() {
		driver.findElement(By.linkText("Open Positions")).click();
	}

	public String getOpenPositions() {
		return driver.findElement(By.cssSelector(".content-page")).getText();
	}
}
