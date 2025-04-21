package runner;
 
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
 
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import pages.SportsJamMensShoesPage;
import pages.SportsJamPumaWomenSportsPage;
import utils.Base;
import utils.Reporter;
import utils.Screenshot;
 
public class TestSportsJam extends Base{
    public static ExtentReports report;
 
    /*
     * a. MethodName: generate
     * b. AuthorName: Sharath
     * c. Description: This is used in creating a HTML report before running all the testCases.
     * d. Parameters: None
     * e. Return Type: None
     */
    @BeforeClass
    public void generate(){
         report = Reporter.generateReport("SPORT_JAM_Report");
    }
 
    /*
     * a. MethodName: open
     * b. AuthorName: Sharath
     * c. Description: This is used in opening the browser Interfaces
     * d. Parameters: None
     * e. Return Type: None
     */
    @BeforeMethod
    public void open(){
        openBrowser();
    }
 
    /*
     * a. MethodName: SportsJamWomenSportsCase
     * b. AuthorName: Sharath
     * c. Description: This is used to run the tests of the pages.
     * d. Parameters: None
     * e. Return Type: None
     */
    @Test(enabled = true)
    public void SportsJamWomenSportsCase(){
        ExtentTest test = report.createTest("Puma Brand Page Test");
        SportsJamPumaWomenSportsPage sportsJamPumaWomenSportsPage = new SportsJamPumaWomenSportsPage(driver,test);
        sportsJamPumaWomenSportsPage.runWomenSportsCase();
        Screenshot.captureScreenShot("Women Sports");
        Reporter.attachScreenshotToReport("Women Sports",test,"WOmen Shoes Screenshot have been captured");
    }


    /*
     * a. MethodName: SprotsJamBadmintonPageVerificationCase
     * b. AuthorName: Sharath
     * c. Description: This is used to run the tests of the badminton shoes pages.
     * d. Parameters: None
     * e. Return Type: None
     */
    @Test(enabled = true)
    public void SprotsJamBadmintonPageVerificationCase(){
        ExtentTest test = report.createTest("Shoes Page Test");
        SportsJamMensShoesPage  sportsJamMensShoesPage = new SportsJamMensShoesPage(driver,test);
        sportsJamMensShoesPage.runMensShoesCase();
        Screenshot.captureScreenShot("squash");
        Reporter.attachScreenshotToReport("squash",test,"Squash Screenshot have been captured");
    }

    /*
     * a. MethodName: close
     * b. AuthorName: Sharath
     * c. Description: This is used in closing the browser Interfaces
     * d. Parameters: None
     * e. Return Type: None
     */
    @AfterMethod
    public void close(){
        driver.quit();
    }
 
    /*
     * a. MethodName: flush
     * b. AuthorName: Sharath
     * c. Description: This is used in dumping all the test cases into the report.
     * d. Parameters: None
     * e. Return Type: None
     */
    @AfterClass
    public void flush(){
        report.flush();
    }
}
 