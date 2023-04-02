package reviewday6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class DatePicker {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String url = "https://www.redbus.in/";
        driver.get(url);
        driver.manage().window().maximize();

        String month = "Aug";
        String day = "19";
        String year = "2023";

        driver.findElement(By.xpath("//*[@id=\"onward_cal\"]")).click();

        boolean isFound=false;
        while(!isFound){
            WebElement montYear=driver.findElement(By.xpath("//td[@class='monthTitle']"));
            String montYear2=montYear.getText();
            String montYear3[]=montYear2.split(" ");

            if(montYear3[0].equalsIgnoreCase(month) && montYear3[1].equalsIgnoreCase(year)){

                List<WebElement>days=driver.findElements(By.xpath("//table[@class='rb-monthTable first last']//tr/td"));

                for (WebElement day1:days){

                    if(day1.getText().equalsIgnoreCase(day)){
                        day1.click();isFound=true;
                    }
                }
            }else{driver.findElement(By.xpath("//td[@class='next']")).click();
        }

    }}}

        /*driver.findElement(By.xpath("//input[@id='onward_cal']")).click();

        boolean isFound = false;

        while (!isFound) {
            String monthYear = driver.findElement(By.xpath("//td[@class='monthTitle']")).getText();
            String yearMonth[] = monthYear.split(" ");
            if (yearMonth[0].equals(month) && yearMonth[1].equals(year)) {

                List<WebElement> days = driver.findElements(By.xpath("//table[@class='rb-monthTable first last']//tr/td"));

                for (WebElement day2 : days) {
                    String day3 = day2.getText();
                    if (day3.equalsIgnoreCase(day)) {
                        day2.click();
                        isFound=true;
                        break;
                    }
                }
            } else {
                driver.findElement(By.xpath("//td[@class='next']")).click();

            }
        }

    }
}*/

  /*while(true)
          {
          //3. Capture Year and Month
          String monthYear=driver.findElement(By.xpath("//td[@class='monthTitle']")).getText();
          String [] ym=monthYear.split(" ");
          if(ym[0].equalsIgnoreCase(month) && ym[1].equalsIgnoreCase(year))
          {
          // perform some operation
          List<WebElement> dates= driver.findElements(By.xpath("//table[@class='rb-monthTable first last']//tr/td"));
        for(WebElement dt : dates)
        {
        if(dt.getText().equals(date))
        {
        dt.click();
        break;
        }
        }
        }
        else
        {
        driver.findElement(By.xpath("//td[@class='next']")).click();
        }

        }
        }

        }*/



