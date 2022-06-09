package team06.pages.testcase11;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team06.utilities.Driver;

public class VerificationPage11 {
    public VerificationPage11() {
        PageFactory.initElements(Driver.getDriver(), this);
<<<<<<< HEAD
}
=======
    }
>>>>>>> main



    @FindBy(xpath = "//a[@href='/view_cart']")
    public WebElement cartButton;

    @FindBy(xpath = "//h2[text()='Subscription']")
    public WebElement subscription;

    @FindBy(xpath= "//input[@id='susbscribe_email']")
    public WebElement emailAddressBox;

    @FindBy(xpath= "//button[@id='subscribe']")
    public WebElement arrowButton;

    @FindBy(xpath="//html[@lang='en']")
    public WebElement successfullySubscribedMessageDisabled;




}