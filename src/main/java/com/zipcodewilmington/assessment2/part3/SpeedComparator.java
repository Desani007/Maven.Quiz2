package com.zipcodewilmington.assessment2.part3;

import java.util.Comparator;

public class SpeedComparator implements Comparator<Animal> {

    Animal animal1;
    Animal animal2;

    SpeedComparator(){
        BlueJay b = new BlueJay();
        Horse h = new Horse();


    }

    @Override
    public int compare(Animal animal1, Animal animal2) {

        if (this.animal1.getSpeed() == this.animal2.getSpeed()) {
            return 0;
        } else if (animal1.getSpeed() > animal2.getSpeed()) {
            return 1;
        } else if (animal1.getSpeed() < animal2.getSpeed()) {
            return 2;
        }
        return 0;
    }
}
