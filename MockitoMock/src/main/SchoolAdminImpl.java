package main;


import static java.lang.System.out;

/**
 * TODO .
 *
 * @author paolareyes
 */
public class SchoolAdminImpl implements SchoolAdmin{

    String user;
    String pwd;

    public SchoolAdminImpl(String user, String pwd){
        this.user = user;
        this.pwd = pwd;
    }

    @Override
    public void ShutSchoolDueToAFire(String elementsToClose) {
        //will ACTUALLY close the selected windows and doors
        System.out.println("closing...");
    }
}
