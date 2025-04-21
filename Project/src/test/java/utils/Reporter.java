package utils;
import java.io.File;
import java.util.Base64;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
 
public class Reporter extends Base {
    private static ExtentReports extentReport;
    private static ExtentSparkReporter extentSparkReporter;
    
    /*
     * AuthorName: Srujana Makam
     * MethodName:generateReport
     * Description:A method to geenrate report with default name
     * Parameters:NA
     * Return Type:ExtentReport
     */
    public static ExtentReports generateReport() {
        return generateReport("TEST REPORT");
    }
    /*
     * AuthorName: Srujana Makam
     * MethodName:generateReport
     * Description:A method to geenrate report 
     * Parameters:reportName
     * Return Type:ExtentReport
     */
    public static ExtentReports generateReport(String reportName) {
        if (extentReport == null) {
            extentReport = createExtentReport(reportName);
        }
        return extentReport;
    }
    /*
     * AuthorName: Srujana Makam
     * MethodName:createExtentReport
     * Description:A method to create extentReport
     * Parameters:reportName
     * Return Type:ExtentReport
     */
    private static ExtentReports createExtentReport(String reportName) {
        if (extentReport == null) {
            String reportsPath = System.getProperty("user.dir") + "/reports/";
            String report = reportsPath + reportName + ".html"; 
            File reportsDir = new File(reportsPath);
            if (!reportsDir.exists()) {
                reportsDir.mkdirs();
            }
            extentSparkReporter = new ExtentSparkReporter(report); 
            extentReport = new ExtentReports();
            extentReport.attachReporter(extentSparkReporter);
        }
        return extentReport;
    }
    /*
     * AuthorName: Srujana Makam
     * MethodName:takeScreenshotAsBase64
     * Description:A method to take screenshot
     * Parameters:NA
     * Return Type:String
     */
    public static String takeScreenshotAsBase64() {
        String base64String = "";
        try {
            File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            byte[] fileContent = FileUtils.readFileToByteArray(screenshotFile);
            base64String = Base64.getEncoder().encodeToString(fileContent);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return base64String;
    }
    /*
     * AuthorName: Srujana Makam
     * MethodName:attachScreenshotToReport
     * Description:A method to attach screenshot to report 
     * Parameters:reportName,test,description
     * Return Type:ExtentReport
     */
    public static void attachScreenshotToReport(String reportName, ExtentTest test, String description) {
        try {
            String base64Screenshot = takeScreenshotAsBase64();
            if (!base64Screenshot.isEmpty()) {
                test.info(description, MediaEntityBuilder.createScreenCaptureFromBase64String(base64Screenshot).build());
            } else {
                test.log(Status.FAIL, "Screenshot capture failed.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
