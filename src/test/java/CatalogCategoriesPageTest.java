import Admin.LeftNavigationBar.CatalogCategoriesPage;
import Admin.LeftNavigationBar.LeftNavigationBar;
import Utils.Action;
import Utils.Browser;
import Utils.WaitTool;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.testng.Assert;
import org.testng.annotations.Test;

//import java.lang.invoke.LambdaForm$Holder;

public class CatalogCategoriesPageTest extends BaseTest{

    LoginPageTest loginPageTest = new LoginPageTest();

    @Test
    public void addAndDeleteCategoryTest() {
        loginPageTest.loginAsAdmin();
        WaitTool.waitUntilVisibleElement(LeftNavigationBar.CATALOG_MENU);
        WaitTool.waitUntilElementIsClickable(LeftNavigationBar.CATALOG_MENU);
        LeftNavigationBar.clickOnWebElement(LeftNavigationBar.CATALOG_MENU);
        WaitTool.waitUntilVisibleElement(LeftNavigationBar.CATALOG_MENU_CATEGORIES);
        WaitTool.waitUntilElementIsClickable(LeftNavigationBar.CATALOG_MENU_CATEGORIES);
        LeftNavigationBar.clickOnWebElement(LeftNavigationBar.CATALOG_MENU_CATEGORIES);
        CatalogCategoriesPage.clickOnWebElement(CatalogCategoriesPage.ADD_CATEGORY_BUTTON);
        CatalogCategoriesPage.writeTextInWebelemnt(CatalogCategoriesPage.CATEGORY_NAME_INPUT_FIELD, CatalogCategoriesPage.newCategoryName);
        Action.scrollToMyElement(CatalogCategoriesPage.META_TAG_TITLE_INPUT_FIELD);
        CatalogCategoriesPage.writeTextInWebelemnt(CatalogCategoriesPage.META_TAG_TITLE_INPUT_FIELD, "newly added category");
        CatalogCategoriesPage.clickOnWebElement(CatalogCategoriesPage.SAVE_ADDED_CATEGORY_BUTTON);
        Assert.assertEquals(CatalogCategoriesPage.getTextFromSuccessMessage(), "Success: You have modified categories!");
        CatalogCategoriesPage.clickOnWebElement(CatalogCategoriesPage.CATEGORY_TYPE);
        CatalogCategoriesPage.clickOnWebElement(CatalogCategoriesPage.DELETE_BUTTON);
        try{
            Alert alert = Browser.getDriver().switchTo().alert();
            alert.accept();
        } catch (NoAlertPresentException e){
            e.printStackTrace();
        }
        Assert.assertEquals(CatalogCategoriesPage.getTextFromSuccessMessage(), "Success: You have modified categories!");
    }
}
