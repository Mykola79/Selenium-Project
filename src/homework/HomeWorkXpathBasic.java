package homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HomeWorkXpathBasic {
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

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.syntaxtechs.net/basic-first-form-demo.php");

        driver.findElement(By.xpath("//input[@id='user-message']")).sendKeys("Hello");

        driver.findElement(By.xpath("//button[@onclick='showInput();']")).click();

        driver.findElement(By.xpath("//input[@id='sum1']")).sendKeys("10");

        driver.findElement(By.xpath("//input[@id='sum2']")).sendKeys("20");

        WebElement getTotal = driver.findElement(By.xpath("//button[@onclick='return total()']"));

        getTotal.click();
        List<WebElement> displayvaluee=driver.findElements(By.tagName("span"));



        //String str=displayvaluee.getAttribute("30");
        //<span id="displayvalue">30</span>
        //String valuee = displayvaluee.getAttribute("30");
        for(WebElement radios:displayvaluee){
            String str= radios.getAttribute("span");
        System.out.println(radios.getAttribute(str));}


        //System.out.println("Get Total ");

        /*List<WebElement> tags = webDriver.findElements(By.tagName("a"));

        for (WebElement tag:tags){
            String link = tag.getAttribute("href");
            System.out.println(link);}*/
    }
}
