package class5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("http://practice.syntaxtechs.net/basic-select-dropdown-demo.php");

      WebElement dropDown=driver.findElement(By.xpath("//select[@id='select-demo']"));

        Select select=new Select(dropDown);

        select.selectByIndex(1);
        Thread.sleep(2000);

        select.selectByValue("Tuesday");
        Thread.sleep(2000);

        select.selectByVisibleText("Friday");
        Thread.sleep(2000);

        //driver.close();



    }
}
