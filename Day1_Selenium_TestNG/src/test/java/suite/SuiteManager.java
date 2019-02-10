package suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import util.DriverManager;

public class SuiteManager {
    DriverManager driverManager;

    @BeforeSuite(alwaysRun = true)
    public void startDriver() {
        driverManager = new DriverManager();
    }

    @AfterSuite(alwaysRun = true)
    public void quitDriver(){
        DriverManager.driver.quit();
    }

}
