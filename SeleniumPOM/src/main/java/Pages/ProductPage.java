package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;


import java.time.Duration;

public class ProductPage extends BasePage{
    final private By addCartButton = By.xpath("/html/body/div[3]/div[1]/div/div/div[3]/div[1]/div[3]/div[1]/button");
    final private By shoppingCart = By.xpath("//*[@id='show-your-cart']/a");
    final private By firstPreloader = By.cssSelector(".preloader");
    final private By secondPreloader = By.xpath("//*[@id=\"Notification-Modal\"]/div/div/div/div[1]/button");
    final private By bookName = By.tagName("h2");

    public ProductPage(WebDriver driver) {
        super(driver);
    }



    protected void clickAddCart() {
        click(addCartButton);
    }


    protected void clickShoppingCart(){
        click(shoppingCart);
    }

    protected void addToCart(){

            waitForPreloaderToDisappear(firstPreloader);
            clickAddCart();
            waitForElement(secondPreloader);
            click(secondPreloader);
            clickShoppingCart();

    }

    protected String getItemName(){
        return toText(bookName);
    }

    public CartPage purchaseProcess(){
        setBookName(getItemName());
        addToCart();
        return new CartPage(driver);
    }



}
