package runner;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import pages.GymGlovesPage;
import utils.Base;
import utils.Reporter;

public class TestExecutor extends Base{
    ExtentReports report;
    ExtentTest test;
    /*
     * a. MethodName: openReport
     * b. AuthorName: Sharath
     * c. Description: This is used in creating a HTML report before running all the testCases.
     * d. Parameters: None
     * e. Return Type: None
     */
    @BeforeClass
    public void openReport()
    {
        report = Reporter.generateReport("Gagan");
    }

    /*
     * a. MethodName: openInterface
     * b. AuthorName: Sharath
     * c. Description: This is used in opening the browser Interfaces
     * d. Parameters: None
     * e. Return Type: None
     */
    @BeforeMethod
    public void openInterface()
    {
        openBrowser();
    }

    @Test
    public void testMain1(){
        test = report.createTest("TestCase 5");
        GymGlovesPage ggp = new GymGlovesPage(test);
        ggp.testCase1();
    }
    /*
     * a. MethodName: closeInterface
     * b. AuthorName: Sharath
     * c. Description: This is used in closing the browser Interfaces
     * d. Parameters: None
     * e. Return Type: None
     */
    @AfterMethod
    public void closeInterface()
    {
        driver.quit();
    }

    /*
     * a. MethodName: closeReport
     * b. AuthorName: Sharath
     * c. Description: This is used in dumping all the test cases into the report.
     * d. Parameters: None
     * e. Return Type: None
     */
    @AfterClass
    public void closeReport()
    {
        report.flush();
    }
}
