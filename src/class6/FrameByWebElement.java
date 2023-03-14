package class6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameByWebElement {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.uitestpractice.com/Students/Switchto");
        driver.manage().window().maximize();

        // Locate frame by WebElement.

        WebElement findFrameElemenet = driver.findElement(By.xpath("//iframe[@name='iframe_a']"));

        driver.switchTo().frame(findFrameElemenet);

        WebElement text = driver.findElement(By.xpath("//input[@id='name']"));
        text.sendKeys("Hello");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        text.clear();

        driver.switchTo().defaultContent();

        WebElement clickLink=driver.findElement(By.xpath("//h3"));
        System.out.println(clickLink.getText());
    }}

