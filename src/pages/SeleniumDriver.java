package pages;

import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.*;

/**
 * Created by Sargis on 5/23/15.
 */
public class SeleniumDriver {
	protected static WebDriver driver;
	private boolean acceptNextAlert = true;




	@BeforeClass
	public static void setUpClass() throws Exception {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
	}

	@AfterClass
	public static void tearDownClass() throws Exception {
		driver.close();
		driver.quit();
	}

	public void	scroll() {
//		driver.executeScript("document.getElementById('text-8').scrollIntoView(true);");
	}

}
