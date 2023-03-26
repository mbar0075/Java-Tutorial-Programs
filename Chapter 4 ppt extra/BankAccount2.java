
import java.util.Scanner;
import java.util.Vector;
public class BankAccount2
{
	 // the attributes
	 private String accountNumber;
	 private String accountName;
	 private int balance, spot;
	Vector <BankAccount2> b = new Vector <BankAccount2>();
	 // the methods
	 public BankAccount2()
	 {};
	 
	 // the constructor
	 public BankAccount2( String nameIn,String numberIn, int balanceIn)
	 {
		 accountNumber = numberIn;
		 accountName = nameIn;
		 balance = balanceIn;
	 }
	 
	 // methods to read the attributes
	 public String getAccountName()
	 {
	 	return accountName;
	 }
	
	 public String getAccountNumber()
	 {
	 	return accountNumber;
	 }
	
	 public int getBalance()
	 {
		 return balance;
	 }
	
	 // methods to deposit and withdraw money
	 public void deposit(int amountIn)
	 {
		 int bal = b.elementAt(spot).getBalance();
	       int newbal = bal+ amountIn;
	     // create a new instance since I will be overwriting previous object
	       BankAccount2 nextAccount2 = new BankAccount2(b.elementAt(spot).getAccountName(),b.elementAt(spot).getAccountNumber(), newbal );
	       b.setElementAt(nextAccount2,spot);  // 
	 
	 }
	
	 public void withdraw(int amountIn)
	 {
	     int newbal=0;
	 	 int bal = b.elementAt(spot).getBalance();
	 	 if (bal < amountIn) System.out.println("Not enough money in account ");
	 	 else 
	 	 {
	        newbal = bal-  amountIn;
	     // create a new instance since I will be overwriting previous object
	       BankAccount2 nextAccount2 = new BankAccount2(b.elementAt(spot).getAccountName(),b.elementAt(spot).getAccountNumber(), newbal );
	       b.setElementAt(nextAccount2,spot);  
	   }
	 	
	 	
	 }
	 
	 
	 public void readInput()
	 {
	      Scanner keyboard = new Scanner (System.in);
	      System.out.println("Account number ");
	      accountNumber = keyboard.next();
	       System.out.println("Account name ");
	       accountName = keyboard.next();
	        System.out.println("Initial balance ");
	        balance = keyboard.nextInt();
	        b.addElement(new BankAccount2(accountName,accountNumber,balance));
	       }
	       
	public void displayVector()
	{
	    System.out.println("size of vector "+b.size());
	    
	        for (int i = 0; i < b.size() ; i++)  // display accounts
          System.out.println(b.elementAt(i));
        }
          
          public String toString()
	{
	    return accountNumber + "  " + accountName+ "  "+balance;
	   }
	   
	 public void  searchAccount(String temp)
	   {
	       spot = b.indexOf(new BankAccount2(null, temp, 0));
	      if (spot == -1) System.out.println(temp+ " not found ");
	   }
	   
	     public boolean equals (Object other)
       {
           return getAccountNumber().equals( ((BankAccount2)other).getAccountNumber());
        }
   
       
}

