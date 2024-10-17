package test;

import main.SchoolClass;
import main.Student;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;


/**
 * TODO .
 *
 * @author paolareyes
 */
public class ClassTest {

    @Test
    public void shouldAddNewStudentToClass(){
        //Arrange
        SchoolClass schoolClass = new SchoolClass("newClass", new ArrayList<Student>());

        //Act
        schoolClass.addStudentToSchoolClass(new DummyStudent());

        //Assert
        assertEquals(1, schoolClass.numberOfStudents());
    }
}
