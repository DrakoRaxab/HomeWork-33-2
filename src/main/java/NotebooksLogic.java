import org.testng.Assert;

import static com.codeborne.selenide.Condition.text;

public class NotebooksLogic extends NotebooksLogicElements {

    public NotebooksLogic firstProductInCatalogText() {
        firstProductInCatalog.getText();
        return this;
    }

    public NotebooksLogic buyButtonClick() {
        buyButton.click();
        return this;
    }

    public NotebooksLogic basketCounterText() {
        basketCounter.shouldHave(text("1")).click();
        return this;
    }

    public NotebooksLogic productInBasketText() {
        productInBasket.getText();
        return this;
    }

    public NotebooksLogic assertCountInBasketLogic() {
        Assert.assertEquals(productInBasketText(), firstProductInCatalogText(), "В корзине разные товары");
        return this;
    }
}