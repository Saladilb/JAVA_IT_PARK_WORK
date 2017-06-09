
public class Main {
    private WorkWithSite workWithSite = new WorkWithSite();
    public static void main(String[] args) {
        Main main = new Main();
        main.run();
        System.out.println("lol");
    }

    private void run() {
        PropertiesFile propertiesFile = PropertiesFile.getInstance();
        propertiesFile.createFileProperties();
        propertiesFile.CheckUserDataInFileProperties();
        String userLogin = propertiesFile.getLogin();
        String userPassword = propertiesFile.getPassword();

        workWithSite.enterTheSite(userLogin, userPassword);
        for (int i = 0; i < 10000; i ++) {
            workWithSite.clickCycle();
        }
    }
}
