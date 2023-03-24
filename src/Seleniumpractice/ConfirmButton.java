package Seleniumpractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ConfirmButton {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        String URL="https://selenium08.blogspot.com/2019/07/alert-test.html";

        driver.get(URL);driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//button[@id='confirm']")).click();

        Alert alert=driver.switchTo().alert();
        String getText=driver.switchTo().alert().getText();

        System.out.println(getText);
        if(getText.equalsIgnoreCase("This is a confirm alert. Do you want to accept or cancel?")){
            alert.accept();
            System.out.println("Accepted");}
        else{alert.dismiss();
            System.out.println("Canceled");
        }



    }
}
