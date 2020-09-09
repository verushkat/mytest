package web.tests.heroku;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import web.functions.heroku.HerokuAppFunction;
import web.utils.TestBase;




public class HerokuAppNewWindow extends TestBase {

    private HerokuAppFunction herokuAppFunction;

    @BeforeClass
    public void runBeforeClass(){

        herokuAppFunction = new HerokuAppFunction(driver);
    }

    @Test
    public void newWindowTest(){




    }
}
