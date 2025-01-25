package Test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CartTest extends BaseTest{
    final String correctEmail = "wndydr235@gmail.com";
    final String correctPassword = "dagonur123";

    @Test
    protected void addBookToCart(){
        var homePage = loginPage.loginAction(correctEmail,correctPassword);
        if(homePage!=null){
            var productPage = homePage.clickTopHomeProduct();
            if (productPage != null){
                var cartPage = productPage.purchaseProcess();
                if (cartPage != null){
                   Assert.assertTrue(cartPage.validateBook());
                }
            }
        }
    }


}
