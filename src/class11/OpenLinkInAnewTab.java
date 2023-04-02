package class11;

import class9.DragAndDrop;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

public class OpenLinkInAnewTab {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String url = "https://demo.nopcommerce.com/";
        driver.get(url);
        driver.manage().window().maximize();


        String anotherTab=Keys.chord(Keys.CONTROL,Keys.RETURN);
        driver.findElement(By.linkText("Register")).sendKeys(anotherTab);
    }
}