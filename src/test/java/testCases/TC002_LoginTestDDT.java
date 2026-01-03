package testCases;
import org.testng.annotations.Test;
import pageObject.loginPage;
import testBase.testBaseClass;
import utilities.DataProviderClass;

public class TC002_LoginTestDDT extends testBaseClass {

	@Test(dataProvider = "data" , dataProviderClass = DataProviderClass.class)
     public	void Verify_Login_Successfully_With_DDT(String Username , String Password) {
		loginPage lp = new loginPage(driver);
		lp.inputField(Username);
		lp.passwordField(Password);
		lp.loginButtonn();
	}
	
}
