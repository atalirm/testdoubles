package test;

import main.MailService;
import main.Student;

/**
 * TODO .
 *
 * @author paolareyes
 */
public class MailServiceStub implements MailService {
   /* public Integer numMessagesSent;
    @Override
    public boolean sendConfirmationMessage(String message) {
        numMessagesSent = numMessagesSent+1;
        return true;
    }*/

    public String messageSent;
    @Override
    public String sendConfirmationMessage(String message) {
        messageSent = String.format("Message succesfully sent for class %s", message);
        return messageSent;
    }
}
