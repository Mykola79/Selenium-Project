package class5;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationAlert {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.syntaxtechs.net/javascript-alert-box-demo.php");

        driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']")).click();
        Thread.sleep(2000);

        Alert alert=driver.switchTo().alert();

        String getText=driver.switchTo().alert().getText();
        System.out.println(getText);

        if(getText.equalsIgnoreCase("Press a button!")){
            alert.accept();
            System.out.println("Alert accepted");}
        else{alert.dismiss();
            System.out.println("Alert dismissed");
        }
    }}

