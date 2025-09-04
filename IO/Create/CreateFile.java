import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CreateFile {
    public static void main(String[] args) {

        File file = new File("D:\\Java Development\\IO\\Files\\pdf.txt");


        // try {
        // if (file.createNewFile()) {

        // System.out.println(file.createNewFile());

        // } else {
        // System.out.println("Created Not File");
        // }
        // } catch (IOException e) {
        // e.printStackTrace();

        // }

        // System.out.println(file.createNewFile());

        // System.out.println(file.canRead());
        // System.out.println(file.canWrite());
        // System.out.println(file.exists());
        // System.out.println(file.isHidden());
        // System.out.println(file.isFile());
        // System.out.println(file.isDirectory());
        // System.out.println(file.canExecute());
        // System.out.println(file.getName());
        // System.out.println(file.getParent());
        //  System.out.println(file.getPath());
  
       //System.out.println(file.setWritable(true , true));

    //     String [] str = file.list();
     
    //    for(String x:str){
    //     System.out.println(x);
    //    }

    // System.out.println("-----------------------------------");
    //    File [] f1 = file.listFiles();
    //     for(File x:f1){
    //     System.out.println(x);
    //    }


       file.delete();

    }
}
