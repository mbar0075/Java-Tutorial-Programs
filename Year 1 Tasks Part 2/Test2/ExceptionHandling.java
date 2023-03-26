import java.util.*;
public class ExceptionHandling
{
    Scanner sc = new Scanner(System.in);

    public double tryCatch(double input){
        try{
            input=sc.nextDouble();
        }
        catch(Exception e)
        {
            System.out.println(e);   
        }
        sc.nextLine();
        return input;
    }

    public int tryCatch(int input){
        try{
            input=sc.nextInt();
        }
        catch(Exception e)
        {
            System.out.println(e);   
        }
        sc.nextLine();
        return input;
    }

    public String tryCatch(String input){
        try{
            input=sc.nextLine();
        }
        catch(Exception e)
        {
            System.out.println(e);   
        }
        sc.nextLine();
        return input;
    }

    public char tryCatch(char input){
        try{
            input=sc.next().charAt(0);;
        }
        catch(Exception e)
        {
            System.out.println(e);   
        }
        sc.nextLine();
        return input;
    }

}
