package homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class RadioButtons3 {
    public static void main(String[] args) {
        /*goto http://practice.syntaxtechs.net/basic-checkbox-demo.php
        check if the checkBox    "click on this check box" is Selected
        if not,Select the checkBox
        check again if the checkbox is Selected or not*/

        /*2. u need to write down the code that can select  1 check box out of 4 mentioned,
                e.g option1 , option2 , option 3, option 4
                Note: write down the logic in dynamic way i.e one change in if else condition can change ur selection*/

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.syntaxtechs.net/basic-checkbox-demo.php");
        driver.manage().window().maximize();

       List<WebElement>checkBoxes=driver.findElements(By.xpath("//input[@class='cb1-element']"));

        for (WebElement option:checkBoxes
             ) {String option1=option.getAttribute("value");
            if(option1.contains("Option-2") || option1.contains("Option-4")){
                option.click();

                System.out.println("test passed");}else {
                System.out.println("failure");}

        }
        }

}


