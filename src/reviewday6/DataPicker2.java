package reviewday6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class DataPicker2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String url = "https://www.expedia.ca/";
        driver.get(url);
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//button[@id='d1-btn']")).click();

        String month = "August";
        String day = "23";
        String year = "2023";

        boolean isFound = false;
        while (!isFound) {
            WebElement dateYear = driver.findElement(By.xpath("//h2[@class='uitk-date-picker-month-name uitk-type-medium']"));
            String textyear = dateYear.getText();

            String textYear2[] = textyear.split(" ");
            if (textYear2[0].equalsIgnoreCase(month) && textYear2[1].equalsIgnoreCase(year)) {

                List<WebElement> numbers = driver.findElements(By.xpath("//*[@id=\"app-layer-datepicker-check-in-out-start\"]/section/div[2]/div[2]/div[1]/div[3]/table"));

                for (WebElement number : numbers) {
                    String num1 = number.getText();
                    if (num1.equalsIgnoreCase(day)) {
                        //WebDriverWait wait=new WebDriverWait(driver,10);
                        //wait.until(ExpectedConditions.elementToBeClickable(number));
                        number.click();
                        isFound = true;
                        break;
                    }
                }
            } else {
                driver.findElement(By.xpath("//div[@class='uitk-calendar']//button[2]")).click();
            }


        }
    }
}