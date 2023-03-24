package class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickAction {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
        WebElement rightClickButton = driver.findElement(By.xpath("//span[text()='right click me']"));
        Actions act = new Actions(driver);
        act.contextClick(rightClickButton).perform();
    }
}