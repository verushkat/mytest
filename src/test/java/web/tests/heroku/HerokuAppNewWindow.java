package web.tests.heroku;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import web.functions.heroku.HerokuAppFunction;
import web.functions.heroku.WindowFunction;
import web.utils.TestBase;




public class HerokuAppNewWindow extends TestBase {

    private WindowFunction windowFunction;

    @BeforeClass
    public void runBeforeClass(){

        windowFunction = new WindowFunction(driver);
        driver.get("http://the-internet.herokuapp.com/windows"); 
    }

    @Test
    public void newWindowTest(){


        windowFunction.clickNewWindowLink();

        softAssert.assertTrue(windowFunction.verifyNewWindowTitleDisplayed() , " New window not displayed");
        softAssert.assertAll();



    }
}
