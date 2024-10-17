package test;

import main.SchoolAdmin;
import main.SchoolAdminImpl;
import main.SchoolClass;
import main.Student;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

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
        SchoolAdminImpl schoolAdminMock = Mockito.mock(SchoolAdminImpl.class);
        Student student = new Student("Joe", "Doe", 59);
        SchoolClass schoolClass = new SchoolClass("testClass", new ArrayList<Student>());

        //Act
        schoolAdminMock.ShutSchoolDueToAFire("LabWindows");

        //Assert
        Mockito.verify(schoolAdminMock).ShutSchoolDueToAFire("LabWindows");
    }
}
