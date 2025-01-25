package Test;

import Pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {


    final String correctEmail = "isubscribed99@gmail.com";
    final String correctPassword = "komainu1";
    final String incorrectEmail = "notsubscribed99@gmail.com";
    final String incorrectPassword = "titikkoma";

    @Test
    protected void testLoginCorrect(){
       var homePage = loginPage.loginAction(correctEmail,correctPassword);
        Assert.assertNotNull(homePage);
        System.out.println("testLoginCorrect passed.");
    }

    @Test
    protected void testLoginIncorrectPassword(){
        var homePage = loginPage.loginAction(correctEmail,incorrectPassword);
        Assert.assertNull(homePage);
        System.out.println("testLoginIncorrectPassword passed.");
    }

    @Test
    protected void testLoginIncorrectEmail(){
        var homePage = loginPage.loginAction(incorrectEmail,correctPassword);
        Assert.assertNull(homePage);
        System.out.println("testLoginIncorrectEmail passed.");
    }


}

