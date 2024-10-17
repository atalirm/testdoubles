package main;

import java.util.ArrayList;

/**
 * TODO .
 *
 * @author paolareyes
 */
public class SchoolClass {

    public String name;
    ArrayList<Student> students;

    public SchoolClass (String name, ArrayList<Student> students){
        this.name = name;
        this.students = students;
    }
}
