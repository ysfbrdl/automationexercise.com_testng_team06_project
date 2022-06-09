package team06.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import team06.pages.testcase1.AutomationExercisePage;
import team06.pages.testcase4.TestPage4;
import team06.utilities.ConfigReader;
import team06.utilities.Driver;

public class TestCase4 {

    TestPage4 testPage4 = new TestPage4();

    @Test
    public void testCase4(){
        // 1. Launch browser
        // 2. Navigate to url 'http://automationexercise.com/'
        Driver.getDriver().get(ConfigReader.getProperty("automation_exercise_url"));

        // 3. Verify that home page is visible successfully
        Assert.assertTrue(testPage4.homePageLogo.isDisplayed());

        //4. Click on 'Signup / Login' button
        testPage4.signupLoginButton.click();

        //5. Verify 'Login to your account' is visible
        Assert.assertTrue(testPage4.loginToYourAccount.isDisplayed());

        //6. Enter correct email address and password
        testPage4.eMail.sendKeys(ConfigReader.getProperty("user_email"));
        testPage4.password.sendKeys(ConfigReader.getProperty("user_password"));

        //7. Click 'login' button
        testPage4.loginButton.click();

        //8. Verify that 'Logged in as username' is visible  ("Logged in as Bilge")
        Assert.assertEquals("Logged in as team06",testPage4.loggedInAsTeam06.getText());

        //9. Click 'Logout' button
        testPage4.logoutButton.click();

        //10. Verify that user is navigated to login page
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(),"https://www.automationexercise.com/login");


        Driver.closeDriver();










    }
}