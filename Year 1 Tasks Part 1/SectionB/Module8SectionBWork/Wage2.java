/*Matthias Bartolo 
 *Class Bc1B  
 *Module8 Section B Q 14*/
public class Wage2 {
    public static void main (String args[]){
     
        String name= "Alex ";
        double hrs = 40.5;
        double rate = 6.5;
        double overtime = 5.3;
        double overrate= 10.5;
        
        final double taxrate = 0.895;
        
        double grosswage = (hrs*rate) + (overtime*overrate);
        double netwage = grosswage*taxrate;
        
        System.out.println(name + "\nEarned €  " + grosswage);
        System.out.println("\nThe Net wage is  €  " + netwage);
        
    }
}