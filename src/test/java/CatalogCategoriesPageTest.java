import Admin.LeftNavigationBar.CatalogCategoriesPage;
import Admin.LeftNavigationBar.LeftNavigationBar;
import Utils.Action;
import Utils.Browser;
import Utils.WaitTool;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

//import java.lang.invoke.LambdaForm$Holder;

public class CatalogCategoriesPageTest extends BaseTest{

    LoginPageTest loginPageTest = new LoginPageTest();

    @Test
    public void addCategoryTest() {
        loginPageTest.loginAsAdmin();
        CatalogCategoriesPage.afterLoginGoToCatalogCategoriesPage();
        CatalogCategoriesPage.clickOnAddCategoryButton();
        CatalogCategoriesPage.writeTextInCategoryNameField();
        CatalogCategoriesPage.scrollToMetaTagTitle();
        CatalogCategoriesPage.writeTextInCategoryMetaTagField();
        CatalogCategoriesPage.clickOnSaveNewCategoryButton();
        Assert.assertEquals(CatalogCategoriesPage.getTextFromSuccessMessage(), "Success: You have modified categories!");
    }
    @Test
    public void deleteCategoryTest(){
        loginPageTest.loginAsAdmin();
        CatalogCategoriesPage.afterLoginGoToCatalogCategoriesPage();
        CatalogCategoriesPage.clickOnTestCategoryType();
        CatalogCategoriesPage.clickOnDeleteButton();
        try{
            Alert alert = Browser.getDriver().switchTo().alert();
            alert.accept();
        } catch (NoAlertPresentException e){
            e.printStackTrace();
        }
        Assert.assertEquals(CatalogCategoriesPage.getTextFromSuccessMessage(), "Success: You have modified categories!");
    }

}
