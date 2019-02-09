package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage {

    @FindBy(id="link-to-login")
    WebElement loginLink;

    @FindBy(id="keywords")
    WebElement searchTextBox;

    @FindBy(xpath = "//input[@value=\"Search\"]")
    WebElement searchButton;

    @FindAll(@FindBy(xpath = "//*[@id=\"products\"]/div"))
    List<WebElement> allProducts;

    @FindBy(xpath = "//div[@id='products']/div/div[1]")
    WebElement firstProduct;

    public void clickOnLogin(){
        loginLink.click();
    }

    public void setSearchTextBox(String productName){
        searchTextBox.sendKeys(productName);
    }

    public void clickOnSearchButton(){
        searchButton.click();
    }

    public int getProductsCount(){
        return allProducts.size();
    }

    public void selectFirstProduct() {
        // allProducts.get(0).click();
        firstProduct.click();
    }

}
