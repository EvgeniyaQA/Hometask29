package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePageLocators {

    @FindBy(how = How.LINK_TEXT, using = "Electronics")
    public WebElement electronicsLink;


    @FindBy(how = How.LINK_TEXT, using = "Camera Drones")
    public WebElement cameraDronesMenuLink;

    @FindBy(how = How.LINK_TEXT, using = "Advanced")
    public WebElement advancedLink;
    @FindBy(how = How.XPATH, using = "//*[@id='_nkw']")
    public WebElement enterKeywordsField;

    @FindBy(how = How.XPATH, using = "//*[@id='adv_search_from']/fieldset[1]/div[3]/button")
    public WebElement searchButton;

}
