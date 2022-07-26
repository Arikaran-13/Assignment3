package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Question3 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(90);
        al.add(98);
        al.add(12);
        al.add(6);

        ListIterator<Integer> i = al.listIterator(al.size());
        while(i.hasPrevious()){
            System.out.println(i.previous());
        }
    }
}
