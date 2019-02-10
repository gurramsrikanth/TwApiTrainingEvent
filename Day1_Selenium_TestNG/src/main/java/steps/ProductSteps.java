package steps;

import org.openqa.selenium.support.PageFactory;
import pages.*;
import util.DriverManager;

public class ProductSteps {
    HomePage homePageObj;
    LoginPage loginPageObj;
    UserAccountPage userAccountPageObj;
    ProductDetailsPage productPageObj;
    ShoppingCartPage cartPageObj;

    public ProductSteps(){
        homePageObj = PageFactory.initElements(DriverManager.driver, HomePage.class);
        loginPageObj = PageFactory.initElements(DriverManager.driver, LoginPage.class);
        userAccountPageObj = PageFactory.initElements(DriverManager.driver, UserAccountPage.class);
        productPageObj = PageFactory.initElements(DriverManager.driver, ProductDetailsPage.class);
        cartPageObj = PageFactory.initElements(DriverManager.driver, ShoppingCartPage.class);
    }

    public void searchProduct(String productName){
        homePageObj.setSearchTextBox(productName);
        homePageObj.clickOnSearchButton();
    }

    public int getProductsCount(String productName){
        this.searchProduct(productName);
        return homePageObj.getProductsCount();
    }

    public boolean orderProduct(String productName, String quantity) {
        this.searchProduct(productName);
        homePageObj.selectFirstProduct();
        productPageObj.setProductQuantity(quantity);
        productPageObj.clickOnAddToCart();
        productPageObj.clickOnCart();
        return productPageObj.isSuccessMessageDisplayed();
    }

    public String getCartHeader(){
        return cartPageObj.getPageHeader();
    }
}
