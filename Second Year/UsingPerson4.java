import java.util.*;
public class UsingPerson4
{
    private static Scanner sc = new Scanner(System.in);

    public static void main( String args[]){
        Person3 p[]= new Person3[5];

        Input(p);

    }

    public static void Input(Person3 c[]){
        for( int i =0 ;i<c.length;i++){
            System.out.println("Input name "+(i+1));  
            String name = sc.next();
            System.out.println("Input surname "+(i+1));  
            String surname = sc.next();
            c[i]= new Person3(name,surname);
        }
        System.out.println("\f");
        for( int i =0 ;i<c.length;i++){
            System.out.println(c[i]);
        }
    }
}