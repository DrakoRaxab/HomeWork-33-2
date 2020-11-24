import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class MainPageElements {

    SelenideElement computersAndNotebookMenu = $(By.linkText("Ноутбуки и компьютеры"));
//SelenideElement computersAndNotebookMenu = $(By.xpath("//a[@class='menu-categories__link']"));
}
