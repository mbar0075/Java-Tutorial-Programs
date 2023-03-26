import java.util.*;
public class MyClass{
    public static void main(String [] args){
        int[] myNumbers ={1,2,3};
        try
        {
            System.out.println(myNumbers[10]);//error!
        }
        catch(ArrayIndexOutOfBoundsException bebbuxu)
        {
            System.out.println("Adrian Zammit");
        }
        catch(Exception e)
        {
            System.out.println("Excajburr");
        }
    }
}