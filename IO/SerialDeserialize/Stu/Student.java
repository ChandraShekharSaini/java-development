package SerialDeserialize.Stu;

import java.io.Serializable;

public class Student implements Serializable {

    private String name;
    private int age;
    private String gender;
    private String address;

    transient   private int password;
    static String kaam = "<UNK>";

    public Student(String name, int age, String gender, String address, int password , String kaam) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.password = password;
        this.kaam = kaam;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public static String getKaam() {
        return kaam;
    }

    public static void setKaam(String kaam) {
        Student.kaam = kaam;
    }
}
