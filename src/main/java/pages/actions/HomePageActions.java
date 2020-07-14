package pages.actions;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import pages.locators.HomePageLocators;
import utils.SeleniumDriver;

public class HomePageActions {
    HomePageLocators homePageLocators = null;
    public HomePageActions () {
        this.homePageLocators = new HomePageLocators();
        PageFactory.initElements(SeleniumDriver.getDriver(), homePageLocators);
    }

    //we are creating methods for interactions with elements

    public void moveToElectronicsMenu(){
        Actions action = new Actions(SeleniumDriver.getDriver());
        action.moveToElement(homePageLocators.electronicsLink).perform();

    }

    public void clickOnCameraDronesMenu(){
        // before this action need to hover mouse on Electronics Menu link on Home Page
        //by invoking method moveToElectronicsMenu();
        homePageLocators.cameraDronesMenuLink.click();

    }

    public void moveToFashionMenu(){

    }

    public void clickOnAdvancedSearching() {
        homePageLocators.advancedLink.click();
    }

    public void enterKeywordsField(){
        homePageLocators.enterKeywordsField.sendKeys("obag");
    }
    public void pressSearchButton(){
        homePageLocators.searchButton.click();

    }
}
