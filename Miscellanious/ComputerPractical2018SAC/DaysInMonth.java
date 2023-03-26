import java.util.*;
public class DaysInMonth{
    public static void main (String args []){
     Scanner sc = new Scanner(System.in);
     System.out.println("input month number");
     int month = sc.nextInt();
     
     switch(month){
       case 1:
       case 3:
       case 5:
       case 7:
       case 8:
       case 10:
       case 12: System.out.println("The month has 31 days");
                break;
       case 4:
       case 6:
       case 9:
       case 11:System.out.println("The month has 30 days");
                break;
                
       case 2:System.out.println("The month has 28 and 1/4 days  ");
                break;
       default:System.out.println("Invalid");  
      }        
    }
}