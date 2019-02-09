package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class DriverManager {
    public static WebDriver driver;
    private String browser = null;
    private String baseUrl = null;
    ConfigFileReader config = null;

    public DriverManager(){
        this.config = new ConfigFileReader();
        this.browser = this.config.getPropertyValue("browser");
        this.baseUrl = this.config.getPropertyValue("baseUrl");

        if(this.browser.equalsIgnoreCase("chrome")){
            String chromeDriverPath = this.config.getPropertyValue("chromeDriverPath");
            System.setProperty("webdriver.chrome.driver", chromeDriverPath);
            driver = new ChromeDriver();
        } else if(this.browser.equalsIgnoreCase("firefox")){
            String fireFoxDriverPath = this.config.getPropertyValue("fireFoxDriverPath");
            System.setProperty("webdriver.gecko.driver", fireFoxDriverPath);
            driver = new FirefoxDriver();
        }

        driver.manage().window().maximize();
        driver.get(this.baseUrl);
    }
}
