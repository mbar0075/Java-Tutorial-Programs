import java.util.*;
public class NameSurname
{
    public static void main( String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input name ");
        String name =sc.next();
        System.out.println("Input surname ");
        String surname =sc.next();
        System.out.println(surname.toUpperCase());
        System.out.println(name.length()+surname.length());
        System.out.println(name.charAt(0));
    }
}
