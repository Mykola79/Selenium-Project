package homework;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HomeWorkXpathText {
    public static void main(String[] args) {
        /*use xpath to complete this

goto http://practice.syntaxtechs.net/basic-first-form-demo.php (edited)
Syntax - Website to practice Syntax Automation Platform
Syntax Automation Platform has great examples like Ajax, JQuery, Bootstrap etc. which are used in most of the web
 applications around the world.

enter the message in the text box
click on show message

Enter value of a (edited)

Enter value of B
click on the button get total
also please print the value of the attribute type of the button GET TOTAL*/
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://practice.syntaxtechs.net/basic-first-form-demo.php");

        WebElement enterMessage= driver.findElement(By.xpath("//label[text()='Enter message']"));
                                                                    //<label for="message">Enter message</label>
        enterMessage.sendKeys("Hello");
        //System.out.println(enterMessage.getText());

        driver.findElement(By.xpath("//label[text()='Your Message: ']")).click();

        driver.findElement(By.xpath("label[text()='Enter a']")).sendKeys("10");

    }
}
