package class8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Table3 {
    public static void main(String[] args) {
        /*TC 1: Table headers and rows verification
1. Open chrome browser
2. Go to "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";
3. Click on “Table” link
4. Click on “ITable Data Search” link
5. Verify second table consist of 5 rows and 4
columns
6. Print name of all column headers
7. Print data of all rows
8. Quit Browser*/
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        String url="http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";
        driver.get(url);driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        /*i request everyone to Attempt it as this will help u alot in working with tables and calenders.
1.goto http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login
username=Admin
password=Hum@nhrm123
2. click on PIM option
3. from the table select Any  value of id and click the check box associated with it
make sure that ur code is dynamic i.e
        changing the id doesnt effect the logic or xpath*/


        driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("Hum@nhrm123");
        driver.findElement(By.xpath("//input[@id='btnLogin']")).click();

        driver.findElement(By.xpath("//b[contains(text(),'PIM')]")).click();

        List<WebElement>rows=driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr"));

        for(int i=1;i< rows.size();i++){
            WebElement row= driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr["+i+"]"));
            String row1=row.getText();
            System.out.println(row1);

            if(row1.contains("52483A")){
                driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr["+i+"]/td[1]/input")).click();
            }
        }
        }
}

