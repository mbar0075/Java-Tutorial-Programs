import java.util.*;
public class Book6
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);  
        double num[]= new double[20];
        for(int i= 0;i<num.length;i++){
            num[i]=(Math.random()*100);
        }
        for(int i= 0;i<num.length;i++){
            System.out.println(num[i]+ " ");  
        }
    }
}
