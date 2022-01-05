package behavioral.chainreponesibility.logging;

public class EmailLogger extends Logger{
    public EmailLogger(LogLevel level) {
        super(level);
    }

    @Override
    protected void writeMessage(String msg) {
        System.out.println("Sent message with mail, msg: "+msg);
    }
}
