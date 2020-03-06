package com.zipcodewilmington.assessment2.part2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListUtility {
    ArrayList list;

    public ListUtility(){
        list=new ArrayList();
    }

    public boolean add(int i) {


           return  list.add(i);

    }

    public Integer size() {
        return list.size();
    }

    public List<Integer> getUnique() {
        return null;
    }

    public String join() {
        return null;
    }

    public Integer mostCommon() {
        return null;
    }

    public Boolean contains(Integer valueToAdd) {


            return list.contains(valueToAdd);

    }
}
