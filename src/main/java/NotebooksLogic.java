import org.testng.Assert;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.page;

public class NotebooksLogic extends NotebooksElements {

//    public NotebooksLogic firstProductInCatalogText() {
//        firstProductInCatalog.getText();
//        return this;
//    }

    public NotebooksLogic buyButtonClick() {
        buyButton.click();
        return this;
    }

    public BasketLogic basketCounterText() {
        basketCounter.shouldHave(text("1")).click();
        return page(BasketLogic.class);
    }

//    public NotebooksLogic productInBasketText() {
//        productInBasket.getText();
//        return this;
//    }
//
//    public NotebooksLogic assertCountInBasketLogic() {
//        Assert.assertEquals(productInBasketText(), firstProductInCatalogText(), "Товар в корзине не такой как в каталоге");
//        return this;
//    }
}