package reviewday6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class DatePicker3 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String url = "https://www.redbus.in/";
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//label[@for='onward_cal']")).click();

        String month = "Jun";
        String day = "23";
        String year = "2023";


        boolean isFound = false;
        while (!isFound) {
            String montTitle = driver.findElement(By.xpath("//td[@class='monthTitle']")).getText();

            String monthYear2[] = montTitle.split(" ");

            if (monthYear2[0].equals(month) && monthYear2[1].equals(year)) {
                List<WebElement> days = driver.findElements(By.xpath("//table[@class='rb-monthTable first last']//tr/td"));

                for (WebElement day1 : days) {
                    String day2 = day1.getText();
                    if (day2.equalsIgnoreCase(day)) {
                        day1.click();
                        isFound = true;
                        break;}
                    }
                }
        else{
                    driver.findElement(By.xpath("//td[@class='next']")).click();

                }

            }
        }
    }