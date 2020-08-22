package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class LearnTesting {
    public static void main(String[] args) throws InterruptedException {
        // go to web browser
        //go to amazon
        // go to searchbox ans rearch for product
        //hit search
        // find the product

        String chromeDriver="webdriver.chrome.driver";
        String chromeDriverPath="lib/browserDriver/chromedriver.exe";
        String url="https://www.amazon.com/";
        String searchBox="//*[@id=\"twotabsearchtextbox\"]";
        String productName="iphone 11 case";
        String searchButton="//*[@id=\"nav-search-submit-text\"]/input";
        String expectedText="Spigen Ultra Hybrid Designed for Apple iPhone 11 Case (2019) - Matte Black";
        String iphoneCaseActual="//*[@id=\"search\"]/div[1]/div/div[1]/div/span[3]/div[2]/div[8]/div/span/div/div/div[2]/h2/a/span";


        System.setProperty(chromeDriver,chromeDriverPath);
        WebDriver driver= new ChromeDriver();
        driver.get(url);
        driver.findElement(By.xpath(searchBox)).sendKeys(productName);
        driver.findElement(By.xpath(searchButton)).click();
        Thread.sleep(3000);

        String actualText=driver.findElement(By.xpath(iphoneCaseActual)).getText();
        Assert.assertEquals(actualText,expectedText);
        Thread.sleep(3000);
        driver.close();



    }
}
