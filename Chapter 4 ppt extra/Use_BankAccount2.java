
import java.util.Scanner;

public class Use_BankAccount2
{
  public static void main (String args [])
  {
    //  Vector <BankAccount> b = new Vector <BankAccount>();
      char repeat = 'y';
      Scanner keyboard = new Scanner (System.in);
      BankAccount2 nextAccount = new BankAccount2();
      while (repeat == 'y' || repeat == 'Y')
      {
          
          nextAccount.readInput();
          System.out.println("Enter another account Y/y ? ");
          repeat = keyboard.next().charAt(0);
        }
          System.out.println("Enter account number to search ");
          String temp = keyboard.next();
          
          nextAccount.searchAccount(temp);
          // making a deposit in the above account
	      System.out.println("Deposit amount ? ");
	      int tempdep= keyboard.nextInt();
	      nextAccount.deposit(tempdep);
	      nextAccount.displayVector();
	      
 	      
       // assuming to withdraw from same account
	      System.out.println("Withdraw amount ? ");
	      int tempwithdraw= keyboard.nextInt();
 	      nextAccount.withdraw(tempwithdraw);
	      nextAccount.displayVector();
// 	    
// 	    
	        
	        
	        
        
    }
}