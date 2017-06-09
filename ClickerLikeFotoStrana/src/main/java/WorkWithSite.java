
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Random;


public class WorkWithSite {
    private Random random = new Random();
    private String userPass;
    private String userLog;
    private WebDriver webDriver;

    public void enterTheSite(String userLogin, String userPassword) {
        System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
        userPass = userPassword;
        userLog = userLogin;
        webDriver = new FirefoxDriver();
        webDriver.get("https://fotostrana.ru");
        webDriver.manage().window().maximize();
        webDriver.findElement(By.linkText("Войти")).click();
        webDriver.findElement(By.id("user_email")).click();
        webDriver.findElement(By.id("user_email")).sendKeys(userLog);
        webDriver.findElement(By.id("user_password")).click();
        webDriver.findElement(By.id("user_password")).sendKeys(userPass);
        webDriver.findElement(By.id("loginPopupSubmitButton")).click();
        sleepWebDriver(3000);
        //webDriver.findElement(By.className("rating-week-top-title-name")).click();
        webDriver.findElement(By.className("pin-item-img")).click();
        sleepWebDriver(3000);
        webDriver.findElement(By.id("fsr-photo-like-fs")).click();
        sleepWebDriver(3000);
    }

    private void sleepWebDriver(int time) {
        int a = random.nextInt(100) + time;
        try {
            Thread.sleep(a);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void clickCycle() {
        sleepWebDriver(222);
        webDriver.findElement(By.id("fsr-photo-like-fs")).click();
    }
}
