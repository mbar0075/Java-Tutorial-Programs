import java.util.*;
public class Runner4
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input how many number of contacts you want to add");
        int count = sc.nextInt();

        Directory[] directory = new Directory[count];
        Directory d = new Directory();
        
        d.inputDetails(directory);    
        d.display(directory); 
        
        d.searchMobile(directory);
        d.search_by_surname(directory);
    }
}
