package Patterns.DAO.SudentDAO;

import Patterns.DAO.Student;

import java.util.List;

public interface Sudendao {




     void getDetails();
     List<Student> getStudents();
     void getStudentById(int id);
     void insertStudent(Student student);
     void deleteStudent(int id);


}
