class InsufficientBalanceException extends Exception {

    InsufficientBalanceException(String message) {
        super(message);
    }
}

class InvalidAmountException extends Exception {

    InvalidAmountException(String message) {
        super(message);
    }
}

class ATM {

    private double balance;

    ATM(double balance) {
        this.balance = balance;
    }

    void withdraw(double amount)
            throws InsufficientBalanceException, InvalidAmountException {

        if (amount <= 0) {
            throw new InvalidAmountException(
                    "Withdrawal amount must be greater than zero."
            );
        }

        if (amount > balance) {
            throw new InsufficientBalanceException(
                    "Insufficient balance."
            );
        }

        balance = balance - amount;

        System.out.println("Withdrawal Successful.");
        System.out.println("Withdrawn Amount: " + amount);
        System.out.println("Remaining Balance: " + balance);
    }

    void checkBalance() {

        System.out.println("Current Balance: " + balance);
    }
}

public class ATMSystem {

    public static void main(String[] args) {

        ATM atm = new ATM(10000);

        atm.checkBalance();

        try {

            atm.withdraw(4000);

        } catch (InsufficientBalanceException e) {

            System.out.println("Error: " + e.getMessage());

        } catch (InvalidAmountException e) {

            System.out.println("Error: " + e.getMessage());
        }

        atm.checkBalance();
    }
}