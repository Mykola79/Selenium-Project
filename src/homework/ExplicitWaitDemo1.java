package homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitDemo1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        String url="https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver";
        driver.get(url);driver.manage().window().maximize();

        WebElement clearText=driver.findElement(By.xpath("//button[@id='populate-text']"));
        clearText.click();



        WebDriverWait wait=new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[starts-with(text(),'Selenium')]")));

        WebElement text= driver.findElement(By.xpath("//h2[@id='h2']"));

        System.out.println(text.getText());

        if(text.isDisplayed()){
            System.out.println("Test passed");
        }
    }
}
