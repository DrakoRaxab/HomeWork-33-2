import com.codeborne.selenide.Condition;
import org.openqa.selenium.JavascriptExecutor;

import static com.codeborne.selenide.Selenide.page;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class ComputersAndNotebooksLogic extends ComputersAndNotebooksElements {


    public NotebooksLogic notebookImgClickJS() {
        notebookImg.shouldBe(Condition.visible);
        JavascriptExecutor executor = (JavascriptExecutor) getWebDriver();
        executor.executeScript("arguments[0].click();", notebookImg);
        return page(NotebooksLogic.class);
    }
}