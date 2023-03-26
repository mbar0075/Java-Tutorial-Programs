import java.util.*;
public class BubbleSort
{

    public static void inputNums(int a[]){
        Scanner sc = new Scanner (System.in);
        for( int i =0 ; i<a.length;i++){
            System.out.println("Input num "+(i+1));
            a[i]=sc.nextInt();
        }
    }

    public static void display(int a[]){
        for( int i =0 ; i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }

    public static void sort(int a[]){
        int n = a.length;
        for(int i=0;i<(n-1);i++){
            for(int j=0;j<(n-i);j++){
                if(j!=(n-1)){
                    if(a[j]>a[j+1]){
                        int temp = a[j];
                        a[j]=a[j+1];
                        a[j+1]=temp;
                    }
                }
            }           
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input how many elements you want in the array");
        int size = sc.nextInt();

        int [] array = new int[size];

        inputNums(array);
        display(array);
        
        sort(array);
        display(array);

    }
}
