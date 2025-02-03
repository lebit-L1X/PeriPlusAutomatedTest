package Test;

import Pages.ProductPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchTest extends BaseTest{
    final String correctEmail = "isubscribed99@gmail.com";
    final String correctPassword = "komainu1";

    final String searchNameCorrect = "1984";
    final String searchISBNCorrect = "";
    final String searchAuthorCorrect = "";
    final String searchIncorrect = "WRONG1293192041024AAA";

    @Test
    protected void testSearchCorrect(){
        var homePage = loginPage.loginAction(correctEmail,correctPassword);
        if(homePage!=null){
            var searchPage = homePage.operateSearch(searchNameCorrect);
            if (searchPage!= null){
             var  productPage = searchPage.findSelectBook();
                if (productPage != null){
                    var cartPage = productPage.purchaseProcess();
                    if (cartPage != null){
                        Assert.assertTrue(cartPage.validateBook());
                    }
                }
            }

        }
    }



}


