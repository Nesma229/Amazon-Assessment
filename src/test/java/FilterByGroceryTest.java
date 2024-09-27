import org.testng.Assert;
import org.testng.annotations.Test;

public class FilterByGroceryTest extends BaseTest{


    @Test
    public void chooseGroceryFilterTest() throws InterruptedException {

                homePage.clickTodayDealsBtn()
                        .chooseGroceryFilter()
                        .selectTenPercentOffOrMore();


    }

}
