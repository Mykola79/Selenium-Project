package reviewselenium3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HandlingLastTwhoBoxes {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.get("https://itera-qa.azurewebsites.net/home/automation");

        List<WebElement>days=driver.findElements(By.xpath("//input[@type='checkbox' and contains(@id,'day')]"));

        for(int i=5;i<days.size();i++){
            days.get(i).click();
        }
    }
}
