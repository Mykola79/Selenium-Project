package class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebOrderTask {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");

        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        driver.manage().window();

        driver.findElement(By.id("ct100_MainContent_username")).sendKeys("Tester");
        driver.findElement(By.name("ct100$MainContent4username")).sendKeys("test");
        driver.findElement(By.className("button")).click();
    }
}
