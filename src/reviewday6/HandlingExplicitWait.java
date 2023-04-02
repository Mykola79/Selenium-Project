package reviewday6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;

public class HandlingExplicitWait {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        String url="http://janbaskdemo.com/";
        driver.get(url);
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//i[@class='fa fa-user']")).click();

        WebElement login=driver.findElement(By.xpath("//a[text()='Login']"));

        WebDriverWait wait=new WebDriverWait(driver,2);
        wait.until(ExpectedConditions.elementToBeClickable(login));
        login.click();


    }
}
