package com.zipcodewilmington.assessment2.part1;

import com.j256.ormlite.stmt.query.In;

public class IntegerArrayUtilities {
    public Boolean hasEvenLength(Integer[] array) {
        int count = 0;
        for (Integer i : array) {
            if (i % 2 == 0) {
                count++;
            }
        }
        if (count == array.length) {
            return true;
        }
        return false;
    }

    public Integer[] range(int start, int stop) {
        return null;
    }

    public Integer getSumOfFirstTwo(Integer[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (i <= 1) {
                sum += array[i];
            }
        }


        return sum;
    }

    public Integer getProductOfFirstTwo(Integer[] array) {
        int product=0;
        int one=0;
        int two=0;



        for (int i= array.length-1; i >=0 ; i--) {
             one=array[array.length-1];
             two=array[array.length-2];
             product=two*one;
            }


     return product;
}

}
