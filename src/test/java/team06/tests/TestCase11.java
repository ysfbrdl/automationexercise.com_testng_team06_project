package team06.tests;

import com.github.javafaker.Faker;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import team06.pages.testcase1.AutomationExercisePage;
import team06.pages.testcase11.VerificationPage11;
import team06.utilities.ConfigReader;
import team06.utilities.Driver;

import java.time.Duration;

public class TestCase11 {
    VerificationPage11 verificationPage11 ;

    Faker faker;


    @Test
    public void verifySubscriptionInCart() {
        verificationPage11=new VerificationPage11();
//        1. Launch browser
//        2. Navigate to url 'http://automationexercise.com/'
        Driver.getDriver().get(ConfigReader.getProperty("automation_exercise_url"));
//        3. Verify that home page is visible successfully
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), "https://www.automationexercise.com/");

        //       4. Click 'Cart' button
            verificationPage11.cartButton.click();
        //      5. Scroll down to footer

        Actions action=new Actions(Driver.getDriver());
        action.sendKeys(Keys.PAGE_DOWN).build().perform();
        //       6. Verify text 'SUBSCRIPTION'
        Assert.assertTrue(verificationPage11.subscription.isDisplayed());

//        7. Enter email address in input and click arrow button
        String fakeremail=Faker.instance().internet().emailAddress();
        System.out.println(fakeremail);
        verificationPage11.emailAddressBox.sendKeys(fakeremail);
        verificationPage11.arrowButton.click();


        //       8. Verify success message 'You have been successfully subscribed!' is visible
        Assert.assertTrue(verificationPage11.successfullySubscribedMessageDisabled.isDisplayed(),"not visible");


        Driver.closeDriver();
    }
}
