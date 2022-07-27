package Generics;

public class Question1 {
    public static void main(String[] args) {
        int a=10;
        Integer i = a; // boxing
        Integer b = Integer.valueOf(a); // boxing
        int c = i.intValue(); // unboxing
        Double d = Double.valueOf(2.34); // boxing
        double d1 = d.doubleValue();
        byte b1=1;
        Byte b2 = Byte.valueOf(b1); // boxing
        byte b3 = b2.byteValue();
        float f1 = 23.3f;
        Float f2 = Float.valueOf(f1);
        float f3 = f2.floatValue();

        System.out.println(a);
        System.out.println(i);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(d1);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f3);



    }
}
