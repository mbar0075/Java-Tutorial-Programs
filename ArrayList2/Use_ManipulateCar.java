import java.util.ArrayList;
import java.util.Scanner;

public class Use_ManipulateCar

{
    public static void main (String args[])
    {
    char choice;
        ArrayList<Car> carList = new ArrayList<Car>();
        Scanner keyboard = new Scanner(System.in);
        keyboard.useDelimiter("\n");
         Manipulate_Car  mc = new  Manipulate_Car();
    
        // menu options
        do
        {
           
            System.out.println("1. Add a car");
            System.out.println("2. Remove a car");
           System.out.println("3. List all cars");
            System.out.println("4. Edit a Car");
            System.out.println("5. List by Make ");
            System.out.println("6. Quit\n");
            choice = keyboard.next().charAt(0);
         
            switch(choice)
            {
                case '1' : mc.addCar(carList);
                           break;
                  case '2' : mc.removeCar(carList);
                             break;
                case '3' : mc.listAll(carList);
                            break;
                case '4' : mc.editCar(carList);           
                             break;
                case '5' : mc.findMake(carList);
                            break;
                    case '6' : break;

                default  : System.out.print
                            ("\nPlease choose a number from 1 - 6 only\n ");
            }
        }while(choice != '6');
    }
}