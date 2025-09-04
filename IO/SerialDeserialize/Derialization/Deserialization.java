package SerialDeserialize.Derialization;

import SerialDeserialize.Stu.Student;
import java.io.FileInputStream;
import java.io.ObjectInputStream;


public class Deserialization {

    public static void main(String[] args) {

        String fileName  = "D:\\Java Development\\IO\\SerialDeserialize\\Stu\\Stu.txt";
        Student student = null;
        try{
            FileInputStream file = new FileInputStream(fileName);
            ObjectInputStream in = new ObjectInputStream(file);
            student =   (Student) in.readObject();

            in.close();
            file.close();


            System.out.println("Object has been deserialized");
            System.out.println(student.getName());
            System.out.println(student.getAge());
            System.out.println(student.getGender());
            System.out.println(student.getAddress());
            System.out.println(student.getPassword());
            System.out.println(student.getKaam());

        }

        catch(Exception e){
            e.printStackTrace();
        }
    }
}
