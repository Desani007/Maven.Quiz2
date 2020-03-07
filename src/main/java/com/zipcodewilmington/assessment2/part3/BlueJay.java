package com.zipcodewilmington.assessment2.part3;

public class BlueJay extends Bird  {
    String color ;
    String motion ;
    int speed;

    BlueJay(){
        this.motion="fly";
        this.color="blue";
        this.speed=13;

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
