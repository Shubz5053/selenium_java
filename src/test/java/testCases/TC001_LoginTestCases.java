package testCases;

import org.testng.annotations.Test;
import pageObject.loginPage;
import testBase.testBaseClass;

public class TC001_LoginTestCases extends testBaseClass {
	@Test 
	void Verify_Login_Successfully() {
		logger.info("Browser started");
		loginPage lp = new loginPage(driver);
		logger.info("Navigated to application URL");
		logger.debug("Entering username");
		lp.inputField(p.getProperty("email"));
		logger.debug("Entering password");
		lp.passwordField(p.getProperty("password"));
		lp.loginButtonn();
		logger.info("Login successful");
	}

}
