package web.functions.heroku;


import org.openqa.selenium.WebDriver;
import web.functions.GUIFunctionBase;
import web.pages.heroku.WindowPage;

public class WindowFunction extends GUIFunctionBase {

    private WindowPage windowPage;
    public WindowFunction(WebDriver driver) {
        super(driver);
        windowPage = new WindowPage(driver);
    }

    public void clickNewWindowLink(){
        windowPage.clickNewWindowLink();
    }

    public boolean verifyNewWindowTitleDisplayed(){
        return windowPage.verifyNewWindowTitleDisplayed();
    }
}
