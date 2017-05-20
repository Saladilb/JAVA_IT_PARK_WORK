

public class Main {
    private ClassOurSite classOurSite = new ClassOurSite();
    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }

    private void run() {
        PropertiesFile propertiesFile = PropertiesFile.getInstance();
        propertiesFile.createFileProperties();
        propertiesFile.CheckUserDataInFileProperties();
        String userLogin = propertiesFile.getLogin();
        String userPassword = propertiesFile.getPassword();

        classOurSite.enterTheSite(userLogin, userPassword);
        for (int i = 0; i < 500; i ++) {
            classOurSite.clickCycle();
        }
    }
}
