package team06.pages.testcase10;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team06.pages.testcase1.AutomationExercisePage;
import team06.utilities.Driver;

public class TestPage10 {
    public TestPage10(){PageFactory.initElements(Driver.getDriver(),this); }

    @FindBy(xpath = "//a[@href='/']")
    public WebElement homePage;

    @FindBy(xpath = "//div[@class='footer-bottom']")
    public WebElement footer;

    @FindBy(xpath = "//*[text()='Subscription']")
    public WebElement subscription;

    @FindBy(xpath = "//input[@id='susbscribe_email']")
    public WebElement subEmail;

    @FindBy (xpath = "//i[@class='fa fa-arrow-circle-o-right']")
    public WebElement subArrowClick;

    @FindBy (xpath = "//div[@class='alert-success alert']")
    public WebElement successAlert;

}
