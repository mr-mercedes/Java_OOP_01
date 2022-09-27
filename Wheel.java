package ru.geekbrains.oop01;

public class Wheel implements Checkable {
    public void rotate(){
        System.out.println("Rowling Rowling Rowling");
    }
    @Override
    public void check(){
        System.out.println("Wheel is ok");
    }
}
