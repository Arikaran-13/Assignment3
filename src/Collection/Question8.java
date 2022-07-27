package Collection;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class Question8 { // fail-fast and fail-safe
    public static void main(String[] args) {


        failfast();
        failsafe();
    }

    private static void failsafe() {
        List<Integer> al = new CopyOnWriteArrayList<>();
        al.add(8);
        al.add(9);
        al.add(8);
        al.add(8);
        Iterator<Integer> i = al.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
        Map<Integer,Integer> hm = new ConcurrentHashMap<>();
      hm.put(2,3);
      hm.put(1,3);
        hm.put(3,31);
        hm.put(4,13);
        hm.put(5,39);
        hm.put(6,35);

    Iterator<Map.Entry<Integer,Integer>>j =    hm.entrySet().iterator();

    while(j.hasNext()){
        System.out.println(j.next());
    }

    }

    private static void failfast() {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(8);
        al.add(9);
        al.add(8);
        al.add(8);
        Iterator<Integer> i = al.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
        Map<Integer,Integer> hm = new HashMap<>();
        hm.put(2,3);
        hm.put(1,3);
        hm.put(3,31);
        hm.put(4,13);
        hm.put(5,39);
        hm.put(6,35);

        Iterator<Map.Entry<Integer,Integer>>j =    hm.entrySet().iterator();

        while(j.hasNext()){
            System.out.println(j.next());
        }
    }
}

