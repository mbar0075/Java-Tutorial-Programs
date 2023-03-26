import java.util.*;
public class Manipulate_Account
{
    private Scanner sc = new Scanner(System.in);

    public void addAccount(ArrayList<BankAccount> bankList)
    {
        boolean found=true;
        int num;
        do{
            found=false;
            System.out.println("Enter Bank account number");
            num = sc.nextInt();
            BankAccount temp = find(bankList,num);
            if(temp!=null)
                found=true;
        }while(found==true);    
        System.out.println("Enter amount to deposit");
        double deposit = sc.nextDouble();
        bankList.add(new BankAccount(num,deposit));
    }

    public double getTotalBalance(ArrayList<BankAccount> bankList)
    {
        double total=0;
        for(int i = 0; i<bankList.size();i++){
            BankAccount b =bankList.get(i);
            total +=b.getBalance();
        }
        return total;
    }

    public int count(ArrayList<BankAccount> bankList,double atLeast)
    {
        int count=0;
        for(int i = 0; i<bankList.size();i++){
            BankAccount b =bankList.get(i);
            if(b.getBalance()>=atLeast)
                count++;
        }
        return count;
    }

    public BankAccount find(ArrayList<BankAccount> bankList,int accountNumber)
    {
        BankAccount b;
        for(int i = 0; i<bankList.size();i++){
            b=bankList.get(i);
            if(b.getAccountNumber()==accountNumber)
                return b;
        }
        return null;
    }

    public BankAccount getMaximum(ArrayList<BankAccount> bankList)
    {
        BankAccount max = bankList.get(0);
        for(int i = 0; i<bankList.size();i++){
            BankAccount temp = bankList.get(i);
            if(max.getBalance()<=temp.getBalance())
                max=temp;
        }
        return max;
    }

    public void make_deposit(ArrayList<BankAccount> bankList)
    {
        System.out.println("Enter Bank account number");
        int num = sc.nextInt();
        BankAccount b = new BankAccount(num,0);
        int pos =bankList.indexOf(b);
        if(pos==-1){
            System.out.println("Not found");
        }
        else if(pos!=-1) { 
            System.out.println(bankList.get(pos));
            b=bankList.get(pos);
            System.out.println("Enter amount to deposit");
            double deposit = sc.nextDouble();
            deposit+=b.getBalance();
            BankAccount P = new BankAccount(num,deposit);
            bankList.set(pos,P);
        }
    }

    public void make_withdrawal(ArrayList<BankAccount> bankList)
    {
        System.out.println("Enter Bank account number");
        int num = sc.nextInt();
        BankAccount b = new BankAccount(num,0);
        int pos =bankList.indexOf(b);
        if(pos==-1){
            System.out.println("Not found");
        }
        else { 
            System.out.println(bankList.get(pos));
            b=bankList.get(pos);
            double amount=b.getBalance();
            System.out.println("Enter amount to withdrawal");
            double deposit = sc.nextDouble();
            amount-=deposit;
            BankAccount P = new BankAccount(num,amount);
            bankList.set(pos,P);
        }
    }

    public void list_all(ArrayList<BankAccount> bankList)
    {
        for( int i = 0;i<bankList.size();i++){
            System.out.println(bankList.get(i)); 
        }
    }
}
