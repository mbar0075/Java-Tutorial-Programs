import java.util.*;
public class ThrowExample2 {
    public static void main (String args[]){ 
        int num=-1;
        do{
            Scanner sc = new Scanner(System.in);
            try{
                System.out.println("Input positive number");
                num=sc.nextInt();
                if(num<=0)
                    throw new Exception("Ray u Adrian");
            }
            catch(InputMismatchException bebbuxu)
            {
                System.out.println("Excajbur");
            }
            catch(Exception Adrian)
            {
                System.out.println(Adrian.getMessage());
                System.out.println("Gorg tal Laham");
            }
        } while(num<=0);
        int square = num*num;
        System.out.println("The square is "+square);
    } 
}