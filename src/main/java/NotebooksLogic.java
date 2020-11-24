import org.testng.Assert;

import static com.codeborne.selenide.Condition.text;

public class NotebooksLogic extends NotebooksLogicElements {
//    By firstProductInCatalog = By.xpath("//a[@class='goods-tile__heading']");
//    By buyButton = By.xpath("//button[@class='buy-button goods-tile__buy-button']");
//    By basketCounter = By.xpath("//span[@class='header-actions__button-counter']");
//    By basket = By.xpath("//a[@class='header-actions__button header-actions__button_type_basket header-actions__button_state_active']");
//    By productInBasket = By.xpath("//a[@class='cart-product__title']");
//
//    private final WebDriver driver;
//    private final WebDriverWait wait;
//
//    public NotebooksLogic(WebDriver driver, WebDriverWait wait) {
//        this.driver = driver;
//        this.wait = wait;
//    }

    public NotebooksLogic firstProductInCatalogText() {
//        wait.until(ExpectedConditions.visibilityOfElementLocated(firstProductInCatalog));
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

    public NotebooksLogic basketClick() {
        basket.click();
        return this;
    }

    public NotebooksLogic productInBasketText() {
        productInBasket.getText();
        return this;
    }

    //    public NotebooksLogic assertTestInNotebooksLogic() {
//        Assert.assertEquals(basketCounterText(), "1", "В корзине больше одного товара");
//        return this;
//    }
//
    public NotebooksLogic assertCountInBasketLogic() {
        Assert.assertEquals(productInBasketText(), firstProductInCatalogText(), "В корзине больше одного товара");
        return this;
    }
}