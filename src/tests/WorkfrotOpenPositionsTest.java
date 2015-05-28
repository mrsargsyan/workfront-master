package tests;

import org.junit.*;
import static org.junit.Assert.*;
import pages.*;

/**
 * Created by Sargis on 5/28/15.
 */

public class WorkfrotOpenPositionsTest extends SeleniumDriver{
	private MainPage mainPage;

	@Before
	public void setUp() throws Exception {
		mainPage = new MainPage();
	}


	@Test
	public void oprenPositionInArmenia() {

		mainPage.openMainPage();
		mainPage.scrollToEnd();
		mainPage.clickOnCareers();
		CareersPage careersPage = new CareersPage();
		careersPage.clickOnOpenPositions();

		assertTrue("There is not open position in Yerevan, Armenia", careersPage.getOpenPositions().contains("Yerevan, Armenia"));
	}

	@Test
	public void automationQAEnginnerPosition() {
		CareersPage careersPage = new CareersPage();
		careersPage.openCareersPage();
		careersPage.clickOnOpenPositions();

		assertTrue("There is no QA Automation Enginner open position!",
			careersPage.getOpenPositions().contains("QA Automation Engineer"));
	}

}
