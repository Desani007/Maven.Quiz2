package com.zipcodewilmington.assessment2.part3;

public class BlueJay extends Bird  {
    String color ;
    String motion ;

    BlueJay(){
        this.motion="fly";
        this.color="blue";

    }
    @Override
    public String move() {
        return motion;
    }

    @Override
    public int getSpeed() {
        return 0;
    }

    @Override
    public String color() {
        return color;
    }
}
