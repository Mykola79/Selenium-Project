package class9;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Skrinshot {
    public static void main(String[] args) throws IOException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        String url="https://www.facebook.com";
        driver.get(url);driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //driver.findElement(By.xpath("//*[@id='ctl00_MainContent_username']")).sendKeys("Tester");
        //driver.findElement(By.xpath("//*[@id='ctl00_MainContent_password']")).sendKeys("test");
        //driver.findElement(By.xpath("//*[@id='ctl00_MainContent_login_button']")).click();
        WebElement element = driver.findElement(By.xpath("//input[@name='email']"));
        element.sendKeys("Deepak");

        //Full page Screen Shot
        TakesScreenshot ss=(TakesScreenshot) driver;
        File sourceFile=ss.getScreenshotAs(OutputType.FILE);
        File desFile = new File("C:\\Users\\Admin\\OneDrive\\Pictures\\Screenshots.jpeg");
        FileUtils.copyFile(sourceFile,desFile);


        //Screenshot of portion of the page with WebElement
        /*WebElement portion=driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']"));
        File sourceFile=portion.getScreenshotAs(OutputType.FILE);
        File desFile = new File("C:\\Users\\Admin\\OneDrive\\Pictures\\Screenshots.jpeg");
        FileUtils.copyFile(sourceFile,desFile);*/



        System.out.println("Taking Screenshots");
        driver.close();

    }
}
