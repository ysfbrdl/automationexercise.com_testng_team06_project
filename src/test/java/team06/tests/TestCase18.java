package team06.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import team06.pages.testcase11.VerificationPage11;
import team06.pages.testcase18.TestPage18;
import team06.utilities.ConfigReader;
import team06.utilities.Driver;

public class TestCase18 {
    TestPage18 testPage18;


  @Test
    public void categoryPage() {
        testPage18 = new TestPage18();
//        1. Launch browser
//        2. Navigate to url 'http://automationexercise.com/'
        Driver.getDriver().get(ConfigReader.getProperty("automation_exercise_url"));
  //      3. Verify that categories are visible on left side bar/
        Assert.assertTrue(testPage18.categoryText.isDisplayed());
        //      4. Click on 'Women' category
        testPage18.womenCategory.click();

  //      5. Click on any category link under 'Women' category, for example: Dress
        testPage18.topsCategory.click();
  //      6. Verify that category page is displayed and confirm text 'WOMEN - TOP PRODUCTS'
        Assert.assertTrue(testPage18.topsCategoryPage.isDisplayed());

        Assert.assertTrue(testPage18.womenTopsProducts.isDisplayed());


  //      7. On left side bar, click on any sub-category link of 'Men' category
        testPage18.menCategory.click();
        testPage18.menTShirtsCategory.click();

  //      8. Verify that user is navigated to that category page



    }
}
