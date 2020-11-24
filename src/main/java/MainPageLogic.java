import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.codeborne.selenide.Selenide.page;

public class MainPageLogic extends MainPageElements {
//    By computersAndNotebookMenu = By.linkText("Ноутбуки и компьютеры");


//    private final WebDriver driver;
//    private final WebDriverWait wait;

//    public MainPageLogic(WebDriver driver, WebDriverWait wait) {
//        this.driver = driver;
//        this.wait = wait;
//    }

    public ComputersAndNotebooksLogic computersAndNotebookMenuClick() {
        computersAndNotebookMenu.click();
        return page(ComputersAndNotebooksLogic.class);
    }
}