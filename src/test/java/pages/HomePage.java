package pages;

import base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.LogUtils;

public class HomePage extends BaseClass {
    
    @FindBy(id = "twotabsearchtextbox")
    private WebElement searchBox;

    @FindBy(id = "nav-search-submit-button")
    private WebElement searchButton;

    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void searchForProduct(String product) {
        LogUtils.info("Entering product name in search box: " + product);
        enterText(searchBox, product);
        LogUtils.info("Clicking the search button.");
        clickElement(searchButton);
    }
}