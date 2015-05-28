package pages;

import org.openqa.selenium.*;

/**
 * Created by Sargis on 5/23/15.
 */
public class MainPage  extends SeleniumDriver {

	public void openMainPage() {
		driver.get("http://www.workfront.com/");
	}

	public void scrollToEnd() {
		WebElement webElement = driver.findElement(By.className("footer-bottom-menus"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", webElement);
	}

	public void clickOnCareers() {
		driver.findElement(By.cssSelector(".menu-item-15538 a")).click();
	}

	//Method to find request a trial button and click
	public void clickOnRequestTrial() {

	}

	//Method to find submit request a trial button and click
	public void submitRequestTrial() {

	}
}
