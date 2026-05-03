package pages;

import base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utils.LogUtils;

public class ProductDetailsPage extends BaseClass {
    
    @FindBy(id = "add-to-cart-button")
    private WebElement addToCartBtn;

    // Locator for the top menu Cart option
    @FindBy(id = "nav-cart")
    private WebElement topMenuCartIcon;

    public ProductDetailsPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void clickAddToCart() {
        LogUtils.info("Switching to the Product Detail Page tab.");
        switchToNewTab(); 
        
        LogUtils.info("Clicking 'Add to Cart' button.");
        // Using explicit wait here to ensure the button is ready
        wait.until(ExpectedConditions.elementToBeClickable(addToCartBtn)).click();
        
        // Wait for the side panel or confirmation to appear before moving on
        try {
            Thread.sleep(2000); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void goToCart() {
        LogUtils.info("Switching directly to the Cart option from the top menu.");
        wait.until(ExpectedConditions.elementToBeClickable(topMenuCartIcon)).click();
    }
}