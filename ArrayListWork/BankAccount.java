import java.util.*;
public class BankAccount
{
    private int accountNum ;
    private double balance;
    
    public BankAccount(int num )
    {
        accountNum = num;
        balance=0;
    }

    public BankAccount(int num ,double b )
    {
        accountNum = num;
        balance=b;
    }

    public int getAccountNumber(){
        return accountNum;
    }

    public double getBalance(){
        return balance;
    }

    public String toString(){
        return accountNum+" has balance   "+balance;
    }

    public boolean equals(Object Other){
        return getAccountNumber()==(((BankAccount)Other).getAccountNumber());
    }
}
