import Pages.HomePage;
import Pages.SignUpPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignUpTests extends BaseTest {

  @Test(priority = 1)
  public void SignUpSuccessTest() {
    SignUpPage signUpPage = new SignUpPage(driver);
    signUpPage.openSignUpPage().setEmailField(signUpPage.getRandomEmail());
    signUpPage.setPasswordField("incorrectPassword");
    signUpPage.setConfirmPasswordField("incorrectPassword");
    signUpPage.setZipCode("90066");
    signUpPage
        .clickCheckboxTermsAndConditions()
        .clickCheckboxHIPAA()
        .clickToLoginButton();

//        signUpPage.clickToLoginButton();
//    HomePage homePage = signUpPage.clickToLoginButton();
//        WebElement phoneNumber = signUpPage.getPhoneNumberElement();
    //driver.findElement(By.cssSelector("[label=\"Your Phone Number\"]"));
    Assert.assertTrue(signUpPage.phoneNumberElement.isDisplayed());
  }


}
