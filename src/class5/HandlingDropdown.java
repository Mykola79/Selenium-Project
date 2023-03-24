package class5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class HandlingDropdown {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String url="https://www.orangehrm.com/contact-sales/";
        driver.get(url);driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement country= driver.findElement(By.xpath("//select[@name='Country']"));

        Select countries=new Select(country);

        //countries.selectByIndex(2);
       //countries.selectByValue("Austria");
        countries.selectByVisibleText("India");


    }
}