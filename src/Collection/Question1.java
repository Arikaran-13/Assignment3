package Collection;

import java.util.Comparator;
import java.util.TreeSet;

public class Question1 {
    public static void main(String[] args) {
        Person p = new Person("aadam",76,189);
        Person p2 = new Person("Mike",65,178);
        Person p3 = new Person("Will",76,170);
        Person p4 = new Person("Max",67,165);

        TreeSet<Person> ts = new TreeSet<Person>();
        ts.add(p);
        ts.add(p2);
        ts.add(p3);
        ts.add(p4);
        System.out.println(ts);
    }
}
class Person implements Comparable<Person> {
    private String name;
    private int weight;
    private int height;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", height=" + height +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Person(String name, int weight, int height) {
        this.name = name;
        this.weight = weight;
        this.height = height;
    }



    @Override
    public int compareTo(Person o) {
       if(this.weight > o.weight)return 1;
       else if ( this.weight < o.weight) return -1;
       else if (this.weight == o.weight){
           if( this.height > o.height)return 1;
           else if ( this.height < o.height) return -1;
           else return 0;
       }
       return 0;
    }
}