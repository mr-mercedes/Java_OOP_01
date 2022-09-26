package ru.geekbrains.oop01;

public class Transmission {
    private int gear;

    public void switchGear (int number) {
        this.gear = number;
        System.out.println("Turn gear to " + number);
    }

    public int getGear() {
        return gear;
    }
}
