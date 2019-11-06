import java.util.Scanner;

class Account {
    int amount;
    String AccHolderName;
    int accNumber;

    Account(int amount, int accNumber, String AccHolderName) {
        this.amount = amount;
        this.accNumber = accNumber;
        this.AccHolderName = AccHolderName;
    }

    public void withdraw(int val) throws IllegalAccessException {
        if ((amount - val) < 1000) {
            throw new IllegalAccessException("The total amount is falling below minimum allowed amount(Rs.1000)");
        }
        amount = amount - val;
    }

    public void deposite(int val) {
        amount = amount + val;
    }
}

class q1 {
    public static void main(String[] args) {
        Account a = new Account(4000, 001, "Rajat Nagpure");
        int val = 0;
        Scanner scanner = new Scanner(System.in);
        val = scanner.nextInt();
        scanner.close();
        try {
            a.withdraw(val);
        } catch (Exception e) {
            System.out.println("Error! : " + e);
        } finally {
            System.out.println("The current Balance is :" + a.amount);
        }
    }
}