package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class LoginTest extends BaseTest{
    @Test
    public void correctLogin(){
    loginPage.open();
    loginPage.login();
    }
}
