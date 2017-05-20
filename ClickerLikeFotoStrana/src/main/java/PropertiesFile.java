import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFile {
    private File file;
    private static PropertiesFile ourInstance = new PropertiesFile();
    private String login;
    private String password;

    public static PropertiesFile getInstance() {
        return ourInstance;
    }

    private PropertiesFile() {
        file = new File("C:\\Program Files\\ClickerLikeFotoStrana\\app.properties");
    }

    public void createFileProperties() {
        if (file.exists() && file.isFile()) {
            return;
        } else {
            try {
                file.createNewFile();
                FileWriter fileWriter = new FileWriter(file);
                fileWriter.write("userLogin=" + "\n" + "userPassword=");
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public void CheckUserDataInFileProperties() {
        if (file.exists() && file.isFile()) {
            try {
                Properties properties = new Properties();
                properties.load(new FileInputStream(file));

                login = properties.getProperty("userLogin");
                password = properties.getProperty("userPassword");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
