package utils;

import org.testng.annotations.DataProvider;

public class TestDataProvider {
    @DataProvider(name = "searchData")
    public static Object[][] getSearchData() {
        return new Object[][]{
            {"laptop"},
            {"mobile phone"}
        };
    }
}