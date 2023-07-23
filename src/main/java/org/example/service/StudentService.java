package org.example.service;

import org.example.model.Student;

import java.util.List;

public interface StudentService {
    // CRUD METNOD


    void createTableStudent();


    //  SAVE KOSHUU METODU
    void saveStudent(Student student);



    List<Student> getAllStudents();



    // UPDATE MAANISINE OZGORTUU KIRGIZUU;

    void updateStudent(Long id, Student student);



    //  CLEAN  TABLISANYN ICHINDEGI MAALYMATTARDY  OCHUROT;
    void cleanTable();



    //  DROP   BAARDYK MAALYMATTY OCHYROT;
    void dropTable();
}
