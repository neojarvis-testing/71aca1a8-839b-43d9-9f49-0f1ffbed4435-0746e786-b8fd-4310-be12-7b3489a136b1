package utils;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Base64;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import jakarta.mail.Message;
import jakarta.mail.Multipart;
import jakarta.mail.PasswordAuthentication;
import jakarta.mail.Session;
import jakarta.mail.Transport;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeBodyPart;
import jakarta.mail.internet.MimeMessage;
import jakarta.mail.internet.MimeMultipart;
 
public class Reporter extends Base {
    private static ExtentReports extentReport;
    private static ExtentSparkReporter extentSparkReporter;
    public static String report;
    
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
            String time = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
            String reportsPath = System.getProperty("user.dir") + "/reports/";
            report = reportsPath + reportName +"_"+time+ "_.html"; 
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
     * MethodName:attachBase64ScreenshotToReport
     * Description:A method to attach screenshot to report 
     * Parameters:reportName,test,description
     * Return Type:ExtentReport
     */
    public static void attachBase64ScreenshotToReport(String reportName, ExtentTest test, String description) {
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
    /*
     * AuthorName: Srujana Makam
     * MethodName:attachScreenshotToReport
     * Description:A method to attach screenshot to report 
     * Parameters:reportName,test,description
     * Return Type:ExtentReport
     */
    public static void attachScreenshotToReport(String filename, ExtentTest test, String description) {
        try 
        {
            test.log(Status.INFO, description, MediaEntityBuilder.createScreenCaptureFromPath(TakeScreenshot(filename)).build());
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
	}
    /*
     * AuthorName: Srujana Makam
     * MethodName:TakeScreenshot
     * Description:A method to attach screenshot to report 
     * Parameters:reportName,test,description
     * Return Type:ExtentReport
     */
    public static String TakeScreenshot(String filename) {
        try
        {
            String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
            String name = filename + timestamp + ".png";
            String destPath =  "./"+name;
            TakesScreenshot ts = (TakesScreenshot) driver;
            File file = ts.getScreenshotAs(OutputType.FILE);
            File screenshotsDir = new File(System.getProperty("user.dir") + "/reports/screenshots");
            if (!screenshotsDir.exists()) 
            {
                screenshotsDir.mkdirs();
            }
            File target = new File(screenshotsDir, name);
            FileUtils.copyFile(file, target); 
            return destPath;
        }
        catch (Exception e) 
        {
			e.printStackTrace();
		}
		return "";
    }
     /*
     * AuthorName: Srujana Makam
     * MethodName:sendEmail
     * Description:A method to attach report to email
     * Parameters:recipient,subject,reportFilePath
     * Return Type:void
     */
    public static void sendEmail(String recipient, String subject, String reportFilePath) {
            final String senderEmail = "makamsrujana03@gmail.com"; 
            final String senderPassword = "tkdswezfuhmaumug";   
            Properties properties = new Properties();
            properties.put("mail.smtp.host", "smtp.gmail.com");
            properties.put("mail.smtp.port", "587");
            properties.put("mail.smtp.auth", "true");
            properties.put("mail.smtp.starttls.enable", "true");
            Session	session= Session.getInstance(properties, new jakarta.mail.Authenticator(){
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(senderEmail, senderPassword);
                }
            });
            try {
                Message message = new MimeMessage(session);
                message.setFrom(new InternetAddress(senderEmail));
                message.setRecipient(Message.RecipientType.TO, new InternetAddress(recipient));
                message.setSubject(subject);
                MimeBodyPart textPart = new MimeBodyPart();
                textPart.setText("Please find the attached report.");
                MimeBodyPart filePart = new MimeBodyPart();
                filePart.attachFile(new File(reportFilePath));
                Multipart multipart = new MimeMultipart();
                multipart.addBodyPart(textPart);
                multipart.addBodyPart(filePart);
                message.setContent(multipart);
                Transport.send(message);
                System.out.println("Email sent successfully!");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
}
