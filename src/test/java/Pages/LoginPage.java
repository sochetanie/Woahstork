package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BasePage {

  public LoginPage(WebDriver myDriver) {
    super(myDriver);
  }

  public void openRegisterPage() {
    driver.get("https://test.woahstork.com/register");
  }

  public void clickAlreadyHaveAnAccount() {
    findElement("[class*='styled__Bottom']").click();
  }

  public void setEmail(String email) {
    WebElement emailField = findElement("[placeholder='Email']");
    emailField.sendKeys(email);
  }

  public void setPassword(String password) {
    WebElement passwordField = findElement("[placeholder='Password']");
    passwordField.sendKeys(password);
  }

  public void clickToLoginButton() {
    WebElement login_button = findButtonByText("Sign Up");
    login_button.click();
  }


  public void setConfirmPasswordField(String password) {
    WebElement passwordField = findElement("[placeholder='Confirm Password']");
    passwordField.sendKeys(password);
  }

  public void setZipCode(String zipcode) {
    WebElement zip = findElement("[placeholder='Zipcode']");
    zip.sendKeys(zipcode);
  }

  public WebElement findButtonByText(String textOfTheButton) {
    return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='" + textOfTheButton + "']")));
  }


}
