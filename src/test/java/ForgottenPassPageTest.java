import Admin.ForgottenPasswordPage;
import Admin.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ForgottenPassPageTest extends BaseTest{

    LoginPageTest loginPageTest = new LoginPageTest();

    @Test
    public void forgottenPasswordCancel(){
        loginPageTest.forgottenPassword();
        ForgottenPasswordPage.cancelTheForget();
        Assert.assertEquals(LoginPage.inputWindowTitle(), "Please enter your login details.");
    }

    @Test
    public void forgottenPasswordResetWithoutEmail(){
        loginPageTest.forgottenPassword();
        ForgottenPasswordPage.clickOnWebElement(ForgottenPasswordPage.getResetPasswordButton());
        Assert.assertEquals(ForgottenPasswordPage.getWarningMessage(),"Warning: The E-Mail Address was not found in our records, please try again!");
    }

}
