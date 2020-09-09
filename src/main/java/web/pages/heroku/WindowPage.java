package web.pages.heroku;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import web.pages.PageBase;

import java.util.ArrayList;

public class WindowPage extends PageBase {

    private By newWindowLink = By.linkText("Click Here");
    private By newWindowTitle = By.xpath("//h3[text()='New Window']");

    public WindowPage(WebDriver driver) {
        super(driver);
    }

    public void clickNewWindowLink(){
        driver.findElement(newWindowLink).click();

        ArrayList<String> tabs_windows = new ArrayList(this.driver.getWindowHandles());
        this.driver.switchTo().window((String)tabs_windows.get(1));


    }

    public boolean verifyNewWindowTitleDisplayed(){
        return driver.findElement(newWindowTitle).isDisplayed();
    }
}
