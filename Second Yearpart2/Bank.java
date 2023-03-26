import java.util.*;
public class Bank {
    public static void main (String args[]) {
        Account a1 = new Account(100);
        savingsaccount s1 = new savingsaccount(101, 4.4);
        currentaccount c1 = new currentaccount(102);
        a1.deposit(500);
        a1.withdrawal(50);
        System.out.println(a1);
        s1.deposit(500);
        s1.withdrawal(50);
        s1.calculateinterest();
        System.out.println(s1);
        c1.Limit();
        c1.deposit(500);
        c1.Limit();
        c1.withdrawal(50);
        
        System.out.println(s1);
    }
}