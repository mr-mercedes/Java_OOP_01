package ru.geekbrains.oop01;

public class Door implements Checkable{
    private boolean state = true;

    public void open(){
        this.state = false;
        System.out.println("The door is open");
    }
    public void close(){
        this.state = true;
        System.out.println("The door is close");
    }

    public boolean isState() {
        return state;
    }
    @Override
    public void check(){
        System.out.println("Door is ok");
    }
}
