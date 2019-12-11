package Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.concurrent.TimeUnit;

public class LoginPage extends BasePage {

  public LoginPage(WebDriver myDriver) {
    super(myDriver);
  }

  public void openRegisterPage() {
    driver.get("https://test.woahstork.com/register");
  }

  public void clickAlreadyHaveAnAccount() {
    WebElement link = findElement("[class*='styled__Bottom']");
    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true)", link);
    findElement("//button[contains(text(),'Got it!')]").click();
    findElement("//a[contains(text(),'Already have an account')]").click();
  }

  public void setEmail(String email) {
    WebElement emailField = findElementByXPath("(//input[@placeholder='Email'])[2]");
    emailField.sendKeys(email);
  }

  public void setPassword(String password) {
    WebElement passwordField = findElementByXPath("(//input[@placeholder='Password'])[2]");
    passwordField.sendKeys(password);
  }

  public void clickLoginButton() {
    WebElement loginButton = findElementByXPath("//button[contains(text(),'Log In')]");
    loginButton.click();
  }

}
