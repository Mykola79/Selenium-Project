package homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Instant;
import java.util.concurrent.TimeUnit;

public class HiddenElement {
    public static void main(String[] args){
        /*1.Open the Chrome browser and navigate to https://the-internet.herokuapp.com/dynamic_loading/1
2.Click on the "Start" button to initiate the loading of a hidden element
3.Without using Thread.sleep(), write a code that waits for the hidden element to appear using Implicit Wait
4.Click the "Finish" button to reveal the hidden element
5.Verify that the text "Hello World!" is now displayed on the page*/

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        String URL="https://the-internet.herokuapp.com/dynamic_loading/1";
        driver.navigate().to(URL);

        driver.findElement(By.xpath("//button")).click();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

        driver.findElement(By.xpath("//div[@id='finish']")).click();

        //WebElement helloWorldText = driver.findElement(By.xpath("//div[@id='finish']/h4"));
        WebElement helloWorldText = driver.findElement(By.xpath("//h4[text()='Hello World!']"));
        String actualText = helloWorldText.getText();
        System.out.println(actualText);
        String expectedText = "Hello World!";
        if (actualText.equals(expectedText)) {
            System.out.println("Text verification passed!");
        } else {
            System.out.println("Text verification failed!");
        }
 }
}
