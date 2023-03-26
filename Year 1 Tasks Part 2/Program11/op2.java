import java.util.*;
public class op2
{
    op1 o1;
    public op2(op1 o){
        o1 = o;
    }

    public void Output(){
        System.out.println("name:"+o1.name);
        System.out.println("surname:"+o1.surname);
        System.out.println("ClientID:"+o1.ClientID);
        System.out.println("Date of Birth:"+o1.Date);
        System.out.println("Credit Card Number:"+o1.CreditCard);
    }
}
