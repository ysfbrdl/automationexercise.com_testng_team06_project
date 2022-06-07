package team06.tests;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import team06.pages.testcase1.AutomationExercisePage;
import team06.utilities.ConfigReader;
import team06.utilities.Driver;

public class TestCase1 {
    AutomationExercisePage automationExercisePage = new AutomationExercisePage();

    @Test
    public void registerUser(){
//        1. Launch browser
//        2. Navigate to url 'http://automationexercise.com/'
        Driver.getDriver().get(ConfigReader.getProperty("automation_exercise_url"));
//        3. Verify that home page is visible successfully
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(),"https://www.automationexercise.com/");
//        4. Click on 'Signup / Login' link
        automationExercisePage.signUpLoginLink.click();
//        5. Verify 'New User Signup!' is visible
        Assert.assertTrue(automationExercisePage.newUserSignUpText.isDisplayed());
//        6. Enter name and email address
        automationExercisePage.newUserSignUpNameBox.sendKeys(Faker.instance().name().fullName());
        automationExercisePage.newUserSignUpEmailBox.sendKeys(Faker.instance().internet().emailAddress());
//        7. Click 'Signup' button
        automationExercisePage.newUserSignUpSignUpButton.click();
//        8. Verify that 'ENTER ACCOUNT INFORMATION' is visible
        Assert.assertTrue(automationExercisePage.enterAccountInformationText.isDisplayed());
//        9. Fill details: Title, Password, Date of birth
        automationExercisePage.genderMrRadioButton.click();
        automationExercisePage.enterAccountInformationPasswordBox.sendKeys(Faker.instance().internet().password());
        automationExercisePage.dateOfBirthDayListBox.sendKeys("25");
        automationExercisePage.dateOfBirthMonthListBox.sendKeys("April");
        automationExercisePage.dateOfBirthYearListBox.sendKeys("1982");
//        10. Select checkbox 'Sign up for our newsletter!'
        automationExercisePage.ourNewsletterCheckBox.sendKeys(Keys.ENTER);
//        11. Select checkbox 'Receive special offers from our partners!'
        automationExercisePage.receiveSpecialCheckBox.sendKeys(Keys.ENTER);
//        12. Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
        automationExercisePage.addressInformationFirstName.sendKeys(Faker.instance().name().firstName());
        automationExercisePage.addressInformationLastName.sendKeys(Faker.instance().name().lastName());
        automationExercisePage.addressInformationCompany.sendKeys(Faker.instance().company().name());
        automationExercisePage.addressInformationAddress1.sendKeys(Faker.instance().address().fullAddress());
        automationExercisePage.addressInformationAddress2.sendKeys(Faker.instance().address().fullAddress());
        Select select = new Select(automationExercisePage.addressInformationCountryDropbox);
        select.selectByIndex(2); //Canada
        automationExercisePage.addressInformationState.sendKeys(Faker.instance().address().state());
        automationExercisePage.addressInformationCity.sendKeys(Faker.instance().address().city());
        automationExercisePage.addressInformationZipCode.sendKeys(Faker.instance().address().zipCode());
        automationExercisePage.addressInformationMobileNumber.sendKeys(Faker.instance().phoneNumber().cellPhone());
//        13. Click 'Create Account button'
        automationExercisePage.addressInformationCreateAccountButton.click();
//        14. Verify that 'ACCOUNT CREATED!' is visible
        Assert.assertTrue(automationExercisePage.accountCreatedText.isDisplayed());
//        15. Click 'Continue' button
        automationExercisePage.accountCreatedContinueButton.click();
//        16. Verify that 'Logged in as username' is visible
        Assert.assertTrue(automationExercisePage.loggedInAsUsernameText.isDisplayed());
//        17. Click 'Delete Account' button
        automationExercisePage.deleteAccountLink.click();
//        18. Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button
        //Web page has problem about this step

        Driver.closeDriver();
    }
}
