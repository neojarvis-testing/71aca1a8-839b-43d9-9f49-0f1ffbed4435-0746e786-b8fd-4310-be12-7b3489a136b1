package pages;

import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;

import uistore.ShopSportsLocators;
import utils.Base;
import utils.Screenshot;
import utils.WebDriverHelper;

public class ShopSportsPage {
    ExtentTest test;
    WebDriverHelper helper;
    public ShopSportsPage(ExtentTest test){
        helper=new WebDriverHelper(Base.driver, test);
    }
    /*
     * a. Method Name: hoverOnRacketSports
     * b. Author Name: Muralidhar
     * c. Description: This will be used to hover on Racket Sports.
     * d. Parameter: None
     * e. Return Type: void
     */
    public void hoverOnRacketSports(){
        
        helper.hoverOverElement(ShopSportsLocators.racketSport, "Hovered On Racket Sports");
    }
    /*
     * a. Method Name: clickonShopSportswear
     * b. Author Name: Muralidhar
     * c. Description: This will be used to Clicked on shopsportswear.
     * d. Parameter: None
     * e. Return Type: void
     */
    public void clickonShopSportswear(){
        helper.clickOnElement(ShopSportsLocators.sportswear, "Clicked on shopSportsWear");
    }
    /*
     * a. Method Name: verifyURLClothing
     * b. Author Name: Muralidhar
     * c. Description: This will be used to VerifyURL of clothing.
     * d. Parameter: None
     * e. Return Type: void
     */
    public void verifyURLClothing(){
        String data= Base.driver.getCurrentUrl();
        try {
            Assert.assertTrue(data.contains("buy-clothing-online-india"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    /*
     * a. Method Name: verifyClothing
     * b. Author Name: Muralidhar
     * c. Description: This will be used to Verify the text clothing.
     * d. Parameter: None
     * e. Return Type: void
     */
    public void verifyClothing(){
        try {
            String data=helper.getText(ShopSportsLocators.clothing, "Verified Clothing");
            Assert.assertEquals(data, "CLOTHING");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    /*
     * a. Method Name: clickonListView
     * b. Author Name: Muralidhar
     * c. Description: This will be used to Click on ListView.
     * d. Parameter: None
     * e. Return Type: void
     */
    public void clickonListView(){
        helper.clickOnElement(ShopSportsLocators.ListByView,"Clicked on ListView");
    }
        /*
        * a. Method Name: clickonComapre1
        * b. Author Name: Muralidhar
        * c. Description: This will be used to Click on Comapre 1st product.
        * d. Parameter: None
        * e. Return Type: void
        */
    public void clickonCompare1(){
        helper.clickOnElement(ShopSportsLocators.compare, "Clicked On Compare product 1");
    }
    /*
     * a. Method Name: verifyYouaddedproducttothecomparisonlist
     * b. Author Name: Muralidhar
     * c. Description: This will be used to Verify the products.
     * d. Parameter: None
     * e. Return Type: void
     */
    public void verifyYouaddedproducttothecomparisonlist(){
        try {
            String data=helper.getText(ShopSportsLocators.youaddedproducttocomparison, "Verified");
            Assert.assertTrue(data.contains("YOU ADDED PRODUCT"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    /*
     * a. Method Name: clickonCompare2
     * b. Author Name: Muralidhar
     * c. Description: This will be used to Click on Comapre 2nd product.
     * d. Parameter: None
     * e. Return Type: void
     */
    public void clickonCompare2(){
        helper.clickOnElement(ShopSportsLocators.compare2, "Clicked On Compare Product 2");
    }
    /*
     * a. Method Name: verifyComapre2
     * b. Author Name: Muralidhar
     * c. Description: This will be used to Verify comapre 2nd product.
     * d. Parameter: None
     * e. Return Type: void
     */
    public void verifyComapre2(){
        try {
            String data=helper.getText(ShopSportsLocators.youaddedproducttocomparison2, "Verified");
            Assert.assertTrue(data.contains("YOU ADDED PRODUCT"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    /*
     * a. Method Name: clickonCompareProductList
     * b. Author Name: Muralidhar
     * c. Description: This will be used to click on compare productlist.
     * d. Parameter: None
     * e. Return Type: void
     */
    public void clickonCompareProductList(){
        helper.clickOnElement(ShopSportsLocators.compareList, "Clicked On compare Products");
    }
    /*
     * a. Method Name: verifyCompareProducts
     * b. Author Name: Muralidhar
     * c. Description: This will be used to VerifyCompare products.
     * d. Parameter: None
     * e. Return Type: void
     */
    public void verifyCompareProducts(){
        try {
            String data=helper.getText(ShopSportsLocators.compareProducts, "Verified");
            Assert.assertTrue(data.contains("COMPARE PRODUCTS"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    /*
     * a. Method Name: clickonX1
     * b. Author Name: Muralidhar
     * c. Description: This will be used to Click on x of first product.
     * d. Parameter: None
     * e. Return Type: void
     */
    public void clickOnX1(){
        helper.clickOnElement(ShopSportsLocators.secondX, "Clicked On X1");
    }
    /*
     * a. Method Name: clickonOK1
     * b. Author Name: Muralidhar
     * c. Description: This will be used to Click on ok of first product.
     * d. Parameter: None
     * e. Return Type: void
     */
    public void clickOnOK1(){
        helper.clickOnElement(ShopSportsLocators.ok, "Clicked On ok1");
    }
    /*
     * a. Method Name: verifyOK1
     * b. Author Name: Muralidhar
     * c. Description: This will be used to Verify remove of first product.
     * d. Parameter: None
     * e. Return Type: void
     */
    public void verifyOk1(){
        try {
            String data=helper.getText(ShopSportsLocators.nolongerlisted, "Verified");
            Assert.assertTrue(data.contains("YOU REMOVED PRODUCT"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    /*
     * a. Method Name: clickonX2
     * b. Author Name: Muralidhar
     * c. Description: This will be used to Click on x of second product.
     * d. Parameter: None
     * e. Return Type: void
     */
    public void clickOnx2(){
        helper.clickOnElement(ShopSportsLocators.secondX, "Clicked on ok2");
    }
    /*
     * a. Method Name: clickonOK2
     * b. Author Name: Muralidhar
     * c. Description: This will be used to Click on ok of second product.
     * d. Parameter: None
     * e. Return Type: void
     */
    public void clickOnOk2(){
        helper.clickOnElement(ShopSportsLocators.ok2, "Clicked On ok2");
    }
    /*
     * a. Method Name: verifyOK2
     * b. Author Name: Muralidhar
     * c. Description: This will be used to Verify remove of second product.
     * d. Parameter: None
     * e. Return Type: void
     */
    public void verifyOK2(){
        try {
            String data=helper.getText(ShopSportsLocators.nolongerlisted2, "Verified");
            Assert.assertTrue(data.contains("YOU REMOVED PRODUCT"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    /*
     * a. Method Name: verifyMessage
     * b. Author Name: Muralidhar
     * c. Description: This will be used to Verify text.
     * d. Parameter: None
     * e. Return Type: void
     */
    public void verifyMessage(){
        try {
            String data=helper.getText(ShopSportsLocators.noproductslisted, "Verified");
            Assert.assertTrue(data.contains("YOU HAVE NO ITEMS"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        Screenshot.captureScreenShot("NO items");
    }
    /*
     * a. Method Name: testcase3
     * b. Author Name: Muralidhar
     * c. Description: It contains all the methods.
     * d. Parameter: None
     * e. Return Type: void
     */
    public void testcase3(){
        hoverOnRacketSports();
        clickonShopSportswear();
        verifyURLClothing();
        clickonListView();
        clickonCompare1();
        verifyYouaddedproducttothecomparisonlist();
        clickonCompare2();
        verifyComapre2();
        clickonCompareProductList();
        verifyCompareProducts();
        clickOnX1();
        clickOnOK1();
        verifyOk1();
        clickOnx2();
        clickOnOk2();
        verifyOK2();
        verifyMessage();
    }


}
