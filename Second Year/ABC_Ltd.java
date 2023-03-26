import java.util.*;
public class ABC_Ltd
{
    private static Scanner sc = new Scanner(System.in);

    public static void main( String args[]){
        Employee1 e[]= new Employee1[10];

        Input(e);
        sort(e);

        int input =0;

        do  {
            System.out.println("1. Input payroll details for this month \n2. See financial details of employees \n3. Print payslips\n4 .Quit");
            input = sc.nextInt();
            switch (input) {
                case 1: 
                for ( int i =0; i<e.length;i++){
                    System.out.println(e[i].getDetails());
                    System.out.println("Input number of hours worked for the month ");
                    int hrs = sc.nextInt();
                    e[i].inputDetails(hrs);
                }
                break;
                case 2:
                System.out.println("1.Print financial details of all emplyees\n2. Print financial details of specific employee ");
                int h = sc.nextInt();
                if(h==1){
                    for ( int i =0; i<e.length;i++){
                        e[i].getFinancialDetails();
                    }
                }
                else if(h==2){
                    System.out.println("Input employee id to search for ");
                    int id = sc.nextInt();
                    search(e,id);                       
                }
                else
                    System.out.println("Invalid choice");
                break;
                case 3:
                for ( int i =0; i<e.length;i++){
                    e[i].printPayslip();
                }
                break;
                case 4:System.out.println("Goodbye");
                break;
                default:
                System.out.println("Invalid input");
            }
        }while (input != 4);
    }

    public static void Input(Employee1 c[]){
        for( int i =0 ;i<c.length;i++){
            System.out.println("Input id "+(i+1));  
            int id = sc.nextInt();
            System.out.println("Input name "+(i+1));  
            String name = sc.next();
            System.out.println("Input surname "+(i+1));  
            String surname = sc.next();
            int type=-1;
            do{
                System.out.println("Input employment type 1.FT 2.PT ");  
                type = sc.nextInt();
            } while((type<1)||(type>2));
            c[i]= new Employee1(id,name,surname,type);
        }
    }

    public static void sort(Employee1 e[]){
        int n = e.length;
        for(int i=0;i<(n-1);i++){
            for(int j=0;j<(n-i);j++){
                if(j!=(n-1)){
                    if(e[j].getID()>e[j+1].getID()){
                        Employee1 temp = e[j];
                        e[j]=e[j+1];
                        e[j+1]=temp;
                    }
                }
            }           
        }
    }

    public static void search(Employee1 a[],int n){
        int check = Search(a,0,9,n);
        if(check==-1)
            System.out.println("Not found ");
        else
            a[check].getFinancialDetails();
    }

    public static int Search(Employee1[] a, int first, int last, int key)
    {
        int result = 0;

        if (first > last)
            result = -1;
        else
        {
            int mid = (first + last)/2;

            if (key == a[mid].getID())
                result = mid;
            else if (key < a[mid].getID())
                result = Search(a, first, mid - 1, key);
            else if (key > a[mid].getID())
                result = Search(a, mid + 1, last, key);
        }
        return result;
    }
}