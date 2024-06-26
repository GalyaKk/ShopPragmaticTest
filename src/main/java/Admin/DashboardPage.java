package Admin;

import Base.BasePage;
import org.openqa.selenium.By;

public class DashboardPage extends BasePage {

    private static final By HEADER = By.cssSelector("h1");

    public static By getHeader(){
        return HEADER;
    }

    public static String getHeaderText(){
        return BasePage.getTextFromElement(HEADER);
    }
}
