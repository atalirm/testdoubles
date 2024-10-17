package main;

import test.MethodInvocationSpy;
import test.StudentSpy;

import java.util.List;

/**
 * TODO .
 *
 * @author paolareyes
 */
public class Student {
    String name;
    String surname;
    Integer age;
    StudentSpy spy;

    public Student (String name, String surname, Integer age){
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public void enrollToClass(String schoolClass){
        //should do a lot of stuff also
        MethodInvocationSpy invocation = new MethodInvocationSpy();
        invocation.addParam(schoolClass).setMethod("enrollToClass");
        spy.registerCall(invocation);
    }

    public void setSpy(StudentSpy spy){
        this.spy = spy;
    }

}
