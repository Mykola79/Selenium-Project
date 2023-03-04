package class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("http://practice.syntaxtechs.net/basic-radiobutton-demo.php");

        WebElement maleButton=driver.findElement(By.cssSelector("input[value='Male']"));

        boolean isEnable= maleButton.isEnabled();
        System.out.println(isEnable);

        boolean isDisplay= maleButton.isDisplayed();
        System.out.println(isDisplay);

        boolean isSelect= maleButton.isSelected();
        System.out.println(isSelect);


        if(!isSelect){
            maleButton.click();

            isSelect=maleButton.isSelected();
            System.out.println(isSelect);
        }




        //maleButton.click();


    }
}
