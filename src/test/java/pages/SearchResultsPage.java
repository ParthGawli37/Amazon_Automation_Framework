package pages;

import base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import utils.LogUtils;

public class SearchResultsPage extends BaseClass {
    
    // Dynamic locator for the "Add to Cart" button on the Search Results Page
    private By serpAddToCartBtn = By.xpath("(//button[contains(text(), 'Add to cart')] | //button[contains(text(), 'Add to Cart')] | //input[@value='Add to Cart'] | //input[@name='submit.addToCart'])[1]");

    // Locator for the top menu Cart option
    private By topMenuCartIcon = By.id("nav-cart");

    public SearchResultsPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void clickAddToCartDirectly() {
        try {
            LogUtils.info("Scanning search results for the first 'Add to Cart' button...");
            WebElement addToCartButton = wait.until(ExpectedConditions.elementToBeClickable(serpAddToCartBtn));
            
            LogUtils.info("Found the 'Add to Cart' button on SERP. Clicking it.");
            addToCartButton.click();
            
            // Hard wait to allow Amazon's background AJAX request to update the cart count
            Thread.sleep(3000); 
            
        } catch (Exception e) {
            LogUtils.error("Failed to find the 'Add to Cart' button on the search results page.");
            Assert.fail("No 'Add to Cart' button was available on the search results page.");
        }
    }

    public void clickTopMenuCart() {
        LogUtils.info("Clicking the Cart option from the top menu.");
        wait.until(ExpectedConditions.elementToBeClickable(topMenuCartIcon)).click();
    }
}