import java.util.*;
public class Q4
{
    static Scanner sc = new Scanner(System.in);
    private static int input;
    private static int num[]= new int[5];
    private static int find;
    private static boolean found;
    private static int temp;
    public static void main (String args[]){
        do{
            System.out.println("Choose from the following Options:\n1.Accept elements of an array\n2.Display elements of an array\n3.Search the element within the array by the given user\n4.Sort the array using bubble sort method\n5.Exit");
            input = sc.nextInt();
            switch(input){
                case 1:Q4.Populate();
                break;
                case 2:Q4.Display();
                break;
                case 3:Q4.LinearSearch();
                break;
                case 4:Q4.BubbleSort();
                break;
                case 5:System.out.println("\fThank you for using the program");
                break;
                default:System.out.println("Invalid Option");
            }
        }while(input!=5);
    }

    public static void Populate(){
        for(int i = 0; i<num.length;i++){
            System.out.println("Input num "+(i+1));
            num[i]=sc.nextInt();
        }
    }

    public static void Display(){
        for(int i = 0; i<num.length;i++){
            System.out.println(num[i]);
        }
    }

    public static void LinearSearch(){
        found=false;
        System.out.println("Enter number you wish to find");
        find = sc.nextInt();
        for(int i = 0; i<num.length;i++){
            if(num[i]==find){
                found=true;
                System.out.println("Found in location "+(i+1));
            }
        }
        if(found==false)
            System.out.println("Element not found");
    }

    public static void BubbleSort(){
        int n= num.length-1;
        for(int i = 0; i<(n-1);i++){
            for(int j = 0; j<i;j++){
                if(num[j]>num[j+1]){
                    //only this is correct approach temp is always num[j] and not num[j+1]
                    temp=num[j];
                    num[j]=num[j+1];
                    num[j+1]=temp;
                }
            }
        }
        for(int i = 0; i<num.length;i++){
            System.out.print(num[i]+ " ");
        }
    }
}
