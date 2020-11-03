package testingpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Samplefile{
    @Test
    public void testlogo() throws Exception{
        System.setProperty("webdriver.chrome.driver", "C://Users//Sagar//Desktop//chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://www.way2automation.com/demo.html");
        // for the site
        String actualTitle = "Welcome";
        //title on the site
        Assert.assertEquals(driver.getTitle(), actualTitle);
        WebElement logo = driver.findElement(By.className("logo")  );
        Assert.assertEquals(true, logo.isDisplayed());
        //checking if the logo is displayed or not
        System.out.println("pass");
        //statement if it is correct


        driver.close(); //to close the driver
    }

}
