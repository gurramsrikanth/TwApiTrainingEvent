package products;

import org.testng.Assert;
import org.testng.annotations.Test;
import steps.ProductSteps;

public class SearchProductTest extends suite.SuiteManager{
    @Test(groups = {"regression"}, priority = 2)
    public void testSearchProd(){
        ProductSteps prodStepsObj = new ProductSteps();
        int searchCount = prodStepsObj.getProductsCount("bag");
        Assert.assertEquals(searchCount, 2);

    }
}
