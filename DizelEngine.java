package ru.geekbrains.oop01;

public class DizelEngine extends Engine {
    @Override
    protected void startInternal() {
        System.out.println("wroom... wroom... dizel....motherfacer");
    }

    @Override
    protected void stopInternal() {
        System.out.println("bay bay dizel baby");
    }

    @Override
    protected void throttleUpInternal(int level) {
        System.out.println("Fast and Furious to dizel " + level);
    }
}
