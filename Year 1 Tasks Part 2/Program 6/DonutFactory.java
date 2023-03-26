/*Program 6 - Donut factory
 * 5 classes
 * menu other 4 are option 1 ,2 ,3, 4
 * array list (flexible array) tikber u tickien sakemm tkun trid
 * option1 :Paint donut(draw the donut); taghzel jekk hux small medium jew large jpingilek id donut
 * option2 :Order donuts : input quantity and size
 * sub menu(small (1 euros) , medium (2euros) ,large(3 euros))
 * option3 :Edit order: edit 3 data structures(small,medium ,large)
 * option4 :Create text files(taqbad l order u tis savejah f textfile)
 * option5 :Exit 
 */
import java.util.*;
public class DonutFactory
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);   
        int choice = 0;
        Option1 op1 = new Option1();
        Option2 op2 = new Option2();
        Option3 op3= new Option3(op2);
        Option4 op4 = new Option4(op2);
        Option5 op5 = new Option5();
        do{
            System.out.println("Choose from the following Options:\n1.Paint Donut\n2.Order Donuts\n3.Edit Order\n4.Create text files\n5.Exit");
            try{
                choice=sc.nextInt() ;
            }
            catch(InputMismatchException e){        
                System.out.println(e); 
            }
            sc.nextLine();
            switch (choice){
                case 1:op1.PaintDonut();
                break; 
                case 2:op2.OrderDonuts();
                break;
                case 3:op3.EditOrder();
                break;
                case 4:op4.usingFileWriter();
                break;
                case 5:op5.Exit();
                break;
                default: System.out.println("Invalid entry , Try again"); 
            }
        }while(choice!=5);
    }
}
