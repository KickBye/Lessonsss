package seleniumTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
    WebDriver driver;

    @BeforeTest
    public void beforeT(){
        System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
        ChromeOptions op = new ChromeOptions();
        DesiredCapabilities dc= DesiredCapabilities.chrome();
        dc.setCapability(ChromeOptions.CAPABILITY,op);
        driver= new ChromeDriver();



    }


    @AfterTest
    public void afterTest(){
        driver.quit();
        if (driver!=null){
            driver.quit();

    }
    }
    public WebDriver getDriver(){
        return driver;
    }

}
