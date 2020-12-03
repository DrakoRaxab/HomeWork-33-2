import org.testng.Assert;

public class BasketLogic extends BasketElements{

    public BasketLogic firstProductInCatalogText() {
        firstProductInCatalog.getText();
        return this;
    }

    public BasketLogic productInBasketText() {
        productInBasket.getText();
        return this;
    }

    public BasketLogic assertCountInBasketLogic() {
        Assert.assertEquals(productInBasketText(), firstProductInCatalogText(), "Товар в корзине не такой как в каталоге");
        return this;
    }

}
