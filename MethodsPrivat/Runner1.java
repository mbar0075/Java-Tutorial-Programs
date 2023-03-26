import java.util.*;
public class Runner1
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        SalonObject so[]= new SalonObject[6];
        SalonObject s =new SalonObject();
        
        s.inputServices(so);
        s.display_all(so);
        
        System.out.println("Input service to Search for");
        String temp = sc.next();
        int position=s.search_Service_position(so, temp);
        if(position!=-1)
            s.display_service(so, position);
        else
            System.out.println("Not found");
    }
}
