package class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

public class CSSselector {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("http://www.facebook.com/");

        WebElement createNewButton=driver.findElement(By.cssSelector("a[data-testid= 'open-registration-form-button']"));
        createNewButton.click();


        Thread.sleep(2000);

        WebElement firstName=driver.findElement(By.cssSelector("input[name='firstname']"));
        firstName.sendKeys("efefefs");


    }
}
