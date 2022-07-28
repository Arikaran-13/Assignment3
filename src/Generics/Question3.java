package Generics;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Question3 {
    public static void main(String[] args) {
        printMapKeyValues();
    }
    public static void printMapKeyValues(){
        HashMap<Integer,Integer> hm = new HashMap<>();
        hm.put(2,3);
        hm.put(4,3);
        hm.put(9,0);
        hm.put(1,0);
        Set s = hm.keySet();
        System.out.println("set: "+s);
       Collection<Integer> values =  hm.values();
        System.out.println("Values: "+values);
        Set<Map.Entry<Integer,Integer>> entryset = hm.entrySet();

        for(Map.Entry<Integer,Integer> i : entryset){
            System.out.println(i);
        }


    }
}
