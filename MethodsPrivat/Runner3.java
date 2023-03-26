import java.util.*;
public class Runner3
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input how many friends you want to add");
        int count = sc.nextInt();
        //Part A
        Friends[] friend = new Friends[count];
        Friends f = new Friends();
        
        f.enter_details(friend);    
        f.display_persons(friend);
        
        //Part B
        f.list_by_surname(friend);
    }
}
