package pages;

import base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.LogUtils;

public class CartPage extends BaseClass {
    
    @FindBy(name = "proceedToRetailCheckout")
    private WebElement proceedToBuyBtn;

    public CartPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void clickProceedToBuy() {
        LogUtils.info("Clicking 'Proceed to Buy' button from the cart.");
        clickElement(proceedToBuyBtn);
    }
}