package homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SwitchToFrame {
    public static void main(String[] args) throws InterruptedException {
        /*1.Open the Chrome browser and navigate to https://the-internet.herokuapp.com/iframe
2.Switch to the iframe on the page
3.Clear the existing text in the  editor inside the iframe
4.Enter the text "Hello World!" in the editor inside the iframe
5.Switch back to the main page*/
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("https://the-internet.herokuapp.com/iframe");

        //Thread.sleep(2000);

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        driver.switchTo().frame(0);

        WebElement findText= driver.findElement(By.xpath("//p"));

        findText.clear();
        driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
        findText.sendKeys("Hello World!");

        driver.switchTo().defaultContent();

        WebElement text= driver.findElement(By.xpath("//h3"));

        System.out.println(text.getText());

    }
}
