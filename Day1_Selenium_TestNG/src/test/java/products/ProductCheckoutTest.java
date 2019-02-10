package products;
import org.testng.Assert;
import org.testng.annotations.Test;
import steps.ProductSteps;
import suite.SuiteManager;
import util.ConfigFileReader;

public class ProductCheckoutTest extends SuiteManager {

    @Test(groups = {"regression"}, priority = 2)
    public void orderProduct() {
        ProductSteps prodStepsObj = new ProductSteps();
        ConfigFileReader testConfig = new ConfigFileReader();
        String productName = testConfig.getPropertyValue("productName");
        boolean messageDisplayed = prodStepsObj.orderProduct(productName, "2");
        Assert.assertTrue(messageDisplayed);
    }

}
