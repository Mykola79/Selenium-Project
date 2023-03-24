package class7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class TableSample3Columns {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String url = "https://www.techlistic.com/p/demo-selenium-practice.html";

        driver.manage().window().maximize();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        List<WebElement> rowsAndColumns = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td"));

        for (WebElement rAndCol:rowsAndColumns){
            System.out.println(rAndCol.getText());
        }
    }}
