package ru.geekbrains.oop01;

public class Base {
    private Engine engine;
    private Wheel wheelFL;
    private Wheel wheelFR;
    private Wheel wheelBL;
    private Wheel wheelBR;
    private Transmission transmission;

    public Base() {
        this.engine = new Engine();
        this.wheelFL = new Wheel();
        this.wheelFR = new Wheel();
        this.wheelBL = new Wheel();
        this.wheelBR = new Wheel();
        this.transmission = new Transmission();
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
        engine.stop();
    }
}
