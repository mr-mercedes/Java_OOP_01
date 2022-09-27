package ru.geekbrains.oop01;

public abstract class Engine implements Checkable{
    private Boolean work;

    public void start(){
        this.work = true;
        startInternal();
    }
    protected abstract void startInternal();
    public void stop(){
        this.work = false;
        stopInternal();
    }
    protected abstract void stopInternal();
    public void throttleUp(int level){
        if (this.work){
            throttleUpInternal(level);
        }
    }
    protected abstract void throttleUpInternal(int level);

    public Boolean getWork() {
        return work;
    }
    @Override
    public void check(){
        System.out.println("Engine is ok");
    }
}
