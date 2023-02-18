package techproed.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

public class Day20_Driver_Config_Test {

    @Test
    public void firstTest(){

        //       Go to Amazon

        //       driver -> Driver.getDriver()

        //       ConfigReader.getProperty("amazon_url") -> https://www.amazon.com
        Driver.getDriver().get(ConfigReader.getProperty("amazon_url"));     // driver.get("https://www.amazon.com")

        //       Assert that it's amazon in the title
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Amazon"));

        //       Close driver
        Driver.closeDriver();
    }
}
