import java.util.*;
public class Password1
{
    private static int length =8;

    public Password1()
    {

    }

    public static boolean isValid(String p){
        int count =0;
        char array[]=new char[p.length()];
        boolean valid =false;
        if(p.length()>=length){
            length=p.length();
            for(int i = 0;i<length;i++){
                array[i]=p.charAt(i);
            }
            for(int i = 0;i<length;i++){
                if((array[i]=='1')||(array[i]=='2')||(array[i]=='3')||(array[i]=='4')||(array[i]=='5')||(array[i]=='6')||(array[i]=='7')||(array[i]=='8')||(array[i]=='9'))
                    count++;
            }
            if(count>=3)
                valid =true;
        }
        return valid;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        boolean test =false;
        do{
            System.out.println("Input password of length 8 and include 3 digits");
            String password = sc.next();
            test = isValid(password);
            if(test == false)
                System.out.println("Invalid password");
            else 
                System.out.println("Welcome");
        }while(test==false);
    }
}
