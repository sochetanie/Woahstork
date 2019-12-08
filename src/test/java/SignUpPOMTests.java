import Pages.HomePage;
import Pages.SignUpPOmPage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignUpPOMTests extends BaseTest {
  @Test(priority = 1)
  public void SignUpSuccessTest () {

    SignUpPOmPage signUpPOmPage = new SignUpPOmPage(driver);

    signUpPOmPage.openSignUpPage();

    signUpPOmPage.setEmailField(signUpPOmPage.getRandomEmail());

    signUpPOmPage.setPasswordField("incorrectPassword");
    signUpPOmPage.setConfirmPasswordField("incorrectPassword");
    signUpPOmPage.setZipCode("90066");

    signUpPOmPage.clickCheckboxTermsAndConditions();
    signUpPOmPage.clickCheckboxHIPAA();

    HomePage homePage = signUpPOmPage.clickToLoginButton();
    WebElement phoneNumber = signUpPOmPage.getPhoneNumberElement();
    //driver.findElement(By.cssSelector("[label=\"Your Phone Number\"]"));

    Assert.assertTrue(phoneNumber.isDisplayed());
  }

}