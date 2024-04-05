
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;

public class Ex1Test {
    @Test
    public void testEx1() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://duckduckgo.com/");
        WebElement searchboxHomepage = driver.findElement(By.id("searchbox_input"));
        searchboxHomepage.click();
        searchboxHomepage.sendKeys("selenium");
        sleep(1000);
        searchboxHomepage.sendKeys(Keys.RETURN);
        Assert.assertTrue(driver.getCurrentUrl().contains("selenium"));
        driver.quit();
    }


}