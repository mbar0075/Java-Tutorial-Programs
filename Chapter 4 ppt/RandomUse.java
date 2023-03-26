
public class RandomUse
{
    public static void main (String args[])
    {
    double num = Math.random()*49;  // 0 to 48.999999
    double num2 = Math.random()*49+1;  // 1 to 49.9999
    int num3 = (int)(Math.random()*49); // 0 to 48
    int num4 = (int)(Math.random()*49+1);// 1 to 49
    
    System.out.println(num);
    System.out.println(num2);
    System.out.println(num3);
    System.out.println(num4);
}
}
