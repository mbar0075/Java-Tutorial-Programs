import java.util.*;
public class Heights
{

    public static void input(int height[],String names[]){
        Scanner sc = new Scanner (System.in);
        for( int i =0 ; i<names.length;i++){
            System.out.println("Input name "+(i+1));
            names[i]=sc.next();
            System.out.println("Input height "+(i+1));
            height[i]=sc.nextInt();
        }
    }

    public static void display(int height[],String names[]){
        for( int i =0 ; i<height.length;i++){
            System.out.println(names[i]+"\t"+height[i]);
        }
        System.out.println();
    }

    public static void sort(int height[],String names[]){
        int n = height.length;
        for(int i=0;i<(n-1);i++){
            for(int j=0;j<(n-i);j++){
                if(j!=(n-1)){
                    if(height[j]>height[j+1]){
                        int temp = height[j];
                        height[j]=height[j+1];
                        height[j+1]=temp;
                        
                        String temp2 = names[j];
                        names[j]=names[j+1];
                        names[j+1]=temp2;
                    }
                }
            }           
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int [] height = new int[10];
        String [] names = new String [10];

        input(height,names);
        int input,num;
        do{
            System.out.println("Choose from the folowing Menu:\n1.Sort by height\n2.Display \n3.Quit");

            input = sc.nextInt();
            switch(input){
                case 1: sort(height,names);
                break;
                case 2:display(height,names); 
                break;
                case 3:System.out.println("Goodbye");
                break;
                default:System.out.println("Invalid Entry");   
            }
        }while (input!=3);
    }
}
