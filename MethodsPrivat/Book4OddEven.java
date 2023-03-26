import java.util.*;
public class Book4OddEven
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);  
        int num[]= new int[10];
        int countOdd=0;
        int countEven=0;
        int sumEven=0;
        int sumOdd=0;
        for(int i= 0;i<num.length;i++){
            System.out.println("Input num "+(i+1));
            num[i]=sc.nextInt();         
        }

        for(int i= 0;i<num.length;i++){
            if((num[i]%2)==0){
                System.out.println("The number "+ num[i]+ " is Even");
                countEven++;
                sumEven+= num[i];
            }
            else{
                System.out.println("The number "+ num[i]+ " is Odd");
                countOdd++;
                sumOdd+= num[i];
            }
            //Ghandek method ghal input , method biex jsiblek is sum tal even  method ghalija, ghamilha setter
            System.out.println("There were"+countEven+" Even numbers");
            System.out.println("There were"+countOdd+" Odd numbers");
            System.out.println("There sum of even numbers is "+sumEven);
            System.out.println("There sum of odd numbers is "+sumOdd);
        }
    }
}
