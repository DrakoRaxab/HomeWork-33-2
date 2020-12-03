import org.testng.Assert;

import static com.codeborne.selenide.Condition.visible;

public class BasketLogic extends BasketElements {

    String titleOfFirstProductInCatalog = new NotebooksLogic().getTitleOfFirstProductInCatalog();

    public String productInBasketText() {
        return productInBasket.shouldBe(visible).getText();
    }

    public BasketLogic assertCountInBasketLogic() {
        Assert.assertEquals(productInBasketText(), titleOfFirstProductInCatalog, "Товар в корзине не такой как в каталоге");
        System.out.println(productInBasketText() + " - " + titleOfFirstProductInCatalog);
        return this;
    }
}
