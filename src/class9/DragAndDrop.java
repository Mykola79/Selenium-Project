package class9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://jqueryui.com/droppable/");

        driver.switchTo().frame(0);
        WebElement dragToDrop=driver.findElement(By.xpath("//div[@id='draggable']"));
        WebElement drop= driver.findElement(By.xpath("//div[@id='droppable']"));


        Actions action=new Actions(driver);
        action.dragAndDrop(dragToDrop,drop).perform();

        Thread.sleep(3000);

        driver.switchTo().defaultContent();

        String title=driver.getTitle();
        System.out.println(title);





    }
}
