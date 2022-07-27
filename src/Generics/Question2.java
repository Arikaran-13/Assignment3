package Generics;

import java.util.ArrayList;
import java.util.List;

public class Question2 {
    public static void main(String[] args) {
        @SuppressWarnings("rawtypes")
        List l = new ArrayList();
        byte a =1;
        short s = 2;
        l.add(a);
        l.add(23);
        l.add(23.3f);
        l.add(90.9876);
        l.add(s);
        l.add(9607865302l);
        System.out.println(l);
    }
}
