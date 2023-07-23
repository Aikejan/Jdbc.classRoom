package org.example;

import org.example.model.Student;
import org.example.service.StudentService;
import org.example.serviceimpl.StudentServiceImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        StudentService studentService = new StudentServiceImpl();
        //studentService.createTableStudent();
        studentService.saveStudent(new Student("Akylay","Samatova",20));
        //studentService.getAllStudents().forEach(System.out::println);
       //studentService.updateStudent(1L,new Student("Asan","Turatov",25));
        //studentService.dropTable();

    }
}
