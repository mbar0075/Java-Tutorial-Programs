import java.util.*;
public class Create_Car_Owner
{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in );
        System.out.println("Input name");
        String name=sc.next();
        System.out.println("Input surname");
        String surname=sc.next();
        System.out.println("Input id number");
        String id=sc.next();
        
        Person p = new Person(name,surname,id);
        
        System.out.println("Input brand");
        String brand=sc.next();
        System.out.println("Input model");
        String model=sc.next();
        System.out.println("Input reg no");
        String reg=sc.next();
        
        System.out.println("Input fuel");
        String fuel=sc.next();
        
        Car c =new Car(p,brand,model,reg,fuel);
        
        System.out.println(c);
        System.out.println("Input new name");
        String newname=sc.next();
        System.out.println("Input new surname");
        String newsurname=sc.next();
        System.out.println("Input new id number");
        String newid=sc.next();
        
        p.setPerson(newname,newsurname,newid);
        c.setOwner(p);
        
        System.out.println(c);
    }
}
