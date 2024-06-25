import java.util.*;
public class Working 
{
    Scanner sc = new Scanner(System.in);
    Map<Integer, BankJankari> accounts = new HashMap<>();
    public void openAccount() 
    {
        BankJankari b = new BankJankari();
        System.out.print("Enter Account No of Customer: ");
        b.setAccNo(sc.nextInt());
        sc.nextLine();
        System.out.println("Select Account type:");
        System.out.println("1. Savings");
        System.out.println("2. Current");
        System.out.println("3. Fixed Deposit");
        System.out.println("4. Recurring Deposit");
        System.out.print("Enter choice: ");
        int accTypeChoice = sc.nextInt();
        sc.nextLine();
        String accType;
        switch (accTypeChoice) 
        {
            case 1:
                accType = "Savings";
                break;
            case 2:
                accType = "Current";
                break;
            case 3:
                accType = "Fixed Deposit";
                break;
            case 4:
                accType = "Recurring Deposit";
                break;
            default:
                System.out.println("Invalid choice, defaulting to Savings.");
                accType = "Savings";
        }
        b.setAccType(accType);
        System.out.print("Enter Name of the Customer: ");
        b.setName(sc.nextLine());
        System.out.print("Enter Balance in Customer's Account: ");
        b.setBalance(sc.nextDouble());
        accounts.put(b.getAccNo(), b);
        System.out.println("------THE ACCOUNT DETAILS-------");
        System.out.println(b);
    }
    public void deposit() 
    {
        System.out.print("Enter the Account No you want to deposit to: ");
        int AccNo = sc.nextInt();
        BankJankari b = accounts.get(AccNo);
        if (b != null) 
	{
            System.out.println("Enter the amount you want to deposit:");
            double deposit = sc.nextDouble();
            double amount = b.getBalance() + deposit;
            b.setBalance(amount);
            System.out.println(deposit + " is deposited into your Account");
            System.out.println("Current Available Balance is Rs: " + b.getBalance());
        } 
	else 
	{
            System.out.println("Account not found.");
        }
    }
    public void withdraw() 
    {
        System.out.print("Enter the Account No you want to withdraw from: ");
        int AccNo = sc.nextInt();
        BankJankari b = accounts.get(AccNo);
        if (b != null) 
	{
            System.out.print("Enter the amount you want to withdraw:");
            double withdraw = sc.nextDouble();
            if (withdraw <= b.getBalance()) 
	    {
                b.setBalance(b.getBalance() - withdraw);
                System.out.println(withdraw + " is withdrawn from your Account");
                System.out.println("Current Available Balance is Rs: " + b.getBalance());
            } 
	    else 
	    {
                System.out.println("Alert! Low Balance");
                System.out.println("Current Available Balance is Rs: " + b.getBalance());
            }
        } 
	else 
	{
            System.out.println("Account not found.");
        }
    }
    public void checkBalance() 
    {
        System.out.print("Enter the Account No you want to check balance for: ");
        int AccNo = sc.nextInt();
        BankJankari b = accounts.get(AccNo);
        if (b != null) 
	{
            System.out.println("Customer's Name: " + b.getName());
            System.out.println("Account no: " + b.getAccNo());
            System.out.println("Account type: " + b.getAccType());
            System.out.println("Balance: " + b.getBalance());
            System.out.println("THANKS FOR BALANCE CHECKING");
        } 
	else 
	{
            System.out.println("Account not found.");
        }
    }
    public void transferFunds() 
    {
        System.out.print("Enter the Account No to transfer from: ");
        int fromAcc = sc.nextInt();
        BankJankari from = accounts.get(fromAcc);
        if (from != null) 
	{
            System.out.print("Enter the Account No to transfer to: ");
            int toAcc = sc.nextInt();
            BankJankari to = accounts.get(toAcc);
            if (to != null) 
	    {
                System.out.print("Enter the amount to transfer: ");
                double amount = sc.nextDouble();
                if (amount <= from.getBalance()) 
		{
                    from.setBalance(from.getBalance() - amount);
                    to.setBalance(to.getBalance() + amount);
                    System.out.println("Successfully transferred " + amount + " from Account No: " + fromAcc + " to Account No: " + toAcc);
                    System.out.println("Current Balance of Account No " + fromAcc + " is Rs: " + from.getBalance());
                    System.out.println("Current Balance of Account No " + toAcc + " is Rs: " + to.getBalance());
                } 
		else 
		{
                    System.out.println("Alert! Low Balance in the account to transfer from.");
                }
            } 
	    else 
	    {
                System.out.println("Alert! Account not found.");
            }
        } 
	else 
	{
            System.out.println("Alert! Account from not found.");
        }
    }
    public static void main(String[] args) 
    {
        Working work = new Working();
        Scanner sc = new Scanner(System.in);
        int Options;
        do 
	{
            System.out.println("\n***Banking System Application***");
            System.out.println("1. Open Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Check Balance");
            System.out.println("5. Transfer Funds");
            System.out.println("6. Exit");
            System.out.print("Operation to be executed is: ");
            Options = sc.nextInt();
            switch (Options) 
	    {
                case 1:
                    work.openAccount();
                    break;
                case 2:
                    work.deposit();
                    break;
                case 3:
                    work.withdraw();
                    break;
                case 4:
                    work.checkBalance();
                    break;
                case 5:
                    work.transferFunds();
                    break;
                case 6:
                    System.out.println("Thank you for using our banking system.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } 
	while (Options != 6);
        sc.close();
    }
}
