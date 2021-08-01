package com.signtel;

public class Duck extends FlyingBird implements Swimmer{
    @Override
    public void sign() {
        System.out.println("Quack Quack");
    }


    @Override
    public void swim() {
        System.out.println("I am swimming");
    }
}
