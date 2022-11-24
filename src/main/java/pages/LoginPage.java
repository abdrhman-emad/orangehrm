package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase {


    @FindBy(name = "username")
    WebElement userNameTxt;

    @FindBy(name = "password")
    WebElement passwordTxt;

    @FindBy(css = "button.oxd-button.oxd-button--medium.oxd-button--main.orangehrm-login-button")
    WebElement logInBtn;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void UserLogin(String username, String password) {

        setTextElement(userNameTxt, username);
        setTextElement(passwordTxt, password);
        clickButton(logInBtn);
    }
}
