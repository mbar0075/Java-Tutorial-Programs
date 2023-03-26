public class Shop{
    public static void main(String args[]){
     int i1 = 2;
     int i2 = 4;
     int q1 = 2;
     int q2 = 1;
     int total =(i1*q1)+(i2*q2);
     double discount = total*0.95;
     System.out.println("The price is " + total);
     System.out.println("The discounted price is "+ discount);   
        
    }
}