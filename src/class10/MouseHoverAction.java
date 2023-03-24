package class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class MouseHoverAction {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demo.opencart.com/");
        WebElement menuItem = driver.findElement(By.xpath("//a[text()='Components']"));

        Actions act = new Actions(driver);
        act.moveToElement(menuItem).perform();
        WebElement subMenuItem = driver.findElement(By.xpath("//a[contains(text(), 'Monitors')]"));
        act.moveToElement(subMenuItem).click().perform();
    }
}