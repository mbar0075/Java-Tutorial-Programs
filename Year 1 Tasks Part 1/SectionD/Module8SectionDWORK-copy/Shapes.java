/*Matthias Bartolo 
 *Class Bc1B  
 *Module8 Section D Q 15*/
// Java program to read data of various types using Scanner class.  
import java.util.*;
public class Shapes{
    public static void main (String args[]){
     Scanner sc = new Scanner(System.in);
     
        System.out.println("Choose from the following options:\n1.Rectangle\n 2.Square\n  3.Quit");
        int choice  = sc.nextInt(); 
        double area=0;
        double per= 0;
        double length=0;
        double height=0;
        do{
         switch (choice){
          case 1:System.out.println("Choose from the following options:\n1.Area \n2.Perimeter\n3.Quit");
                    choice  = sc.nextInt(); 
                if(choice!=3){ 
                    System.out.println("Input length");
                    length = sc.nextDouble();    
                 System.out.println("Input height");
                    height = sc.nextDouble();  
                }
                    switch (choice){
                     case 1:System.out.println("You chose Area");
                            area = length*height;
                            System.out.println("The area is "+ area);
                            break;
                     case 2:System.out.println("You chose Perimeter");
                            per = (2*length)+(2*height);
                            System.out.println("The perimeter is "+ per);
                            break; 
                     case 3: System.out.println("Back to main Menu");
                             break;      
                     default :System.out.println("Invalid"); 
                }
                    break;
          case 2:System.out.println("Choose from the following options:\n1.Area \n2.Perimeter\n3.Quit");
                    choice  = sc.nextInt(); 
                    if(choice!=3){
                    System.out.println("Input length");
                    length = sc.nextDouble(); 
                }
                    switch (choice){
                      case 1:System.out.println("You chose Area");
                            area = length*length;
                            System.out.println("The area is "+ area);
                             break;
                      case 2:System.out.println("You chose Perimeter");
                            per = 4*length;
                            System.out.println("The perimeter is "+ per);
                            break; 
                      case 3: System.out.println("Back to main Menu");
                                break;         
                      default :System.out.println("Invalid"); 
                }
                    break;
          case 3: System.out.println("Goodbye");
                    break;          
          default :System.out.println("Invalid"); 
        } 
       }while(choice!=3);     
    }
}