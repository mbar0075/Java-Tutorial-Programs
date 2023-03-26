import java.util.*;
public class Battleship
{
    private static int input1=-1;
    private static int input2=-1;
    private static char input;
    private static int tries =10;
    private static boolean found=false;
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        ShipClass Ships = new ShipClass();
        System.out.println("Welcome to Battleship");
        Ships.Populate();
        do{
            do{
                System.out.println("Input vertical coordinates eg:A,B,etc.. ");
                input=sc.next().charAt(0);
                input = Character.toUpperCase(input);
                if(input=='A')
                    input2=0;
                else if(input=='B')
                    input2=1;
                else if(input=='C')
                    input2=2;
                else if(input=='D')
                    input2=3;
                else if(input=='E')
                    input2=4;
                else
                    System.out.println("Invalid");
            }while((input2<0)||(input2>5));
            do{
                System.out.println("Input horizontal coordinates eg:1,2,etc.. ");
                try{
                    input1 = sc.nextInt();         
                }
                catch(Exception e){
                    System.out.println(e);
                    tries++;
                }
                sc.nextLine();
                if((input1<0)||(input1>5))
                    System.out.println("Invalid");
            }while((input1<0)||(input1>5));
            input1--;
            Ships.Search(input1,input2);
            found=Ships.Check();
            if(found==false)
                tries--;  
            System.out.println("Tries left: "+tries);    
        }while(tries!=0);
        System.out.println("Goodbye");
    }

}
