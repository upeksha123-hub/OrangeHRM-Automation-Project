package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Logout {
    WebDriver driver;

    public Logout(WebDriver driver) {
        this.driver = driver;
    }

    // Locators
    By profileDropdown = By.className("oxd-userdropdown-name");
    By logoutButton = By.xpath("//a[text()='Logout']");

    public void logout() throws InterruptedException {
        driver.findElement(profileDropdown).click();
        Thread.sleep(1000);
        driver.findElement(logoutButton).click();
    }
}
