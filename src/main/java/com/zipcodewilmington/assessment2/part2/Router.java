package com.zipcodewilmington.assessment2.part2;

import javafx.util.Pair;

import java.util.HashMap;
import java.util.Map;

public class Router {

    HashMap<String, String> s ;

    public Router(){
        s= new HashMap<String,String>();


    }


    public void add(String path, String controller) {
        s.put(path,controller);


         }

    public Integer size() {
        return s.size() ;
    }

    public String getController(String path) {
        for (Map.Entry<String,String> f : s.entrySet()){
           if ( f.getKey() ==path){
               return f.getValue();
           }
        }
        return null;
    }

    public void update(String path, String studentController) {
         s.replace(path,studentController);


    }

    public void remove(String path) {
        for (Map.Entry<String,String> f : s.entrySet()){
            if ( f.getKey() ==path){
                s.remove(f.getKey());
            }

        }
    }

    @Override
    public String toString() {
        for (Map.Entry<String, String> f : s.entrySet()) {

            return  f.getKey()+
                    f.getValue();
        }
return null;
    }
}
