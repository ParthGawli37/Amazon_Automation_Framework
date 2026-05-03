package stepdefinitions;

import base.BaseClass;
import io.cucumber.java.en.*;
import org.testng.Assert;
import pages.*;
import utils.LogUtils;

public class AmazonSteps extends BaseClass {
    
    HomePage homePage;
    SearchResultsPage resultsPage;
    CartPage cartPage;
    LoginPage loginPage;

    @Given("I navigate to the Amazon India application")
    public void i_navigate_to_the_amazon_india_application() {
        driver.get("https://www.amazon.in/");
        homePage = new HomePage(driver);
        LogUtils.info("Navigated to Amazon India.");
        Assert.assertTrue(driver.getCurrentUrl().contains("amazon.in"), "Did not navigate to correct URL");
    }

    @When("I search for a product {string}")
    public void i_search_for_a_product(String productName) {
        homePage.searchForProduct(productName);
        resultsPage = new SearchResultsPage(driver);
        LogUtils.info("Searched for product: " + productName);
    }

    @When("I select the first product from the search results")
    public void i_select_the_first_product_from_the_search_results() {
        // We are hijacking this step to click "Add to Cart" directly on the SERP based on your new strategy
        resultsPage.clickAddToCartDirectly();
        LogUtils.info("Clicked Add to Cart directly from the search results page.");
    }

    @When("I add the product to the cart")
    public void i_add_the_product_to_the_cart() {
        // Since it's already added, we just use this step to navigate to the cart via the top menu
        resultsPage.clickTopMenuCart();
        cartPage = new CartPage(driver);
        LogUtils.info("Navigated to the Cart page via top menu.");
    }

    @When("I proceed to buy from the cart page")
    public void i_proceed_to_buy_from_the_cart_page() {
        cartPage.clickProceedToBuy();
        loginPage = new LoginPage(driver);
        LogUtils.info("Clicked proceed to buy.");
    }

    @Then("I should be redirected to the Amazon Sign-In page")
    public void i_should_be_redirected_to_the_amazon_sign_in_page() {
        boolean isLoaded = loginPage.isLoginPageLoaded();
        LogUtils.info("Validating Login Page presence.");
        
        Assert.assertTrue(isLoaded, "Login page was not displayed successfully.");
        Assert.assertTrue(driver.getCurrentUrl().contains("signin"), "URL does not contain 'signin'");
    }
}