package Collection;

import java.text.*;


import java.util.HashMap;

public class Question5 {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat s = new SimpleDateFormat("dd-mm-yyyy");
Employee e1 = new Employee();
        Employee e2 = new Employee();
        Employee e3 = new Employee();
        Employee e4 = new Employee();
        Employee e5 = new Employee();

HashMap<Employee,Integer> hm = new HashMap<>();
hm.put(e1,1);
hm.put(e2,2);
hm.put(e3,3);
hm.put(e4,4);
hm.put(e5,5);

        System.out.println(hm.get(e1));

    }
}

class Employee{
    private int id;
    private String name;

    @Override
    public int hashCode() {
        return 7;
    }

    @Override
    public boolean equals(Object obj) {
        return true;
    }
}