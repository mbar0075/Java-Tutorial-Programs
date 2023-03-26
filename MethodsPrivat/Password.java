import java.util.*;
public class Password
{
    private static Scanner sc = new Scanner(System.in);
    private static String password;
    private static boolean found;
    private static char temp;
    private static boolean found1;
    private static boolean found2;
    private static int current;
    private static int count;

    public static boolean is_Valid_Password(String password){
        found=false;
        if((password.length())>=10)
            found=true;
        return found;
    }

    public static boolean is_Letter(char ch){
        found1=false;
        ch=Character.toUpperCase(ch);
        current = (int)(ch);
        if((current>=65)&&(current<=90))
            found1=true;
        return found1;
    }

    public static boolean is_Numeric(char ch){
        found2=false;
        count++;
        if(count==2){
            found2=true;
        }
        return found2;
    }

    public static void main (String args[]){

        System.out.println("For a password to be valid it has to follows the following rules:\nA password must have at least ten characters.\nA password consists of only letters and digits.\nA password must contain at least two digits.\n\n\nPlease Enter Password");
        password =sc.next();
        found = is_Valid_Password(password);
        for( int i = 0;i<password.length();i++){
            temp = password.charAt(i); 
            if((temp<'0')||(temp>'9'))
                found1=is_Letter(temp);
            else
                found2=is_Numeric(temp);
        }
        if((found==false)||(found1==false)||(found2==false))
            System.out.println("Password is Invalid");  
        else
            System.out.println("Password is Correct");
    }
}
