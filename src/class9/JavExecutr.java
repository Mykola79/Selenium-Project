package class9;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class JavExecutr {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        String url="http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";
        driver.get(url);driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement username =driver.findElement(By.xpath("//input[@id='txtUsername']"));
        username.sendKeys("Admin");

        JavascriptExecutor jvscr=(JavascriptExecutor) driver;
        jvscr.executeScript("arguments[0].style.border='5px dotted blue'",username);

        WebElement loginBtn= driver.findElement(By.xpath("//input[@id='btnLogin']"));
        jvscr.executeScript("arguments[0].click()",loginBtn);



        //js.executeScript("arguments[0].style.border='5px dotted blue'",username);

    }
}
