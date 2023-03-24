package homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitDemo3 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        String url="https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver";
        driver.get(url);driver.manage().window().maximize();

        driver.findElement(By.xpath("//button[@id='enable-button']")).click();

        WebDriverWait wait=new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='enable-button']")));

        WebElement eneabled= driver.findElement(By.xpath("//button[@id='enable-button']"));

        if(eneabled.isEnabled()){
            System.out.println("Test enabled passed");}

    }
}
