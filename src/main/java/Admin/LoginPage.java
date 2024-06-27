package Admin;

import Base.BasePage;
import org.openqa.selenium.By;

public class LoginPage extends BasePage {

    private static final By USERNAME_INPUT_FIELD = By.id("input-username");
    private static final By PASSWORD_INPUT_FIELD = By.id("input-password");
    private static By LOGIN_BUTTON = By.cssSelector("button[type='submit']");
    private static final String LOGIN_PAGE_URL = "https://shop.pragmatic.bg/admin/index.php?route=common/login";
    private static final By TITLE_INPUT_WINDOW = By.className("panel-title");
    private static final By FORGOTTEN_PASS_LINK = By.xpath("//span[@class='help-block']/a");

    public static By getLoginButton() {
        return LOGIN_BUTTON;
    }
    public static By getTitleInputWindow(){
        return TITLE_INPUT_WINDOW;
    }
    public static By getForgottenPassLink(){
        return FORGOTTEN_PASS_LINK;
    }

    public static void openLoginPage(){
        driver.get(LOGIN_PAGE_URL);
    }

    public static void typeIntoUsernameField () {
        BasePage.writeTextInWebelemnt(USERNAME_INPUT_FIELD, "admin");
    }
    public static void typeIntoPasswordField () {
        BasePage.writeTextInWebelemnt(PASSWORD_INPUT_FIELD, "parola123!");
    }

    public static String getInputWindowTitle (){
        return LoginPage.getTextFromElement(TITLE_INPUT_WINDOW);
    }

    public static void clickOnForgottenPasswordLink(){
        LoginPage.clickOnWebElement(FORGOTTEN_PASS_LINK);
    }

    public static void clickOnLoginButton(){
        LoginPage.clickOnWebElement(LOGIN_BUTTON);
    }



}
