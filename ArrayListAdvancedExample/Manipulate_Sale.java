import java.io.*; 
import java.util.*;
public class Manipulate_Sale
{
     public  void addSale(ArrayList<Car> carListIn, ArrayList<Client>clientList,
                            ArrayList<Client_Car> clientcarList)
     {
         Scanner keyboard = new Scanner(System.in);
        keyboard.useDelimiter("\n");
        Car tempCar= null;
        Client tempOwner = null;
        boolean found = false;
        String tempReg;
        int spot=-1;
        char tempSold2;
        
      do {
        System.out.print("Please enter the registration number OR XXX to stop: ");
         tempReg = keyboard.next();
         if (tempReg.equalsIgnoreCase("XXX")) break;
         spot = carListIn.indexOf( new Car( tempReg, null, 0,'Y' ) ) ;
        if (spot != -1) {
            tempCar= carListIn.get(spot);
            tempSold2 = tempCar.getSold();
            if (tempSold2=='Y') System.out.println("Car requested "+tempCar+ " already sold ");
            else  found = true;
        }
        else 
        {
            System.out.println(tempReg + " not found ");
            found = false;
        }
    } while(found ==false);
        
    if (!(tempReg.toUpperCase().equalsIgnoreCase("XXX")))
    {
        System.out.print("Please enter the client id number ");
        String tempId = keyboard.next();
        int spot2 = clientList.indexOf( new Client( tempId,null,null ) ) ;
        if (spot2 != -1) 
        {
            tempOwner = clientList.get(spot2);
             System.out.println("Client already exists "+tempOwner);
            }
         else // ask for client details
         {
             addClient(clientList,clientcarList, tempId,tempReg );
            }
            // change car as sold by setting the variable sold to 'Y'
            
            Car carObject = carListIn.get(spot);
            String tempMake = carObject.getMake();
            double tempPrice= carObject.getPrice();
            char tempSold = 'Y';  // setting car as sold
            carListIn.set(spot,new Car(tempReg, tempMake, tempPrice,tempSold));  
            // YOU HAVE TO SAVE ON THE FILE AS WELL
             Manipulate_Car mc = new Manipulate_Car();
             mc.writeList(carListIn);
            }
        
     }
     
     public  void addClient(ArrayList<Client> clientList,ArrayList<Client_Car> clientcarList,
                            String tempId, String tempReg )
     {
         Scanner keyboard = new Scanner(System.in);
        keyboard.useDelimiter("\n");
         System.out.print("Please enter Client name ");
         String name = keyboard.next();
         System.out.print("Please enter Client surname ");
         String surname = keyboard.next();
         clientList.add(new Client(tempId, name,surname));
         clientcarList.add(new Client_Car(tempId,tempReg));//link class 
         
        }
        
      public void display_sales(ArrayList<Client> clientList,ArrayList<Client_Car> clientcarList,
                                ArrayList<Car> carListIn)
      {
         // System.out.println("\f");
          Client_Car sale;
          String tregno, tIdno;
          int spot, spot2;
          
          for (int k=0; k<clientcarList.size(); k++)
          {
              sale = clientcarList.get(k);
              tregno = sale.getReg();
              tIdno =  sale.getId();
              spot = carListIn.indexOf( new Car(tregno, null, 0,'Y' ) ) ;
              System.out.println("Car details "+carListIn.get(spot));
              spot2 = clientList.indexOf( new Client( tIdno,null,null ) ) ;
              System.out.println("Client details "+clientList.get(spot2));
        }
    }
    
    
   
    
     public  void writeList(ArrayList<Client> clientList,ArrayList<Client_Car> clientcarList)
    {
         try
           {
               FileOutputStream clientFile = new FileOutputStream("clients3.obf");
               ObjectOutputStream clientStream = new ObjectOutputStream(clientFile);
               
               for ( Client item : clientList)
               {
                   clientStream.writeObject(item);
              }
              clientStream.close();
            }
            
            
         // handle the exception thrown by the FileWriter methods
         catch(IOException e)
         {
            System.out.println("There was a problem writing the file");
         }
         
         
           try
           {
               FileOutputStream clientcarFile = new FileOutputStream("clcar3.obf");
               ObjectOutputStream client_carStream = new ObjectOutputStream(clientcarFile);
               
               for ( Client_Car item : clientcarList)
               {
                   client_carStream.writeObject(item);
              }
              client_carStream.close();
            }
              // handle the exception thrown by the FileWriter methods
         catch(IOException e)
         {
            System.out.println("There was a problem writing the file");
         }
            
            
            
    }
    
    
    
     public  void readList(ArrayList<Client> clientList,ArrayList<Client_Car> clientcarList)
    {
        Client tempClient;
        Client_Car tempclientCar;
         boolean endOfFile2 = false;
         boolean endOfFile = false;
        

            try
         {
             FileInputStream clientFile = new FileInputStream("clients3.obf");
             ObjectInputStream clientStream = new ObjectInputStream(clientFile);
             // read the first (whole) object with the readObject method
             tempClient = (Client) clientStream.readObject();
             while (endOfFile != true)
             {
                 try
                 {
                     clientList.add(tempClient);
                     // read the next (whole) object
                     tempClient = (Client) clientStream.readObject();
                    }
                 catch (EOFException e)
                 {
                     endOfFile = true;
                    }
                    
             }
                  
             FileInputStream clientCarFile = new FileInputStream("clcar3.obf");
             ObjectInputStream clientCarStream = new ObjectInputStream(clientCarFile);
             tempclientCar = (Client_Car) clientCarStream.readObject();
             while (endOfFile2 != true)
             {
                 try
                 {
                     clientcarList.add(tempclientCar);
                     // read the next (whole) object
                     tempclientCar= (Client_Car) clientCarStream.readObject();
                    }
                 catch (EOFException e)
                 {
                     endOfFile2 = true;
                    }
                    
             }
             
            clientCarStream.close();
            clientStream.close();
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
