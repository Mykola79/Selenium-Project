package class9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class TableDemo3 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("Hum@nhrm123");
        driver.findElement(By.xpath("//input[@name='Submit']")).click();

        WebElement pimBtn = driver.findElement(By.xpath("//b[text()='PIM']"));
        pimBtn.click();

        boolean isFound = false;
        while (!isFound) {
            List<WebElement> column2 = driver.findElements(By.xpath("//table[@id='resultTable']//tr/td[2]"));

            for (int i = 0; i < column2.size(); i++) {
                String colum3 = column2.get(i).getText();
                System.out.println(colum3);
                if (colum3.equalsIgnoreCase("52320A")) {

                    WebElement checkBox = driver.findElement(By.xpath("//table[@id='resultTable']//tr[" + (i + 1) + "]/td[1]"));
                    checkBox.click();
                    isFound = true;
                    break;

                }
            }if(!isFound){driver.findElement(By.xpath("//a[text()='Next']")).click();



            }
        }
    }

}
