/*Matthias Bartolo 
 *Class Bc1B  
 *Module8 Section D Q 4*/
// Java program to read data of various types using Scanner class.  
 import java.util.*;
public class Numbers {
    public static void main (String args[]){
     Scanner sc = new Scanner(System.in);
      int random=0;  
      int  c1=0,c2=0,c3=0,c4=0,c5=0;
     for(int i = 1; i<=30;i++){
        random=(int) (Math.random()*5+1);
        if(i%10==0)
          System.out.print(random+" \n"); 
        else
          System.out.print(random+" ");  
        if(random==1)    
           c1++; 
        else  if(random==2)    
           c2++; 
        else  if(random==3)    
           c3++;  
        else  if(random==4)    
           c4++;  
        else  if(random==5)    
           c5++;              
        } 
       
      System.out.println("\nThe number 1 appeared " + c1 + " times");
      System.out.println("The number 2 appeared " + c2 + " times");  
      System.out.println("The number 3 appeared " + c3 + " times");  
      System.out.println("The number 4 appeared " + c4 + " times");  
      System.out.println("The number 5 appeared " + c5 + " times");          
    }
}