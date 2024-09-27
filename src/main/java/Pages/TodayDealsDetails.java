package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.CustomMethods;

public class TodayDealsDetails {

    private WebDriver driver;
    public TodayDealsDetails(WebDriver driver) {
        this.driver = driver;
    }


    private final By groceryFilterBtn = By.xpath("//button[@data-testid=\"filter-bubble-grocery\"]");
    private final By theRightArrow = By.xpath("//a[@id='a-autoid-1']\n");

    private final By radioButtonOfTenPercent = By.xpath("    //span[text()='Discount']//following::input[@value=\"1\"][1]\n");

    //div[@data-csa-c-element-id="filter-percentOff-10% off or more"]//preceding-sibling::input[@value='1']
    public TodayDealsDetails chooseGroceryFilter(){
        CustomMethods.click(driver,theRightArrow);
        CustomMethods.click(driver,groceryFilterBtn);
        return this;
    }

    public TodayDealsDetails selectTenPercentOffOrMore(){
        CustomMethods.click(driver,radioButtonOfTenPercent);
        return this;
    }




}
