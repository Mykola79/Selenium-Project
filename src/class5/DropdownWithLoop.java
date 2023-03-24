package class5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class DropdownWithLoop {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String url = "https://www.orangehrm.com/contact-sales/";
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement dropdown= driver.findElement(By.xpath("//select[@id='Form_getForm_Country']"));

        Select dropdown1=new Select(dropdown);

        List<WebElement>dropdown3=dropdown1.getOptions();

        for(WebElement dropdown4:dropdown3) {
            String dropdown5 = dropdown4.getText();
            if (dropdown5.equalsIgnoreCase("Japan")) {
                dropdown4.click();break;
            }


        }}}