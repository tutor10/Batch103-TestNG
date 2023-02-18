package techproed.tests;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Day20_SoftAssertion {

    @Test
    public void softAsssertTest(){

        // SoftAssert object create
        SoftAssert softAssert = new SoftAssert();

        System.out.println("Row 13");
        softAssert.assertEquals(2,5);
        System.out.println("Row 15");
        softAssert.assertTrue("JAVA".contains("U"));
        System.out.println("Row 17");


    }


}
