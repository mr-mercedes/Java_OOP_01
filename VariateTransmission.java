package ru.geekbrains.oop01;

public class VariateTransmission extends Transmission implements SwitchGear{
    @Override
    protected void switchGearInternal(int number) {
        switchGear(number);
    }

    @Override
    public void switchGear(int number) {
        int maxGear = 4;
        if (number > 0){
            System.out.println("Transmission switch to drive");
            for (int i = 1; i < maxGear; i++) {
                System.out.println("Variate Transmission increase speed to " + 10 * i + "%");
            }
        } else if (number < 0) {
            System.out.println("Transmission switch to reverse");
        } else {
            System.out.println("Transmission switch to parking");
        }
    }
}
