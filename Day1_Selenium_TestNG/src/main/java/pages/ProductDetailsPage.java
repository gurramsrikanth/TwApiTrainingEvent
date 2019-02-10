package pages;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class ProductDetailsPage {
    WebDriverWait wait;
    WebDriver driver;
    public ProductDetailsPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 30);
    }

    @FindBy(id="quantity")
    WebElement productQuantity;

    @FindBy(id="add-to-cart-button")
    WebElement addtoCartButton;

    @FindBy(id="link-to-cart")
    WebElement linkToCart;

    @FindBy(css="#content > div.alert.alert-success")
    WebElement successMessage;

    public void setProductQuantity(String quantity){
        this.productQuantity.clear();
        this.productQuantity.sendKeys(quantity);
    }

    public void clickOnAddToCart(){
        this.addtoCartButton.click();
    }

    public void clickOnCart(){
        linkToCart.click();
    }

    public boolean isSuccessMessageDisplayed(){
        try {
            wait.until(visibilityOf(successMessage));
        } catch (NoSuchElementException e) {
            System.out.print(e);
        }
        String message = successMessage.getText();
        return message.equalsIgnoreCase("Item Added To Cart");
    }

}
