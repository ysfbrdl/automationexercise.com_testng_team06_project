package team06.pages.testcase4;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team06.utilities.Driver;

public class TestPage4 {

    public TestPage4(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//img[@src='/static/images/home/logo.png']")
    public WebElement homePageLogo;

    @FindBy(xpath = "//a[@href='/login']")
    public WebElement signupLoginButton;

    @FindBy(xpath = "//*[text()='Login to your account']")
    public WebElement loginToYourAccount;

    @FindBy(xpath = "(//input[@type='email'])[1]")
    public WebElement eMail;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement password;

    @FindBy(xpath = "//button[@data-qa='login-button']")
    public WebElement loginButton ;

    @FindBy(xpath = "(//a)[10]")
    public WebElement loggedInAsTeam06;

    @FindBy(xpath = "//a[@href='/logout']")
    public WebElement logoutButton ;

}
