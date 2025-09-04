package SerialDeserialize.Seializaion;

import SerialDeserialize.Stu.Student;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Serialization {

    public static void main(String[] args) {
        String fileName  = "D:\\Java Development\\IO\\SerialDeserialize\\Stu\\Stu.txt";
        Student stu = new Student("Chandra" , 12 , "Male" , "Roorkee",78668 ,  "vbnm");

        try {
            FileOutputStream fos = new  FileOutputStream(fileName);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(stu);
            oos.close();
            fos.close();

            System.out.println("Object has been serialized");

        }catch (Exception e){
            e.printStackTrace();
        }



    }

}
