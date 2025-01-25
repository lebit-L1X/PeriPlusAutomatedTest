package Test;

import Pages.BasePage;
import Pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public abstract class BaseTest {
    protected WebDriver driver;
    protected String url = "https://www.periplus.com/account/Login";
    protected LoginPage loginPage;


    @BeforeMethod
    public void setUp(){
        System.out.println("Beginning new driver session");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        loginPage = new LoginPage(driver);
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }






}


