import java.util.*;
public class Binary
{
    private int num;

    public Binary()
    {
    }

    public void setNumber(int n){
        num=n;
    }

    public int getNumber(){
        return num;
    }

    public String toBinary(){
        String display="";
        while(num>0){
            int r=num%2;
            display=r+display;
            num/=2;
        }
        return display;
        }
}
