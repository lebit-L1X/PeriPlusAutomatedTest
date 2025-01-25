package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;


public class SearchPage extends BasePage{
    final private By searchResults = By.className("results");
    final private By productFound = By.tagName("h3");



    public SearchPage(WebDriver driver) {
        super(driver);
    }

    public void findBooks() {
        List<WebElement> books = findAll(productFound);

        }

    public void findBook() {
        click(productFound);
    }


}
