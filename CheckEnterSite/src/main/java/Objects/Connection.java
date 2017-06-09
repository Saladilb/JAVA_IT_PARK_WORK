package Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Connection {
    private WebDriver webDriver;
    private static Connection ourInstance = new Connection();

    public static Connection getInstance() {
        return ourInstance;
    }

    private Connection() {
        System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
        webDriver = new FirefoxDriver();
    }

    public WebDriver getWebDriver() {
        return webDriver;
    }
}
