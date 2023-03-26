import java.util.*;
public class Use_Bank {
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);   
        ArrayList<BankAccount>accounts = new ArrayList<BankAccount>(); 
        Manipulate_Account M = new Manipulate_Account();   
        int choice =0;
        do{
            System.out.println("1. Add an account ");
            System.out.println("2. Deposit ");
            System.out.println("3. Withdrawal ");
            System.out.println("4. Display balance of all accounts ");
            System.out.println("5. Count accounts that exceed a value ");
            System.out.println("6. Find a particular account ");
            System.out.println("7. Get account with largest amount ");
            System.out.println("8. List all Accounts ");
            System.out.println("9. Quit\n");
            choice= sc.nextInt();

            switch(choice){
                case 1:M.addAccount(accounts);
                break;
                case 2:M.make_deposit(accounts);
                break;
                case 3:M.make_withdrawal(accounts);
                break;
                case 4:double temp=M.getTotalBalance(accounts);
                System.out.println("The total is  "+temp);
                break;
                case 5:System.out.println("Input an amount");
                double amount= sc.nextDouble();
                int count = M.count(accounts,amount);
                System.out.println("The count is " +count);
                break;
                case 6:System.out.println("Enter bank account number");
                int NUM = sc.nextInt();
                BankAccount b  =M.find(accounts,NUM); 
                System.out.println(b);
                break;
                case 7:System.out.println("The bank account with the hgihest number is");
                BankAccount c  =M.getMaximum(accounts); 
                System.out.println(c);
                break;
                case 8:M.list_all(accounts);
                break;
                case 9:System.out.println("Goodbye");
                break;

                default:System.out.println("Invalid");
            }
        } while(choice!=9);
    }
}