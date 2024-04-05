
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import org.testng.Assert;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;

public class Ex3Test {
    @Test
    public void testEx3() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://formy-project.herokuapp.com/form");
        WebElement firstName = driver.findElement(By.id("first-name"));
        firstName.sendKeys("Darius");
        WebElement lastName = driver.findElement(By.id("last-name"));
        lastName.sendKeys("Chis");
        WebElement jobTitle = driver.findElement(By.id("job-title"));
        jobTitle.sendKeys("Qa Engineer");
        WebElement radioButton = driver.findElement(By.id("radio-button-1"));
        radioButton.click();
        WebElement checkBox1 = driver.findElement(By.id("checkbox-1"));
        checkBox1.click();
        WebElement selectMenu = driver.findElement(By.id("select-menu"));
        selectMenu.click();
        Select select = new Select(selectMenu);
        select.selectByIndex(2);
        WebElement datePicker = driver.findElement(By.id("datepicker"));
        datePicker.sendKeys("04/05/2024");
        WebElement submit = driver.findElement(By.linkText("Submit"));
        submit.click();
        sleep(1000);
        WebElement successToaster = driver.findElement(By.className("alert-success"));
        Assert.assertTrue(successToaster.getText().contains("The form was successfully submitted!"));
        driver.quit();
    }


}