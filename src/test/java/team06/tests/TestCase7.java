package team06.tests;


import org.testng.Assert;
import org.testng.annotations.Test;
import team06.pages.testcase7.TestPage7;
import team06.utilities.ConfigReader;
import team06.utilities.Driver;

public class TestCase7 {
    TestPage7 testPage7;

    @Test
    public void testCase7(){
        Driver.getDriver().get(ConfigReader.getProperty("automation_exercise_url"));
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(),"https://www.automationexercise.com/");
        testPage7 = new TestPage7();
        testPage7.testCasesLink.click();
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(),"https://www.automationexercise.com/test_cases");

        Driver.closeDriver();



    }



}
