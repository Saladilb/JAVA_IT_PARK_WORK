package Objects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class YandexMain {
    WebDriver gec;
    public YandexMain (WebDriver web) {
        gec = web;
        gec.get("http://ya.ru");
    }
    public String getSearchString() {
        return "text";
    }

    public void Input(String searchString, String anyText ) {
        gec.findElement(By.id(searchString)).sendKeys(anyText);
    }

    public void click(String anyElement, String type) {
        if (type.equals("button"))
            gec.findElement(By.className(anyElement)).submit();
        else if (type.equals("text"))
            gec.findElement(By.linkText(anyElement)).click();
        else if (type.equals("needsclick"))
            gec.findElement(By.className(anyElement)).click();
    }

    public String getSubmit() {
        return "button__text";
    }

    private void sleep(int time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void goNeedSite() {
        sleep(3000);
        System.out.println(gec.findElement(By.className("needsclick")).getAttribute("href"));
    }
}
