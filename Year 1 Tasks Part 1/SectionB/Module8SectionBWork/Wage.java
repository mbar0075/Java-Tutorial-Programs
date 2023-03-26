/*Matthias Bartolo 
 *Class Bc1B  
 *Module8 Section B Q 8*/
public class Wage {
    public static void main (String args[]){
     
        String name= "Alex ";
        double hrs = 40.5;
        double rate = 6.5;
        double overtime = 5.3;
        double overrate= 10.5;
        
        double grosswage = (hrs*rate) + (overtime*overrate);
        
        System.out.println(name + "\nEarned €  " + grosswage);
        
    }
}