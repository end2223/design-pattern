package behavioral.observer;

import java.io.File;
import java.io.IOException;

public class Editor {
    public EventManager eventManager;
    private File file;

    public Editor() {
        this.eventManager = new EventManager("open", "save");
    }

    public void openFile(String filePath){
        try {
            this.checkFileExist(filePath);
            eventManager.notify("open", this.file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void saveFile() throws Exception {
        if (this.file != null) {
            eventManager.notify("save", this.file);
        } else {
            throw new Exception("Please open a file first.");
        }
    }

    private void checkFileExist(String path) throws IOException {
        this.file = new File(path);
        if (!file.exists()){
            file.createNewFile();
        }
    }
}
