package com.signtel;

public class Dolphin  extends Animal implements Swimmer {
    @Override
    public void swim() {
        System.out.println("I am swimming");
    }
}
