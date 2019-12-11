package Pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.codeborne.selenide.WebDriverRunner;

import static com.codeborne.selenide.Selenide.$;


public class PLPPage {
  WebDriver driver;

  public PLPPage(WebDriver myDriver) {
    driver = myDriver;
    PageFactory.initElements(myDriver, this);
//    WebDriverRunner.setWebDriver(myDriver);
  }

//  SelenideElement checkoutElement = $("[class*='ButtonWrapper'] a");
  @FindBy(css = "[class*='ButtonWrapper'] a")
  private WebElement checkoutElement;
  public String getCheckoutButtonLabel() {
    return checkoutElement.getText();
  }

//  SelenideElement cartButton = $("[class*='CartButton']");
  @FindBy(css = "[class*='CartButton']")
  private WebElement cartButton;
  public PLPPage clickCarButton() {
    cartButton.click();
    return this;
  }

  public PLPPage openPLPPage() {
    driver.get("https://test.woahstork.com/cbdmarketplace");
    return this;
  }

}
