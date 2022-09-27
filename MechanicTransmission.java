package ru.geekbrains.oop01;

public class MechanicTransmission extends Transmission {
    @Override
    protected void switchGearInternal(int number) {
        System.out.println("Turn gear to " + number);
    }
}
