import java.util.*;
public class Areas
{
    private static Scanner sc = new Scanner(System.in);
    private static double input1,input2,area,r;
    private static int input;

    public static void main( String args[]){
        showMenu();
    }

    private static double calcRec(){
        System.out.println("Input side 1");
        input1 = sc.nextInt();
        System.out.println("Input side 2");
        input2 = sc.nextInt();
        area=input1*input2;
        return area;
    }

    private static double calcCirc(){
        r=-1;
        while(r<0){
            System.out.println("Input radius");
            r = sc.nextInt();
        }
        area=Math.PI*Math.pow(r,2);
        return area;
    }

    private static void showMenu(){
        input =0;
        do{
            System.out.println("Choose from the folowing Menu:\n1.Area of Rectangle\n2.Area of Circle\n3.Quit"); 
            input = sc.nextInt();
            switch(input){
                case 1:area=calcRec();
                System.out.println("The area is "+area);
                break;
                case 2:area=calcCirc();
                System.out.println("The area is "+area);
                break;
                case 3:System.out.println("Goodbye");
                break;
                default:System.out.println("Invalid Entry");   
            }
        }while (input!=3);
    }
}
