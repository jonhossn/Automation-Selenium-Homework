package test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AmazonTestPage extends MainAmazon {


    @Test
    public void testCustomerService() throws InterruptedException {
        customerService();
    }
    @Test
    public void testBestSellers() throws InterruptedException {
       bestSellers();
    }
    @Test
    public void testNewRelease() throws InterruptedException {
        newRelease();
}
    @Test
    public void testTodaysDeal() throws InterruptedException {
        todaysDeal();
    }
    @Test
    public void testFindGift() throws InterruptedException {
    findGift();    }

    @Test
    public void testWholeFood() throws InterruptedException {
        wholeFood();    }
    @Test
    public void testGiftCard() throws InterruptedException {
    giftCard();}
    @Test
    public void testFreeShipping() throws InterruptedException {
        freeShipping();}

}
