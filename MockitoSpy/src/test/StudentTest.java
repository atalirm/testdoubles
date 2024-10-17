package test;

import main.SchoolClass;
import main.Student;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * TODO .
 *
 * @author paolareyes
 */
public class StudentTest {

    @Test
    public void sendMessageToStudentWhenSuccesfullyEnrolledToClass(){
        //Arrange
        Student student = new Student("Joe", "Doe", 59);
        Student studentSpy = Mockito.spy(student);
        SchoolClass schoolClass = new SchoolClass("testClass", new ArrayList<Student>());

        //Act
        studentSpy.enrollToClass(schoolClass.name);

        //Assert
        Mockito.verify(studentSpy).enrollToClass("testClass");
    }
}
