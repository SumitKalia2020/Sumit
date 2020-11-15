import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeTestCase_demo {

    @BeforeMethod
    void setup()
    {
        System.out.println("I am setting up some configuration");
    }

    @AfterMethod
    void done()
    {
        System.out.println("The Tests case execution is completed");
    }

    @Test(priority = 1)
    void login()
    {
        System.out.println("This is login test");
    }

    @Test(priority = 3)
    void teardown()
    {
        System.out.println("Closing the browser");
    }


}
