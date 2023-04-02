package class11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureToolTip {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        String url="https://jqueryui.com/tooltip/";
        driver.get(url);
        driver.manage().window().maximize();

        driver.switchTo().frame(0);
        WebElement age=driver.findElement(By.xpath("//*[@id=\"age\"]"));
        String title=age.getAttribute("title");
        System.out.println(title);

    }
}
