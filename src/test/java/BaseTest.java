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

  public static final String USERNAME = "alla.g.";
  public static final String ACCESS_KEY = "67bd6c0c-1768-4774-a2c6-799ee70f799c";
  public static final String URL = "http://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:80/wd/hub";

//  @BeforeMethod
//  public void setUp() throws MalformedURLException {
//    DesiredCapabilities caps = DesiredCapabilities.safari();
//    caps.setCapability("platform", Platform.WIN10);
//    caps.setCapability("version", "77.0");
//
//    driver = new RemoteWebDriver(new URL(URL), caps);
//
//    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//    driver.manage().window().maximize();
//    driverWait = new WebDriverWait(driver,10);
//  }


  @BeforeMethod
  public void setUp() {
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driverWait = new WebDriverWait(driver,10);
  }

//  @BeforeMethod
//  public void beforeMethodSetup() throws MalformedURLException {
//    String nodeURL = "http://localhost:4444/";
//    DesiredCapabilities caps = DesiredCapabilities.safari();
////        caps.setBrowserName("chrome");
////        caps.setPlatform(Platform.MAC);
//    driver = new RemoteWebDriver(new URL(nodeURL), caps);
//    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//    driverWait = new WebDriverWait(driver,4);
//    driver.manage().window().maximize();
//  }


  @AfterMethod
  public void tearDown() {
    driver.quit();
  }
}
