package reviewday6;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class CaptureScreenShot {
    public static void main(String[] args) throws IOException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String url = "https://www.salesforce.com/au/";
        driver.get(url);
        driver.manage().window().maximize();

        TakesScreenshot take=(TakesScreenshot) driver;
        File file=take.getScreenshotAs(OutputType.FILE);
        File target=new File("C:\\Users\\Admin\\OneDrive\\Pictures\\Salesforce.png");
        FileUtils.copyFile(file,target);
    }
}
