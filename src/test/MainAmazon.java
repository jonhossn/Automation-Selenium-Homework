package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.sql.SQLOutput;

public class MainAmazon {// TEST CASE # 1

    // TEST CASE ONE
    public WebDriver myDriver;


    //TEST CASE # ( Todays Deals)

    public void todaysDeal() throws InterruptedException {
        String todaysDeals = "//*[@id=\"nav-xshop\"]/a[3]";
        String expectedTodaysDeals = "Today's Deals";
        String actualTodaysDeals = "//*[@id=\"gbox-item-0.0.0\"]/div/div/div[1]/h1/div[1]";
        myDriver.findElement(By.xpath(todaysDeals)).click();
        System.out.println(expectedTodaysDeals);
        Thread.sleep(3000);
    }
    // TEST CASE# 1 ( Best Sellers)

    public void bestSellers() throws InterruptedException {
        String bestSellers = "//*[@id=\"nav-xshop\"]/a[1]";
        String expectedBestSellers = "Amazon Best Sellers";
        String actualBestSellers = "//*[@id=\"zg_banner_text_wrapper\"]";
        myDriver.findElement(By.xpath(bestSellers)).click();
        System.out.println(expectedBestSellers);
        Thread.sleep(3000);
    }

    //TEST CASE#2

    @BeforeMethod
    public void lounchBrowser() {
        System.out.println("WELCOME TO AMAZON TESTING PAGE  ");
        String chromeDriver = "webdriver.chrome.driver";
        String chromePath = "lib/browserDriver/chromedriver.exe";
        System.setProperty(chromeDriver, chromePath);
        myDriver = new ChromeDriver();
        String url = "https://www.amazon.com/";
        myDriver.get(url);

    }

//        public void setupInfo( String driverUrl,String driverPath,String url) {
//            System.setProperty(driverUrl,driverPath);
//            myDriver=new ChromeDriver();
//            myDriver.get(url);
//        }

    public void customerService() throws InterruptedException {
        String customerService = "//*[@id=\"nav-xshop\"]/a[2]";
        String expectedCustomerService = "Hello. What can we help you with?";
        String actualCustomerService = "/html/body/div[2]/div[1]/h1";
        myDriver.findElement(By.xpath(customerService)).click();
        System.out.println(expectedCustomerService);
        // Assert.assertEquals(actualCustomerService,expectedCustomerService);
        Thread.sleep(3000);
    }

    @AfterMethod
    public void closingWebdriver() {
        myDriver.close();
    }


    //TEST CASE# 3
    public void newRelease() throws InterruptedException {
        String newReleases = "//*[@id=\"nav-xshop\"]/a[4]";
        String expectedNewReleases = "Hello. What can we help you with?";
        String actualNewRelease = "/html/body/div[2]/div[1]/h1";
        myDriver.findElement(By.xpath(newReleases)).click();
        System.out.println(expectedNewReleases);
        Thread.sleep(3000);

    }

    public void findGift() throws InterruptedException {
        String findGift = " //*[@id=\"nav-xshop\"]/a[5]";
        String expectedFindGift = "Gifts for Everyone";
        String actualFindGift = "//*[@id=\"notification-provider\"]/div/div/div[3]/h2";
        myDriver.findElement(By.xpath(findGift)).click();
        System.out.println(findGift);
        Thread.sleep(3000);

    }
    public void wholeFood() throws InterruptedException {
        String wholeFood = " //*[@id=\"nav-xshop\"]/a[6]";
        String expectedWholeFood= "Gifts for Everyone";
        String actualWholeFood = "//*[@id=\"nav-subnav\"]/a[1]/span[1]/img";
        myDriver.findElement(By.xpath(wholeFood)).click();
        System.out.println(wholeFood);
        Thread.sleep(3000);
    }
    public void giftCard() throws InterruptedException {
        String giftCard = " //*[@id=\"nav-xshop\"]/a[7]";
        String expectedGiftCard= "Gifts Cards";
        String actualGiftCard = "//*[@id=\"contentGrid_889818\"]/div/div/div/div/div/img";
        myDriver.findElement(By.xpath(giftCard)).click();
        System.out.println(giftCard);
        Thread.sleep(3000);
    }
    public void freeShipping() throws InterruptedException {
        String freeShipping = " //*[@id=\"nav-xshop\"]/a[8]";
        String expectedFreeShipping= "FREE Shipping By Amazon";
        String actualFreeShipping = "//*[@id=\"contentGrid_200052\"]/div/div[1]/div/div/div/img";
        myDriver.findElement(By.xpath(freeShipping)).click();
        System.out.println(freeShipping);
        Thread.sleep(3000);
    }

}