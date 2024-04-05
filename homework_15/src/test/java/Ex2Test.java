
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;

public class Ex2Test {
    @Test
    public void testEx2() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/");
        WebElement formAuthentication = driver.findElement(By.linkText("Form Authentication"));
        formAuthentication.click();
        WebElement userName = driver.findElement(By.id("username"));
        userName.sendKeys("tomsmith");
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("SuperSecretPassword!");
        WebElement loginButton = driver.findElement(By.className("fa-sign-in"));
        loginButton.click();
        WebElement successToaster = driver.findElement(By.id("flash"));
        Assert.assertTrue(successToaster.getText().contains("You logged into a secure area!"));
        driver.quit();
    }


}