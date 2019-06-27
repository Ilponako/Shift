package Shift.Tests;

import Shift.Pages.PageHome;
import Shift.StartClass;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestHome extends StartClass {

    @Test
    public void searchFields() throws InterruptedException {
        PageHome pageHome = PageFactory.initElements(driver, PageHome.class);
        pageHome.searchPickupField();
        pageHome.searchDropoffField("Exeter");
        Thread.sleep(4000);
        pageHome.clickselectMoveTypeBtn();

    }







}
