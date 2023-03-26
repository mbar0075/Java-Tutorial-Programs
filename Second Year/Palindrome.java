import java.util.*;
public class Palindrome
{
    private  Scanner sc = new Scanner(System.in);
    private boolean found= false;
    private char array[];

    public boolean  Check(String word){
        int n = word.length();
        int count=0;
        array=new char[n];
        for(int i = 0;i<n;i++){
            array[i]=word.charAt(i);
        }
        int c=n-1;
        for(int i = 0;i<n;i++){
            if(array[i]==array[c])
                count++;
            c--;
        }
        if(count==n)
            found=true;
        return found;
    }

}
