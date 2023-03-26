import java.util.Scanner;
public class Program9
{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        Class1 c1 = new Class1();
        Class2 c2 = new Class2();
        Class3 c3 = new Class3();
        int rows =8;
        int columns=5;
        int array[][]= new int [rows][columns];
        int count = 1;
        int input=0;
        int input1= -1;
        
        System.out.println("2D ARRAY MANIPULATION ");
        for(int i = 0; i<rows;i++){
            for(int j = 0; j<columns;j++){
                System.out.print("Input element "+count+": ");
                count++;
                try {
                    array[i][j]= sc.nextInt();
                }
                catch(Exception e){
                    System.out.println(e);
                    j--;
                    count--;
                }
                sc.nextLine();
            }
        }
        c1.getSort(array);

        System.out.println("Input number to search for");
        try {
            input1= sc.nextInt();
        }
        catch(Exception e){
            System.out.println(e);
        }
        c2.getSearch(array,input1);

        while((input<=0)||(input>columns)){
            System.out.println("Input Column");
            try {
                input= sc.nextInt();
            }
            catch(Exception e){
                System.out.println(e);
            }
            if((input<=0)||(input>=6))
                System.out.println("Invalid");
        }
        input--;
        c3.DisplayColumn(input,array);

    }
}
