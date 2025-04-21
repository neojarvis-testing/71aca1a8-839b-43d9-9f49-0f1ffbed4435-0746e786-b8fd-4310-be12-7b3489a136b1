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
        helper.checkAssert(text, ExcelReader.getCellData("AssertData", 0, 0),"Text verified");
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
        helper.checkAssert(text, ExcelReader.getCellData("AssertData", 1, 0),"Heading verified");
    }

    public void selectCheckboxOfRacketSports(){
        helper.checkbox(SportsJamAdidasResultsPageLocator.filterCategoryRacketSports, ExcelReader.getCellData("CheckBoxData", 0, 0), "Selected Racket Sports");
    }

    public void verifyRacketSportsLabel(){
        String text = helper.getText(SportsJamAdidasResultsPageLocator.filterCategoryRacketSportsLabel, "Label verified");
        helper.checkAssert(text, ExcelReader.getCellData("AssertData", 2, 0),"Text verified");
    }
    
    public void selectCheckboxOfShoes(){
        helper.checkbox(SportsJamAdidasResultsPageLocator.filterCategoryShoes, ExcelReader.getCellData("CheckBoxData", 1, 0), "Selected Shoes");
    }
    
    public void verifyShoesLabel(){
        String text = helper.getText(SportsJamAdidasResultsPageLocator.filterCategoryShoesLabel, "Label verified");
        helper.checkAssert(text, ExcelReader.getCellData("AssertData", 3, 0),"Text verified");
    }

    public void deSelectCheckboxOfRacketSports(){
        helper.checkbox(SportsJamAdidasResultsPageLocator.filterCategoryRacketSports, ExcelReader.getCellData("CheckBoxData", 0, 0), "De-selected Racket Sports");
    }

    public void selectCheckboxOfClothing(){
        helper.checkbox(SportsJamAdidasResultsPageLocator.filterCategoryClothing, ExcelReader.getCellData("CheckBoxData", 2, 0), "Selected Clothing");
    }

    public void verifyClothingLabel(){
        String text = helper.getText(SportsJamAdidasResultsPageLocator.filterCategoryClothingLabel, "Label verified");
        helper.checkAssert(text, ExcelReader.getCellData("AssertData", 4, 0), "Text verified");
    }

    public void selectCheckboxOfAccessories(){
        helper.checkbox(SportsJamAdidasResultsPageLocator.filterCategoryAccessories, ExcelReader.getCellData("CheckBoxData", 3, 0), "Selected Accessories");
    }

    public void verifyAccessoriesLabel(){
        String text = helper.getText(SportsJamAdidasResultsPageLocator.filterCategoryAccessoriesLabel, "Label verified");
        helper.checkAssert(text, ExcelReader.getCellData("AssertData", 5, 0), "Text verified");
    }

    public void selectCheckboxOfRunning(){
        helper.checkbox(SportsJamAdidasResultsPageLocator.filterCategoryRunning, ExcelReader.getCellData("CheckBoxData", 4, 0), "Selected Running");
    }

    public void verifyRunningLabel(){
        String text = helper.getText(SportsJamAdidasResultsPageLocator.filterCategoryRunningLabel, "Label verified");
        helper.checkAssert(text, ExcelReader.getCellData("AssertData", 6, 0), "Text verified");
    }

    public void clickClearAllButton(){
        helper.clickOnElement(SportsJamAdidasResultsPageLocator.clearAllButton, "Clicked on Clear All button");
    }

    public void adidasProductFilter(){
        clickOnSearchIcon();
        verifySearchBar();
        clickOnSearchBar();
        sendDataInSearchBar();
        clickOnGoButton();
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
