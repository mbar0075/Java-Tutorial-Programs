//Matthias Bartolo BC1B GroupA
import java.util.Scanner;
public class Question3
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in); 
        int array[]= new int[20];
        boolean found ;
        int input=0;
        System.out.println("Input 20 numbers");
        for(int i = 0; i<20;i++){
            System.out.println("Input num "+(i+1));
            try{
                array[i]= sc.nextInt();
            }
            catch(Exception e){
                System.out.println(e); 
                i--;
            }
            sc.nextLine();
        }
        do{
            System.out.println("choose from the following Options:\n1.Search\n2.Non Negative Numbers\n3.Quit");
            try{
                input = sc.nextInt();         
            }
            catch(Exception e){
                System.out.println(e); 
            }
            sc.nextLine();
            switch (input){
                case 1: found=false;
                System.out.println("Input num you want to find");
                input= sc.nextInt();
                for(int i = 0; i<20;i++){
                    if(input==array[i]){
                        System.out.println("Element was found at position "+i);
                        found=true;
                    }
                }
                if(found==false)
                    System.out.println("Element was not found ");
                break;
                case 2:
                for(int i = 0; i<20;i++){
                    if(array[i]>0){
                        System.out.print(array[i]+" ");
                    }
                }
                break;
                case 3:System.out.println("Goodbye");
                break;
                default: System.out.println("Invalid");
            }
        }while(input!=3);
    }
}