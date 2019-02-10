package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import util.DriverManager;

import java.util.List;

public class SearchSteps {
    WebDriver driver;

    public SearchSteps()
    {
        driver = DriverManager.driver;
    }

    public int SearchProduct1(String prodName)
    {
        int productsCount;
        WebElement serachTextBox = driver.findElement(By.id("keywords"));
        serachTextBox.sendKeys(prodName);
        WebElement searchButton = driver.findElement(By.xpath("//*[@id=\"search-bar\"]/form/input[2]"));
        searchButton.click();
        List<WebElement> prods = driver.findElements(By.xpath("//ul[@id='products']/li"));
        productsCount = prods.size();
        return productsCount;
    }
}
