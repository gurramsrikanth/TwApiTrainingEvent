package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserAccountPage {
    @FindBy(linkText = "My Account")
    WebElement myAccountLink;

    @FindBy(linkText = "Logout")
    WebElement logoutLink;


    public String getMyAccountName(){
        return myAccountLink.getText();
    }

    public void clickOnLogoutLink(){
        logoutLink.click();
    }
}
