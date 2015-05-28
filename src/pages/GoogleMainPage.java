package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;

/**
 * Created by sargis on 5/23/15.
 */
public class GoogleMainPage extends SeleniumDriver {

	public void openGoogle() {
		driver.get("http://www.google.com/");
	}

	public void makeSecarch(String keyWord) {
		driver.findElement(By.cssSelector(".gsfi")).sendKeys(keyWord);
	}

	public void clickOnSearch() {
		driver.findElement(By.cssSelector(".jsb input[name=\"btnK\"]")).click();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("resultStats")));
	}

	public WebElement getResultsFirstItem() {
		return driver.findElement(By.cssSelector("#rso > li:nth-child(2)"));

	}

}
