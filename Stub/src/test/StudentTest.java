package test;

import main.MailService;
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

  /*  @Test
    public void sendMessageToStudentWhenSuccesfullyEnrolledToClass(){
        //Arrange
        MailServiceStub mailServiceStub = new MailServiceStub();
        mailServiceStub.numMessagesSent = 0;
        Student student = new Student("Joe", "Doe", 59);
        SchoolClass schoolClass = new SchoolClass("testClass", new ArrayList<Student>());

        //Act
        student.enrollToClass(mailServiceStub,schoolClass);

        //Assert
        assertEquals(1, mailServiceStub.numMessagesSent);

    }*/

    @Test
    public void sendMessageToStudentWhenSuccesfullyEnrolledToClass(){
        //Arrange
        MailServiceStub mailServiceStub = new MailServiceStub();
        Student student = new Student("Joe", "Doe", 59);
        SchoolClass schoolClass = new SchoolClass("testClass", new ArrayList<Student>());

        //Act
        student.enrollToClass(mailServiceStub,schoolClass);

        //Assert
        assertEquals("Message succesfully sent for class testClass", mailServiceStub.messageSent);

    }
}
