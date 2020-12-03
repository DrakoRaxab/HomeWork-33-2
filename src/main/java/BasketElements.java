import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class BasketElements {

    SelenideElement productInBasket = $(By.xpath("//a[@class='cart-product__title']"));

}
