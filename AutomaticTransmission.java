package ru.geekbrains.oop01;

public class AutomaticTransmission  extends Transmission implements SwitchGear{
    @Override
    protected void switchGearInternal(int number) {
        switchGear(number);

    }

    @Override
    public void switchGear(int number) {
        int maxGear = 6;
        if (number > 0){
            System.out.println("Transmission switch to drive");
            for (int i = 1; i < maxGear; i++) {
                System.out.println("Automatic Transmission switch gear to " + i);
            }
        } else if (number < 0) {
            System.out.println("Transmission switch to reverse");
        } else {
            System.out.println("Transmission switch to parking");
        }

    }
}
