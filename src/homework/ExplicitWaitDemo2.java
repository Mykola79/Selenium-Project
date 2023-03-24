package homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitDemo2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        String url="https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver";
        driver.get(url);driver.manage().window().maximize();

        driver.findElement(By.xpath("//button[@id='display-other-button']")).click();

        WebDriverWait wait=new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'Enabled')]")));

        WebElement enabled= driver.findElement(By.xpath("//button[@id='hidden']"));

        //System.out.println(enabled.isEnabled());

        if(enabled.isEnabled()){
            System.out.println("test passed");}




    }
}
