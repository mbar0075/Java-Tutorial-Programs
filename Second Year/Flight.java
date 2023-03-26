import java.util.*;
public class Flight
{
    private  Scanner sc = new Scanner(System.in);
    private String destination ;
    private  double price_Adult,price_Child,total,adults,children;

    public Flight(){
       destination =null;
       price_Adult = 0;
       price_Child =0;
       adults=0;
       children=0;
    }
    
    public void setDestination(String d){
        destination=d;
    } 
    
    public void setAprice(double a){
        price_Adult =a;
    } 
    
    public void setCprice(double c){
        price_Child=c;
    } 
    
    public void setAdults(double a){
        adults=a;
    } 
    
    public void setChildren(double c){
        children=c;
    } 

    public double calculateTotal(){
        total =(price_Adult*adults)+(price_Child*children);
        return total;
    } 
    
    public void showDetails(){
        double vat = 1.18*total;
        System.out.println(destination+"  "+adults+"  "+children+"  total "+total+"  total with vat" +vat);
    } 
    
}
