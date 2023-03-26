import java.util.*;
// you are to use a data structure to store 11 elements 
//, you will output the elements of 
//this data structure 1,3,2,4,5,7,6,8,9,11,10
public class ArrayOutput2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input any number");
        int num1 = sc.nextInt();
        num1++;
        int num[]=new int[(num1-1)];
        int c = 3;
        int l =0;
        for( int i = 0;i<num.length;i++){
          num[i]=i+1;  
        }
        System.out.println(" ");
        for( int i = 0;i<num.length;i++){
            if(c==4){
                l=num[i+1];
                num[i+1]=num[i];
                num[i]=l;
                c=0;
            }
            c++;
        }
        for( int i = 0;i<num.length;i++){
            System.out.println(num[i]);
        }
    }
}