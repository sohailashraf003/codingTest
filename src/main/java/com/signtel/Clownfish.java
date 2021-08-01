package com.signtel;

class Clownfish extends Fish {
    private String size;
    private String color;

    public Clownfish(String size, String color) {
        this.size = size;
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
