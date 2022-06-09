package team06.pages.testcase18;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team06.utilities.Driver;

public class TestPage18 {
    public TestPage18() {
        PageFactory.initElements(Driver.getDriver(), this);
    }



    @FindBy (xpath= "//h2[text()='Category']")
    public WebElement categoryText;

    @FindBy (xpath= "//a[@href='#Women']")
    public WebElement womenCategory;

    @FindBy (xpath= "//a[@href='/category_products/2']")
    public WebElement topsCategory;

    @FindBy (xpath= "//li[@class='active']")
    public WebElement topsCategoryPage;

    @FindBy (xpath= "//a[@href='#Men']")
    public WebElement menCategory;

    @FindBy (xpath= "//h2[text()='Women - Tops Products']")
    public WebElement womenTopsProducts;

    @FindBy (xpath= "//a[@href='/category_products/3']")
    public WebElement menTShirtsCategory;






}