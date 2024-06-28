package Admin.LeftNavigationBar;

import Base.BasePage;
import Utils.Action;
import Utils.Browser;
import Utils.WaitTool;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;

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
    public static final By CATEGORY_LIST_NEXT_PAGE_NUMBER = By.xpath("//div[@class='row']//li[@class='active']/following-sibling::li[1]/a");
    public static final By CATEGORY_LIST_FIRST_PAGE = By.xpath("//ul[@class='pagination']//a[text()=\"1\"]");



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
    public static void clickOnNextCategoryPage(){
        CatalogCategoriesPage.clickOnWebElement(CATEGORY_LIST_NEXT_PAGE_NUMBER);
    }
    public static void moveToNextCategoryPage(By by){
        Action.moveToMyElement(by);
    }

    public static By getCategoryListNextPageNumber(){
        return CATEGORY_LIST_NEXT_PAGE_NUMBER;
    }

    public static List<String> addAllCategoriesToList(){
        List<String> categoriesList = new ArrayList<>();
        while (true){
            for (int i=1; true; i++){
                try {
                    categoriesList.add(CatalogCategoriesPage.getTextFromElement(By.xpath("//tbody/tr[" +i+ "]/td[@class='text-left']")).toUpperCase());
                } catch (Exception e) {
                    break;
                }
            }
            try {
                Actions actions = new Actions(Browser.getDriver());
                actions.moveToElement(Browser.getDriver().findElement(CatalogCategoriesPage.getCategoryListNextPageNumber()));
//       CatalogCategoriesPage.moveToNextCategoryPage(CatalogCategoriesPage.CATEGORY_LIST_NEXT_PAGE_NUMBER);
                WaitTool.waitUntilElementIsClickable(By.xpath("//div[@class='row']//li[@class='active']/following-sibling::li[1]/a"));
                CatalogCategoriesPage.clickOnNextCategoryPage();
            } catch (Exception noNextPage){
                break;
            }
        }
        return categoriesList;
    }
    public static void clickOnFirstPageOfCategories(){
        CatalogCategoriesPage.clickOnWebElement(CATEGORY_LIST_FIRST_PAGE);
    }
}
