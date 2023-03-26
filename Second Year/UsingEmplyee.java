import java.util.*;
public class UsingEmplyee
{
    public static void main( String args[]){
        Employee emp1 = new Employee("Kratos","Midgard",50,7.8);
        Employee emp2 = new Employee("Einor","Assasin",40,8);
        
        emp1.setCompanyName("ABC Ltd");
        emp2.setCompanyName("ABC Ltd");
        System.out.println(emp1);
        System.out.println(emp2);
        emp1.setCompanyName("XYZ Ltd");
        emp2.setCompanyName("XYZ Ltd");
        System.out.println(emp1);
        System.out.println(emp2);
    }
}
