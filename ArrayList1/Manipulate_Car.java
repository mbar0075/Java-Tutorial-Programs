
import java.util.ArrayList;
import java.util.Scanner;

public class Manipulate_Car
{
    // method for adding a new car to the list
    public  void addCar(ArrayList<Car> carListIn)
    {
        String tempReg;
        String tempMake;
        double tempPrice;
        Scanner keyboard = new Scanner(System.in);
        keyboard.useDelimiter("\n");
        System.out.print("Please enter the registration number: ");
        tempReg = keyboard.next();
        System.out.print("Please enter the make: ");
        tempMake = keyboard.next();
        System.out.print("Please enter the price: ");
        tempPrice = keyboard.nextDouble();
 
        carListIn.add(new Car(tempReg, tempMake, tempPrice));
    }
    
   // method for listing details of all cars2 in the list
    public  void listAll(ArrayList<Car> carListIn)
    {
        for(Car item : carListIn)
        {   
            System.out.println(item);
        }
    }
    
    public  void editCar(ArrayList<Car> carListIn)
    {
        int pos, counter= 0 ;
        String findreg;
         String tempReg;
        String tempMake;
        double tempPrice;
        
     Scanner keyboard = new Scanner(System.in);
     keyboard.useDelimiter("\n");
     
     boolean found = true;
     do {
       System.out.println("Enter car registration to edit its price ");
        findreg = keyboard.next();
        
      // Look for Car registration no "findreg" in CarList. The indexOf() 
      //method uses the equals(Object) method of each object in the list.
    
    int spot = carListIn.indexOf( new Car( findreg, null, 0 ) ) ;

     if (spot >=0 )
     {    
         System.out.println( "indexOf returns: " + spot ) ;
         ask_new_details (carListIn, findreg,  spot);  
         found = true;
        }
     else 
     {
         System.out.println("registration no "+findreg + " not found");
         found = false;
        }
        
    } while (found == false);    
    }
    
    
      // this method asks for make and price which need to be edited 
    
    public  void ask_new_details (ArrayList<Car> carListIn, String findreg, int pos)
    {
          Scanner keyboard = new Scanner(System.in);
          keyboard.useDelimiter("\n");
          Car tCar ;
          boolean stop, result;
          char choice;
          tCar = carListIn.get(pos);
          String tempMake = tCar.getMake();  // read make from Car object
          double tempPrice = tCar.getPrice();
         do {          
             stop = false;
          
         do{    
          System.out.println("A..to edit Make ");
          System.out.println("B..to edit Price ");
          System.out.println("C..to Exit ");
          
          choice = keyboard.next().charAt(0);
          Validation v = new Validation();
          result = v.checkLetter(choice,'A','C');
          
        } while ( result == false); 
          
          if (choice =='A')
           {   System.out.println("New make ");
               tempMake = keyboard.next();
            }
          else if (choice == 'B')
          {
                   System.out.println("New price ");
                   tempPrice = keyboard.nextDouble();
                }
                   
          else stop = true;
                   
        } while(stop == false);
        String tempReg = findreg;
          carListIn.set(pos,new Car(tempReg, tempMake, tempPrice));  
     }
          
          
   public  void removeCar ( ArrayList<Car> carListIn)
   {
       
           Scanner keyboard = new Scanner(System.in);
          keyboard.useDelimiter("\n");
     
         System.out.println("Enter car registration to delete the Car ");
         String findreg = keyboard.next();
         int spot = carListIn.indexOf( new Car( findreg, null, 0 ) ) ;
         if (spot == -1) System.out.println("Reg number not found ");
         else 
         { System.out.println("Found in position "+spot);
              carListIn.remove(spot);
            }
    
        }
        
        /**
         * Lists all the cars with a particular make
         */
   public void findMake(ArrayList<Car> carListIn)
   {
         Scanner keyboard = new Scanner(System.in);
          keyboard.useDelimiter("\n");
          System.out.println("Enter make to find all cars ");
          String temp = keyboard.next();
          Car carObject;
          String tmake;
          
          for(int k= 0; k<carListIn.size(); k++)
            {
                 carObject = carListIn.get(k);
                 
                 tmake = carObject.getMake();
                 if (tmake.equals(temp)) System.out.println(carObject);
                }
            }
    }