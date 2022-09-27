package ru.geekbrains.oop01;

public class Conditioner implements Checkable {
    private boolean work;
    int temperature;

    public boolean on(){
        System.out.println("Conditioner on");
        return this.work = true;
    }
    public boolean off(){
        System.out.println("Conditioner off");
        return this.work = false;
    }

    public boolean isWork() {
        return work;
    }
    @Override
    public void check(){
        System.out.println("Conditioner is ok");
    }

    public void switchTemperature(int num){
        if (this.work){
            this.temperature = num;
            System.out.printf("Indicate temperature %d\n", num);
            if (this.temperature > 22){
                System.out.println("Blow hot stream");
            } else if (this.temperature < 18) {
                System.out.println("Blow cold stream");
            } else {
                System.out.println("Blow stream");
            }
        }
    }
}
