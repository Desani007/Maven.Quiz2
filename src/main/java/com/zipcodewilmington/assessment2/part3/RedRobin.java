package com.zipcodewilmington.assessment2.part3;

public class RedRobin extends Bird {
    String color;
    int speed;
    String migrationMonth;
    String motion;

    RedRobin(){
        this.color="red";
        this.speed=10;
        this.motion ="fly";

    }
    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public String color() {
        return color;
    }
    @Override
    public String getMigrationMonth() {
        return migrationMonth;
    }

    @Override
    public void setMigrationMonth(String migrationMonth) {
        this.migrationMonth = migrationMonth;
    }
    @Override
    public String move() {
        return motion;
    }

}
