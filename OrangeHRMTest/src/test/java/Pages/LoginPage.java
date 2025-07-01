package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterUsername(String username) {
        driver.findElement(By.name("username")).sendKeys(username);
    }

    public void enterPassword(String password) {
        driver.findElement(By.name("password")).sendKeys(password);
    }

    public void clickLogin() {
        driver.findElement(By.cssSelector("button[type='submit']")).click();
    }
}
