package com.zipcodewilmington.assessment2.part3;

public class Horse implements Animal{
    String motion;
    String color;
    int speed;

    Horse(){
        this.color="brown";
        this.motion="gallop";
        this.speed=40;

    }
    @Override
    public String move() {
        return motion;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public String color() {
        return color;
    }
}
