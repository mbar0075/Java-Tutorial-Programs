import java.util.*;
public class Exercise3
{
    static Scanner sc = new Scanner(System.in);
    private static int Time[] =new int[6];
    private static double Price[] =new double[6];
    private static String Service[] =new String[6];
    private static int length = Time.length;
    private static String name= null;
    private static double total = 0;
    private static int enter=0;
    private static int position;
    private static boolean found= false;
    private static double tempPrice=0;

    public static void main (String args[]){
        Input(Service,Time,Price);
        System.out.println();
        Display(Service,Time,Price);
        System.out.println();
        ServiceName(Service,Time,Price);
        System.out.println();
        Invoice(Service,Time,Price);
        System.out.println("Found in location "+position);
        System.out.println();
        ChangePrice(Service,Price,Time);
    }

    private static void Input(String[]service,int[]time,double[]price){
        for(int i= 0;i<length; i++){
            System.out.println("Input Service "+(i+1)); 
            service[i] = sc.next();
            System.out.println("Input price "+(i+1)); 
            price[i] = sc.nextDouble();
            System.out.println("Input time "+(i+1)); 
            time[i] = sc.nextInt();
        }  
    }

    private static void Display(String[]service,int[]time,double[]price){
        System.out.println("Service\tPrice\tTime");
        for(int i= 0;i<length; i++){
            System.out.print(service[i]+"\t\t"+price[i]+"\t\t"+time[i]+"\n");
        }  
    }

    private static void ServiceName(String[]service,int[]time,double[]price){
        System.out.println("Input Service name");
        name = sc. next();
        int posi =Search(service,name);
        System.out.print(service[posi]+"\t"+price[posi]+"\t"+time[posi]);
    }

    private static void Invoice(String[]service,int[]time,double[]price){
        System.out.println("Enter how many services you wish to add");
        enter = sc.nextInt();
        while(enter!=0){
            System.out.println("Input Service name");
            name = sc. next();
            int posi =Search(service,name);
            total+=price[posi];
            enter--;
        }
        System.out.println("Total Cost is "+total);
    }

    private static int Search(String[]service,String name){
        for(int i= 0;i<length; i++){
            if(name.equalsIgnoreCase(service[i])){
                found=true;
                position=i;
            }
        }  
        if(found==false)
            System.out.println("Not found");
        return position;
    }

    private static void ChangePrice(String[]service,double[]price,int[]time){
        System.out.println("Input Service name");
        name = sc. next();
        int posi =Search(service,name);
        System.out.println("Input new price");
        price[posi]=sc.nextDouble();
        System.out.println("These are the following prices:");
        Display(service,time,price);
    }
}
