package homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

public class HomeWork22 {
    public static void main(String[] args) throws InterruptedException {
        /*HW2
navigate/get to fb.com
click on create new account
fill up all the textboxes
click on sign up button
close the pop up
close the browser

TIP for HW2:
just fill in text boxes or button, no need to deal with other webElements

also u will need a Thread.sleep after clicking on create new account*/

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        WebDriver webDriver=new ChromeDriver();
        webDriver.get("https://www.facebook.com/");
        webDriver.manage().window().maximize();

        //<a role="button" class="_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy" href="#" ajaxify="/reg/spotlight/"
        //id="u_0_0_HM" data-testid="open-registration-form-button" rel="async">Create new account</a>

        webDriver.findElement(By.linkText("Create new account")).click();

        Thread.sleep(2000);


        /*<input type="text" class="inputtext _58mg _5dba _2ph-" data-type="text" name="firstname" value=""
         aria-required="true" placeholder="First name" aria-label="First name" id="u_2_b_oC" tabindex="0">
         */
        webDriver.findElement(By.name("firstname")).sendKeys("Sara");

        //<input type="text" class="inputtext _58mg _5dba _2ph-" data-type="text" name="lastname" value=""
        // aria-required="true" placeholder="" aria-label="Last name" id="u_2_d_Ev">
        webDriver.findElement(By.name("lastname")).sendKeys("Love");

        //<input type="text" class="inputtext _58mg _5dba _2ph-" data-type="text" name="reg_email__" value=""
        // aria-required="true" placeholder="" aria-label="Mobile number or email" id="u_2_g_h6">
        webDriver.findElement(By.name("reg_email__")).sendKeys("12345678900");

        //<input type="password" class="inputtext _58mg _5dba _2ph-" data-type="password" autocomplete="new-password"
        // name="reg_passwd__" id="password_step_input" aria-required="true" placeholder="" aria-label="New password">
        webDriver.findElement(By.name("reg_passwd__")).sendKeys("Love");


        webDriver.findElement(By.id("month")).sendKeys("Jun");
        webDriver.findElement(By.id("day")).sendKeys("6");


        webDriver.findElement(By.id("year")).sendKeys("1986");


        webDriver.findElement(By.xpath("//label[text()='Male']")).click();


        //webDriver.findElement(By.name("websubmit")).click();


        //Thread.sleep(2000);
        //webDriver.close();







    }
}
