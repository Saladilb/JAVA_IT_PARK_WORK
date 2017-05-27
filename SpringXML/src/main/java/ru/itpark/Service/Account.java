package ru.itpark.Service;

/**
 * Created by Student3 on 24.05.2017.
 */
public class Account {
    private String name;
    private int balace;

    public Account(String name, int balace) {
        this.name = name;
        this.balace = balace;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalace() {
        return balace;
    }

    public void setBalace(int balace) {
        this.balace = balace;
    }
}
