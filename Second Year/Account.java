import java.util.*;
public class Account
{
    private String owner;
    private double balance;
    public Account()
    {
    }
    
    public Account(String name)
    {
        owner = name;
        balance=0;
    }

    public String getOwner(){
       return owner; 
    }
    
    public double getBalance(){
       return balance; 
    }
    
    public void deposit(double amount){
       balance+=amount; 
    }
    
    public void withdrawal(double amount){
       balance-=amount; 
    }
    
    public String toString(){
       return owner+"  has balance "+balance; 
    }
    
}
