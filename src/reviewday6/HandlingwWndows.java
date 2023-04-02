package reviewday6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class HandlingwWndows {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String url = "https://www.salesforce.com/au/";
        driver.get(url);
        driver.manage().window().maximize();

        driver.findElement(By.xpath("(//a[contains(@aria-label, 'Start my free')])[1]")).click();

        Set<String>windows=driver.getWindowHandles();

        for (String window:windows){
            driver.switchTo().window(window);

            if(windows.contains("Free CMR")){
                driver.findElement(By.name("UserFirstName")).sendKeys("Ashish");
            driver.findElement(By.name("UserLastName")).sendKeys("Mishra");
        }
    }driver.quit();
        }


    }

