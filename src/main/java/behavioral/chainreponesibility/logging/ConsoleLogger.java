package behavioral.chainreponesibility.logging;

public class ConsoleLogger extends Logger{

    public ConsoleLogger(LogLevel level) {
        super(level);
    }

    @Override
    protected void writeMessage(String msg) {
        System.out.println("Console logger: " + msg);
    }
}
