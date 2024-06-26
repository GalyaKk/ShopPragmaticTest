import Admin.DashboardPage;
import Admin.ForgottenPasswordPage;
import Admin.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest{

    @Test
    public void loginAsAdmin() {
        LoginPage.openLoginPage();
        Assert.assertEquals(LoginPage.inputWindowTitle(), "Please enter your login details.");
        LoginPage.typeIntoUsernameField("admin");
        LoginPage.typeIntoPasswordField("parola123!");
        LoginPage.clickOnWebElement(LoginPage.getLoginButton());
        Assert.assertEquals(DashboardPage.getHeaderText(), "Dashboard");
    }

    @Test
    public void forgottenPassword() {
        LoginPage.openLoginPage();
        LoginPage.clickOnWebElement(LoginPage.getForgottenPassLink());
        Assert.assertEquals(ForgottenPasswordPage.titleForgottenPass(), "Forgot Your Password?");
    }



}
