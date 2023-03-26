import java.util.*;
public class Ages
{
    public static void main( String args[]){
        Scanner sc = new Scanner(System.in);
        String names[]= new String[20];
        int ages[]= new int[20];
        int sum=0;

        for ( int i =0; i<20;i++){
            System.out.println("Input name "+(i+1));
            names[i]= sc.next();
            System.out.println("Input age "+(i+1));
            ages[i]= sc.nextInt();
            sum+=ages[i];
        }
        double average =(double)(sum/20);
        System.out.println("The average age is "+average);

        for ( int i =0; i<20;i++){
            if(ages[i]>average)
                System.out.println(names[i]+ "   "+ages[i]+" was above average");
            else
                System.out.println(names[i]+ "   "+ages[i]+" was below average");
        }
    }
}
