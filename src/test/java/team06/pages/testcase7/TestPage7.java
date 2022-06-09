package team06.pages.testcase7;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team06.utilities.Driver;

public class TestPage7 {

    public TestPage7(){PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(linkText = "Test Cases")
    public WebElement testCasesLink;



}
