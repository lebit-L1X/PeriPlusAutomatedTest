package Test;

import Pages.ProductPage;
import org.testng.Assert;
import org.testng.annotations.Test;


public class ProductTest extends  BaseTest{
    final String correctEmail = "isubscribed99@gmail.com";
    final String correctPassword = "komainu1";
    int index = 9;//Product selected at the homepage

    @Test
    protected void clickTopHomeProduct(){
        var homePage = loginPage.loginAction(correctEmail,correctPassword);
        if(homePage!=null){
            var productPage = homePage.clickTopHomeProduct();
            if (productPage != null){
                productPage.purchaseProcess();

            }
        }
    }


}
