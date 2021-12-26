package creational.factorymethod;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten ngan hang TPBank hoac VietcomBank?");
        String bank = sc.nextLine();
        if (bank.equals("TPBank")){
            System.out.println(BankFactory.getBank(BankType.TPBank).getBankName());
        }
        else {
            System.out.println(BankFactory.getBank(BankType.VietcomBank).getBankName());
        }
    }
}
