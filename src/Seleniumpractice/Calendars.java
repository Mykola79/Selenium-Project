package Seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Calendars {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String url = "https://www.expedia.ca/";
        driver.get(url);
        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);



        WebElement flightTab = driver.findElement(By.xpath("//span[text()='Flights']"));
        flightTab.click();
        WebElement depart = driver.findElement(By.xpath("//*[@id=\"d1-btn\"]"));
        depart.click();

        WebElement month= driver.findElement(By.xpath("//div[@class='uitk-layout-flex uitk-layout-flex-justify-content-space-between uitk-date-picker-menu-pagination-container']"));

        WebElement next = driver.findElement(By.xpath("//div[@class='uitk-layout-flex uitk-layout-flex-justify-content-space-between uitk-date-picker-menu-pagination-container']//button[1]"));

        boolean isFound = false;

        while (!isFound) {
            String month1 = month.getText();
            System.out.println(month1);

            if (month1.contains("April")){
                List<WebElement> days = driver.findElements(By.xpath("//div[@class='uitk-calendar']//div[1]//table[1]"));

            for (WebElement day : days) {

                String dayText = day.getText();

                System.out.println(dayText);

                    if (dayText.equalsIgnoreCase("30")) {
                        day.click();
                        isFound = true;
                        break;
                    }
                }
            } else {
                next.click();
            }
        }
    }
}