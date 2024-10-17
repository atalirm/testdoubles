package test;

import main.Student;
import main.StudentsRepository;

import java.util.ArrayList;

/**
 * TODO .
 *
 * @author paolareyes
 */
public class FakeStudentRepository implements StudentsRepository {

    ArrayList<Student> students = new ArrayList<Student>();

    @Override
     public void addStudent(Student student) {
        students.add(student);
    }

    @Override
    public Student getStudentByName(String name) {
        for (Student student: students){
            if (student.equals(name)){
                return student;
            }
        }
        return null;
    }

}
