import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class BaseTest {
  WebDriver driver;
  WebDriverWait driverWait;

  @BeforeMethod
  public void setUp() {
    driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
//    driverWait = new WebDriverWait(driver,5);
  }

  @AfterMethod
  public void tearDown() {
    driver.quit();
  }
}
