package class11;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class CookiesDemo {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        String url="https://demo.nopcommerce.com/";
        driver.get(url);
        driver.manage().window().maximize();

        Set<Cookie>cookies=driver.manage().getCookies();
        System.out.println("Size of cookies "+cookies.size());

        for (Cookie cook:cookies){
            System.out.println(cook.getName()+" : "+cook.getValue());
        }


        Cookie cookie=new Cookie("Mycokie","1253");
        driver.manage().addCookie(cookie);



        cookies=driver.manage().getCookies();
        System.out.println("Size after adding: "+cookies.size());

        //driver.manage().deleteCookie(cookie);
        driver.manage().deleteCookieNamed("Mycokie");
        cookies=driver.manage().getCookies();
        System.out.println("Size after deletion: "+cookies.size());

        driver.manage().deleteAllCookies();
        cookies=driver.manage().getCookies();
        System.out.println("Size after deletion: "+cookies.size());


        driver.quit();
    }
}
