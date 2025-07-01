package Tests;

import org.testng.annotations.Test;
import Pages.LoginPage;
import Pages.Logout;
import Utils.BaseTest;

public class LoginTest extends BaseTest {

    @Test
    public void testmain() throws InterruptedException {
        // Use Page Object
        LoginPage login = new LoginPage(driver);
        login.enterUsername("Admin");
        login.enterPassword("admin123");
        login.clickLogin();

        // Wait a little to observe result
        Thread.sleep(5000);

        // Print URL to verify login
        System.out.println("Login successful! Now at: " + driver.getCurrentUrl());
        
        Logout logout = new Logout(driver);
        logout.logout();
        Thread.sleep(2000);
        System.out.println("Logged out successfully!");
        
    }
    
    
    
}
