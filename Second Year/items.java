import java.util.*;
public class items
{
    private String name;
    private int quantity;
    private double price;

    public items(){
    }

    public items(String n,int q, double p)
    {
        name=n;
        quantity=q;
        price=p;
    }

    public void updateQuantity(int q)
    {
        quantity-=q;
    }

    public void addQuantity(int q)
    {
        quantity+=q;
    }
    
    public void showInventory()
    {
        System.out.println(name+"  "+quantity+"  "+price);
    }
}
