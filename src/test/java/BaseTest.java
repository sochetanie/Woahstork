import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BaseTest {
  protected WebDriver driver;
  protected WebDriverWait driverWait;

//  @BeforeMethod
//  public void setUp() {
//    driver = new ChromeDriver();
//    driver.manage().window().maximize();
//    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//    driverWait = new WebDriverWait(driver,10);
//  }

  @BeforeMethod
  public void beforeMethodSetup() throws MalformedURLException {
    String nodeURL = "http://localhost:4444/";
    DesiredCapabilities caps = DesiredCapabilities.chrome();
//        caps.setBrowserName("chrome");
//        caps.setPlatform(Platform.MAC);
    driver = new RemoteWebDriver(new URL(nodeURL), caps);
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driverWait = new WebDriverWait(driver,4);
  }


  @AfterMethod
  public void tearDown() {
    driver.quit();
  }
}
