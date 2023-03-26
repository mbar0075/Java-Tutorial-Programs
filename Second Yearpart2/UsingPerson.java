import java.util.*;
public class UsingPerson
{
    private static Scanner sc = new Scanner(System.in);
    public static void main( String args[]){
        ArrayList <Person> person = new ArrayList <Person>();

        int input,num;
        do{
            System.out.println("Choose from the folowing Menu:\n1.Add person\n2.Remove person\n3.Modify a person\n4.Search by name\n5.List\n6.Quit");

            input = sc.nextInt();
            switch(input){
                case 1:System.out.println("Input name");
                String n = sc.next();
                System.out.println("Input surname");
                String s = sc.next();
                person.add(new Person(n,s));
                break;

                case 2:System.out.println("Input location to delete");
                num = sc.nextInt();
                person.remove(num);
                break;

                case 3:System.out.println("Input location to modify");
                num = sc.nextInt();
                System.out.println("Input new name");
                n = sc.next();
                System.out.println("Input new surname");
                s = sc.next();
                person.set(num,new Person(n,s));
                break;

                case 4:System.out.println("Input name to search for");
                n= sc.next();
                int pos =-1;
                boolean found = false;
                for(int i =0; i<person.size();i++){
                    if(n.equals(person.get(i).getName())){
                        found = true;
                        pos=i;
                        System.out.println("Found in position "+pos);
                    }
                }
                if ( found ==false)
                    System.out.println("not found");
                break;

                case 5:
                for(int i =0; i<person.size();i++){
                    System.out.println(person.get(i));
                }
                break;
                case 6:System.out.println("Goodbye");
                break;
                default:System.out.println("Invalid Entry");   
            }
        }while (input!=6);
    }
}
