package class9;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Javexecitr2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        String url="https://www.google.com";
        driver.get(url);driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement search= driver.findElement(By.xpath("//input[@name='q']"));
        WebElement click= driver.findElement(By.xpath("//input[@name ='btnK']"));

        JavascriptExecutor jvr=(JavascriptExecutor) driver;

        //jvr.executeScript("arguments[0].value='Selenium'",search);
        //jvr.executeScript("arguments[0].click()",click);

        jvr.executeScript("arguments[0].value = 'Selenium',arguments[1].click()", search,click);
        // js.executeScript("arguments[0].value = 'Selenium', arguments[1].click()", search, submit)

    }
}
