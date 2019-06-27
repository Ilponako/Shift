package Shift.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageHome {

    WebDriver driver;
    public PageHome (WebDriver driver){
        this.driver=driver;
    }

    @FindBy (xpath = "//input[@id='pickup_input']")
    private WebElement pickupField;
    @FindBy (xpath = "//input[@id='dropoff_input']") //ye так икспасс неправильный
    private  WebElement dropoffField;
    @FindBy(xpath = "//div[text() = 'Select Move Type ']")
    private WebElement selectMoveTypeBtn;

    public void searchPickupField() throws InterruptedException {
//        Thread.sleep(10000);
        WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='pickup_input']")));
        pickupField.click();
        pickupField.sendKeys("london");
    }
    public void searchDropoffField (String dropoff){
        WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='dropoff_input']")));
        dropoffField.click();
        dropoffField.sendKeys(dropoff);
    }
    public void clickselectMoveTypeBtn(){
        selectMoveTypeBtn.click();
    }

}
