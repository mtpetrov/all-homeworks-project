package lecture12;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class lecture12Test {
    private WebDriver driver;
    private WebDriverWait wait;

    @BeforeSuite
    public void setUpTestSuite(){
        WebDriverManager.chromedriver().setup();
    }

    @BeforeMethod
    public void setUpTest(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

    @AfterMethod
    public void tearDownTest(){
        if (this.driver != null){
            driver.close();
        }
    }

    @Test
    public void myFirstTest(){
        driver.get("http://training.skillo-bg.com:4300/posts/all");
        WebElement loginButton = driver.findElement(By.id("nav-link-login"));
        loginButton.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.urlToBe("http://training.skillo-bg.com:4300/users/login"));

        WebElement usernameField = driver.findElement(By.id("defaultLoginFormUsername"));
        WebElement passwordField = driver.findElement(By.id("defaultLoginFormPassword"));

        usernameField.sendKeys("genadigenadi");
        passwordField.sendKeys("genadi");

        WebElement signInButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("sign-in-button")));
        signInButton.click();
    }
}
