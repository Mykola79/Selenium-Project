package reviewday6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class HandlingImplicitWait {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String url = "http://janbaskdemo.com/";
        driver.get(url);
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//i[@class='fa fa-user']")).click();

        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//a[text()='Login']")).click();
    }
}
