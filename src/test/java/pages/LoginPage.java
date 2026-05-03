package pages;

import base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.LogUtils;

public class LoginPage extends BaseClass {
    
    @FindBy(xpath = "//h1[contains(text(), 'Sign in')]")
    private WebElement signInHeader;

    @FindBy(id = "ap_email")
    private WebElement emailInput;

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public boolean isLoginPageLoaded() {
        LogUtils.info("Verifying if the login page has loaded successfully.");
        return isElementDisplayed(signInHeader) && isElementDisplayed(emailInput);
    }
}