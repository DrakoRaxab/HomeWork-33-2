import static com.codeborne.selenide.Selenide.page;

public class ComputersAndNotebooksLogic extends ComputersAndNotebooksElements {


    public NotebooksLogic notebookImgClick() {
        notebookImg.click();
        return page(NotebooksLogic.class);
    }
}