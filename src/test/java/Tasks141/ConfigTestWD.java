package Tasks141;

import Tasks131.SingletonWD;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by pavlo.balyuk on 11/27/2017.
 */

// To run test from console use command
// mvn -Dtest=ConfigTestWD test
// mvn –Dtest=ConfigTestWD –Dbrowser=firefox  test
public class ConfigTestWD {
    @Parameters({"browser"})
    @Test
    public void gotoMailPage(String browser) throws IOException {
        String baseUrl = "http://www.gmail.com";
        WebDriver webDriver = SingletonWD.getInstance(System.getProperty("browser"));
        webDriver.get(baseUrl); //Open browser window
        webDriver.findElement(By.cssSelector("#identifierId")).sendKeys("webdriver2018");
        webDriver.findElement(By.cssSelector("#identifierNext")).click();
        webDriver.findElement(By.xpath("//div[@id=\"password\"]//input")).sendKeys("2018webdriver");
        webDriver.findElement(By.xpath("//*[@id=\"passwordNext\"]")).click();
        webDriver.findElement(By.xpath("//a[contains(@title, 'Google Account')]")).click();
        webDriver.findElement(By.linkText("Sign out")).click();
        String header = webDriver.findElement(By.id("headingText")).getText();
        Assert.assertEquals(header, "Hi webdriver");
    }
}
