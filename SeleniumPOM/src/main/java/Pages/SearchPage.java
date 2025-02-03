package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;


public class SearchPage extends BasePage{
    final private By searchResults = By.className("results");
    final private By preloader = By.className("preloader");
    final private By productFound = By.xpath("/html/body/section/div/div/div[2]/div[1]/div[1]/div/div[1]/a/img[2]");



    public SearchPage(WebDriver driver) {
        super(driver);
    }

    public void findBooks() {
        List<WebElement> books = findAll(productFound);

        }



    public void findBook() {
        waitForPreloaderToDisappear(preloader);
        click(productFound);
    }
    public ProductPage findSelectBook(){
        findBook();
        return new ProductPage(driver);
    }

}
