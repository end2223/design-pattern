package behavioral.chainreponesibility.logging;

public abstract class Logger {
    protected LogLevel level;
    protected Logger nextLogger;

    public Logger(LogLevel level) {
        this.level = level;
    }

    public Logger setNextLogger(Logger nextLogger){
        this.nextLogger = nextLogger;
        return nextLogger;
    }

    public void log(LogLevel severity, String msg) {
        if (level.getLevel() <= severity.getLevel()) {
            writeMessage(msg);
        }
        if (nextLogger != null) {
            nextLogger.log(severity, msg);
        }
    }

    protected abstract void writeMessage(String msg);
}
