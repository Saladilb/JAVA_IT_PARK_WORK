
import Objects.Connection;
import Objects.YandexMain;
import org.openqa.selenium.WebDriver;

public class Main {
    Connection connection;
    WebDriver web;
    YandexMain yandexMain;
    public static void main(String[] args) {
        Main main = new Main();

        main.run();
    }

    private void run() {
        connection = Connection.getInstance();
        web = connection.getWebDriver();
        yandexMain = new YandexMain(web);
        yandexMain.Input( yandexMain.getSearchString(), "быстроденьги");
        yandexMain.click(yandexMain.getSubmit(), "button");
        yandexMain.goNeedSite();
    }


    private void sleep(int time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
