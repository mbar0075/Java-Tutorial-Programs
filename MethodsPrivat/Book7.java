import java.util.*;
public class Book7
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);  
        double num[]= new double[20];
        double sum =0 ;
        double average =0;
        for(int i= 0;i<num.length;i++){
            num[i]=(Math.random()*100);
            sum+=num[i];
        }
        for(int i= 0;i<num.length;i++){
            System.out.println(num[i]+ " ");  
        }
        average= (double)(sum/20.0);
        System.out.println("\n\nThe average is " + average);
    }
}
