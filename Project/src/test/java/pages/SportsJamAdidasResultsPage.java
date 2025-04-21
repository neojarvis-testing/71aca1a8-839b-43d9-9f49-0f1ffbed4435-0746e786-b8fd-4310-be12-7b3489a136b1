package pages;

import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;

import uistore.SportsJamAdidasResultsPageLocator;
import uistore.SportsJamHomePageLocator;
import utils.Base;
import utils.ExcelReader;
import utils.WebDriverHelper;

public class SportsJamAdidasResultsPage {
    public static ExtentTest test;
    public static WebDriverHelper helper;

    public SportsJamAdidasResultsPage(ExtentTest test){
        helper = new WebDriverHelper(Base.driver, test);
        this.test=test;
    }

    public void clickOnSearchIcon(){
        helper.clickOnElement(SportsJamHomePageLocator.searchIcon, "Clicked on search icon");
    }

    public void verifySearchBar(){
        String text = Base.driver.findElement(SportsJamHomePageLocator.placeholderSearchBar).getDomAttribute("placeholder");
        System.out.println(text);
        Assert.assertEquals(text, ExcelReader.getCellData("AssertData", 0, 0));
    }

    public void clickOnSearchBar(){
        helper.clickOnElement(SportsJamHomePageLocator.searchBar, "Clicked on search bar");
    }

    public void sendDataInSearchBar(){
        helper.sendData(SportsJamHomePageLocator.searchBar, ExcelReader.getCellData("SearchBarData", 0, 0), "Input sent");
    }

    public void clickOnGoButton(){
        helper.clickOnElement(SportsJamHomePageLocator.goButton, "Clicked on go button");
    }

    public void verifyAdidasInHeading(){
        String text = helper.getText(SportsJamAdidasResultsPageLocator.adidasHeading, "Heading verified");
        Assert.assertTrue(text.contains("adidas"));
    }

    public void selectCheckboxOfRacketSports(){
        helper.checkbox(SportsJamAdidasResultsPageLocator.filterCategoryRacketSports, "Racket Sports", "Checked Racket Sports");
    }

    public void verifyRacketSportsLabel(){
        String text = helper.getText(SportsJamAdidasResultsPageLocator.filterCategoryRacketSportsLabel, "Label verified");
        Assert.assertTrue(text.contains("Racket Sports"));
    }
    
    public void selectCheckboxOfShoes(){
        helper.checkbox(SportsJamAdidasResultsPageLocator.filterCategoryShoes, "Shoes", "Checked Shoes");
    }
    
    public void verifyShoesLabel(){
        String text = helper.getText(SportsJamAdidasResultsPageLocator.filterCategoryShoesLabel, "Label verified");
        Assert.assertTrue(text.contains("Shoes"));
    }

    public void deSelectCheckboxOfRacketSports(){
        
    }
}
