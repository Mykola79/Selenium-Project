package class7;

import org.openqa.selenium.remote.RemoteWebDriver;

public class SeleniumVersion {
    public static void main(String[] args) {
        String seleniumVersion = RemoteWebDriver.class.getPackage().getSpecificationVersion();
        System.out.println("Selenium version: " + seleniumVersion);
    }
}

