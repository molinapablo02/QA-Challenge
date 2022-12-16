package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Tests {

    private WebDriver driver;

    // @BeforeMethod
    @Test
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.mercadolibre.com.ar/");
        // driver.manage().window().maximize();
        // driver.navigate().to("https://www.mercadolibre.com.ar/");

    }

    @AfterClass
    public void tearDown() {
        driver.close();
    }

}
