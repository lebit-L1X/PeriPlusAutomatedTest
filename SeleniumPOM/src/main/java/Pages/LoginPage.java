package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{
    private final By emailField = By.name("email");
    private final By passwordField = By.name("password");
    private final By loginButton = By.className("buton");
    private final By errorMessage = By.className("warning");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    //Email
    private void inputEmail(String email){
        input(emailField,email);
    }

    private void inputPassword(String password){
        input(passwordField,password);
    }

    private HomePage clickButton(){
        click(loginButton);
        if(find(errorMessage) == null) {
            return new HomePage(driver);
        }
        else{
            System.out.println(toText(errorMessage));
            return null;
        }
    }

    public HomePage loginAction(String email, String password){
        inputEmail(email);
        inputPassword(password);
        return clickButton();
    }
}
