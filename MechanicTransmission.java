package ru.geekbrains.oop01;

import java.util.Scanner;

public class MechanicTransmission extends Transmission  implements SwitchGear{
    @Override
    protected void switchGearInternal(int number) {
        switchGear(number);
    }

    @Override
    public void switchGear(int number) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag){
            System.out.print("Turn gear to: ");
            number = scanner.nextInt();
            if (number == 0){
                System.out.println("Turn gear to neutral gear" );
            } else {
                System.out.println("Turn gear to " + number);
            }
            System.out.println("Do you want to switch another gear? 1/Yes || 0/No");
            number = scanner.nextInt();
            if (number == 0){
                flag = false;
            }
        }
    }
}
