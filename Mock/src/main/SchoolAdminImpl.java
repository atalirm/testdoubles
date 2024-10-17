package main;

import java.util.ArrayList;

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

    public void ShutSchoolDueToAFire(ArrayList<String> elementsToClose){
        //will ACTUALLY close the selected windows and doors
    }

    @Override
    public void ShutSchoolDueToAFire(String elementsToClose) {

    }
}
