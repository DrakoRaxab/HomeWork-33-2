
import static com.codeborne.selenide.Selenide.page;

public class MainPageLogic extends MainPageElements {

    public ComputersAndNotebooksLogic computersAndNotebookMenuClick() {
        computersAndNotebookMenu.click();
        return page(ComputersAndNotebooksLogic.class);
    }
}