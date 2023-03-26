import java.util.*;
public class Supermarket
{
    public static void main( String args[]){
        Scanner sc = new Scanner(System.in);
        String names[]= new String[5];
        int barcode[]= new int[5];
        double gross[]= new double[5];
        double net[]= new double[5];

        for ( int i =0; i<5;i++){
            System.out.println("Input barcode "+(i+1));
            barcode[i]= sc.nextInt();
            System.out.println("Input name "+(i+1));
            names[i]= sc.next();
            System.out.println("Input gross price "+(i+1));
            gross[i]= sc.nextDouble();

            net[i]=gross[i]*1.18;
        }

        for ( int i =0; i<5;i++){
            System.out.println(barcode[i]+"\n"+ names[i]+"\n"+gross[i]+"\n"+net[i]);
            System.out.println();
        }
        
        System.out.println("Input barcode to search ");
         int input = sc.nextInt();
         boolean found = false;
         for ( int i =0; i<5;i++){
            if(input==barcode[i]){
               System.out.println(barcode[i]+"\n"+ names[i]+"\n"+gross[i]+"\n"+net[i]);
               found=true;
            }
        }
        
        if ( found==false)
            System.out.println("Not found");
    }
    
}
