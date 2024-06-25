import java.util.*;
public class BankJankari 
{
    private String Name;
    private int Acc_No;
    private String Acc_type;
    private double Balance;
    public void setName(String Name) 
    {
        this.Name = Name;
    }
    public String getName() 
    {
        return Name;
    }
    public void setAccNo(int Acc_No) 
    {
        this.Acc_No = Acc_No;
    }
    public int getAccNo() 
    {
        return Acc_No;
    }
    public void setAccType(String Acc_type) 
    {
        this.Acc_type = Acc_type;
    }
    public String getAccType() 
    {
        return Acc_type;
    }
    public void setBalance(double Balance) 
    {
        this.Balance = Balance;
    }
    public double getBalance() 
    {
        return Balance;
    }
    @Override
    public String toString() 
    {
        return "BankJankari{" + "Name='" + Name + '\'' + ", Acc_No=" + Acc_No + ", Acc_type='" + Acc_type + '\'' + ", Balance=" + Balance + '}';
    }
}
