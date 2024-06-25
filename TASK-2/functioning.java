import java.util.*;
public class functioning 
{
    public static void BankJankari() 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("------------------------------------------------------------------------------------------------------------------------");
        System.out.println(" *** Banking System Application ***");
        System.out.println(" ------------------------------------------------------------------------------------------------------------------");
        System.out.println(" 1. Create a new account \n 2. Check Balance \n 3. Deposit the amount \n 4. Withdraw the amount \n 5. Transfer Funds \n 6. Exit \n\nENTER YOUR CHOICE :: ");
        int key = sc.nextInt();
        functioning(key);
    }
    public static void functioning(int key) 
    {
        Working work = new Working();
        switch (key) 
	{
            case 1:
                System.out.println(" -------------WELCOME! PLEASE CLICK HERE TO OPEN YOUR NEW ACCOUNT-------------------");
                work.openAccount();
                System.out.println(" ---------------------------------------------------------------------------------------------------");
                break;
            case 2:
                System.out.println(" ------------CHECK YOUR ACCOUNT BALANCE--------------------------------------------------");
                work.checkBalance();
                System.out.println(" -----------------------------------------------------------------------------------------------------------------------");
                break;
            case 3:
                System.out.println("---------DEPOSIT THE AMOUNT---------------- ");
                work.deposit();
                System.out.println(" ----------------------------------------------------------------------------------------------------------");
                break;
            case 4:
                System.out.println("---------AMOUNT WITHDRAWN---------------- ");
                work.withdraw();
                System.out.println(" ----------------------------------------------------------------------------------------------------------");
                break;
            case 5:
                System.out.println("---------TRANSFER FUNDS---------------- ");
                work.transferFunds();
                System.out.println(" ----------------------------------------------------------------------------------------------------------");
                break;
            case 6:
                System.out.println("Exiting the system. Thank you for using our banking system.");
                return;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
        System.out.println("MAIN PAGE_:: PRESS 1 ::");
        Scanner sc = new Scanner(System.in);
        if (sc.nextInt() == 1) 
	{
            BankJankari();
        }
    }
}
