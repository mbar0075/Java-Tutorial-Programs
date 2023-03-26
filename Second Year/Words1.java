import java.util.*;
public class Words1
{
    private int v,c;

    public Words1()
    {
    }

    public int getVowels(String w){
        for( int i=0;i<w.length();i++){
            char temp = w.charAt(i);
            temp = Character.toLowerCase(temp);
            if((temp=='a')||(temp=='e')||(temp=='u')||(temp=='i')||(temp=='o'))
                v++;
        }        
        return v;
    }

    public int getConsonants(String w){
        v=0;
        c = w.length()-getVowels(w);
        return c;
    }
}
