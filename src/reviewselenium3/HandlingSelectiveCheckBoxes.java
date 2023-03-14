package reviewselenium3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HandlingSelectiveCheckBoxes {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.get("https://itera-qa.azurewebsites.net/home/automation");

        List<WebElement>days=driver.findElements(By.xpath("//input[contains(@id,'day') and @type='checkbox']"));

        for (WebElement threeDays: days){
            if(threeDays.getAttribute("id").equalsIgnoreCase("Tuesday")
                    || threeDays.getAttribute("id").equalsIgnoreCase("Friday")
                || threeDays.getAttribute("id").equalsIgnoreCase("Saturday")){
                threeDays.click();
            }
        }


    }
}
