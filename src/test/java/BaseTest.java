import Utils.Browser;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class BaseTest {

    @BeforeClass
    public static void setup(){
        Browser.driverSetup();
    }

    @AfterClass
    public static void quit(){
        //Browser.driverQuit();
    }



}
