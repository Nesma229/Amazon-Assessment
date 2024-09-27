import org.testng.Assert;
import org.testng.annotations.Test;

public class AddItemToTheCartTest extends BaseTest{



    @Test
    public void validateAddItemToTheCart() throws InterruptedException {

         Assert.assertTrue(
        homePage.clickFirstItem()
                .addItemToCart()
                .clickNavCartBtn()
                .textOfSubTotal()
                      .contains("1 item"));

    }

}
