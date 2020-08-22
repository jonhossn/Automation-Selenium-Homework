package homepage;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class SearchBox_Old {


//  #Search box functionality test: Pass
//    Open Chrome browser: Pass
//    Enter amazon url in address bar and hit enter: Pass
//    Click on search box: Pass
//    Enter Hand sanitizer: Pass
//    Click on search button: pass
//    Verify Hand sanitizer is displayed properly: Pass
//    ExpectedResult: Hand sanitizer should display properly
//    ActualResult: Hand sanitizer display properly


    public static void main(String[] args) throws InterruptedException {

        String chromeDriver="webdriver.chrome.driver";
        String chromeDriverPath="lib/browserDriver/chromedriver.exe";
        String url="https://www.amazon.com/";
        String searchBox="//*[@id=\"twotabsearchtextbox\"]";
        String productSearch="Hand sanitizer";
        String searchButton="//*[@id=\"nav-search\"]/form/div[2]/div/input";
        String handSanitizerActualText="//*[@id=\"search\"]/div[1]/div[2]/div/span[3]/div[2]/div[7]/div/span/div/div/div[2]/h2/a/span";
        String expectedText="6-pack myDerm Hand Sanitizer with Aloe - 62% Alcohol kills 99.9% of germs";

        // Open Chrome Browser

        // For Chrome Browser
        System.setProperty(chromeDriver,chromeDriverPath);
        WebDriver driver=new ChromeDriver();
        // For FireFox
       // System.setProperty("webdriver.gecko.driver","lib/browserDriver/geckodriver.exe");
       // WebDriver driver=new FirefoxDriver();
        //driver.manage().window().fullscreen();
       // driver.navigate().to("https://www.amazon.com/");

        // Enter amazon url in address bar and hit enter
        driver.get(url);

        //Click on search box and Enter Hand sanitizer
        driver.findElement(By.xpath(searchBox)).sendKeys(productSearch);
        //Click on search button
        driver.findElement(By.xpath(searchButton)).click();
        Thread.sleep(8000);
        // Verify Hand sanitizer is displayed properly
        String actualText=driver.findElement(By.xpath(handSanitizerActualText)).getText();
        Assert.assertEquals(actualText,expectedText);

        driver.close();



    }






}
