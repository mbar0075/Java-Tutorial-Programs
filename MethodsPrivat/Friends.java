import java.util.*;
public class Friends
{
    private Scanner sc = new Scanner(System.in);
    private String name,surname;
    private String temp;

    public Friends()
    {  
    }

    public Friends(String name,String surname){
        this.name =name;
        this.surname=surname;
    }

    public  void enter_details (Friends[] personarray){
        for(int i=0;i<personarray.length;i++){
            System.out.println("Input name "+(i+1));
            name=sc.next();
            System.out.println("Input surname "+(i+1));
            surname=sc.next();
            personarray[i]=new Friends(name,surname);
        }
    }

    public String getName(){
        return name;
    }

    public String getSurname(){
        return surname;
    }

    public String toString(){        
        return name +"  "+surname; 
    }

    public void display_persons (Friends[] personarray){
        for(int i=0;i<personarray.length;i++){
            System.out.println(personarray[i].toString());
        }
    }

    public void list_by_surname(Friends[] personarray){
        System.out.println("Input surname to search for");
        temp=sc.next();
        int n=personarray.length;
        int count=-1;
        for(int i=0;i<n;i++){
            if (personarray[i].surname.equals(temp)){
                System.out.println(personarray[i].toString());
                count=i;
            }
        }
        if(count==-1)
            System.out.println("Not found");
    }
}
