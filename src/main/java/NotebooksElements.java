import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class NotebooksElements {

    SelenideElement firstProductInCatalog = $(By.xpath("//a[@class='goods-tile__heading']"));
    SelenideElement buyButton = $(By.xpath("//button[@class='buy-button goods-tile__buy-button']"));
    SelenideElement basketCounter = $(By.xpath("//span[@class='header-actions__button-counter']"));

}
