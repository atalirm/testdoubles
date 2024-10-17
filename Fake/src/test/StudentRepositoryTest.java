package test;

import main.Student;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * TODO .
 *
 * @author paolareyes
 */
public class StudentRepositoryTest {

    @Test
    public void shouldAddNewStudentToRepository(){
        //Arrange
        Student testStudent = new Student("testStudentName", "testStudentSurname", 23);
        FakeStudentRepository fakeStudentRepository = new FakeStudentRepository();
        fakeStudentRepository.students.clear();

        //Act
        fakeStudentRepository.addStudent(testStudent);

        //Assert
        assertEquals(1, fakeStudentRepository.students.size());

    }

}
