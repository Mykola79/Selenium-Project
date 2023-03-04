package homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork222 {/*HW2
navigate/get to fb.com
click on create new account
fill up all the textboxes
click on sign up button
close the pop up
close the browser

TIP for HW2:
just fill in text boxes or button, no need to deal with other webElements

also u will need a Thread.sleep after clicking on create new account*/

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.facebook.com/");

        driver.findElement(By.partialLinkText("Create new account")).click();

        Thread.sleep(2000);
        driver.findElement(By.name("firstname")).sendKeys("Nona");
        driver.findElement(By.name("lastname")).sendKeys("Korta");
        driver.findElement(By.name("reg_email__")).sendKeys("12345678901");
        driver.findElement(By.name("reg_passwd__")).sendKeys("lokonako");
        driver.findElement(By.name("birthday_month")).sendKeys("Feb");
        driver.findElement(By.name("birthday_day")).sendKeys("14");
        driver.findElement(By.name("birthday_year")).sendKeys("1990");
        //driver.findElement(By.name("sex")).click();
        //driver.findElement(By.name("websubmit")).click();
        
        //Thread.sleep(1000);
        //driver.close();





    }
}
