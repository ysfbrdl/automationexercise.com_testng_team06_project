package team06.tests;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import team06.pages.testcase1.AutomationExercisePage;
import team06.pages.testcase10.TestPage10;
import team06.utilities.ConfigReader;
import team06.utilities.Driver;

public class TestCase10 {
   TestPage10 testPage10 = new TestPage10();

    @Test
    public void testTenth() throws InterruptedException {

        // 1. Launch browser

        //2. Navigate to url 'http://automationexercise.com'
        Driver.getDriver().get("http://automationexercise.com");

        // 3. Verify that home page is visible successfully
       Assert.assertTrue(testPage10.homePage.isDisplayed());

        //4.Scroll down to footer
        testPage10.homePage.sendKeys(Keys.PAGE_DOWN);

        //5. Verify text 'SUBSCRIPTION'
        Assert.assertTrue(testPage10.subscription.isDisplayed());

        // 6. Enter email address in input and click arrow button
      //  testPage10.subEmail.sendKeys(ConfigReader.getProperty("user_email"));
       testPage10.subEmail.sendKeys(Faker.instance().internet().emailAddress());
       Thread.sleep(3000);
        testPage10.subArrowClick.click();

        //7.Verify success message 'You have been successfully subscribed!' is visible
      Assert.assertTrue(testPage10.successAlert.isDisplayed());
      //  Assert.assertEquals(testPage10.successAlert,"You have been successfully subscribed!");
        System.out.println(testPage10.successAlert.getText());





    }
}
