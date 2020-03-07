package com.zipcodewilmington.assessment2.part2;

import com.j256.ormlite.stmt.query.In;

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
       String front ="";
        String back="";

        for ( int i=0;i<index;i++){
               back+=array[i]+",";
        }
        for (int i=index;i<array.length;i++){
            front +=array[i] + ",";
        }
        String f = front+back;

        String [] result = f.split(",");
        Integer[] intarray=new Integer[result.length];

        for (int i =0 ;i<intarray.length;i++){
            for (int j=0; j<=i;j++){
        intarray[i]=Integer.parseInt(result[j]);
            }

        }
        return intarray;
    }

    public Integer countOccurrence(Integer[] array1, Integer[] array2, Integer valueToEvaluate) {
        int count=0;
        for ( int i =0; i<array1.length;i++){
            if (array1[i]==valueToEvaluate) {
                count++;
            }

        }
        for ( int i =0; i<array2.length;i++){
            if (array2[i]==valueToEvaluate) {
                count++;
            }

        }
        return count;
    }

    public Integer mostCommon(Integer[] array) {
        String string ="";
        Integer result=0;
        for (int i=0; i<array.length; i++){
            string +=array[i];
            if (array.length==1){
              return Integer.parseInt(String.valueOf(string.charAt(i)));
            }
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
