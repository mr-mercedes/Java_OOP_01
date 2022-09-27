package ru.geekbrains.oop01;

import java.util.ArrayList;
import java.util.List;

public class Car extends Base implements Checkable {
    private Base base;
    private Door doorFL;
    private Door doorFR;
    private Door doorBL;
    private Door doorBR;
    private Conditioner conditioner;
    private Helm helm;
    private List<Checkable> checkables;

    public Car() {
        this.base = new Base();
        this.doorFL = new Door();
        this.doorFR = new Door();
        this.doorBL = new Door();
        this.doorBR = new Door();
        this.conditioner = new Conditioner();
        this.helm = new Helm();
        this.checkables = new ArrayList<>(List.of(base, doorFL, doorFR, doorBL, doorBR, conditioner, helm));
    }

    public void turnR() {
        this.helm.turnRight();
    }

    public void turnL() {
        this.helm.turnLeft();
    }

    public void setTemp(int temperature) {
        if (this.conditioner.isWork()) {
            this.conditioner.switchTemperature(temperature);
        } else {
            this.conditioner.on();
            this.conditioner.switchTemperature(temperature);
        }

    }

    @Override
    public void checkAll() {
        for (Checkable checkable : checkables) {
            checkable.check();
        }
    }

    @Override
    public void check() {

    }

    public boolean closeAllDoors() {
        if (this.doorBL.isState() && this.doorBR.isState() && this.doorFL.isState() && this.doorFR.isState()) {
            return true;
        } else if (!this.doorBL.isState()) {
            System.out.println("Back left door isn't close");
            return false;
        } else if (!this.doorBR.isState()) {
            System.out.println("Back right door isn't close");
            return false;
        } else if (!this.doorFR.isState()) {
            System.out.println("Forward right door isn't close");
            return false;
        } else if (!this.doorFL.isState()) {
            System.out.println("Forward right door isn't close");
            return false;
        }
        return false;
    }

    public void lock() {
        if ((this.doorBL.isState() && this.doorBR.isState() && this.doorFL.isState() && this.doorFR.isState()) == closeAllDoors()) {
            System.out.println("The car close");
        }
    }

    public boolean unlock() {
        if (closeAllDoors()) {
            System.out.println("The car unlock");
            return true;
        } else {
            System.out.println("The car doesn't close");
        }
        return false;
    }

    @Override
    public void stop() {
        this.base.stop();
        this.conditioner.off();
    }

    public void sitInCar() {
        if (unlock()) {
            doorFL.open();
            System.out.println("Sit down in the car");
            doorFL.close();
        }
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.sitInCar();
        car.checkAll();
        car.start();
        car.setTemp(23);
        car.drive();
        car.turnL();
        car.turnR();
        car.setTemp(16);
        car.stop();
        car.lock();

    }
}
