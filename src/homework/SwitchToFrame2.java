package homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SwitchToFrame2 {
    public static void main(String[] args) {
        /*1.Open the Chrome browser and navigate to https://the-internet.herokuapp.com/iframe
2.Switch to the iframe on the page
3.Clear the existing text in the  editor inside the iframe
4.Enter the text "Hello World!" in the editor inside the iframe
5.Switch back to the main page*/
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        String URL = "https://the-internet.herokuapp.com/iframe";

        driver.get(URL);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        System.out.println("Switching to first frame from webpage");
        driver.switchTo().frame("mce_0_ifr");

        WebElement clr=driver.findElement(By.cssSelector("body p"));
        driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
        clr.clear();


        clr.sendKeys("Hello World");

        driver.switchTo().defaultContent();

        WebElement parentPage= driver.findElement(By.cssSelector("h3"));

        System.out.println(parentPage.getText());






    }
}
