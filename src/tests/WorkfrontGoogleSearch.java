package tests;

import org.junit.*;
import pages.*;

import static org.junit.Assert.assertTrue;

/**
 * Created by Sargis on 5/23/15.
 */
public class WorkfrontGoogleSearch extends SeleniumDriver {
	GoogleMainPage googleMainPage;

	@Before
	public void setUp() throws Exception {
		googleMainPage = new GoogleMainPage();
	}

	@Test
	public void searchWorkfrontInGoogle() {
		googleMainPage.openGoogle();
		googleMainPage.makeSecarch("Workfront");
		googleMainPage.clickOnSearch();

		assertTrue("Worfront in the first place in the shearch resultes!",
			googleMainPage.getResultsFirstItem().getText().contains("Project Management Software – Workfront – Formerly AtTask"));
	}

	@Test
	public void checkNavigation(){
		googleMainPage.openGoogle();
		googleMainPage.makeSecarch("Workfront");
		googleMainPage.clickOnSearch();

		googleMainPage.getResultsFirstItem().click();


	}

}
