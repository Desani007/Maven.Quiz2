package com.zipcodewilmington.assessment2.part1;

public class IntegerArrayUtilities {
    public Boolean hasEvenLength(Integer[] array) {
     return array.length%2==0;
    }

    public Integer[] range(int start, int stop) {
       int f = Math.abs(start-stop);

       Integer [] arr= new Integer[ f+1];
       int counter=start;
       for ( int i=0 ; i<=f; i++){

           arr[i]= counter ;
           counter++;


       }
     return arr;
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
