package class5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowHandle2 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://accounts.google.com/v3/signin/identifier?dsh=S-1291190790%3A1678243026259432&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ifkv=AWnogHdb8nCgg9TK7ONUl6jFPC9dbH3k4x5J18iYLiMhlVrkmW1A9lYhPPUuxiuC-8MuzwmUSUWW&rip=1&sacu=1&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin");

        WebElement help = driver.findElement(By.xpath("//a[text()='Help']"));
        help.click();

        WebElement privacy = driver.findElement(By.xpath("//a[text()='Privacy']"));
        privacy.click();

        String parentHandle = driver.getWindowHandle();

        Set<String> allHandles = driver.getWindowHandles();

        for (String all : allHandles) {

            driver.switchTo().window(all);
            String title = driver.getTitle();
            if (title.equals("Privacy Policy – Privacy & Terms – Google")) {
                driver.findElement(By.xpath("//title[text()='Privacy Policy – Privacy & Terms – Google']"));
                break;
            }
        }
        System.out.println(driver.getTitle());
        driver.switchTo().window(parentHandle);

    }}











        /*driver.get("https://talentzing.com/");
driver.findElement(By.xpath("//a[text()='Terms & Conditions']")).click();
driver.findElement(By.xpath("//a[text()='FeedBack']")).click();
String parentHandle;
parentHandle = driver.getWindowHandle();
Set<String> allhandles = driver.getWindowHandles();
for(String h1:allhandles)
{
driver.switchTo().window(h1);
String URL = driver.getCurrentUrl();
if (URL.contains("TermsAndConditions"))
{
driver.findElement(By.xpath("//input[@id='btnOk']")).click();
driver.close();
break;
}
}
driver.switchTo().window(parentHandle)*/



