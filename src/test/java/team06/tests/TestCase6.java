package team06.tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import team06.pages.testcase6.TestPage6;
import team06.utilities.ConfigReader;
import team06.utilities.Driver;

public class TestCase6 {

    WebDriver driver = Driver.getDriver();
    TestPage6 testPage6 = new TestPage6();

    @Test
    public void testCase6() throws InterruptedException {
        // Launch browser
        // Navigate to url 'http://automationexercise.com'
        driver.get(ConfigReader.getProperty("automation_exercise_url"));
        // Verify that home page is visible successfully
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(),"https://www.automationexercise.com/");
        // Click on 'Contact Us' button
        testPage6.contactUsLink.click();
        // Verify 'GET IN TOUCH' is visible
        Assert.assertTrue(testPage6.getInTouchText.isDisplayed());
        // Enter name,
        testPage6.nameBox.sendKeys(ConfigReader.getProperty("user_name"));
        // email,
        testPage6.emailBox.sendKeys(ConfigReader.getProperty("user_email"));
        // subject
        testPage6.subjectBox.sendKeys("subject");
        // message
        testPage6.messageBox.sendKeys("message");
        // Upload file
        testPage6.uploadFile.sendKeys("/Users/nzmyldz/Desktop/logo.jpeg");
        // Click 'Submit' button
        Thread.sleep(2000);
        testPage6.submitButton.click();
        // Click OK button
        driver.switchTo().alert().accept();
        // Verify success message 'Success! Your details have been submitted successfully.' is visible
        String statusMessageText = testPage6.statusMessage.getText();
        Assert.assertEquals(statusMessageText,"Success! Your details have been submitted successfully.");
        // Click 'Home' button and verify that landed to home page successfully
        testPage6.homeButton.click();
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(),ConfigReader.getProperty("automation_exercise_url"));
    }
}
