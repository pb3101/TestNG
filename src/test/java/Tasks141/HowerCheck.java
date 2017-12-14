package Tasks141;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import java.io.IOException;

/**
 * Created by pavlo.balyuk on 12/5/2017.
 */
public class HowerCheck {

    @Parameters({"browser"})
    @Test
    public void howerCheck(String browser) throws IOException {
        String baseUrl = " https://eleks.com/";
        SingletonWD.getInstance(browser).get(baseUrl);
        WebDriver driver = SingletonWD.getInstance(browser);
        driver.findElement(By.xpath("//*[@id='headerblock']/a[1]")).click();
        Actions actions = new Actions(driver);
        WebDriverWait wait = new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='topmenu']")));
        WebElement menu = driver.findElement(By.xpath("//*[@id=\"topmenu\"]"));
        actions.moveToElement(menu).perform();
        WebElement caseStudies = driver.findElement(By.xpath("//*[@id='menu-item-4997']"));
        actions.moveToElement(caseStudies).perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='menu-item-3242']")));
        driver.findElement(By.xpath("//*[@id=\"menu-item-3242\"]/a")).click();
        String header = SingletonWD.getInstance(browser).findElement(By.className("toppage__title")).getText();
        Assert.assertEquals(header, "OUR CLIENTS");
        SingletonWD.getInstance(browser).quit();
    }
}
