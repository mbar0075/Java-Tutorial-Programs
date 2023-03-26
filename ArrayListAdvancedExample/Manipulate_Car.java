import java.util.ArrayList;
import java.util.Scanner;
import java.io.*; 
public class Manipulate_Car
{
    // method for adding a new car to the list
    public  void addCar(ArrayList<Car> carListIn)
    {
        String tempReg;
        String tempMake;
        double tempPrice;
        char sold;
        Scanner keyboard = new Scanner(System.in);
        keyboard.useDelimiter("\n");
        System.out.print("Please enter the registration number: ");
        tempReg = keyboard.next();
        System.out.print("Please enter the make: ");
        tempMake = keyboard.next();
        System.out.print("Please enter the price: ");
        tempPrice = keyboard.nextDouble();
        sold = 'N';
 
        carListIn.add(new Car(tempReg, tempMake, tempPrice,sold));
    }
    
   // method for listing details of all cars2 in the list
    public  void listAll(ArrayList<Car> carListIn)
    {
        for(Car item : carListIn)
        {   
            System.out.println(item);
        }
    }
    
     /* method TO edit a car from the list - in a real
       application this would need to include some validation */
    public  void editCar(ArrayList<Car> carListIn)
    {
        int pos, counter= 0 ;
        String findreg;
         String tempReg;
        String tempMake;
        double tempPrice;
        
     Scanner keyboard = new Scanner(System.in);
     keyboard.useDelimiter("\n");
     
       System.out.println("Enter car registration to edit its price ");
        findreg = keyboard.next();
        
      // Look for Car registration no "findreg" in CarList. The indexOf() 
      //method uses the equals(Object) method of each object in the list.
    
    int spot = carListIn.indexOf( new Car( findreg, null, 0,'N' ) ) ;

     if (spot >=0 )
     {    
         System.out.println( "indexOf returns: " + spot ) ;
         ask_new_details (carListIn, findreg,  spot);  
        }
     else System.out.println("registration no "+findreg + " not found");
    }
    
    public boolean check_input (char first, char last, char input)
    {
        if (input >= first && input <= last) return true;
        else return false;
    }
    
      // this method asks for make and price which need to be edited 
    
    public  void ask_new_details (ArrayList<Car> carListIn, String findreg, int pos)
    {
          Scanner keyboard = new Scanner(System.in);
          keyboard.useDelimiter("\n");
          Car tCar ;
          
          tCar = carListIn.get(pos);
          String tempMake = tCar.getMake();  // read make from Car object
          double tempPrice = tCar.getPrice();
          char tempSold = tCar.getSold();
          boolean stop , ok;
          char choice;
          
        do {           
            stop = false;
         do {   
             ok = true;
          System.out.println("A..to edit Make ");
          System.out.println("B..to edit Price ");
          System.out.println("C..to Exit");
           choice = keyboard.next().charAt(0);
           choice = Character.toUpperCase(choice);
           ok = check_input('A','C',choice);
        } while (ok == false);
        
          if (choice =='A')
           {   System.out.println("New make ");
               tempMake = keyboard.next();
            }
          else if (choice == 'B'){
                   System.out.println("New price ");
                   tempPrice = keyboard.nextDouble();
                }
          else 
                stop = true;
            } while (stop == false);
                
                   String tempReg = findreg;
          
          carListIn.set(pos,new Car(tempReg, tempMake, tempPrice,tempSold));  
     }
          
          
   public  void removeCar ( ArrayList<Car> carListIn)
   {
       
           Scanner keyboard = new Scanner(System.in);
          keyboard.useDelimiter("\n");
          char choice;
     
         System.out.println("Enter car registration to delete the Car ");
         String findreg = keyboard.next();
         int spot = carListIn.indexOf( new Car( findreg, null, 0,'Y' ) ) ;
         if (spot == -1) System.out.println("Reg number not found ");
         else 
         { System.out.println("Found in position "+spot);
             System.out.println(" Proceed with deletion Y/N ? ");
             choice =keyboard.next().charAt(0);
             if (choice == 'Y') carListIn.remove(spot);
             else System.out.println("You have selected not to delete");
            }
    
        }
        
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
                 if (tmake.equalsIgnoreCase(temp)) System.out.println(carObject);
                }
            }
            
            
   public  void writeList(ArrayList<Car> carListIn)
    {
         try
           {
               FileOutputStream carFile = new FileOutputStream("cars3.obf");
               ObjectOutputStream carStream = new ObjectOutputStream(carFile);
               
               for ( Car item : carListIn)
               {
                   carStream.writeObject(item);
              }
              carStream.close();
            }
         // handle the exception thrown by the FileWriter methods
         catch(IOException e)
         {
            System.out.println("There was a problem writing the file");
         }
    }

    
    // method for reading the file
    public  void readList(ArrayList<Car> carListIn)
    {
         Car tempCar;
         boolean endOfFile = false;
         try
         {
             // create a FileInputStream object, car2File
             FileInputStream carFile = new FileInputStream("cars3.obf");
             // create an ObjectInputStream object to wrap around car2File
             ObjectInputStream carStream = new ObjectInputStream(carFile);
             // read the first (whole) object with the readObject method
             tempCar = (Car) carStream.readObject();
             while (endOfFile != true)
             {
                 try
                 {
                       carListIn.add(tempCar);
                     // read the next (whole) object
                     tempCar = (Car) carStream.readObject();
                    }
                 catch (EOFException e)
                 {
                     endOfFile = true;
                    }
                    
             }
                  
           
            carStream.close();
         }

         /* handle the exception that is thrown by the FileReader 
            constructor if the file is not found */
         catch(FileNotFoundException e)
         {
            System.out.println("\nNo file was read");
         }
         
         catch (ClassNotFoundException e) // thrown by readObject
         {
             System.out.println("\nTrying to read an object of an unknown class");
            }

         catch (StreamCorruptedException e) // thrown by the constructor
         {
             System.out.println("\nUnreadable file format");
            }
            
            
         // handle the exception thrown by the FileReader methods
         catch(IOException e)
         {
            System.out.println("\nThere was a problem reading the file");
         }
    }

    }