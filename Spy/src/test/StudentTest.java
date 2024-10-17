package test;

import main.SchoolClass;
import main.Student;
import org.junit.jupiter.api.Test;

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
        StudentSpy spy = new StudentSpy();
        student.setSpy(spy);
        SchoolClass schoolClass = new SchoolClass("testClass", new ArrayList<Student>());

        //Act
        student.enrollToClass(schoolClass.name);

        //Assert
        assertEquals(1, spy.invocation("enrollToClass"));
        assertEquals("testClass",spy.arguments("enrollToClass", 1).getParams().get(0));

    }
}
