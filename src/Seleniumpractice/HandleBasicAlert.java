package Seleniumpractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class HandleBasicAlert {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        String URL="https://selenium08.blogspot.com/2019/07/alert-test.html";

        driver.get(URL); driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//input[@id='simple']")).click();

        Alert alert=driver.switchTo().alert();

        String getText=driver.switchTo().alert().getText();
        System.out.println(getText);

        if(getText.equalsIgnoreCase("Hello! I am a simple alert box!")){alert.accept();
            System.out.println("It works");}
        else{
            System.out.println("Something went wrong");}
        //alert.accept();
        }

    }

