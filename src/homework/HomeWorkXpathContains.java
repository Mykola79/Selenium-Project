package homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWorkXpathContains {
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

        WebElement enterMessage=driver.findElement(By.xpath("//input[contains(@placeholder,'Please enter')]"));
        enterMessage.sendKeys("Hello");

        WebElement showMessage=driver.findElement(By.xpath("//button[contains(@onclick,'showInput')]"));
        showMessage.click();

        WebElement enterValue1= driver.findElement(By.xpath("//input[contains(@id,'sum1')]"));
        enterValue1.sendKeys("10");

        WebElement enterValue2= driver.findElement(By.xpath("//input[contains(@id,'sum2')]"));
        enterValue2.sendKeys("20");

        WebElement getTotal=driver.findElement(By.xpath("//button[contains(@onclick,'return total')]"));
        getTotal.click();


        String getValue=getTotal.getText();

        System.out.println(getValue+" 30");


    }
}
