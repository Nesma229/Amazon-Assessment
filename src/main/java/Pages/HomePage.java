package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.CustomMethods;

public class HomePage {

    private WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    private final By firstItem = By.xpath("//a[@aria-label='Cooker']");
    private final  By todaydealsBtn = By.xpath("//a[@href=\"/gp/goldbox?ref_=nav_cs_gb\"]");

    public CookerResultsPage clickFirstItem(){
        CustomMethods.click(driver,firstItem);
        return new CookerResultsPage(driver);
    }

    public TodayDealsDetails clickTodayDealsBtn(){
        CustomMethods.click(driver,todaydealsBtn);
        return new TodayDealsDetails(driver);
    }



}
