package steps;
import org.openqa.selenium.support.PageFactory;
import pages.HomePage;
import pages.LoginPage;
import pages.UserAccountPage;
import util.DriverManager;

public class LoginSteps {
    HomePage homePageObj;
    LoginPage loginPageObj;
    UserAccountPage userAccountPageObj;

    public LoginSteps(){
        homePageObj = PageFactory.initElements(DriverManager.driver, HomePage.class);
        loginPageObj = PageFactory.initElements(DriverManager.driver, LoginPage.class);
        userAccountPageObj = PageFactory.initElements(DriverManager.driver, UserAccountPage.class);
    }

    public String login(String userName, String passKey) {
        String acccountText;
        this.homePageObj.clickOnLogin();
        this.loginPageObj.setUserName(userName);
        this.loginPageObj.setPassword(passKey);
        this.loginPageObj.clickOnLoginButton();
        acccountText = this.userAccountPageObj.getMyAccountName();
        return acccountText;

    }
    public void logout(){
        this.userAccountPageObj.clickOnLogoutLink();
    }

}
