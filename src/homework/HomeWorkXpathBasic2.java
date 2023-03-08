package homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HomeWorkXpathBasic2 {
    public static void main(String[] args) {
        /*use xpath to complete this

go to http://practice.syntaxtechs.net/basic-first-form-demo.php (edited)
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
       WebDriver driver =new ChromeDriver();
       driver.get("http://practice.syntaxtechs.net/basic-first-form-demo.php");
       driver.manage().window().maximize();

       driver.findElement(By.xpath("//input[@id='user-message']")).sendKeys("Hello");

       WebElement showMessage= driver.findElement(By.xpath("//button[@class='btn btn-default']"));
       showMessage.click();

       driver.findElement(By.xpath("//input[@id='sum1']")).sendKeys("10");

       driver.findElement(By.xpath("//input[@id='sum2']")).sendKeys("20");

       WebElement clickTotal= driver.findElement(By.xpath("//button[contains(text(),'Get Total')]"));
       clickTotal.click();

        WebElement valuee= driver.findElement(By.xpath("//span[@id='displayvalue']"));




        String getTotalButtonType = valuee.getAttribute("id");

        System.out.println("The 'type' attribute of the 'Get Total' button is: " + getTotalButtonType);


        }





    }

