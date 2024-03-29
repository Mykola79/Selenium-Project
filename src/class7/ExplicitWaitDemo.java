package class7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class ExplicitWaitDemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        String URL="http://practice.syntaxtechs.net/dynamic-elements-loading.php";
        driver.manage().window().maximize();

        driver.get(URL);//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//button[@id='startButton']")).click();

        WebDriverWait wait=new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[text()='Welcome Syntax Technologies']")));

        WebElement text = driver.findElement(By.xpath("//h4[text()='Welcome Syntax Technologies']"));


        String actualText = text.getText();
        String expectedText="Welcome Syntax Technologies";

        if(actualText.equals(expectedText)){
            System.out.println("Test passed");}
    }
}
