
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class ComputersAndNotebooksLogic extends ComputersAndNotebooksElements {


    public NotebooksLogic notebookImgClickJS() {
//        JavascriptExecutor jse = (JavascriptExecutor) driver;
//        WebElement notebookImg = driver.findElement(By.xpath("//img[@alt='Ноутбуки']"));
        notebookImg.click();

//        notebookImg.shouldNotBe(Condition.visible);
//        JavascriptExecutor executor = (JavascriptExecutor) getWebDriver();
//        executor.executeScript("arguments[0].click;", notebookImg);
        return page(NotebooksLogic.class);
    }
}