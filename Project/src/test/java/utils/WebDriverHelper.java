package utils;
 
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
 
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
 
 
public class WebDriverHelper {
    WebDriver driver;
	ExtentTest test;
	 List<String> list=new ArrayList<String>();
	public WebDriverHelper(WebDriver driver,ExtentTest test) {
		this.driver = driver;
		this.test = test;
		list.add(driver.getWindowHandle());
	}
	public void clickOnElement(By locator, String message) {
		try {
			waitForElementToBeVisible(locator, 10);
			driver.findElement(locator).click();
			LoggerHandler.info(message);
			test.log(Status.PASS, message);
		} catch (Exception e) {
			 
			LoggerHandler.error(message);
			test.log(Status.FAIL, message);
		}
	}
	public void sendData(By locator, String value, String message) {
		try {
			waitForElementToBeVisible(locator, 10);
			driver.findElement(locator).sendKeys(value);
			LoggerHandler.info(message);
			test.log(Status.PASS, message);
		} catch (Exception e) {
			 
			LoggerHandler.error(message);
			test.log(Status.FAIL, message);
		}
	}
	public String getText(By locator, String message) {
		try {
			waitForElementToBeVisible(locator, 10);
			String dataString = driver.findElement(locator).getText();
			LoggerHandler.info(message);
			test.log(Status.PASS, message);
			return dataString;
		} catch (Exception e) {
			 
			LoggerHandler.error(message);
			test.log(Status.FAIL, message);
		}
		return null;
	}
	public void hoverOverElement(By locator, String message) {
		try {
			waitForElementToBeVisible(locator, 10);
			Actions action = new Actions(driver);
			WebElement element = driver.findElement(locator);
			action.moveToElement(element).build().perform();
			LoggerHandler.info(message);
			test.log(Status.PASS, message);
		} catch (Exception e) {
			 
			LoggerHandler.error(message);
			test.log(Status.FAIL, message);
		}
	}
	public void hoverOverClick(By locator, String message) {
		try {
			waitForElementToBeVisible(locator, 10);
			Actions action = new Actions(driver);
			WebElement element = driver.findElement(locator);
			action.click(element).build().perform();
			LoggerHandler.info(message);
			test.log(Status.PASS, message);
		} catch (Exception e) {
			 
			LoggerHandler.error(message);
			test.log(Status.FAIL, message);
		}
	}
	public void switchToIFrame(By locator, String message){
		try {
			waitForElementToBeVisible(locator, 10);
			WebElement element=driver.findElement(locator);
			driver.switchTo().frame(element);
			LoggerHandler.info(message);
			test.log(Status.PASS, message);
		} catch (Exception e) {
			 
			LoggerHandler.error(message);
			test.log(Status.FAIL, message);
		}
	}
	public void exitIFrame(String message){
		try {
			driver.switchTo().defaultContent();
			LoggerHandler.info(message);
			test.log(Status.PASS, message);
		} catch (Exception e) {
			 
			LoggerHandler.error(message);
			test.log(Status.FAIL, message);
		}
	}
	public void jsScrollUsingPixel(int x,int y, String message) {
		try {
			JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
			jsExecutor.executeScript("window.scrollBy(arguments[0],arguments[1])", x,y);
			LoggerHandler.info(message);
			test.log(Status.PASS, message);
		} catch (Exception e) {
			 
			LoggerHandler.error(message);
			test.log(Status.FAIL, message);
		}
	}
	public void jsScrollUntilElementIsVisible(By locator, String message) {
		try {
			WebElement element = driver.findElement(locator);
			JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
			jsExecutor.executeScript("arguments[0].scrollIntoView(true)",element);
			LoggerHandler.info(message);
			test.log(Status.PASS, message);
		} catch (Exception e) {
			 
			LoggerHandler.error(message);
			test.log(Status.FAIL, message);
		}
	}
	public void jsClick(By locator, String message) {
		try {
			JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
			WebElement element = driver.findElement(locator);
			jsExecutor.executeScript("arguments[0].click()",element);
			LoggerHandler.info(message);
			test.log(Status.PASS, message);
		} catch (Exception e) {
			 
			LoggerHandler.error(message);
			test.log(Status.FAIL, message);
		}
	}
	public void selectDropDown(By locator, String value, String message) {
		try {
			waitForElementToBeVisible(locator, 10);
			WebElement element = driver.findElement(locator);
			Select select = new Select(element);
			select.selectByVisibleText(value);
			LoggerHandler.info(message);
			test.log(Status.PASS, message);
		} catch (Exception e) {
			 
			LoggerHandler.error(message);
			test.log(Status.FAIL, message);
		}
	}
	public List<WebElement> getElementsByXPath(String path, String message){
		try {
			List<WebElement> elements = driver.findElements(By.xpath(path));
			LoggerHandler.info(message);
			test.log(Status.PASS, message);
			return elements;
		} catch (Exception e) {
			 
			LoggerHandler.error(message);
			test.log(Status.FAIL, message);
		}
		return null;
	}
	public void swichToChildWindow(String message) {
		try {
			String parent = driver.getWindowHandle();
			Set<String> set = driver.getWindowHandles();
			for(String child: set) {
				if(!child.equals(parent)) {
					driver.switchTo().window(child);
				}
			}
			LoggerHandler.info(message);
			test.log(Status.PASS, message);
		} catch (Exception e) {
			 
			LoggerHandler.error(message);
			test.log(Status.FAIL, message);
		}
	}
	public void swichToParentWindow(String message) {
		try {
			String child = driver.getWindowHandle();
			Set<String> set = driver.getWindowHandles();
			for(String parent: set) {
				if(!child.equals(parent)) {
					driver.switchTo().window(parent);
				}
			}
			LoggerHandler.info(message);
			test.log(Status.PASS, message);
		} catch (Exception e) {
			 
			LoggerHandler.error(message);
			test.log(Status.FAIL, message);
		}
	}
	public void dragAndDrop(By sourcePath, By destinationPath, String message) {
		try {
			waitForElementToBeVisible(sourcePath, 10);
			waitForElementToBeVisible(destinationPath, 10);
			Actions action = new Actions(driver);
			WebElement source = driver.findElement(sourcePath);
			WebElement destination = driver.findElement(destinationPath);
			action.dragAndDrop(source, destination).perform();
			LoggerHandler.info(message);
			test.log(Status.PASS, message);
		} catch (Exception e) {
			 
			LoggerHandler.error(message);
			test.log(Status.FAIL, message);
		}
	}
	public void sliderFunction(By locator, int pixel, String message) {
		try {
			waitForElementToBeVisible(locator, 10);
			Actions action = new Actions(driver);
			WebElement slider = driver.findElement(locator);
			action.clickAndHold(slider).moveByOffset(pixel, 0).release().build().perform();
			LoggerHandler.info(message);
			test.log(Status.PASS, message);
		} catch (Exception e) {
			 
			LoggerHandler.error(message);
			test.log(Status.FAIL, message);
		}
	}
	public void waitForElementToBeVisible(By locator ,int seconds ){
        try{
        new WebDriverWait(driver, Duration.ofSeconds(seconds)).until(ExpectedConditions.visibilityOfElementLocated(locator));
        }catch(Exception e){
            e.printStackTrace();
        }
    }
	public void navigateBack(String message) {
		try {
			driver.navigate().back();
			LoggerHandler.info(message);
			test.log(Status.PASS, message);
		} catch (Exception e) {
			 
			LoggerHandler.error(message);
			test.log(Status.FAIL, message);
		}
	}
	public void enterAction(By locator, String value, String message) {
		try {
			driver.findElement(locator).sendKeys(Keys.ENTER);
			LoggerHandler.info(message);
			test.log(Status.PASS, message);
		} catch (Exception e) {
			LoggerHandler.error(message);
			test.log(Status.FAIL, message);
		}
	}
	public void switchToNewWindow() {
        try {
            Set<String> windowHandles = driver.getWindowHandles();
            for (String windowHandle : windowHandles) {
                if (!windowHandle.isEmpty()) {
                    driver.switchTo().window(windowHandle);
                    list.add(windowHandle);
                } else {
                    throw new Exception("New window could not be retrieved");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
	public void switchBackTowindow(int x){
		driver.switchTo().window(list.get(x));
	}
}
