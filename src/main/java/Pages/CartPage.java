package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.CustomMethods;

public class CartPage {

    private WebDriver driver;
    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    private final By txtOfSubTotal = By.xpath("//span[@id='sc-subtotal-label-activecart']\n");


    public String textOfSubTotal() throws InterruptedException {
      return CustomMethods.findElementVisible(driver,txtOfSubTotal).getText();

    }




}
