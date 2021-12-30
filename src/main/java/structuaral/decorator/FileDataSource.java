package structuaral.decorator;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class FileDataSource implements DataSource{
    private String name;

    public FileDataSource(String name) {
        this.name = name;
    }

    @Override
    public void writeData(String data) {
        File file = new File(this.name);
        OutputStream os = null;
        try {
            os = new FileOutputStream(file);
            os.write(data.getBytes(StandardCharsets.UTF_8), 0, data.length());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                assert os != null;
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public String readData() {
        char[] buffer = null;
        File file = new File(this.name);
        FileReader fr = null;
        try {
            fr = new FileReader(file);
            buffer = new char[(int) file.length()];
            fr.read(buffer);
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                assert fr != null;
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return new String(buffer);
    }
}
