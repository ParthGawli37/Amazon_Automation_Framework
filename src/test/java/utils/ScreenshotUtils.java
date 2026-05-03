package utils;

import base.BaseClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ScreenshotUtils {

    /**
     * Takes a screenshot and saves it to the target directory.
     * Useful for local physical logs.
     */
    public static String takeScreenshotAsFile(String testName) {
        String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
        File srcFile = ((TakesScreenshot) BaseClass.getDriver()).getScreenshotAs(OutputType.FILE);
        String destDirPath = System.getProperty("user.dir") + "/target/Screenshots/";
        String destFilePath = destDirPath + testName + "_" + timestamp + ".png";

        try {
            Path targetPath = Paths.get(destFilePath);
            Files.createDirectories(targetPath.getParent());
            Files.copy(srcFile.toPath(), targetPath, StandardCopyOption.REPLACE_EXISTING);
            LogUtils.info("Screenshot saved successfully at: " + destFilePath);
        } catch (IOException e) {
            LogUtils.error("Failed to save screenshot: " + e.getMessage());
        }
        return destFilePath;
    }

    /**
     * Returns screenshot as bytes. 
     * Highly recommended for Extent-Cucumber adapters to embed directly into the HTML report.
     */
    public static byte[] getScreenshotAsBytes() {
        LogUtils.info("Capturing screenshot as byte array for Extent Report...");
        return ((TakesScreenshot) BaseClass.getDriver()).getScreenshotAs(OutputType.BYTES);
    }
}