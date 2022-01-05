package behavioral.chainreponesibility.logging;

import java.io.*;

public class FileLogger extends Logger{

    public FileLogger(LogLevel level) {
        super(level);
    }

    @Override
    protected void writeMessage(String msg) {
        File file = new File("/home/caongocson/Desktop/code/design-pattern/src/main/java/behavioral/chainreponesibility/FileLogger.txt");
        FileWriter fw = null;
        try {
            fw = new FileWriter(file, true);
            fw.write(msg+"\n");
            System.out.println("File Logger: "+ msg);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                assert fw != null;
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
