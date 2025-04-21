package pages;

import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;

import uistore.SportsJamAdidasResultsPageLocator;
import uistore.SportsJamHomePageLocator;
import utils.Base;
import utils.ExcelReader;
import utils.WebDriverHelper;

public class SportsJamAdidasResultsPage {
    public  ExtentTest test;
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
        // System.out.println(text);
        helper.checkAssert(text, ExcelReader.getCellData("AssertData", 0, 0),"Text verified");
    }

    public void clickOnSearchBar(){
        helper.clickOnElement(SportsJamHomePageLocator.searchBar, "Clicked on search bar");
    }

    public void sendDataInSearchBar(){
        helper.sendData(SportsJamHomePageLocator.searchBar, ExcelReader.getCellData("SearchBarData", 0, 0), "Input sent");
    }

    public void pressEnter(){
        helper.enterData(SportsJamHomePageLocator.searchBar);
    }

    public void verifyAdidasInHeading(){
        String text = helper.getText(SportsJamAdidasResultsPageLocator.adidasHeading, "Heading verified");
        helper.checkAssert(text, "ADIDAS", "Heading verified");
    }

    public void selectCheckboxOfRacketSports(){
        helper.clickOnElement(SportsJamAdidasResultsPageLocator.filterCategoryRacketSports, "Selected Racket Sports");
    }

    public void verifyRacketSportsLabel(){
        String text = helper.getText(SportsJamAdidasResultsPageLocator.filterCategoryRacketSportsLabel, "Label verified");
        helper.checkAssert(text, ExcelReader.getCellData("AssertData", 2, 0),"Text verified");
    }
    
    public void selectCheckboxOfShoes(){
        helper.clickOnElement(SportsJamAdidasResultsPageLocator.filterCategoryShoes, "Selected Shoes");
    }
    
    public void verifyShoesLabel(){
        String text = helper.getText(SportsJamAdidasResultsPageLocator.filterCategoryShoesLabel, "Label verified");
        helper.checkAssert(text, ExcelReader.getCellData("AssertData", 3, 0),"Text verified");
    }

    public void deSelectCheckboxOfRacketSports(){
        helper.clickOnElement(SportsJamAdidasResultsPageLocator.filterCategoryRacketSports, "De-selected Racket Sports");
    }

    public void selectCheckboxOfClothing(){
        helper.clickOnElement(SportsJamAdidasResultsPageLocator.filterCategoryClothing, "Selected Clothing");
    }

    public void verifyClothingLabel(){
        String text = helper.getText(SportsJamAdidasResultsPageLocator.filterCategoryClothingLabel, "Label verified");
        helper.checkAssert(text, ExcelReader.getCellData("AssertData", 4, 0), "Text verified");
    }

    public void selectCheckboxOfAccessories(){
        helper.clickOnElement(SportsJamAdidasResultsPageLocator.filterCategoryAccessories, "Selected Accessories");
    }

    public void verifyAccessoriesLabel(){
        String text = helper.getText(SportsJamAdidasResultsPageLocator.filterCategoryAccessoriesLabel, "Label verified");
        helper.checkAssert(text, ExcelReader.getCellData("AssertData", 5, 0), "Text verified");
    }

    public void selectCheckboxOfRunning(){
        helper.clickOnElement(SportsJamAdidasResultsPageLocator.filterCategoryRunning, "Selected Running");
    }

    public void verifyRunningLabel(){
        String text = helper.getText(SportsJamAdidasResultsPageLocator.filterCategoryRunningLabel, "Label verified");
        helper.checkAssert(text, ExcelReader.getCellData("AssertData", 6, 0), "Text verified");
    }

    public void clickClearAllButton(){
        helper.clickOnElement(SportsJamAdidasResultsPageLocator.clearAllButton, "Clicked on Clear All button");
    }

    public void adidasProductsFilter(){
        clickOnSearchIcon();
        verifySearchBar();
        clickOnSearchBar();
        sendDataInSearchBar();
        pressEnter();
        verifyAdidasInHeading();
        selectCheckboxOfRacketSports();
        verifyRacketSportsLabel();
        selectCheckboxOfShoes();
        verifyShoesLabel();
        deSelectCheckboxOfRacketSports();
        selectCheckboxOfClothing();
        verifyClothingLabel();
        selectCheckboxOfAccessories();
        verifyAccessoriesLabel();
        selectCheckboxOfRunning();
        verifyRunningLabel();
        clickClearAllButton();
    }
}
