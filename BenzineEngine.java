package ru.geekbrains.oop01;

public class BenzineEngine extends Engine{
    @Override
    protected void startInternal() {
        System.out.println("wroom... wroom... benzine....motherfacer");
    }

    @Override
    protected void stopInternal() {
        System.out.println("bay bay benzine baby");
    }

    @Override
    protected void throttleUpInternal(int level) {
        System.out.println("Fast and Furious to benzine " + level);
    }
}
