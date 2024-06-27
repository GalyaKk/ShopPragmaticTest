package Admin.LeftNavigationBar;

import Base.BasePage;
import org.openqa.selenium.By;

public class LeftNavigationBar extends BasePage {

    protected static final By DASHBOARD_MENU = By.cssSelector("#menu-dashboard>a");
    private static final By CATALOG_MENU = By.cssSelector("#menu-catalog>a");
    private static final By CATALOG_MENU_CATEGORIES = By.xpath("//*[@id='menu-catalog']/ul/li[1]/a");
    protected static final By CATALOG_MENU_PRODUCTS = By.xpath("//*[@id='menu-catalog']/ul/li[2]/a");
    protected static final By CATALOG_MENU_RECURRING_PROFILES = By.xpath("//*[@id='menu-catalog']/ul/li[3]/a");
    protected static final By CATALOG_MENU_FILTERS = By.xpath("//*[@id='menu-catalog']/ul/li[4]/a");
    protected static final By CATALOG_MENU_ATTRIBUTES = By.xpath("//*[@id='menu-catalog']/ul/li[5]/a");
    protected static final By CATALOG_MENU_OPTIONS = By.xpath("//*[@id='menu-catalog']/ul/li[6]/a");
    protected static final By CATALOG_MENU_MANUFACTURERS = By.xpath("//*[@id='menu-catalog']/ul/li[7]/a");
    protected static final By CATALOG_MENU_DOWNLOADS = By.xpath("//*[@id='menu-catalog']/ul/li[8]/a");
    protected static final By CATALOG_MENU_REVIEWS = By.xpath("//*[@id='menu-catalog']/ul/li[9]/a");
    protected static final By CATALOG_MENU_INFORMATION = By.xpath("//*[@id='menu-catalog']/ul/li[10]/a");
    protected static final By EXTENSIONS_MENU = By.xpath("//*[@id='menu-extension']/a");
    protected static final By EXTENSIONS_MENU_MARKETPLACE = By.xpath("//*[@id='menu-extension']/ul/li[1]/a");
    protected static final By EXTENSIONS_MENU_INSTALLER = By.xpath("//*[@id='menu-extension']/ul/li[2]/a");
    protected static final By EXTENSIONS_MENU_EXTENSIONS = By.xpath("//*[@id='menu-extension']/ul/li[3]/a");
    protected static final By EXTENSIONS_MENU_MODIFACATIONS = By.xpath("//*[@id='menu-extension']/ul/li[4]/a");
    protected static final By EXTENSIONS_MENU_EVENTS = By.xpath("//*[@id='menu-extension']/ul/li[5]/a");
    protected static final By DESIGN_MENU = By.xpath("//*[@id='menu-design']/a");
    protected static final By DESIGN_MENU_LAYOUTS = By.xpath("//*[@id='menu-design']/ul/li[1]/a");
    protected static final By DESIGN_MENU_THEME_EDITOR = By.xpath("//*[@id='menu-design']/ul/li[2]/a");
    protected static final By DESIGN_MENU_LANGUAGE_EDITOR = By.xpath("//*[@id='menu-design']/ul/li[3]/a");
    protected static final By DESIGN_MENU_BANNERS = By.xpath("//*[@id='menu-design']/ul/li[4]/a");
    protected static final By DESIGN_MENU_SEO_URL = By.xpath("//*[@id='menu-design']/ul/li[5]/a");
    protected static final By SALE_MENU = By.xpath("//*[@id='menu-sale']/a");
    protected static final By SALE_MENU_ORDERS = By.xpath("//*[@id='menu-sale']/ul/li[1]/a");
    protected static final By SALE_MENU_RECURRING_ORDERS = By.xpath("//*[@id='menu-sale']/ul/li[2]/a");
    protected static final By SALE_MENU_RETURNS = By.xpath("//*[@id='menu-sale']/ul/li[3]/a");
    protected static final By SALE_MENU_GIFT_VOUCHERS = By.xpath("//*[@id='menu-sale']/ul/li[4]/a");
    protected static final By CUSTOMER_MENU = By.xpath("//*[@id='menu-customer']/a");
    protected static final By CUSTOMER_MENU_CUSTOMERS = By.xpath("//*[@id='menu-customer']/ul/li[1]/a");
    protected static final By CUSTOMER_MENU_CUSTOMER_GROUPS = By.xpath("//*[@id='menu-customer']/ul/li[2]/a");
    protected static final By CUSTOMER_MENU_CUSTOMER_APPROVALS = By.xpath("//*[@id='menu-customer']/ul/li[3]/a");
    protected static final By CUSTOMER_MENU_CUSTOM_FIELDS = By.xpath("//*[@id='menu-customer']/ul/li[4]/a");
    protected static final By MARKETING_MENU = By.xpath("//*[@id='menu-marketing']/a");
    protected static final By MARKETING_MENU_MRKETING = By.xpath("//*[@id='menu-marketing']/ul/li[1]/a");
    protected static final By MARKETING_MENU_COUPONS = By.xpath("//*[@id='menu-marketing']/ul/li[2]/a");
    protected static final By MARKETING_MENU_MAIL = By.xpath("//*[@id='menu-marketing']/ul/li[3]/a");
    protected static final By MARKETING_MENU_GOOGLE_SHOPPING = By.xpath("//*[@id='menu-marketing']/ul/li[4]/a");
    protected static final By SYSTEM_MENU_ = By.xpath("//*[@id='menu-system']/a");
    protected static final By SYSTEM_MENU_SETTINGS = By.xpath("//*[@id='menu-system']/ul/li[1]/a");
    protected static final By SYSTEM_MENU_USERS = By.xpath("//*[@id='menu-system']/ul/li[2]/a");
    protected static final By SYSTEM_MENU_LOCALISATION = By.xpath("//*[@id='menu-system']/ul/li[3]/a");
    protected static final By SYSTEM_MENU_MAINTENANCE = By.xpath("//*[@id='menu-system']/ul/li[4]/a");
    protected static final By REPORT_MENU = By.xpath("//*[@id='menu-report']/a");
    protected static final By REPORT_MENU_REPORTS = By.xpath("//*[@id='menu-report']/ul/li[1]/a");
    protected static final By REPORT_MENU_WHO_ONLINE = By.xpath("//*[@id='menu-report']/ul/li[2]/a");
    protected static final By REPORT_MENU_STATISTICS = By.xpath("//*[@id='menu-report']/ul/li[3]/a");

    public static By getCatalogMenu() {
        return CATALOG_MENU;
    }

    public static By getCatalogMenuCategories(){
        return CATALOG_MENU_CATEGORIES;
    }

    public static void clickOnCatalogMenu(){
        LeftNavigationBar.clickOnWebElement(CATALOG_MENU);
    }
    public static void clickOnCatalogMenuCategories(){
        LeftNavigationBar.clickOnWebElement(CATALOG_MENU_CATEGORIES);
    }






}
