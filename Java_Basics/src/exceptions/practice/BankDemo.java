package exceptions.practice;

public class BankDemo {

    public static void main(String [] args) {
        CheckingAccount c = new CheckingAccount(10123232);
        System.out.println("Depositing to Account Number "+c.getAccountNumber()+" $500...");
        c.deposit(500.00);

        try {
            System.out.println("\nWithdrawing from Account Number "+c.getAccountNumber()+" $100...");
            c.withdraw(100.00);
            System.out.println("\nWithdrawing from Account Number "+c.getAccountNumber()+" $600...");
            c.withdraw(600.00);
        } catch (InsufficientFundsException e) {
            System.out.println("Sorry, but you are short $" + e.getAmount());
            e.printStackTrace();
        } finally {
            System.out.println("Your current balance is "+c.getBalance()+" dollar...");
        }
    }
}
