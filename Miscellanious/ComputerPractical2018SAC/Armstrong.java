import java.util.*;
public class Armstrong{
    public static void main (String args[]){
     Scanner sc = new Scanner(System.in);
     int d1,d2,d3,sum;
     for(int i = 1;i<=500;i++){
         d1=0;
         d2=0;
         d3=0;
         sum=0;
         if(i>=1&&i<=9){
            d1=1;
            d2=0;
            d3=0;
        }
        else if (i>=10&&i<=99){
            d1=i/10;
            d2=i%10;
            d3=0;
        }
        else{
            d1=i/100;
            d2=(i/10)%10;
            d3 =(i%100)%10;
        }
        sum = (d1*d1*d1)+(d2*d2*d2)+(d3*d3*d3);
        if (sum==i)
        System.out.println(i);
    }
}
}