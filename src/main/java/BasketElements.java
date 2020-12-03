import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class BasketElements {

    SelenideElement firstProductInCatalog = $(By.xpath("//a[@class='goods-tile__heading']"));
    SelenideElement productInBasket = $(By.xpath("//a[@class='cart-product__title']"));

}
