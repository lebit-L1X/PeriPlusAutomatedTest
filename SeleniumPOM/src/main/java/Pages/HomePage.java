package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage extends BasePage{

    private final By searchBar = By.id("filter_name");
    private final By editorsPick = By.className("single_product");
    private final By searchButton = By.className("btnn");
    private final By logo = By.cssSelector(".logo.logo-new");
    private final By homeTopProduct = By.xpath("/html/body/div[3]/div[2]/div/div[2]/div/div[1]/div[1]/div/div[11]/div/div[1]/a/img[2]");
    public HomePage(WebDriver driver) {
        super(driver);
    }

    public SearchPage clickSearch(){
        click(searchButton);
        return new SearchPage(driver);
    }
    public void inputSearchBar(String searchQuery){
        input(searchBar, searchQuery);
    }

    public void waitForButton(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(searchButton));
    }

    public SearchPage operateSearch(String searchQuery) {
        inputSearchBar(searchQuery);
        return clickSearch();
    }

    public ProductPage clickTopHomeProduct(){
        click(homeTopProduct);
        return new ProductPage(driver);
    }





}
