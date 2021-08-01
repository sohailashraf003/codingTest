package com.signtel;

public abstract class Bird extends Animal {
    abstract void sign();
    void walk() {
        System.out.println("I am walking");
    }
}
