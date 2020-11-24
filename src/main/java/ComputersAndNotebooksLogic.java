import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.codeborne.selenide.Selenide.page;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class ComputersAndNotebooksLogic extends ComputersAndNotebooksElements{

//    private final WebDriver driver;
//    private final WebDriverWait wait;

//    public ComputersAndNotebooksLogic(WebDriver driver, WebDriverWait wait) {
//        this.driver = driver;
//        this.wait = wait;
//    }

    public NotebooksLogic notebookImgClickJS() {
//        JavascriptExecutor jse = (JavascriptExecutor) driver;
//        WebElement notebookImg = driver.findElement(By.xpath("//img[@alt='Ноутбуки']"));


        notebookImg.shouldBe(Condition.visible);
        JavascriptExecutor executor = (JavascriptExecutor) getWebDriver();
        executor.executeScript("arguments[0].click;", notebookImg);
        return page(NotebooksLogic.class);
    }
    }