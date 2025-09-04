package Patterns.DAO.SudentDAO;

import Patterns.DAO.Student;
import Patterns.DAO.connectionDB.JDBDatabaseConnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

public class StudentDaoImp implements Sudendao{



  static  Connection con = new JDBDatabaseConnection().getConnection();

    @Override
    public void getDetails() {


        try{
         Statement stmt =  con.createStatement();

         String query = "SELECT * FROM students";
            ResultSet result =  stmt.executeQuery("select * from students");

            while (result.next()){


                System.out.println(result.getInt(1)+" "+result.getString(2)+" "+result.getString(3));
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public List<Student> getStudents() {



        return List.of();
    }

    @Override
    public void getStudentById(int id) {

    }

    @Override
    public void insertStudent(Student student) {

    }

    @Override
    public void deleteStudent(int id) {

    }
}
