import java.util.*;
public class Square2
{
    private  Scanner sc = new Scanner(System.in);
    private  double length;
    
    public Square2(double l){
       length=l;
    }
    
    public double getArea(){
        return length*length;
    }
    
    public double getPer(){
        return 4*length;
    }

}
