package class3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class AmazonTest {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        WebDriver webDriver=new ChromeDriver();
        webDriver.get("https://www.amazon.com/");
        webDriver.manage().window().maximize();

        //get all the links
        //we that links are in tag <a> which is also called anchor tag lets use the locator

        List<WebElement> tags = webDriver.findElements(By.tagName("a"));

        for (WebElement tag:tags){
            String link = tag.getAttribute("href");
            System.out.println(link);}


    }
}
