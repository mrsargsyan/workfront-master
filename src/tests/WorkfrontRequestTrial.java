package tests;

import org.junit.*;
import pages.*;

/**
 * Created by Sargis on 5/28/15.
 */
public class WorkfrontRequestTrial extends SeleniumDriver {
	private MainPage mainPage;
	@Before
	public void setUp() throws Exception {
		mainPage = new MainPage();
	}


	//check that user is not able to submit trail request w/o specifing First name
	@Test
	public void trialRequest() {

	}
}
