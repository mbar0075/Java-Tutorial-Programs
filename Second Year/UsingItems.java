import java.util.*;
public class UsingItems
{
    public static void main( String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input name 1");
        String n1 = sc.next();
        System.out.println("Input quantity 1");
        int q1 = sc.nextInt();
        System.out.println("Input price 1");
        double p1 = sc.nextDouble();
        System.out.println("Input name 2");
        String n2 = sc.next();
        System.out.println("Input quantity 2");
        int q2 = sc.nextInt();
        System.out.println("Input price 2");
        double p2 = sc.nextDouble();

        items o1 = new items(n1,q1,p1);
        items o2 = new items(n2,q2,p2);

        o1.addQuantity(100);
        o2.addQuantity(150);
        o1.showInventory();
        o2.showInventory();

        o1.updateQuantity(10);
        o1.updateQuantity(5);
        o2.updateQuantity(60);
        o1.updateQuantity(15);

        o1.showInventory();
        o2.showInventory();
    }
}
