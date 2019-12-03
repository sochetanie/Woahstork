import Pages.LoginPage;
import org.testng.annotations.Test;

public class LoginTests extends  BaseTest{

  @Test(priority = 1)

  public void LoginSuccessTest() {
    LoginPage loginPage = new LoginPage(driver);

    loginPage.openRegisterPage();
    loginPage.clickAlreadyHaveAnAccount();
  }
}
