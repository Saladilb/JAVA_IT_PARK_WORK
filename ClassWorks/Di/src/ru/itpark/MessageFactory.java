package ru.itpark;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class MessageFactory {
    private Properties properties;

    public MessageFactory() {
        properties = new Properties();
        try {
            properties.load(new FileInputStream("resources\\app.properties"));
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    public Message getMessage() {
        String messageClassName = properties.getProperty("message.class");
        try {
            Class<Message> messageClass = (Class<Message>) Class.forName(messageClassName);
            Message message = messageClass.newInstance();
            return message;
        } catch (ReflectiveOperationException e) {
            throw new IllegalArgumentException(e);
        }
    }
}
