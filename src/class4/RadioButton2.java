package class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class RadioButton2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("http://practice.syntaxtechs.net/basic-radiobutton-demo.php");
        driver.manage().window().maximize();

    List<WebElement>radioButtons=driver.findElements(By.xpath("//input[@name='ageGroup']"));

    for(WebElement radios:radioButtons){
        //System.out.println(radios.getAttribute("value"));


        String age=radios.getAttribute("value");

        if (age.equalsIgnoreCase("5 - 15")){
            radios.click();

            System.out.println(age);
        }
    }
    }
}
