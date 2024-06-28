package Utils;

import Admin.LeftNavigationBar.CatalogCategoriesPage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;

public class Action extends Browser{

    protected static Actions action;

    public static void scrollToMyElement(By locator) {
        action = new Actions(getDriver());
        action.scrollToElement(getDriver().findElement(locator));
        action.perform();
    }

    public static void moveToMyElement(By by){
        action = new Actions(getDriver());
        action.moveToElement(Browser.getDriver().findElement(by));
        action.perform();
    }
}
