//Matthias Bartolo BC1B GroupA
import java.util.Scanner;
public class Question1
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in); 
        int input =100;
        int array[]= new int[10];
        int count=1;
        //Input
        for(int i = 0; count<=10;i++){
            System.out.println("Input num "+ count);
            do{
                try{
                    input= sc.nextInt();
                }
                catch(Exception e){
                    System.out.println(e); 
                    i--;
                }
                sc.nextLine();
                array[i]=input;
                if(input==0)
                    i--;
                count++;   
            } while((input<=0)&&(input>=30));
        }
        for(int i = 0; i<10;i++){
            System.out.print(array[i]+" ");
        }
    }   
}