package homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework2 {
    public static void main(String[] args) {

        /*https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22
        fill out the form
        click on register
        close the browser*/


        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");

        driver.manage().window().maximize();


        String username="username";

        //driver.findElement(By.name("username")).sendKeys("Nas");
        //driver.findElement(By.name("password")).sendKeys("rggrg");

        //<input type="submit" class="button" value="Log In">
        //driver.findElement(By.className("button")).click();



        //<input id="customer.firstName" name="customer.firstName" class="input" type="text" value="">
        driver.findElement(By.id("customer.firstName")).sendKeys("Sara");

        //<input id="customer.lastName" name="customer.lastName" class="input" type="text" value="">
        driver.findElement(By.id("customer.lastName")).sendKeys("Love");

        //<input id="customer.address.street" name="customer.address.street" class="input" type="text" value="">
        driver.findElement(By.id("customer.address.street")).sendKeys(("82 Prospecr Ave"));

      //<input id="customer.address.city" name="customer.address.city" class="input" type="text" value="">
        driver.findElement(By.id("customer.address.city")).sendKeys("Arlington");

        //<input id="customer.address.state" name="customer.address.state" class="input" type="text" value="">
        driver.findElement(By.id("customer.address.state")).sendKeys("VA");

        //<input id="customer.address.zipCode" name="customer.address.zipCode" class="input" type="text" value="">
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("18746");

        //<input id="customer.phoneNumber" name="customer.phoneNumber" class="input" type="text" value="">
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("1234567890");

        //<input id="customer.ssn" name="customer.ssn" class="input" type="text" value="">
        driver.findElement(By.id("customer.ssn")).sendKeys("123-45-6789");

        //<input id="customer.username" name="customer.username" class="input" type="text" value="">
        driver.findElement(By.id("customer.username")).sendKeys("Sara");

        //<input id="customer.password" name="customer.password" class="input" type="password" value="">
        driver.findElement(By.id("customer.password")).sendKeys("Love");

        //<input id="repeatedPassword" name="repeatedPassword" class="input" type="password" value="">
        driver.findElement(By.id("repeatedPassword")).sendKeys("Love");

        //<input type="submit" class="button" value="Register">
        driver.findElement(By.className("button")).click();

        driver.close();







    }
}
