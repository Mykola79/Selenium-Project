package homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Set;

public class RadioButtons2 {
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

        WebElement checkBox = driver.findElement(By.id("isAgeSelected"));

        boolean check = checkBox.isSelected();
        System.out.println(check);

        if (!checkBox.isSelected()) {
            checkBox.click();
        }

        if (checkBox.isSelected()) {
            System.out.println("Success");
        } else {
            System.out.println("Failure");
        }
        /*2. u need to write down the code that can select  1 check box out of 4 mentioned,
                e.g option1 , option2 , option 3, option 4
                Note: write down the logic in dynamic way i.e one change in if else condition can change ur selection*/

        WebElement checkAll = driver.findElement(By.id("check1"));
        checkAll.click();

        List<WebElement> fourOptions = driver.findElements(By.className("cb1-element"));

        for (WebElement ofAllOptions : fourOptions) {
            String findOneAttribute = ofAllOptions.getAttribute("value");

            if (findOneAttribute.equals("Option-2")) {
                ofAllOptions.click();

                System.out.println(findOneAttribute);

            }
        }
    }

}


