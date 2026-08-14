class InsufficientFundsException extends Exception {

    InsufficientFundsException(String message) {
        super(message);
    }
}

class InvalidTransactionAmountException extends Exception {

    InvalidTransactionAmountException(String message) {
        super(message);
    }
}

class BankAccount {

    private String accountHolder;
    private double balance;

    BankAccount(String accountHolder, double balance) {

        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    void deposit(double amount)
            throws InvalidTransactionAmountException {

        if (amount <= 0) {

            throw new InvalidTransactionAmountException(
                    "Deposit amount must be greater than zero."
            );
        }

        balance = balance + amount;

        System.out.println("Deposit Successful.");
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount)
            throws InvalidTransactionAmountException,
                   InsufficientFundsException {

        if (amount <= 0) {

            throw new InvalidTransactionAmountException(
                    "Withdrawal amount must be greater than zero."
            );
        }

        if (amount > balance) {

            throw new InsufficientFundsException(
                    "Insufficient funds for this transaction."
            );
        }

        balance = balance - amount;

        System.out.println("Withdrawal Successful.");
        System.out.println("Withdrawn: " + amount);
    }

    void showAccountDetails() {

        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }
}

public class BankTransaction {

    public static void main(String[] args) {

        BankAccount account =
                new BankAccount("Hariom", 20000);

        account.showAccountDetails();

        try {

            account.deposit(5000);

            account.withdraw(8000);

        } catch (InvalidTransactionAmountException e) {

            System.out.println("Transaction Error: "
                    + e.getMessage());

        } catch (InsufficientFundsException e) {

            System.out.println("Transaction Error: "
                    + e.getMessage());
        }

        System.out.println("\nAfter Transactions:");

        account.showAccountDetails();
    }
}