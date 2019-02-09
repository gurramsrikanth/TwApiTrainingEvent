package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage {
    @FindBy(tagName = "h1")
    WebElement pageHeader;

    public String getPageHeader(){
        return pageHeader.getText();
    }

}
