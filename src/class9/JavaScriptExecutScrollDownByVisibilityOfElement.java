package class9;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class JavaScriptExecutScrollDownByVisibilityOfElement {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        String url="https://selenium08.blogspot.com/2020/02/vertical-scroll.html";
        driver.get(url);driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement health= driver.findElement(By.xpath("//a[text()='Health']"));

        JavascriptExecutor scroll=(JavascriptExecutor) driver;
        scroll.executeScript("arguments[0].scrollIntoView();",health);


    }
}
