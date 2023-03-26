import java.util.*;
public class LinearMethod
{

    public static void fillArray(int a[]){
        for( int i =0 ; i<a.length;i++){
            a[i]=(int)(Math.random()*100+1);
        }
    }

    public static void display(int a[]){
        for( int i =0 ; i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }

    public static void linearSearch(int a[],int n){
        boolean found = false;
        for ( int i =0; i<a.length;i++){
            if(n==a[i]){
                System.out.println("Found in location  "+i);
                found=true;
            }
        }

        if ( found==false)
            System.out.println("Not found");
    }
}
