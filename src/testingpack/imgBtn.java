package testingpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import java.util.List;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class group{
    @BeforeClass
    void setUpClass() {
        System.setProperty("webdriver.chrome.driver", "C://Users//Sagar//Desktop//chromedriver.exe");
    }
    @Test
    public void imagess() throws InterruptedException {
        ChromeDriver driver =new ChromeDriver();

        driver.get("https://opensource-demo.orangehrmlive.com/");
        List<WebElement> listImages = driver.findElements(By.tagName("img"));
        int counts = 0;
        for (WebElement image : listImages) {
            if ( image.isDisplayed()) {
                counts++;
            }
        }
        System.out.println("total Images: " + counts);
        driver.close();
    }
    @Test
    public void buttons() throws InterruptedException {
        ChromeDriver driver =new ChromeDriver();

        driver.get("http://www.way2automation.com/demo.html");
        List<WebElement> listButtons = driver.findElements(By.tagName("button"));

        int btns = 0;
        for (WebElement button : listButtons) {
            if(button.getText().equals("NameofButton")) {
                btns++;
            }
        }
        System.out.println("Total Buttons: " + btns);

        driver.close();
    }



}