package Tasks141;

import Pages.LoginPage;
import Pages.MainPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by pavlo.balyuk on 12/5/2017.
 */
public class Login {
    @Parameters({"browser"})
    @Test
    public void login(String browser) throws IOException {
        String baseUrl = "http://www.gmail.com";
        SingletonWD.getInstance(browser).get(baseUrl);
        LoginPage loginPage = new LoginPage();
        loginPage.validateLoginPagePresence(browser);
        loginPage.login("webdriver2018","2018webdriver",browser);
        loginPage.submitEntrance(browser);
        MainPage mainPage = new MainPage();
        mainPage.validateMainPagePresence(browser);
        mainPage.clickLogout(browser);
        String header = SingletonWD.getInstance(browser).findElement(By.id("headingText")).getText();
        Assert.assertEquals(header, "Hi webdriver");
        SingletonWD.getInstance(browser).quit();
    }
}
