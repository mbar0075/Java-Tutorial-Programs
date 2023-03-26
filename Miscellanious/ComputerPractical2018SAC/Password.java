import java.util.*;
public class Password{
    public static void main (String args []){
     Scanner sc = new Scanner(System.in);
     String pass = "HOKAGE DATTEBAYO";
     String user = "NARUTO";
     String user1,pass1=null;
     for (int i= 0;i<4;i++){
        System.out.println("Input user"); 
        user1 = sc.nextLine(); 
        System.out.println("Input password"); 
        pass1 = sc.nextLine(); 
        
        if((user1.equals(user)&&(pass1.equals(pass)))){
          System.out.println("\n That's my Nindo , my ninja way...NARUTO");  
          break;
        }
        else
            System.out.println("Try again you fool(baka)! \n You have "+(3-i)+" chances left\n");
        }
      }        
   }
