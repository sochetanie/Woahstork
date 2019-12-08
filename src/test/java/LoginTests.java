import Pages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends  BaseTest{

  @Test()
  public void loginSuccessTest() {
    LoginPage loginPage = new LoginPage(driver);

    loginPage.openRegisterPage();
    loginPage.clickAlreadyHaveAnAccount();

    loginPage.setEmail("alla.gorik2901@gmail.com");
    loginPage.setPassword("SomeTest123");
    loginPage.clickLoginButton();

    ///
  }

//  @Test()
//  public void loginWrongCredentials() {
//    LoginPage loginPage = new LoginPage(driver);
//
//    loginPage.openRegisterPage();
//    loginPage.clickAlreadyHaveAnAccount();
//
//    loginPage.setEmail("alla.gorik@gmail.com");
//    loginPage.setPassword("SomeTestXXX");
//    loginPage.clickLoginButton();
//
//    WebElement alertMessage = driver.findElement(By.cssSelector("//div[contains(text(),'does not match')]"));
////    Assert.assertEquals(alertMessage.getText(), "The email and password you provided does not match our records.");
//
//    Assert.assertTrue(alertMessage.isDisplayed());
//  }

}
