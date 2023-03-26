import java.util.*;
public class Volume{
    public static void main (String args []){
     Scanner sc = new Scanner(System.in);
     System.out.println("Input length in cm");
     double l = sc.nextDouble();
     
     double vol = l*l*l;
     
     System.out.println("The volume is " + vol + " cm cubed"); 
      }        
    }
