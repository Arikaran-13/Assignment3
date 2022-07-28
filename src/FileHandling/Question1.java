package FileHandling;

import org.apache.commons.io.FileUtils;

import java.io.File;

public class Question1 {
    public static void main(String[]args){
        File f = new File("D://new4.txt");
        File f2 = new File("D://new5.txt");
        try {
           String str = FileUtils.readFileToString(f, "UTF-8");
            System.out.println(str);

            FileUtils.write(f2,str,"UTF-8",true);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
