package behavioral.observer;

public class Main {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.eventManager.subscribe("open", new LoggingListener("/path/to/log/file.txt"));
        editor.eventManager.subscribe("save", new EmailAlertListener("admin@example.com"));

        try {
            editor.openFile("./out/email-observer.txt");
            editor.saveFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
