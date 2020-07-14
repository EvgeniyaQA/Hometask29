package steps;


import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.actions.HomePageActions;
import utils.SeleniumDriver;

import java.util.List;

public class SearchItemSteps {

    //below are objects of pages for accessing the methods in them
    HomePageActions homePageActions = new HomePageActions();

    @Given("^I am on the Home Page \"([^\"]*)\" of our site$")
    public void i_am_on_the_Home_Page_of_our_site(String websiteURL) throws Throwable {
        SeleniumDriver.openPage(websiteURL);
    }

    @When("^I move to the menu$")
    public void i_move_to_the_menu(List<String> list) throws Throwable {
        // List<String> list - this is a list of our Menu options from feature file
        String menu = list.get(1);

        homePageActions.moveToElectronicsMenu();
    }

    @And("^click on \"([^\"]*)\" link$")
    public void click_on_link(String arg1) throws Throwable {
        homePageActions.clickOnCameraDronesMenu();
    }

    @And("^user clicks on \"([^\"]*)\" link$")
    public void userClicksOnLink(String arg0) throws Throwable {

        homePageActions.clickOnAdvancedSearching();
    }

    @And("^user enters words \"([^\"]*)\" into \"([^\"]*)\" field$")
    public void userEntersWordsIntoField(String arg0, String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        homePageActions.enterKeywordsField();
    }


    @Then("^I should get the list of OBag items \"([^\"]*)\"$")
    public void iShouldGetTheListOfItems(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        homePageActions.pressSearchButton();
    }


}

