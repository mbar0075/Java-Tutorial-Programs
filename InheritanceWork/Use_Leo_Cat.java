import java.util.*;
public class Use_Leo_Cat
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input weight of Leopard");
        double w= sc.nextDouble();
        System.out.println("Input number of spots of Leopard");
        int num= sc.nextInt();

        Leopard leo= new Leopard(w,num);
        System.out.println(leo);

        System.out.println("Input new number of spots of Leopard");
        num= sc.nextInt();
        leo.setNumSpots(num);
        System.out.println(leo);

        leo.eat();
        System.out.println("Meals a leopard eats per day " +leo.mealsPerDay());
        System.out.println("The weight of a leopard " +leo.getWeight());

        System.out.println("Input new weight of Leopard");
        w= sc.nextDouble();
        leo.setWeight(w);
        System.out.println(leo);
    }
}
