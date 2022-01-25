package behavioral.observer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class EmailAlertListener implements EventListeners{
    private String email;

    public EmailAlertListener(String email) {
        this.email = email;
    }

    @Override
    public void update(String eventType, File filename) throws IOException {
        FileWriter fileWriter = new FileWriter(filename);
        fileWriter.write(eventType+"\t\t"+email+"\n");
        System.out.println("Email to " + email + ": Someone has performed " + eventType + " operation with the following file: " + filename.getName());
        fileWriter.close();
    }
}
