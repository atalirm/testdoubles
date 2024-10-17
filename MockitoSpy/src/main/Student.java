package main;

/**
 * TODO .
 *
 * @author paolareyes
 */
public class Student {
    String name;
    String surname;
    Integer age;

    public Student (String name, String surname, Integer age){
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public void enrollToClass(String schoolClass){
        //should do a lot of stuff also
        System.out.println("enrolling...");
    }
}
