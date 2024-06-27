import Admin.DashboardPage;
import Admin.ForgottenPasswordPage;
import Admin.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest{

    @Test
    public void loginAsAdmin() {
        LoginPage.openLoginPage();
        Assert.assertEquals(LoginPage.getInputWindowTitle(), "Please enter your login details.");
        LoginPage.typeIntoUsernameField();
        LoginPage.typeIntoPasswordField();
        LoginPage.clickOnLoginButton();
        Assert.assertEquals(DashboardPage.getHeaderText(), "Dashboard");
    }

    @Test
    public void forgottenPassword() {
        LoginPage.openLoginPage();
        LoginPage.clickOnForgottenPasswordLink();
        Assert.assertEquals(ForgottenPasswordPage.getTitleForgottenPass(), "Forgot Your Password?");
    }



}
