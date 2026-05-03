package stepdefinitions;

import base.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utils.ConfigReader;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Hooks {
    private static final Logger logger = LogManager.getLogger(Hooks.class);

    @Before
    public void setup() {
        logger.info("Initializing WebDriver...");
        BaseClass.initializeDriver(ConfigReader.getProperty("browser"));
    }

    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            logger.error("Scenario failed! Taking screenshot...");
            final byte[] screenshot = ((TakesScreenshot) BaseClass.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "Failed_Screenshot"); 
        }
        logger.info("Closing WebDriver...");
        BaseClass.tearDown();
    }
}