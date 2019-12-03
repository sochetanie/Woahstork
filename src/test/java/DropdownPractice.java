import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DropdownPractice extends BaseTest {

  @Test()
  public void advancedTechniques() {
    driver.get("https://learn.woahstork.com/category/cannabis-science/");
    Actions actions = new Actions(driver);

    WebElement disordersDropDown = driver.findElement(By.xpath("//*[@id='menu-item-2616']//a[text()='Disorders']"));
    WebElement anxiety = driver.findElement(By.xpath("//*[@id='menu-item-2616']//a[text()='Anxiety']"));

    actions.moveToElement(disordersDropDown).moveToElement(anxiety).click().build().perform();

    String title = driver.findElement(By.xpath("//h1[@class='page-title']")).getText();
    Assert.assertEquals(title, "Anxiety");
  }

}


