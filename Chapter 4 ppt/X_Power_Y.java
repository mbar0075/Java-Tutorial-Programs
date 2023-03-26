public class X_Power_Y
{
 	public static int power (int x ,int y)
	{
	    if (y==0) return 1 ;
	    else return (x * power (x, y-1));
	   
	   }
}