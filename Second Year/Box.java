import java.util.*;
public class Box
{
    private  Scanner sc = new Scanner(System.in);
    private  double length,width;
    
    Box(double l,double w){
       length=l;
       width=w;
    }
    
    public void showArea(){
        System.out.println("area "+length*width);
    }

}
