import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.page;

public class NotebooksLogic extends NotebooksElements {


    public String getTitleOfFirstProductInCatalog() {
        return firstProductInCatalog.shouldBe(visible).getText();
    }

    public NotebooksLogic buyButtonClick() {
        buyButton.click();
        return this;
    }

    public BasketLogic basketCounterText() {
        basketCounter.shouldHave(text("1")).click();
        return page(BasketLogic.class);
    }
}