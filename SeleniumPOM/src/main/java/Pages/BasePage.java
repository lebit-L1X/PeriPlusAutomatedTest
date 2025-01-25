package Pages;


import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public abstract class BasePage {
    public WebDriver driver;
    static String selectedBook;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    protected WebElement find(By value)
            throws NoSuchElementException {
        WebElement foundElement;
        try {
            foundElement = driver.findElement(value);
        } catch (NoSuchElementException e) {
            System.out.println(value + " Element not Found");
            return null;
        }
        return foundElement;
    }

    protected void click(By value)
            throws StaleElementReferenceException {
        try {
            find(value).click();
        } catch (
                StaleElementReferenceException e) {
            System.out.println("Element is inaccessible");
        }
    }

    protected void input(By value, String text){
        if (text != null ) {
            find(value).sendKeys(text);
        }
    }

    protected String toText(By value){
        return find(value).getText();
    }

    protected List<WebElement> findAll (By value)
          throws NoSuchElementException {
            List<WebElement> foundElements;
            try {
                foundElements = driver.findElements(value);
            } catch (NoSuchElementException e) {
                System.out.println(value + " Element not Found");
                return null;
            }
            return foundElements;
    }

    protected void waitForElement(By waitedElement){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(waitedElement));
    }

    protected void scrollToElement(By locator) {
        WebElement element = driver.findElement(locator);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block: 'center', inline: 'nearest'});", element);
    }


    protected void waitForPreloaderToDisappear(By Preloader) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Adjust timeout as needed
        wait.until(ExpectedConditions.invisibilityOfElementLocated(Preloader));
    }

    protected void setBookName(String bookName){
        selectedBook = bookName;
    }

    protected String getBookName (){
        return selectedBook;
    }
}
