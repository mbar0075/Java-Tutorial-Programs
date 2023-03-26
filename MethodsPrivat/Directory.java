import java.util.*;
public class Directory
{
    private Scanner sc = new Scanner(System.in);
    private String name,surname,mobile;
    private String temp;

    public Directory()
    {  
    }

    public Directory(String name,String surname,String mobile){
        this.name =name;
        this.surname=surname;
        this.mobile=mobile;
    }

    public  void inputDetails (Directory[] friends){
        for(int i=0;i<friends.length;i++){
            System.out.println("Input name "+(i+1));
            name=sc.next();
            System.out.println("Input surname "+(i+1));
            surname=sc.next();
            System.out.println("Input mobile "+(i+1));
            mobile=sc.next();
            friends[i]=new Directory(name,surname,mobile);
        }
    }

    public String getName(){
        return name;
    }

    public String getSurname(){
        return surname;
    }

    public String getMobile(){
        return mobile;
    }

    public String toString(){        
        return " \t"+name +" \t "+surname+" \t"+mobile; 
    }

    public void display(Directory[] friends){
        for(int i=0;i<friends.length;i++){
            System.out.println(friends[i].toString());
        }
        System.out.println();
    }

    public void searchMobile(Directory[] friends){
        System.out.println("Input mobile number to search for");
        temp=sc.next();
        int n=friends.length;
        int count=-1;
        for(int i=0;i<n;i++){
            if (friends[i].mobile.equals(temp)){
                System.out.println(friends[i].toString());
                count=i;
            }
        }
        if(count==-1)
            System.out.println("Not found");
        System.out.println();
    }

    public void search_by_surname(Directory[] friends){
        System.out.println("Input surname to search for");
        temp=sc.next();
        int n=friends.length;
        int count=-1;
        for(int i=0;i<n;i++){
            if (friends[i].surname.equals(temp)){
                System.out.println(friends[i].toString());
                count=i;
            }
        }
        if(count==-1)
            System.out.println("Not found");
        System.out.println();
    }
}
