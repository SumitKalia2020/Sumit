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

        //Test Condition 1: If Page title matches with actualTitle then it finds email title and enters the value which we pass
        driver.get("https://www.way2automation.com/demo.html");
        String actualTitle = "Welcome";
        Assert.assertEquals(driver.getTitle(), actualTitle);

        WebElement logo = driver.findElement(By.className("logo")  );
        Assert.assertEquals(true, logo.isDisplayed());
        System.out.println("pass");


        driver.close();
    }

}
