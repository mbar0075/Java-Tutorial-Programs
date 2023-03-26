import java.util.*;
public class Question3{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int choice =0;
        System.out.println("Input number 1");
        int num1 = sc.nextInt();
        System.out.println("Input number 2");
        int num2 = sc.nextInt();
        int sum=0;
        int sub = 0;
        int mul = 0;
        double avg = 0;
        do{
            System.out.println("\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Average\n5.Exit");
            choice = sc.nextInt();
            switch (choice){
                case 1:sum = num1+num2;   
                System.out.println("The sum of "+ num1 + " and " + num2 + " is " + sum);   
                break;
                case 2:if(num1>num2){
                    sub=num1-num2;
                    System.out.println("The subtraction of "+ num2 + " from " + num1 + " is " + sub);
                }
                else{
                    sub=num2-num1; 
                    System.out.println("The subtraction of "+ num1 + " from " + num2 + " is " + sub);
                }        
                break;  
                case 3:mul=num1*num2;
                System.out.println("The number "+ num1 + " multiplied with " + num2 + " is " + mul);   
                break; 
                case 4: avg = sum/2;
                System.out.println("The average of both numbers "+ num1 + " and " + num2 + " is " + avg);   
                break;
                case 5: System.out.println("Goodbye");
                break;
                default:System.out.println("Invalid");          
            }
        } while(choice!=5);
    }
}