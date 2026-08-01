class InsufficientBalanceException extends Exception
{
	InsufficientBalanceException(String message)
	{
		super(message);
	}
}
class BankAccount
{
	private double balance;

	BankAccount(double balance)
	{
		this.balance = balance;
	}

	void withdraw(double amount) throws InsufficientBalanceException
	{
		if(amount > balance)
		{
			throw new InsufficientBalanceException("Insufficient Balance.");
		}

		balance -= amount;

		System.out.println("Withdrawal Successful.");
		System.out.println("Remaining Balance: " + balance);
	}
}
public class BankAccountException
{
	public static void main(String[] args)
	{
		BankAccount account = new BankAccount(5000);

		try
		{
			account.withdraw(7000);
		}

		catch(InsufficientBalanceException e)
		{
			System.out.println(e.getMessage());
		}
	}
}