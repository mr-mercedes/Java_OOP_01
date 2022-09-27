package ru.geekbrains.oop01;

public class Helm implements Checkable{
    public void turnRight(){
        System.out.println("Turn right");
    }

    public void turnLeft(){
        System.out.println("Turn left");
    }
    @Override
    public void check(){
        System.out.println("Helm is ok");
    }

}
