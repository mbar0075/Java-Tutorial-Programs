import java.util.*;
public class Book5Reverse
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);  
        int num1[]= new int[10];
        int num2[]= new int[10];
        int count=9;
        for(int i= 0;i<num1.length;i++){
            System.out.println("Input num "+(i+1));
            num1[i]=sc.nextInt();         
        }

        for(int i= 0;i<num1.length;i++){
            num2[i]=num1[count];
            count--;
        }
        System.out.println("First array");
        for(int i= 0;i<num1.length;i++){
            System.out.print(num1[i]+" ");
        }
        System.out.println("\nSecond array");
        for(int i= 0;i<num2.length;i++){
            System.out.print(num2[i]+" ");
        }
    }
}
