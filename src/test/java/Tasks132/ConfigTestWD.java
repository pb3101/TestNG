package Tasks132;

import Tasks131.SingletonWD;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by pavlo.balyuk on 11/27/2017.
 */

// To run test from console use command
// mvn -Dtest=ConfigTestWD test
public class ConfigTestWD {

    @BeforeClass // Runs this method before the first test method in the current class is invoked
    public void initWD() throws IOException {
        WebDriver webDriver = SingletonWD.getInstance("chrome");
        webDriver.get("http://www.gmail.com"); //Open browser window
        webDriver.manage().window().maximize();
    }

    @Test
    public void gotoMailPage() throws IOException {
        WebDriver webDriver = SingletonWD.getInstance("chrome");
        webDriver.findElement(By.cssSelector("#identifierId")).sendKeys("webdriver2018");
        webDriver.findElement(By.cssSelector("#identifierNext")).click();
        webDriver.findElement(By.xpath("//div[@id=\"password\"]//input")).sendKeys("2018webdriver");
        webDriver.findElement(By.cssSelector("#passwordNext")).click();
        webDriver.findElement(By.xpath("//a[contains(@title, 'Google Account')]")).click();
        webDriver.findElement(By.linkText("Sign out")).click();
        String header = webDriver.findElement(By.id("headingText")).getText();
        Assert.assertEquals(header, "Hi webdriver");
    }

    @AfterClass
    public void closeWD() throws IOException {
        WebDriver webDriver = SingletonWD.getInstance("chrome");
        webDriver.quit();
    }
}
