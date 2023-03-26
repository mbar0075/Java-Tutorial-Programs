import java.util.*;
public class loyaltyCard
{
    private String code;
    private int points;

    public loyaltyCard()
    {
    }
    
    public loyaltyCard(Customers c)
    {
       code= c.getID();
    }

    public void updateCode(Customers c){
        code= c.getID();
    }
    
    public int addPoints(double cost){
        points+=(cost/10);
        return points;
    }
    
    public void redeemPoints(int points){
        this.points -=points;
    }
    
    public void showBalance(){
        System.out.println("Point balance: "+points);
    }
    
    public void showDetails(Customers c){
        System.out.println(c+"  code :"+code+"  points: "+points);
    }
}
