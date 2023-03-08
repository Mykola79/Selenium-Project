package class5;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlert {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.syntaxtechs.net/javascript-alert-box-demo.php");

        WebElement promtBox= driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']"));
        promtBox.click();

        Alert alert=driver.switchTo().alert();
        alert.sendKeys("Hello");
        Thread.sleep(2000);
        alert.accept();
    }
}
