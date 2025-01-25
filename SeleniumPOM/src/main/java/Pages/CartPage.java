package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CartPage extends BasePage {

    private final String selectedBook = getBookName();
    private final By bookAmount = By.xpath("//div[@class='row row-cart-product']");
    private final String bookNameXPath = "//*[@id=\"basket\"]/div/div/div/div/div/div/div[%d]/div[2]/div[1]/p";

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public boolean validateBook() {
        waitForElement(bookAmount);
        List<WebElement> validatedBooks = findAll(bookAmount);

        for (int i = 1; i <= validatedBooks.size(); i++) {
            String currentBookNameXPath = String.format(bookNameXPath, i);
            WebElement currentBookElement = driver.findElement(By.xpath(currentBookNameXPath));
            String validatedText = currentBookElement.getText().trim();
            System.out.println("Selected Book: " + selectedBook);
            System.out.println("Validated Book: " + validatedText);
            if (validatedText.equals(selectedBook)) {
                return true;
            }
        }
        return false;
    }
}
