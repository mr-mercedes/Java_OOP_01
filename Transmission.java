package ru.geekbrains.oop01;

public abstract class Transmission implements Checkable{
    private int gear;

    public void switchGear (int number) {
        this.gear = number;
        switchGearInternal(number);
    }
    protected abstract void switchGearInternal(int number);
    @Override
    public void check(){
        System.out.println("Transmission is ok");
    }

    public int getGear() {
        return gear;
    }
}
