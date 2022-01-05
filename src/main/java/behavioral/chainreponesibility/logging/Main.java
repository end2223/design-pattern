package behavioral.chainreponesibility.logging;
/*
* Chain of repository pattern (It very slowly because it must to recursive all BaseHandlers)
* 1. Handler: It is Interface. It usually contains just a single method for handing request.
* 2. BaseHandler: Where you can put boilerplate(ban mau) that's common to all handler classes.(Logger)
* 3. ConcreteHandler: contain the actual code for processing requests. Upon receiving a request, each handler
*    must decide whether to process it and, additionally, whether to pass it along the chain.
*
* */
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
