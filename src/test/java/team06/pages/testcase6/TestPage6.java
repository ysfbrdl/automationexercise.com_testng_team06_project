package team06.pages.testcase6;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team06.utilities.Driver;

public class TestPage6 {

    public TestPage6() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(linkText = "Contact us")
    public WebElement contactUsLink;
    @FindBy(xpath = "(//h2[@class='title text-center'])[2]")
    public WebElement getInTouchText;
    @FindBy(xpath = "//input[@name='name']")
    public WebElement nameBox;
    @FindBy(xpath = "//input[@name='email']")
    public WebElement emailBox;
    @FindBy(xpath = "//input[@name='subject']")
    public WebElement subjectBox;
    @FindBy(css = "#message")
    public WebElement messageBox;
    @FindBy(xpath = "//input[@name='upload_file']")
    public WebElement uploadFile;
    @FindBy(xpath = "//input[@name='submit']")
    public WebElement submitButton;
    @FindBy(css = ".status")
    public WebElement statusMessage;
    @FindBy(xpath = "//i[@class='fa fa-angle-double-left']")
    public WebElement homeButton;
}
