import org.testng.Assert;

import static com.codeborne.selenide.Condition.visible;

public class BasketLogic extends BasketElements {

    public String productInBasketText() {
        return productInBasket.shouldBe(visible).getText();
    }

    public BasketLogic assertCountInBasketLogic(String firstProductInCatalogText) {
        Assert.assertEquals(productInBasketText(), firstProductInCatalogText, "Товар в корзине не такой как в каталоге");
        return this;
    }
}
