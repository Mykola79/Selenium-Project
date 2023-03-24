package class5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class DropDownWithLoop2 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String url = "https://www.hdfcbank.com/";
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement productTypeDdl = driver.findElement(By.xpath("//a[text()='Select Product Type']"));
        productTypeDdl.click();
        List<WebElement> productType = driver.findElements(By.xpath("//div[@class='dropdown open']//li"));

        for (WebElement product : productType) {
            String productName = product.getText();
            if (productName.equalsIgnoreCase("Loans")) {
                product.click();
                break;
            }
        }


    }
}
