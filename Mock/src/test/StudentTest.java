package test;

import main.SchoolClass;
import main.Student;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * TODO .
 *
 * @author paolareyes
 */
public class StudentTest {

    @Test
    public void sendMessageToStudentWhenSuccesfullyEnrolledToClass(){
        //Arrange
        SchoolAdminMock schoolAdminMock = new SchoolAdminMock();
        Student student = new Student("Joe", "Doe", 59);
        SchoolClass schoolClass = new SchoolClass("testClass", new ArrayList<Student>());

        //Act
        schoolAdminMock.ShutSchoolDueToAFire("LabWindows");

        //Assert
        assertEquals(1, schoolAdminMock.invocation("ShutSchoolDueToAFire"));
        assertEquals("LabWindows",schoolAdminMock.arguments("ShutSchoolDueToAFire", 1).getParams().get(0));

    }
}
