package main;

import java.util.ArrayList;

/**
 * TODO .
 *
 * @author paolareyes
 */
public class SchoolClass {

    String name;
    ArrayList<Student> students;

    public SchoolClass (String name, ArrayList<Student> students){
        this.name = name;
        this.students = students;
    }

    public void addStudentToSchoolClass (Student student){
        students.add(student);
    }

    public int numberOfStudents(){
        return students.size();
    }
}
