package homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class TablesAndMoreCheckboxes {
    public static void main(String[] args) {
        /*i request everyone to Attempt it as this will help u alot in working with tables and calenders.
1.goto http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login
username=Admin
password=Hum@nhrm123
2. click on PIM option
3. from the table select Any  value of id and click the check box associated with it
make sure that ur code is dynamic i.e
        changing the id doesnt effect the logic or xpath*/
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String URL = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";
        driver.get(URL);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("Hum@nhrm123");
        driver.findElement(By.xpath("//input[@id='btnLogin']")).click();

        driver.findElement(By.xpath("//b[contains(text(),'PIM')]")).click();

        List<WebElement>allRows=driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr"));

        for (int i=1; i<= allRows.size();i++){
            WebElement rows= driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr["+i+"]"));

            System.out.println(rows.getText());
            String row =rows.getText();
            if(row.contains("52483A") || row.contains("52381A")){
                driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr["+i+"]/td/input")).click();
            }
        }
    }
}
