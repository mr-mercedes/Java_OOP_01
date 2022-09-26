package ru.geekbrains.oop01;

public class Door {
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
}
