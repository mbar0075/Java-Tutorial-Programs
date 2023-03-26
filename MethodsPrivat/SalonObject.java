import java.util.*;
public class SalonObject
{
    private Scanner sc = new Scanner(System.in);
    private String service;
    private double price;
    private int time;
    private int pos;

    public SalonObject()
    {  
    }

    public SalonObject(String service, double price, int time){
        this.service =service;
        this.price=price;
        this.time=time;
    }

    public void inputServices (SalonObject[] services){
        for(int i=0;i<services.length;i++){
            System.out.println("Input service"+(i+1));
            service=sc.next();
            System.out.println("Input price"+(i+1));
            price=sc.nextDouble();
            System.out.println("Input time"+(i+1));
            time=sc.nextInt();
            services[i]=new SalonObject(service,price,time);
        }
    }

    public String getName(){
        return service;
    }

    public double getPrice(){
        return price;
    }

    public int getTime(){
        return time;
    }

    public String toString(){        
        return service +"  "+price+"  "+time; 
    }

    public void display_all(SalonObject[] services ){
        for(int i=0;i<services.length;i++){
            System.out.println(services[i].toString());
        }
    }

    public int search_Service_position (SalonObject[] services , String service){
        pos=-1;
        for(int i=0;i<services.length;i++){
            if(services[i].service.equals(service)){
                pos=i;
                break;
            }
        }
        return pos;
    }

    public void display_service (SalonObject[] services, int posi){
        System.out.println("\n"+services[posi].toString());
    }
}
