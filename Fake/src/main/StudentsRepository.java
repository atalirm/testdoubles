package main;

/**
 * TODO .
 *
 * @author paolareyes
 */
public interface StudentsRepository {


    void addStudent(Student student);
    Student getStudentByName(String name);
}
