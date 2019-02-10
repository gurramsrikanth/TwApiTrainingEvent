package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
    @FindBy(id="spree_user_email")
    WebElement userName;

    @FindBy(id="spree_user_password")
    WebElement password;

    @FindBy(name = "commit")
    WebElement loginButton;

    public void setUserName(String userName){
        this.userName.sendKeys(userName);
    }

    public void setPassword(String passKey){
        this.password.sendKeys(passKey);
    }

    public void clickOnLoginButton(){
        loginButton.click();
    }
}
