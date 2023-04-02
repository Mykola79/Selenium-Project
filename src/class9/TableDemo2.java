package class9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class TableDemo2 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("Hum@nhrm123");
        driver.findElement(By.xpath("//input[@name='Submit']")).click();

        WebElement pimBtn = driver.findElement(By.xpath("//b[text()='PIM']"));
        pimBtn.click();
        WebElement employeeListBtn = driver.findElement(By.xpath("//a[text()='Employee List']"));
        employeeListBtn.click();

        //click any ID
        boolean isFound = false;
        while (!isFound) {
            List<WebElement> findIdColumn = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr/td[2]"));
            for (int i = 1; i < findIdColumn.size(); i++) {
                String findId = findIdColumn.get(i).getText();
                System.out.println(findId);

                if (findId.equalsIgnoreCase("52085A")) {
                    driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr[" + (i + 1) + "]/td[1]")).click();


                    // do something
                    isFound = true;
                }
            }


            if (!isFound) {
                WebElement nextBtn = driver.findElement(By.xpath("//a[text()='Next']"));
                nextBtn.click();

            }


        }

    }

}





        /*tell your project where the webdriver is located.
//        for mac user please do not use .exe with chromedriver
            System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

            //        create an instance of WebDriver
            WebDriver driver = new ChromeDriver();
//        max the window
            driver.manage().window().maximize();

//   goto syntax HRMS application and login and goto the pim option

            //  go to the website
            driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
            //fill out username
            driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("admin");
            //fill out password
            driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("Hum@nhrm123");
            //press the Login button
            driver.findElement(By.xpath("//input[@name='Submit']")).click();
            //find the PIM button
            WebElement pimBtn = driver.findElement(By.xpath("//b[text()='PIM']"));
            //click on it
            pimBtn.click();
            //find the Employee List
            WebElement employeeListBtn = driver.findElement(By.xpath("//a[text()='Employee List']"));
            //click on it
            employeeListBtn.click();

//        ------------------------

//        get the employee id 52396A  and click on the checkbox associated with it


//in order to find the desired id
            boolean idfound=false;
            while(!idfound) {
//        as DOM is refresehed after the click on next page so we find elements in the loop
                List<WebElement> ids = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr/td[2]"));
                for (int i = 0; i < ids.size(); i++) {
                    String id = ids.get(i).getText();

                    if (id.equalsIgnoreCase("52381A")) {

                        System.out.println("id is on the row " + i);
//                to click on the partivular checkbox
                        WebElement checkBox = driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr[" + (i + 1) + "]/td[1]"));
                        checkBox.click();
                        idfound=true;
                        break;
                    }
                }
//        click on the next page
                if(!idfound) {
                    WebElement nextBtn = driver.findElement(By.xpath("//a[text()='Next']"));
                    nextBtn.click();
                }
            }*/






