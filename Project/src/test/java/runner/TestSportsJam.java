package runner;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import pages.SportsJamAdidasResultsPage;
import utils.Base;
import utils.Reporter;

public class TestSportsJam extends Base{
    public static ExtentTest test;
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
     * a. MethodName: adidasProductsFilterTest
     * b. AuthorName: Sharath
     * c. Description: This is used to run the tests of the pages.
     * d. Parameters: None
     * e. Return Type: None
     */
    @Test
    public void adidasProductsFilterTest(){
        test = report.createTest("adidasProductsFilterTest");
        SportsJamAdidasResultsPage sportsJamAdidasResultsPage = new SportsJamAdidasResultsPage(test);
        sportsJamAdidasResultsPage.adidasProductsFilter();
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