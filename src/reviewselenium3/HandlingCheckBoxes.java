package reviewselenium3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCheckBoxes {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.get("https://itera-qa.azurewebsites.net/home/automation");

        driver.findElement(By.xpath("//input[@id='monday']")).click();
    }
}
