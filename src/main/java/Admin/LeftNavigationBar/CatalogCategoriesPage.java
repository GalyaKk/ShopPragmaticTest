package Admin.LeftNavigationBar;

import Base.BasePage;
import Utils.Action;
import Utils.WaitTool;
import org.openqa.selenium.By;

public class CatalogCategoriesPage extends BasePage {

    static int i;
    private static String newCategoryName = "Another Category";
    private static final By CATEGORY_TYPE_TEST = By.xpath("//td[text()=\""+CatalogCategoriesPage.newCategoryName+"\"]/preceding-sibling::td/input");
    private static final By DELETE_BUTTON = By.cssSelector(".btn-danger");
    private static final By SUCCESS_MESSAGE = By.cssSelector(".alert-success");
    private static final By ADD_CATEGORY_BUTTON = By.xpath("//div[@class='container-fluid']/div[@class='pull-right']/a[@class='btn btn-primary']");
    private static final By CATEGORY_NAME_INPUT_FIELD = By.cssSelector("#input-name1");
    private static final By META_TAG_TITLE_INPUT_FIELD = By.cssSelector("#input-meta-title1");
    private static final By SAVE_ADDED_CATEGORY_BUTTON = By.cssSelector("div.container-fluid>div.pull-right>button");
    private static final By CATEGORY_NAME_BUTTON = By.cssSelector(".asc");
    private static final By CATEGORY_NAME_TEXT = By.xpath("//tbody/tr[" +i+ "]/td[@class='text-left']");



    public static String getTextFromSuccessMessage(){
        WaitTool.waitUntilVisibleElement(CatalogCategoriesPage.SUCCESS_MESSAGE);
        return CatalogCategoriesPage.getTextFromElement(CatalogCategoriesPage.SUCCESS_MESSAGE).substring(0, 38);
    }

    public static void afterLoginGoToCatalogCategoriesPage(){
        WaitTool.waitUntilElementIsClickable(LeftNavigationBar.getCatalogMenu());
        LeftNavigationBar.clickOnCatalogMenu();
        WaitTool.waitUntilElementIsClickable(LeftNavigationBar.getCatalogMenuCategories());
        LeftNavigationBar.clickOnCatalogMenuCategories();
    }
    public static String takeNamesOfAllCategories(){
        return CatalogCategoriesPage.getTextFromElement(CatalogCategoriesPage.CATEGORY_NAME_TEXT);
    }

    public static void clickOnAddCategoryButton() {
        CatalogCategoriesPage.clickOnWebElement(ADD_CATEGORY_BUTTON);
    }

    public static void writeTextInCategoryNameField(){
        CatalogCategoriesPage.writeTextInWebelemnt(CATEGORY_NAME_INPUT_FIELD, newCategoryName);
    }

    public static void writeTextInCategoryMetaTagField(){
        CatalogCategoriesPage.writeTextInWebelemnt(META_TAG_TITLE_INPUT_FIELD, "newly added category");
    }
    public static void clickOnSaveNewCategoryButton(){
        CatalogCategoriesPage.clickOnWebElement(SAVE_ADDED_CATEGORY_BUTTON);
    }

    public static void clickOnTestCategoryType() {
        CatalogCategoriesPage.clickOnWebElement(CATEGORY_TYPE_TEST);
    }
    public static void clickOnDeleteButton(){
        CatalogCategoriesPage.clickOnWebElement(DELETE_BUTTON);
    }
    public static void scrollToMetaTagTitle(){
        Action.scrollToMyElement(META_TAG_TITLE_INPUT_FIELD);
    }
    public static void clickOnCategoryNameButton(){
        CatalogCategoriesPage.clickOnWebElement(CATEGORY_NAME_BUTTON);
    }

}
