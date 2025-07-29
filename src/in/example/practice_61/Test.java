package in.example.practice_61;

public class Test {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("01","Adi Ingole");
        double totalBalance = acc.depositeMoney(5000);
        System.out.println("Total Acc Balance is :"+totalBalance);

        double balance = acc.withdrawMoney(3000);
        System.out.println("After withdraw money total balance is :"+balance);
        acc.withdrawMoney(-10);
        acc.withdrawMoney(0);






    }
}
