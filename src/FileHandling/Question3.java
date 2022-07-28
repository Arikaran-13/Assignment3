package FileHandling;

import java.io.*;
import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) throws IOException {
        try {
            File f = new File("D://ari.txt");
            FileOutputStream fout = new FileOutputStream(f);
            DataOutputStream dout = new DataOutputStream(fout);
            Scanner sc = new Scanner(System.in);
            String str = "";
            int accNum;
            double cash;
            for (int i = 1; i <= 3; i++) {
                str = sc.nextLine();
                accNum = sc.nextInt();
                cash = sc.nextDouble();
                sc.nextLine();
                dout.writeUTF(str);
                dout.writeInt(accNum);
                dout.writeDouble(cash);
            }


            fout.close();
            dout.close();
            FileInputStream fin = new FileInputStream(f);
            DataInputStream din = new DataInputStream(fin);
            for (int i = 1; i <= 3; i++) {
                String accowner = din.readUTF();
                System.out.println(accowner);
                int num = din.readInt();
                System.out.println(num);
                Double rs = din.readDouble();
                System.out.println(rs);
            }

            fin.close();
            din.close();


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
