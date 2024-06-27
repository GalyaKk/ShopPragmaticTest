package Admin.LeftNavigationBar;

import Base.BasePage;
import Utils.WaitTool;
import org.openqa.selenium.By;

public class CatalogCategoriesPage extends BasePage {
    public static String newCategoryName = "Another Category";
    public static final By CATEGORY_TYPE = By.xpath("//td[text()=\""+CatalogCategoriesPage.newCategoryName+"\"]/preceding-sibling::td/input");
    public static final By DELETE_BUTTON = By.cssSelector(".btn-danger");
    public static final By SUCCESS_MESSAGE = By.cssSelector(".alert-success");
    public static final By ADD_CATEGORY_BUTTON = By.xpath("//div[@class='container-fluid']/div[@class='pull-right']/a[@class='btn btn-primary']");
    public static final By CATEGORY_NAME_INPUT_FIELD = By.cssSelector("#input-name1");
    public static final By META_TAG_TITLE_INPUT_FIELD = By.cssSelector("#input-meta-title1");
    public static final By SAVE_ADDED_CATEGORY_BUTTON = By.cssSelector("div.container-fluid>div.pull-right>button");



    public static String getTextFromSuccessMessage(){
        WaitTool.waitUntilVisibleElement(CatalogCategoriesPage.SUCCESS_MESSAGE);
        return CatalogCategoriesPage.getTextFromElement(CatalogCategoriesPage.SUCCESS_MESSAGE).substring(0, 38);
    }

    public static void afterLoginGoToCatalogCategoriesPage(){
        WaitTool.waitUntilElementIsClickable(LeftNavigationBar.CATALOG_MENU);
        LeftNavigationBar.clickOnWebElement(LeftNavigationBar.CATALOG_MENU);
        WaitTool.waitUntilElementIsClickable(LeftNavigationBar.CATALOG_MENU_CATEGORIES);
        LeftNavigationBar.clickOnWebElement(LeftNavigationBar.CATALOG_MENU_CATEGORIES);
    }

}
