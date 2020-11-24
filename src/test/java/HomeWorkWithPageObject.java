import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import java.util.concurrent.TimeUnit;

import static com.codeborne.selenide.Selenide.*;

public class HomeWorkWithPageObject {
    WebDriver driver;
    WebDriverWait wait;

    @BeforeMethod
    public void before() {
        Configuration.startMaximized = true;
        Configuration.holdBrowserOpen = true;
        Configuration.timeout = 5000;
        open("https://www.rozetka.com.ua");

    }

    @Test

    public void pageObject() {
        new MainPageLogic().computersAndNotebookMenuClick();
        new MainPageLogic().computersAndNotebookMenuClick();
        new ComputersAndNotebooksLogic().notebookImgClickJS();
        new NotebooksLogic().buyButtonClick().basketCounterText().basketClick()
                .assertCountInBasketLogic();
        sleep(10000);
//        new MainPageLogic(driver, wait).computersAndNotebookMenuClick();
//        new ComputersAndNotebooksLogic(driver, wait).notebookImgClick();
//        new NotebooksLogic(driver, wait).buyButtonClick();
//        new NotebooksLogic(driver, wait).basketClick();
//        new NotebooksLogic(driver, wait).basketCounterText();
//        new NotebooksLogic(driver, wait).assertTestInNotebooksLogic();
//        new NotebooksLogic(driver, wait).assertCountInBasketLogic();


    }

//    @AfterMethod
//    public void after() {
//
//        driver.quit();
//    }
}