package team06.pages.testcase1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team06.utilities.Driver;

public class AutomationExercisePage {
    public AutomationExercisePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@href='/login']")
    public WebElement signUpLoginLink;

    @FindBy(xpath = "//div[@class='signup-form']//h2")
    public WebElement newUserSignUpText;

    @FindBy(name = "name")
    public WebElement newUserSignUpNameBox;

    @FindBy(xpath = "(//input[@name='email'])[2]")
    public WebElement newUserSignUpEmailBox;

    @FindBy(xpath = "//button[@data-qa='signup-button']")
    public WebElement newUserSignUpSignUpButton;

    @FindBy(xpath = "//div[@class='login-form']//b")
    public WebElement enterAccountInformationText;

    @FindBy(xpath = "(//input[@type='radio'])[1]")
    public WebElement genderMrRadioButton;

    @FindBy(xpath = "(//input[@type='radio'])[2]")
    public WebElement genderMrsRadioButton;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement enterAccountInformationPasswordBox;

    @FindBy(name = "days")
    public WebElement dateOfBirthDayListBox;

    @FindBy(name = "months")
    public WebElement dateOfBirthMonthListBox;

    @FindBy(name = "years")
    public WebElement dateOfBirthYearListBox;

    @FindBy(name = "newsletter")
    public WebElement ourNewsletterCheckBox;

    @FindBy(name = "optin")
    public WebElement receiveSpecialCheckBox;

    @FindBy(xpath = "//*[@id='first_name']")
    public WebElement addressInformationFirstName;

    @FindBy(xpath = "//*[@id='last_name']")
    public WebElement addressInformationLastName;

    @FindBy(xpath = "//*[@id='company']")
    public WebElement addressInformationCompany;

    @FindBy(xpath = "//*[@id='address1']")
    public WebElement addressInformationAddress1;

    @FindBy(xpath = "//*[@id='address2']")
    public WebElement addressInformationAddress2;

    @FindBy(xpath = "//*[@id=\"country\"]")
    public WebElement addressInformationCountryDropbox;

    @FindBy(xpath = "//*[@id=\"state\"]")
    public WebElement addressInformationState;

    @FindBy(xpath = "//*[@id=\"city\"]")
    public WebElement addressInformationCity;

    @FindBy(xpath = "//*[@id=\"zipcode\"]")
    public WebElement addressInformationZipCode;

    @FindBy(xpath = "//*[@id=\"mobile_number\"]")
    public WebElement addressInformationMobileNumber;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement addressInformationCreateAccountButton;

    @FindBy(xpath = "//h2[@class='title text-center']")
    public WebElement accountCreatedText;

    @FindBy(xpath = "//a[@class='btn btn-primary']")
    public WebElement accountCreatedContinueButton;

    @FindBy(xpath = "//*[@id='header']/div/div/div/div[2]/div/ul/li[9]/a")
    public WebElement loggedInAsUsernameText;

    @FindBy(linkText = "Delete Account")
    public WebElement deleteAccountLink;






}
