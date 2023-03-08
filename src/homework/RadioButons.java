package homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class RadioButons {
    public static void main(String[] args) {
        /*HW1:
goto http://practice.syntaxtechs.net/basic-checkbox-demo.php
check if the checkBox    "click on this check box" is Selected
if not,Select the check box
check again if the checkbox is Selected or not*/

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://practice.syntaxtechs.net/basic-checkbox-demo.php");
        driver.manage().window().maximize();

        WebElement checkBox=driver.findElement(By.xpath("//input[@id='isAgeSelected']"));



        System.out.println(checkBox.isSelected());

        if(!checkBox.isSelected()) {
            checkBox.click();}

            if (checkBox.isSelected()) {
                System.out.println("Success - Check box is checked");

            } else {
                System.out.println("Failure - Check box is unchecked");}

        /*1. u need to write down the code that can select  1 check box out of 4 mentioned,
            e.g option1 , option2 , option 3, option 4

            Note: write down the logic in dynamic way i.e one change in if else condition can change ur selection*/
        /*WebElement checkAll=driver.findElement(By.xpath("//input[@value='Check All']"));
        checkAll.click();

        List<WebElement>checkBoxes=driver.findElements(By.className("cb1-element"));

        for (WebElement options:checkBoxes){
            String option=options.getAttribute("value");

            if(option.equalsIgnoreCase("Option-2")){
                options.click();
                System.out.println(options);
            }
        }*/





        //System.out.println(checkBox1.isSelected());


        }

}

