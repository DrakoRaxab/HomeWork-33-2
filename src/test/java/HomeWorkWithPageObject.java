import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import static com.codeborne.selenide.Selenide.*;

public class HomeWorkWithPageObject {

    @BeforeMethod
    public void before() {
        Configuration.startMaximized = true;
        Configuration.timeout = 5000;
        open("https://www.rozetka.com.ua");

    }

    @Test

    public void pageObject() {

        new MainPageLogic().computersAndNotebookMenuClick()
                .notebookImgClickJS()
                .buyButtonClick().basketCounterText()
                .assertCountInBasketLogic();

    }
}