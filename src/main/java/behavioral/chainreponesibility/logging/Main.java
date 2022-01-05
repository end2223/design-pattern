package behavioral.chainreponesibility.logging;

public class Main {
    public static void main(String[] args) {
        Logger logger = AppLogger.getLogger();

        System.out.println("Console");
        logger.log(LogLevel.INFO, "Info message!");
        logger.log(LogLevel.DEBUG, "Debug message!");

        System.out.println("\nAdd File");
        logger.log(LogLevel.ERROR, "Error message!");

        System.out.println("\nAdd Email");
        logger.log(LogLevel.FATAL, "Fatal message!");
    }
}
