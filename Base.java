package ru.geekbrains.oop01;

import java.util.ArrayList;
import java.util.List;

public class Base implements Checkable{
    private Engine engine;
    private Wheel wheelFL;
    private Wheel wheelFR;
    private Wheel wheelBL;
    private Wheel wheelBR;
    private Transmission transmission;
    private List<Checkable> checkables;

    public Base() {
        this.engine = new BenzineEngine();
        this.wheelFL = new Wheel();
        this.wheelFR = new Wheel();
        this.wheelBL = new Wheel();
        this.wheelBR = new Wheel();
        this.transmission = new AutomaticTransmission();
        this.checkables = new ArrayList<>(List.of(engine, wheelBL,wheelBR, wheelFL, wheelFR, transmission));
    }

    public void start(){
        engine.start();
    }
    public void drive(){
        if (engine.getWork()){
            transmission.switchGear(1);
            wheelBL.rotate();
            wheelFL.rotate();
            wheelBL.rotate();
            wheelBR.rotate();
        }
    }
    public void stop(){
        this.transmission.switchGearInternal(0);
        this.engine.stop();
    }

    public void checkAll(){
        for (Checkable checkable: checkables){
            checkable.check();
        }
    }

    @Override
    public void check() {
        checkAll();
    }
}
