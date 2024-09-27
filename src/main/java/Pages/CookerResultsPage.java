package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.CustomMethods;

public class CookerResultsPage {

    private WebDriver driver;

    public CookerResultsPage(WebDriver driver){
        this.driver = driver;
    }

    private final By addItemToCartBtn = By.xpath("//button[text()='Add to cart']");
    private final By navCartBtn = By.xpath("//a[@id='nav-cart']");


    public CookerResultsPage addItemToCart() throws InterruptedException {
        CustomMethods.click(driver,addItemToCartBtn);
        Thread.sleep(5000);
        return this;
    }




    public CartPage clickNavCartBtn(){
        CustomMethods.click(driver, navCartBtn);
        return new CartPage(driver);
    }

}
