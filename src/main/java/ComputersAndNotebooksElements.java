import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.$;

public class ComputersAndNotebooksElements {

    SelenideElement notebookImg = $(By.xpath("//a[@class='tile-cats__heading tile-cats__heading_type_center']"));
}
