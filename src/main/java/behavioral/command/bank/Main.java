package behavioral.command.bank;

public class Main {
    public static void main(String[] args) {
        Account account = new Account("Cao Ngoc Son");

        Command open = new OpenAccount(account);
        Command close = new CloseAccount(account);
        BankApp bankApp = new BankApp(open, close);

        bankApp.clickOpenAccount();
        bankApp.clickCloseAccount();
    }
}
