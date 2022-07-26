package Collection;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class Question2 {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        hs.add("India");
        hs.add("Canada");
        hs.add("USA");
        hs.add("Australia");
        hs.add("Africa");
        System.out.println(hs); // unordered

        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("India");
        lhs.add("Canada");
        lhs.add("USA");
        lhs.add("Australia");
        lhs.add("Africa");
        System.out.println(lhs); // ordered
    }
}
