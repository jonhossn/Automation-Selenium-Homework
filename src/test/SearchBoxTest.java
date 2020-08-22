package test;

import homepage.SearchBox;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchBoxTest extends SearchBox {

    // BeforeMethod
    // Test Method
    // AfterMethod

    // Test case method
    @Test
    public void testSearchBoxCheck() throws InterruptedException {
        searchBoxCheck();
        //Thread.sleep(8000);
        // Verify Hand sanitizer is displayed properly
        String actualText = driver.findElement(By.xpath(handSanitizerActualText)).getText();
        Assert.assertEquals(actualText, expectedText);
//        driver.findElement(By.id("kjdkfjdlkfdds"));
//        driver.findElement(By.name("kjdkfjdlkfdds"));
//        driver.findElement(By.className("kjdkfjdlkfdds"));
//        driver.findElement(By.tagName("kjdkfjdlkfdds"));
//        driver.findElement(By.xpath("kjdkfjdlkfdds"));
//        driver.findElement(By.cssSelector("kjdkfjdlkfdds"));
//        driver.findElement(By.linkText("kjdkfjdlkfdds"));
//        driver.findElement(By.partialLinkText("kjdkfjdlkfdds"));

    }


}
