package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    private final By LoginField = By.xpath("//input[@data-test='username']");
    private final By PasswordField = By.xpath("//input[@placeholder='Password']");
    private final By LoginButton = By.xpath("//input[@type='submit']");
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void open(){
        driver.get(Base_URL);
    }


    public void login(){
        driver.findElement(LoginField).sendKeys("standard_user");
        driver.findElement(PasswordField).sendKeys("secret_sauce");
        driver.findElement(LoginButton).click();
    }



}
