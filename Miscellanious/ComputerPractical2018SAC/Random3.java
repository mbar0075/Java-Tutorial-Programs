import java.util.*;
public class Random3{
    public static void main (String args []){
     Scanner sc = new Scanner(System.in);
     int n1= (int)(Math.random()*100+1);
     int n2= (int)(Math.random()*100+1);
     int n3= (int)(Math.random()*100+1);
     double total= n1+n2+n3; 
     double avg = total/3;
     
     System.out.println("The average of "+ n1+" ,"+n2+" ,"+ n3+" ,random number is  " + avg); 
      }        
   }
