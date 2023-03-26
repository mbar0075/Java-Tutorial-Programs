import java.util.*;
public class UsingAccount
{
    public static void main( String args[]){
        Account a1 = new Account("Bob");
        Account a2 = new Account("Fred");
        Scanner sc= new Scanner(System.in);
        System.out.println(a1);
        System.out.println(a2);
        a1.deposit(200);
        a2.deposit(100);
        System.out.println(a1);
        System.out.println(a2);
        a2.withdrawal(30);
        a1.withdrawal(155);
        System.out.println(a1);
        System.out.println(a2);
    }
}
