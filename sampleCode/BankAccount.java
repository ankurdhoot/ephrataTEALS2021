package sampleCode;

public class BankAccount {

    public static int bankAccount(int accountValue, int deposit) {
        if (deposit >= 0) {
            return deposit + accountValue;
        } else {
            if (Math.abs(deposit) > accountValue) {
                return accountValue;
            } else {
                return accountValue - Math.abs(deposit);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(bankAccount(30, 5));
        System.out.println(bankAccount(30, -5));
        System.out.println(bankAccount(30, -40));
    }
    
}
