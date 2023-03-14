package class6;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Set;

public class FrameByIndex {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://www.uitestpractice.com/Students/Switchto");
        /* Locate the first iframe and switch driver to first iframe by index value 0.
        driver.switchTo().frame(0);*/

        driver.switchTo().frame(0);

        WebElement textBox = driver.findElement(By.xpath("//input[@id='name']"));
        textBox.sendKeys("Hello");

        driver.switchTo().defaultContent();

        WebElement text = driver.findElement(By.xpath("//h3"));

        System.out.println("the text is "+text.getText());





        //driver.switchTo().frame(0);







    }
}
