package class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingElements {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");

//send username
        driver.findElement(By.id("email")).sendKeys("kuk");
        //send password
        driver.findElement(By.id("pass")).sendKeys("kuki");
//create account
        driver.findElement(By.linkText("Create new account")).click();







    }

}