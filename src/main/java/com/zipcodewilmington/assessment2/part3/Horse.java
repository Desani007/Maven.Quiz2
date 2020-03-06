package com.zipcodewilmington.assessment2.part3;

public class Horse implements Animal{
    String motion;
    String color;

    Horse(){
        this.color="brown";
        this.motion="gallop";

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
