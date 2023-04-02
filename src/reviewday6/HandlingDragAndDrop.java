package reviewday6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingDragAndDrop {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String url = "http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html";
        driver.get(url);
        driver.manage().window().maximize();

        WebElement dragable= driver.findElement(By.xpath("//div[@class='dragableBox' and @id='box6']"));
        WebElement dropable=driver.findElement(By.xpath("//div[@id='box106' and @class='dragableBoxRight']"));

        Actions action=new Actions(driver);
        action.dragAndDrop(dragable,dropable).perform();

        WebElement dragable2= driver.findElement(By.xpath("//div[@class='dragableBox' and @id='box7']"));
        WebElement dropable2= driver.findElement(By.xpath("//div[@id='box107' and @class='dragableBoxRight']"));

        action.dragAndDrop(dragable2,dropable2).perform();
    }
}
