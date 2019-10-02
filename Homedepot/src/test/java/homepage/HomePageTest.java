package homepage;

import common.CommonAPI;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HomePageTest extends CommonAPI {
    @Test
    public void test1() throws InterruptedException {
        clickByXpath("//input[@id='headerSearch']");
        typeByXpath("//input[@id='headerSearch']","chair");
         clickByXpath("//*[@class='SearchBox__buttonIcon']");
         Thread.sleep(3000);

    }
}
