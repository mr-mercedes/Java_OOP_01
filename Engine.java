package ru.geekbrains.oop01;

public class Engine {
    private Boolean work;

    public void start(){
        this.work = true;
        System.out.println("wroom... wroom... motherfacer");
    }
    public void stop(){
        this.work = false;
        System.out.println("bay bay baby");
    }
    public void throttleUp(int level){
        if (this.work){
            System.out.println("Fast and Furious to " + level);
        }
    }

    public Boolean getWork() {
        return work;
    }
}
