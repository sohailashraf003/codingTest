package com.signtel;

public class Fish extends Animal implements Swimmer{
    @Override
    public void swim() {
        System.out.println("I am swimming");
    }
}
