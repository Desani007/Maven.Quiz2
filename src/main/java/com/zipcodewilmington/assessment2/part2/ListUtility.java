package com.zipcodewilmington.assessment2.part2;

import com.j256.ormlite.stmt.query.In;
import com.sun.javafx.binding.StringFormatter;

import javax.swing.*;
import java.util.*;
import java.util.stream.Collectors;

public class ListUtility {
    ArrayList list;

    public ListUtility(){
        list=new ArrayList() ;

    }

    public void add(int i) {

       try {
           list.add(i);

        } catch (NullPointerException e){
           list.remove(i);

       }

    }





    public Integer size() {
        return list.size();
    }

    public List<Integer> getUnique() {
        for ( int i =1; i<list.size(); i++){
            if (list.get(i-1)==list.get(i))
                list.remove(i);
        }

        return list;
    }




    public String join() {
        String result = "";
       for( int i=0; i<list.size();i++){
            if (list.size()-1!=i){
                result += list.get(i) + ",";} else
         result+= list.get(i);

        } result=result.replace(",", ", ");
    return result;

}


    public Integer mostCommon() {
        int count = 0;
        int previous = 0;
        Integer k = 0;
        for (Object s : list) {
            if (s!=null) {
                count = Collections.frequency(list, s);
            }
            if (count > previous) {
                previous = count;
                k = Integer.parseInt(String.valueOf(s));
            }


        }
        return k;

    }

    public Boolean contains(Integer valueToAdd) {
            return list.contains(valueToAdd);

    }
}
