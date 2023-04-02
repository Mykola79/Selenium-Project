package class9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.event.ActionListener;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Calundar2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String url = "https://www.delta.com/";
        driver.get(url);
        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement depart= driver.findElement(By.xpath("//span[text()='Depart']"));
        depart.click();
        WebElement month=driver.findElement(By.xpath("//span[@class='dl-datepicker-month-0']"));

        WebElement next= driver.findElement(By.xpath("//span[text()='Next']"));
        //next.click();

        boolean isFound=false;
        while(!isFound){
            String month1=month.getText();
            System.out.println(month1);

            if(month1.equalsIgnoreCase("July")){
                List<WebElement>days=driver.findElements(By.xpath("//table[@class='dl-datepicker-calendar']/tbody/tr/td"));

                for (WebElement days2:days){
                    String days3=days2.getText();
                    //System.out.println(days3);
                    if(days3.equalsIgnoreCase("20")){
                        days2.click();
                        isFound=true;
                        break;
                    }
                }
           }else {
               next.click();


        }




        /*WebElement calendar = driver.findElement(By.xpath("//span[text()='Depart']"));
        calendar.click();

        WebElement month = driver.findElement(By.xpath("//span[@class='dl-datepicker-month-0']"));

        WebElement next = driver.findElement(By.xpath("//span[text()='Next']"));
        //next.click();

        boolean isFound = false;

        while (!isFound) {
            String month1 = month.getText();

            if (month1.equalsIgnoreCase("January")) {

                List<WebElement> days = driver.findElements(By.xpath("//table[@class='dl-datepicker-calendar']/tbody/tr/td"));

                for (WebElement day : days) {

                    String dayText = day.getText();
                    if (dayText.equalsIgnoreCase("20")) {
                        day.click();
                        isFound = true;
                        break;
                    }
                }
            } else {
                next.click();
            }
        }*/
    }
}}


