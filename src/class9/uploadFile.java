package class9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class uploadFile {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        String url="https://the-internet.herokuapp.com/upload";
        driver.get(url);driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement fileUpload= driver.findElement(By.xpath("//input[@id='file-upload']"));

        fileUpload.sendKeys("C:\\Users\\Admin\\OneDrive\\Documents\\Type Casting.docx");



    }
}
