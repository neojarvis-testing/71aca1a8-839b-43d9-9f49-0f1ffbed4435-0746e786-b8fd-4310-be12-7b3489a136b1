package runner;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import pages.SportsJamFooterPage;
import pages.SportsJamLoginPage;
import utils.Base;
import utils.Reporter;

public class TestSample extends Base
{
    public static ExtentReports report;
    public static ExtentTest test;

    @BeforeClass
    public void generate()
    {
        report=Reporter.generateReport("SPORTSJAM REPORT");
    }    

    @BeforeMethod
    public void open()
    {
        openBrowser();
    }

    //@Test
    public void test()
    {
        test=report.createTest("CASELOGIN");
        SportsJamLoginPage lpage=new SportsJamLoginPage(test);
        lpage.testlogin();
    }

    @Test
    public void test1()
    {
        test=report.createTest("CASE");
        SportsJamFooterPage fpage=new SportsJamFooterPage(test);
        fpage.switchtest();
    }

    @AfterMethod
    public void close()
    {
        driver.quit();
    }

    @AfterClass
    public void flush()
    {
        report.flush();
    }
}
