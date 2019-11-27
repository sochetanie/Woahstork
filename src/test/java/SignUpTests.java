import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.sql.Timestamp;

public class SignUpTests extends  BaseTest {



    @Test(priority = 1)
    public void SignUpSuccessTest () {

        openSignUpPage();

        setEmailField(getRandomEmail());

        setPasswordField("incorrectPassword");
        setConfirmPasswordField("incorrectPassword");
        setZipCode("90066");

        clickCheckboxTermsAndConditions();
        clickCheckboxHIPAA();

        clickToLoginButton();

        WebElement phoneNumber = getphoneNumberElement(); //driver.findElement(By.cssSelector("[label=\"Your Phone Number\"]"));

        Assert.assertTrue(phoneNumber.isDisplayed());

    }

    public void openSignUpPage() {

         driver.get("https://test.woahstork.com/register");
    }

    public void clickCheckboxTermsAndConditions() {

        findElement("[class='styled__CheckboxWrapper-sc-1x07d2p-2 cjrWjQ'] [class*='ws-checkbox']").click();
    }

    public void clickCheckboxHIPAA() {

        findElement("[class='styled__CheckboxWrapper-sc-1x07d2p-2 cIPcIz'] [class*='ws-checkbox']").click();
    }

    public WebElement getphoneNumberElement() {

        return findElement("[label='Your Phone Number']");
    }

    public String getRandomEmail() {
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        return timestamp.getTime() + "@gmail.com";

    }

    public void clickToLoginButton(){
        WebElement login_button = findButtonByText("Sign Up");
        login_button.click();
    }

    public void setEmailField(String email){
        WebElement emailField = findElement("[placeholder='Email']");
        emailField.sendKeys(email);
    }

    public void setPasswordField(String password){
        WebElement passwordField = findElement("[placeholder='Password']");
        passwordField.sendKeys(password);
    }

    public void setConfirmPasswordField(String password){
        WebElement passwordField = findElement("[placeholder='Confirm Password']");
        passwordField.sendKeys(password);
    }

    public void setZipCode(String zipcode){
        WebElement zip = findElement("[placeholder='Zipcode']");
        zip.sendKeys(zipcode);
    }

    public WebElement findButtonByText(String textOfTheButton) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='" + textOfTheButton + "']")));
    }


    public WebElement findElement(String cssLocator) {
        return wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(cssLocator)));
    }



}
