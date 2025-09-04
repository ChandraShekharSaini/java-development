package Patterns.DAO;

import Patterns.DAO.SudentDAO.StudentDaoImp;

//public class Main {
//    public static void main(String[] args) {
//        Student student = new Student(1, "John Doe", 20);
//
//        StudentDaoImp studentDao = new StudentDaoImp();
//        studentDao.getDetails();
//    }
//}


public class Main {
    public static void main(String[] args) {
        funn(1, 2, 9);
    }

    public static void funn(Integer a, Integer b, Integer c) {



        for (c = 5; c <= 9; c++) {
            if ((b + 5) > (a - b)) {
                a=(b+5)^a;
                System.out.println(a);
            }
            b =5^c;
            System.out.println(b);


        }

    }
}




