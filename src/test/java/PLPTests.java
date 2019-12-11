import Pages.PLPPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PLPTests extends BaseTest {

  @Test
  public void SignUpSuccessTest() {
    String checkoutButtonLabel = new PLPPage(driver)
        .openPLPPage()
        .clickCarButton()
        .getCheckoutButtonLabel();

    Assert.assertEquals(checkoutButtonLabel, "CHECKOUT");
  }

}
