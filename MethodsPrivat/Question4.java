import java.util.Scanner;
public class Question4
{
    private int x;

    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        boolean prime;
        for(int i = 2;i<=500; i++){
            prime = isPrime(i);
            if(prime==true)
                System.out.println(i + " is prime");
        }
    }

    public static boolean isPrime(int input)
    {
        boolean found = true ;   
        for(int j = 2;j<input; j++){
            if((input%j)==0) 
                found= false;
        }
        return found;
    }
}
