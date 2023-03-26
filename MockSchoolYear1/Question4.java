//Matthias Bartolo BC1B GroupA
import java.util.Scanner;
public class Question4
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in); 
        int input=-1;
        //Checking the input
        do{
            System.out.println("Input num of rows ( from 0 -10)");
            try{
                input = sc.nextInt();         
            }
            catch(Exception e){
                System.out.println(e); 
            }
            sc.nextLine();
        }while((input<=0)||(input>=10));
        //Outputting the rows
        input++;
        for(int i=1; i<=input;i++){
            for(int j=1; j!=i;j++){
                System.out.print(j);
            }
            System.out.println("\n");
        }
    }
}
