package class6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameByNameOrId {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.uitestpractice.com/Students/Switchto");
        driver.manage().window().maximize();

        // Locate iframe and switch driver context to first iframe by value of name attribute.

        driver.switchTo().frame("iframe_a");

        WebElement label=driver.findElement(By.xpath("//label"));
        System.out.println(label.getText());

        driver.switchTo().defaultContent();

        //WebElement parent=driver.findElement(By.xpath("//h3"));
        //System.out.println(parent.getText());






    }
}
