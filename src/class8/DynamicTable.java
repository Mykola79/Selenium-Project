package class8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class DynamicTable {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        String url="http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/" +
                "Login.aspx?ReturnUrl=%2fsamples%2fTestComplete11%2fWebOrders%2fDefault.aspx";

        driver.manage().window().maximize();
        driver.get(url);

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//input[@id='ctl00_MainContent_username']")).sendKeys("Tester");
        driver.findElement(By.xpath("//input[@id='ctl00_MainContent_password']")).sendKeys("test");
        driver.findElement(By.xpath("//input[@id='ctl00_MainContent_login_button']")).click();

        List<WebElement>columns=driver.findElements(By.xpath("//table[@class='SampleTable']/tbody/tr/td[3]"));

        for(int i=0;i< columns.size();i++){
            String extractText=columns.get(i).getText();
            //System.out.println(extractText);
            if(extractText.equals("ScreenSaver")){
                //System.out.println(extractText);
                System.out.println("the row in the table that contains Screensaver is "+(i+2));
                //System.out.println("check the check box");
                WebElement checkbox = driver.findElement(By.xpath("//table[@class='SampleTable']/tbody/tr[" + (i + 2) + "]/td[1]"));

                checkbox.click();
            }
        }
    }
}
