package utils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import com.google.common.io.Files;

public class Screenshot extends Base{

    public static TakesScreenshot ts;
 
    /*
     * a. Method Name: captureScreenShot
     * b. Author Name: Tanishk Maheshwari
     * c. Description: This will be used to capture the screenshot of the complete window or the screen in date and time format.
     * d. Parameter: String filename
     * e. Return Type: void
     */
    public static void captureScreenShot(String filename) {
        try {
            String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
            String name = filename + timestamp + ".png";
            ts = (TakesScreenshot) driver;
            File file = ts.getScreenshotAs(OutputType.FILE);
            File screenshotsDir = new File(System.getProperty("user.dir") + "/screenshots");
            if (!screenshotsDir.exists()) {
                screenshotsDir.mkdirs();
            }
            File target = new File(screenshotsDir, name);
            Files.copy(file,target);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    /*
     * a. Method Name: captureHighlightScreenShot
     * b. Author Name: Tanishk Maheshwari
     * c. Description: This will be used to capture the screenshot and highlight some part of the application in date and time format.
     * d. Parameter: By locator, String filename
     * e. Return Type: void
     */
    public static void captureHighlightScreenShot(By locator, String filename) {
        try {
            WebElement element=driver.findElement(locator);
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].style.backgroundColor='yellow';" , element);
    
            // Capture screenshot of the highlighted element
            File file = element.getScreenshotAs(OutputType.FILE);
            File screenshotsDir = new File(System.getProperty("user.dir") + "/screenshots");
            if (!screenshotsDir.exists()) {
                screenshotsDir.mkdirs();
            }
            String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
            File target = new File(screenshotsDir, filename + timestamp + ".png");
            Files.copy(file,target);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /*
     * a. Method Name: captureSpecificScreenShot
     * b. Author Name: Tanishk Maheshwari
     * c. Description: This will be used to capture the screenshot of a specific part in date and time format.
     * d. Parameter: By locator, String filename
     * e. Return Type: void
     */
    public static void captureSpecificScreenShot(By locator, String filename) {
        try {
            WebElement element=driver.findElement(locator);
            String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
            String name = filename + timestamp + ".png";
            File file = element.getScreenshotAs(OutputType.FILE);
            File screenshotsDir = new File(System.getProperty("user.dir") + "/screenshots");
            if (!screenshotsDir.exists()) {
                screenshotsDir.mkdirs();
            }
            File target = new File(screenshotsDir, name);
            Files.copy(file,target);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}