package org.example.dao;

import org.example.model.Student;

import java.util.List;

public interface StudentDao {

    // CRUD METNOD


    void createTableStudent();


    //  SAVE KOSHUU METODU
    void saveStudent(Student student);



    List<Student> getAllStudents();



    // UPDATE MAANISINE OZGORTUU KIRGIZUU;

    boolean updateStudent(Long id, Student student);



    //  CLEAN  TABLISANYN ICHINDEGI MAALYMATTARDY  OCHUROT;
    void cleanTable();



    //  DROP   BAARDYK MAALYMATTY OCHYROT;
    void dropTable();
}
