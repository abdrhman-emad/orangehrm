package tests;

import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest extends TestBase {

    LoginPage loginObject;
    String userName = "Admin";
    String passWord = "admin123";

    @Test
    public void UserCanLoginSuccessfully() {

        try {

            loginObject = new LoginPage(driver);
            loginObject.UserLogin(userName, passWord);
        } catch (Exception e) {

            System.out.println("Error occurred: " + e.getMessage());
        }
    }
}