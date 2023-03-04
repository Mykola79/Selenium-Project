package class1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        //create instance
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");


        //get the current URL of the browser
        // String URL = driver.getCurrentUrl();
        //print out the URL
                //System.out.println(URL);


        //get the title of the webpage
                //String title= driver.getTitle();
        //print the title of the page
        //System.out.println("the title of the page "+title);

        //slow down for 3 seconds
        //Thread.sleep(3000);

        //driver.close();

    }
}
