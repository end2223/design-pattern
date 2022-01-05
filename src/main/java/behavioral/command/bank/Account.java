package behavioral.command.bank;

public class Account {
    private String name;

    public Account(String name) {
        this.name = name;
    }

    public void open(){
        System.out.println("Account "+this.name+" opened!");
    }

    public void close(){
        System.out.println("Account "+this.name+" closed!");
    }
}
