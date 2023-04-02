package reviewday6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingIframe {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String url = "https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html";
        driver.get(url);
        driver.manage().window().maximize();

        WebElement frameByElement=driver.findElement(By.xpath("//iframe[@name='packageListFrame']"));

        driver.switchTo().frame(frameByElement);
        WebElement clickFrame1= driver.findElement(By.xpath("//a[@target='packageFrame' and text()='org.openqa.selenium.bidi']"));
        clickFrame1.click();

        driver.switchTo().defaultContent();

        driver.switchTo().frame(2);

        driver.findElement(By.xpath("//a[text()='org.openqa.selenium'][1]")).click();
        driver.switchTo().defaultContent();

        driver.switchTo().frame("packageFrame");
        driver.findElement(By.xpath("//span[text()='HasBiDi']")).click();

        driver.switchTo().defaultContent();

        String title=driver.getTitle();
        System.out.println(title);
    }
}
