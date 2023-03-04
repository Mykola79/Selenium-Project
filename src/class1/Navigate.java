package class1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        //initiate the instance of Webdriver

        WebDriver driver=new ChromeDriver();
        driver.get("https://google.com");

        Thread.sleep(2000);

        //navigate to facebook.com
        driver.navigate().to("https://www.facebook.com/");

        Thread.sleep(2000);
        //go back
        driver.navigate().back();

        Thread.sleep(2000);

        //go to facebook

        driver.navigate().forward();
        Thread.sleep(2000);
        //refresh page
        driver.navigate().refresh();

        driver.close();
    }
}
