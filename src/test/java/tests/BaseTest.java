package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.LoginPage;
import pages.ProductsPage;

public class BaseTest {
    public WebDriver driver;
    LoginPage loginPage;
    ProductsPage productsPage;

    @BeforeMethod
    public void setup() {
       driver = new ChromeDriver();

       loginPage = new LoginPage(driver);
       productsPage = new ProductsPage(driver);
    }

    @AfterMethod
    public void close() {
        driver.quit();
    }
}
