package ru.itpark.best;

public class Terminal {
    private int money;
    private AlarmerSoutImpl alarmer;

    /* public Terminal(AlarmerSoutImpl alarmer) {
        this.alarmer = alarmer;
    }
    */

    public Terminal(int money) {
        alarmer = new AlarmerSoutImpl();
        alarmer.alarm();
        this.money = money;
    }

    public void giveMoney(int money) {
        this.money =- money;
    }
}
