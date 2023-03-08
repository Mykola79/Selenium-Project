package class5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiDropDown {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("http://practice.syntaxtechs.net/basic-select-dropdown-demo.php");

        WebElement DD=driver.findElement(By.xpath("//select[@id='multi-select']"));

        Select select= new Select(DD);

        select.selectByValue("New Jersey");
        select.selectByVisibleText("Ohio");
        Thread.sleep(2000);

        select.deselectByValue("New Jersey");
        select.deselectByVisibleText("Ohio");

    }
}