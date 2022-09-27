package ru.geekbrains.oop01;

public class AutomaticTransmission  extends Transmission{
    @Override
    protected void switchGearInternal(int number) {
        if (number > 0){
            System.out.println("Transmission switch to drive");
        } else if (number < 0) {
            System.out.println("Transmission switch to reverse");
        } else {
            System.out.println("Transmission switch to parking");
        }

    }
}
