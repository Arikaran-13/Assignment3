package FileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Vector;

public class Question4 {
    public static void main(String[] args) {
        try {
            FileInputStream fin1 = new FileInputStream("D://ari.txt");
            FileInputStream fin2 = new FileInputStream("D://test1.txt");
            FileInputStream fin3 = new FileInputStream("D://test2.txt");
            Vector v = new Vector();
            v.add(fin1);
            v.add(fin2);
            v.add(fin3);

         Enumeration em = v.elements();
         int j =0;
            SequenceInputStream sin = new SequenceInputStream(em);
            while((j= sin.read()) != -1){
                System.out.println((char)j);
            }
            fin1.close();
            fin2.close();
            fin3.close();
            sin.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
