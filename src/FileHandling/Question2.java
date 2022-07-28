package FileHandling;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.util.List;

public class Question2 {
    public static void main(String[] args) {
        try {
            File dir = new File("D://dir");
            List<File> l = (List<File>) FileUtils.listFiles(dir, null, true);
            BasicFileAttributes attr ;

           for(File i : l){
               System.out.println("File name: "+i.getName());
               System.out.println("File length :"+i.length());

               attr = Files.readAttributes(i.toPath(),BasicFileAttributes.class);
               System.out.println("File creation time :"+attr.creationTime());
               System.out.println("Executable:"+i.canExecute());
               System.out.println("Readable: "+i.canRead());
               System.out.println("Writable : "+i.canWrite());

           }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
