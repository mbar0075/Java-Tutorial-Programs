/*it will prompt the user to choose from 1.average hom many numbers f idejn il user
2.pythagoras to get the hyphotenuse3.volume of a sphere use the math class4.minimum and maximum5.Exit*/
import java.util.*;
public class Calculator{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int choice=0;
        Calc c = new Calc();
        do{
            System.out.println("Calculator\nChoose between the following Options");
            System.out.println("1.Average\n2.Pythagoras\n3.Volume of Sphere\n4.Minimum and Maximum\n5.Exit");   
            choice =sc.nextInt();
            
            switch(choice){
                case 1:c.Average();
                break; 
                case 2:c.Pythagoras();
                break; 
                case 3:c.VolumeSphere();
                break; 
                case 4:c.MaxMin();
                break; 
                case 5:System.out.print( "\f\n\n\n\n\n\n\n\n\n\n\n\t\t\t\t\t\t\t\tCASIO\n\t\t\t\t\t\t\t\tGoodbye");  
                break; 
                default:System.out.println( "Invalid"); 
            }
        }while(choice!=5);   
    }
}