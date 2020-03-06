package com.zipcodewilmington.assessment2.part2;

import java.util.Arrays;

public class ArrayUtility {
    public Integer[] merge(Integer[] array1, Integer[] array2) {
        String first = "";
        String secound = "";
        String res = "";

        for (int i = 0; i <= array1.length - 1; i++) {
            first += array1[i] + ",";
        }
        for (int j = 0; j <= array2.length - 1; j++) {
            secound += array2[j] + ",";

        }
        res = first + secound;


        String[] resolving = res.split(",");
        Integer[] comeon = new Integer[resolving.length];
        for (int i = 0; i <= resolving.length - 1; i++) {
            comeon[i] = Integer.parseInt(resolving[i]);
        }


        return comeon;


        }



    public Integer[] rotate(Integer[] array, Integer index) {
        return null;
    }

    public Integer countOccurrence(Integer[] array1, Integer[] array2, Integer valueToEvaluate) {
        return null;
    }

    public Integer mostCommon(Integer[] array) {
        String string ="";
        Integer result=0;
        for (int i=0; i<array.length; i++){
            string +=array[i];
        }  Integer count=0;
        for ( int i=1; i<string.length();i++){
            if (string.charAt(i)!=string.charAt(i-1))
            {
                String remove = string.replaceAll(String.valueOf(string.charAt(i)), "");
                Integer totalRemoved =  string.length()-remove.length();
                if (totalRemoved > count) {
                    count = totalRemoved;
                    result = Integer.parseInt(String.valueOf(string.charAt(i)));
                }

                remove.replaceAll("", String.valueOf(string.charAt(i)));

            }
        }
        return result;
    }
}
