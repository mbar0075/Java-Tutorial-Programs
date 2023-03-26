import java.util.*;
public class SCI
{
    private  Scanner sc = new Scanner(System.in);
    private  double P;
    
    public void calcInterest(double C,double r , double t){
        P=C*Math.pow((1+r),t);
        System.out.println("The interest of "+C+"   "+r+"  "+t+"  is "+P);
    }
}
