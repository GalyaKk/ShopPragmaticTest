package Admin;

import Base.BasePage;
import org.checkerframework.checker.index.qual.UpperBoundUnknown;
import org.openqa.selenium.By;

public class ForgottenPasswordPage extends BasePage {

    private static final By TITLE_FORGOTTEN_PASS = By.cssSelector(".panel-heading>h1");
    private static final By CANCEL_BUTTON = By.cssSelector(".text-right>a");
    private static final By RESET_PASSWORD_BUTTON = By.cssSelector("div.text-right>button");
    private static final By NO_EMAIL_WARNING_MESSAGE = By.cssSelector(".alert");

    public static By getTitleForgottenPass(){
        return TITLE_FORGOTTEN_PASS;
    }
    public static By getCancelButton(){
        return CANCEL_BUTTON;
    }
    public static By getResetPasswordButton(){
        return RESET_PASSWORD_BUTTON;
    }
    public static By getNoEmailWarningMessage(){
        return NO_EMAIL_WARNING_MESSAGE;
    }


    public static void cancelTheForget() {
        ForgottenPasswordPage.clickOnWebElement(ForgottenPasswordPage.CANCEL_BUTTON);
    }

    public static String getWarningMessage() {
        return ForgottenPasswordPage.getTextFromElement(NO_EMAIL_WARNING_MESSAGE).substring(0, 75);
    }

    public static String titleForgottenPass(){
        return ForgottenPasswordPage.getTextFromElement(TITLE_FORGOTTEN_PASS);
    }

}
