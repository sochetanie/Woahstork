package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.Timestamp;

public class SignUpPage {
  WebDriver driver;
  WebDriverWait wait;

  public SignUpPage(WebDriver myDriver) {
    driver = myDriver;
    PageFactory.initElements(myDriver, this);
  }


  public SignUpPage openSignUpPage() {
    driver.get("https://test.woahstork.com/register");
    return this;
  }

  @FindBy(css = "[class='styled__CheckboxWrapper-sc-1x07d2p-2 cjrWjQ'] [class*='ws-checkbox']")
  private WebElement checkboxForTermsAndConditions;
  public SignUpPage clickCheckboxTermsAndConditions() {
    checkboxForTermsAndConditions.click();
    return this;
  }

  @FindBy(css = "[class='styled__CheckboxWrapper-sc-1x07d2p-2 cIPcIz'] [class*='ws-checkbox']")
  private WebElement checkboxHIPAA;
  public SignUpPage clickCheckboxHIPAA() {
    checkboxHIPAA.click();
    return this;
  }

  @FindBy(css = "[label='Your Phone Number']")
  public WebElement phoneNumberElement;
//  public WebElement getPhoneNumberElement() {
//    return findElement("[label='Your Phone Number']");
//  }

  public String getRandomEmail() {
    Timestamp timestamp = new Timestamp(System.currentTimeMillis());
    return timestamp.getTime() + "@gmail.com";
  }

  public void clickToLoginButton() {
    ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,500)");
    WebElement login_button = findButtonByText("Sign Up");
    login_button.click();
//    return new HomePage(driver);
  }

  @FindBy(css = "[placeholder='Email']")
  private WebElement emailField;
  public void setEmailField(String email) {
    emailField.sendKeys(email);
  }

  @FindBy(css = "[placeholder='Password']")
  private WebElement passwordField;
  public void setPasswordField(String password) {
    passwordField.sendKeys(password);
  }

  @FindBy(css = "[placeholder='Confirm Password']")
  private WebElement confPasswordField;
  public void setConfirmPasswordField(String password) {
    confPasswordField.sendKeys(password);
  }

  @FindBy(css = "[placeholder='Zipcode']")
  private WebElement zip;
  public void setZipCode(String zipcode) {
    zip.sendKeys(zipcode);
  }

  public WebElement findButtonByText(String textOfTheButton) {
    return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='" + textOfTheButton + "']")));
  }


}
