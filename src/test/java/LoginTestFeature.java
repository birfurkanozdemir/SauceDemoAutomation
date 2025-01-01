import org.example.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.example.LoginPage;

public class LoginTestFeature {

    public WebDriver driver;
    public LoginPage loginPage;

    @BeforeClass
    public void setupAutomation(){
        System.setProperty("webdriver.chrome.driver","src/main/resources/drivers/chromedriver.exe");
        String basUrl = "https://www.saucedemo.com/";
        driver = new ChromeDriver();
        driver.get(basUrl);
        loginPage = new LoginPage(driver);
    }

    @Test
    public void loginTest(){
        loginPage.enterUsername("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickLogin();

        String verifyHomePageText = loginPage.getHomePageText();
        Assert.assertEquals(verifyHomePageText, "Swag Labs");
    }

    @AfterClass
    public void closeAutomation(){
        driver.quit();
    }
}
