package class8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class DynamicTable2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        String url="http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders" +
                "/Login.aspx?ReturnUrl=%2fsamples%2fTestComplete11%2fWebOrders%2fDefault.aspx";
        driver.get(url);driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        WebElement userName= driver.findElement(By.xpath("//input[@id='ctl00_MainContent_username']"));
        userName.sendKeys("Tester");

        WebElement password= driver.findElement(By.xpath("//input[@id='ctl00_MainContent_password']"));
        password.sendKeys("test");

        driver.findElement(By.xpath("//input[@id='ctl00_MainContent_login_button']")).click();

        List<WebElement> colomn= driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr/td[3]"));

        /*for (WebElement columnThree:table
             ) {
            String getText=columnThree.getText();
            System.out.println(getText);
}*/
        for (int i=0;i< colomn.size();i++){
            String getText=colomn.get(i).getText();
            //System.out.println(table.size());
            String actualName="FamilyAlbum";
            if(getText.contains(actualName)){
                System.out.println("money is in the list on index "+i);
                //System.out.println();
                System.out.println("money is in the table on index "+(i+2));
                driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr["+(i+2)+"]/td[1]")).click();

            }


        }
    }
}
