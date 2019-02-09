package logintests;

import org.testng.Assert;
import org.testng.annotations.Test;
import steps.LoginSteps;
import testdatata.LoginCredentials;

public class LoginTest extends suite.SuiteManager{

    @Test(groups = {"smoke"}, priority = 1, dataProvider = "loginCredentials", dataProviderClass = LoginCredentials.class)
    public void testLoginPage(String userName, String password){
        String accountString = "";
        LoginSteps loginStepsObj = new LoginSteps();
        accountString = loginStepsObj.login(userName, password);
        Assert.assertEquals(accountString.toUpperCase(), "MY ACCOUNT");
        loginStepsObj.logout();
    }
    @Test(groups = {"regression", "smoke"}, priority = 2)
    public void checkLoginPageElements(){
        System.out.println("Verifying LoginTest page details");
    }

    @Test(groups = {"regression"}, priority = 2)
    public void verifyLoginPageLinks(){
        System.out.println("Verifying LoginTest page links");
    }

}
